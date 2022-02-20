package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class PurchaseForeignCurrencyPage extends BasePage{

    @FindBy(id = "pc_currency")
    public WebElement currencySelection;

    @FindBy(id = "pc_amount")
    public WebElement amountBox;

    @FindBy(id = "purchase_cash")
    public WebElement purchaseButton;

    @FindBy(xpath = "(//input[@type='radio'])[1]")
    public WebElement usdRadioButton;

    @FindBy(xpath = "(//input[@type='radio'])[2]")
    public WebElement selectedCurrencyRadioButton;


    public List<String> getActualCurrencyList(){
        Select select = new Select(currencySelection);
        return BrowserUtils.getElementsText(select.getOptions());
    }

    public void makeRandomSelection(){
        Select select = new Select(currencySelection);
        Random random = new Random();
        //select a random currency
        select.selectByIndex(random.nextInt(select.getOptions().size()));
    }
}
