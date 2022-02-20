package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class FindTransactionsPage extends BasePage{

    @FindBy(id = "aa_fromDate")
    public WebElement startDateInput;

    @FindBy(id = "aa_toDate")
    public WebElement endDateInput;

    @FindBy(id = "aa_description")
    public WebElement descriptionInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement findButton;

    @FindBy(xpath = "(//tbody)[2]//td[1]")
    public List<WebElement> resultDates;

    @FindBy(xpath = "(//tbody)[2]//td[2]")
    public List<WebElement> resultDescriptions;

    @FindBy(xpath = "(//tbody)[2]//td[3]")
    public List<WebElement> depositDescriptions;

    @FindBy(xpath = "(//tbody)[2]//td[4]")
    public List<WebElement> withdrawalDescriptions;

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']//th")
    public List<WebElement> columnHeads;

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']//th")
    public WebElement firstHeadCell;

    @FindBy(id = "aa_type")
    public WebElement typeSelect;


    public void makeSelection(String selectText){
        Select select = new Select(typeSelect);
        select.selectByVisibleText(selectText);
    }





    public boolean isBetween(String[] start, String[] end, List<String> resultDates){
        int startDate = getDateInDays(start);
        int endDate = getDateInDays(end);

        for(String resultDate : resultDates){
            int resultDateInt = getDateInDays(resultDate);
            if(resultDateInt < startDate || resultDateInt > endDate ){
                return false;
            }
        }
        return true;
    }

    private int getDateInDays(String[] start) {
        Integer[] date = new Integer[start.length];
        for(int i = 0; i < start.length; i++){
            date[i] = Integer.parseInt(start[i]);
        }


        int dateInDays = 365 * date[0] + 30 * date[1] + date[2];
        return dateInDays;
    }

    private int getDateInDays(String fullDate) {
        String[] dateArray = fullDate.split("-");

        //Create an empty Integer array
        Integer[] date = new Integer[dateArray.length];
        for(int i = 0; i < dateArray.length; i++){
            //record Integer values of year/month/and day
            date[i] = Integer.parseInt(dateArray[i]);
        }

        //the bigger the number, it's closer today (works relatively)
        int dateInDays = 365 * date[0] + 30 * date[1] + date[2];
        return dateInDays;
    }


    public boolean isSortedByRecent(List<String> actualDates) {
        int[] datesInDays = new int[actualDates.size()];
        for(int i = 0; i < actualDates.size(); i++){
            datesInDays[i] = getDateInDays(actualDates.get(i));
        }

        for(int i = 0; i < datesInDays.length -1; i++ ){
            if(datesInDays[i] < datesInDays[i+1]){
                return false;
            }
        }
        return true;
    }

    public boolean isContain(List<String> actualDates, String negativeDate) {

        for(String actualDate : actualDates){


            if(actualDate.equals(negativeDate)){
                return false;
            }
        }
        return true;
    }

    public boolean isAllActualResultsContain(String expectedKeyword) {
        List<String> actualResultDescriptions = BrowserUtils.getElementsText(resultDescriptions);
        if(actualResultDescriptions.isEmpty()){
            return false;
        }

        boolean result = true;

        //check each word of the description result one by one
        for(String actualResult : actualResultDescriptions){

            //start with the assumption that the expected keyword is not in the result description
            result = false;

            //create an array of the worlds of the result description text
            String[] actuallResultByWord = actualResult.split(" ");

            //and check each word one by one
            for(String actualResultWord : actuallResultByWord){

                //if any of the words are equal to expectedkeyword then the result is true
                if(actualResultWord.equals(expectedKeyword)){
                    result = true;
                }
            }
            //after checking each word in one result and still cannot find expected keyword
            //no need to go further just return false
            if(!result){
                return result;
            }
        }
        return result;
    }

    public List<String> getColumnValuesOf(String columnHead) {
        int columnNumber = getColumnNumber(columnHead);
        //we found out column number and based on that retrieve columns cells List
        List<WebElement> columnCells = Driver.get().findElements(By.xpath("(//tbody)[2]//td[" + columnNumber + "]"));
        //and create a new String list
        List<String> columnCellsText = new ArrayList<>();
        for(WebElement columnCellElement : columnCells){
            if(!columnCellElement.getText().isEmpty()){
                columnCellsText.add(columnCellElement.getText());
            }
        }

        return  columnCellsText;
    }

    private int getColumnNumber(String columnHead){
        for(int i = 0; i < columnHeads.size(); i++){
            if(columnHeads.get(i).getText().equals(columnHead)){
                //as HTML does not start from 1 we add 1 to give the equivalent column number
                return i+1;
            }
        }
        return -1;
    }
}
