package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.FindTransactionsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class FindTransactionsStepDefs {

    @Then("goes to {string} tab")
    public void goesToTab(String tabName) {
        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
        BrowserUtils.waitForPageToLoad(5);
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        accountActivityPage.clickToTab(tabName);
        BrowserUtils.waitForPageToLoad(10);




    }

    @When("the user enters date range from {string} to {string}")
    public void theUserEntersDateRangeFromTo(String startDate, String endDate) {


        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.waitForVisibility(findTransactionsPage.startDateInput, 10);
        findTransactionsPage.startDateInput.clear();
        findTransactionsPage.startDateInput.sendKeys(startDate);
        findTransactionsPage.endDateInput.clear();
        findTransactionsPage.endDateInput.sendKeys(endDate + Keys.ENTER);
        BrowserUtils.waitFor(1);
    }

    @And("clicks search")
    public void clicksSearch() {
        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.waitForVisibility(findTransactionsPage.findButton,10);

        findTransactionsPage.findButton.click();
        BrowserUtils.waitFor(1);
    }


    @Then("results table should only show transactions dates between {string} to {string}")
    public void resultsTableShouldOnlyShowTransactionsDatesBetweenTo(String startDate, String endDate) {
        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.waitForVisibility(findTransactionsPage.findButton,10);

        String[] startDateArr = startDate.split("-");
        String[] endDateArr = endDate.split("-");

        List<String> actualDates = BrowserUtils.getElementsText(findTransactionsPage.resultDates);


        Assert.assertTrue("verify actual dates are between start date and end date",
                !actualDates.isEmpty() && findTransactionsPage.isBetween(startDateArr, endDateArr, actualDates));
    }

    @And("the results should be sorted by most recent date")
    public void theResultsShouldBeSortedByMostRecentDate() {
        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.waitForVisibility(findTransactionsPage.findButton,10);
        List<String> actualDates = BrowserUtils.getElementsText(findTransactionsPage.resultDates);

        Assert.assertTrue("verify if the dates listed in ascending order",
                !actualDates.isEmpty() && findTransactionsPage.isSortedByRecent(actualDates));

    }


    @And("the results table should only not contain transactions dated {string}")
    public void theResultsTableShouldOnlyNotContainTransactionsDated(String negativeDate) {
        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.waitForVisibility(findTransactionsPage.findButton,10);
        List<String> actualDates = BrowserUtils.getElementsText(findTransactionsPage.resultDates);

        Assert.assertTrue("verify negative date does not exist ",
                findTransactionsPage.isContain(actualDates, negativeDate));
    }


    @When("the user enters description {string}")
    public void theUserEntersDescription(String keyWord) {
        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.waitForVisibility(findTransactionsPage.findButton,10);
        findTransactionsPage.descriptionInput.clear();
        findTransactionsPage.descriptionInput.sendKeys(keyWord);

    }

    @Then("results table should only show descriptions containing {string}")
    public void resultsTableShouldOnlyShowDescriptionsContaining(String expectedKeyword) {
        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.waitForVisibility(findTransactionsPage.findButton,10);
        BrowserUtils.waitForVisibility(findTransactionsPage.resultDescriptions.get(0), 10);
        Assert.assertTrue("actual results contain " + expectedKeyword,
                findTransactionsPage.isAllActualResultsContain(expectedKeyword));
        BrowserUtils.waitFor(3);
    }


    @But("results table should not show descriptions containing {string}")
    public void resultsTableShouldNotShowDescriptionsContaining(String expectedKeyword) {
        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.waitForVisibility(findTransactionsPage.findButton,10);

        Assert.assertFalse("actual results NOT contain " + expectedKeyword,
                findTransactionsPage.isAllActualResultsContain(expectedKeyword));
        BrowserUtils.waitFor(3);
    }

    @Then("results table should show at least one result under {string}")
    public void resultsTableShouldShowAtLeastOneResultUnder(String columnHead) {
        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.waitForVisibility(findTransactionsPage.firstHeadCell, 10);
        List<String> actualColumnCellValues = findTransactionsPage.getColumnValuesOf(columnHead);

        Assert.assertTrue("there is at least one result under" + columnHead,
                !actualColumnCellValues.isEmpty());


    }


    @When("user selects type {string}")
    public void user_selects_type(String textOfSelection) {
        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
        BrowserUtils.waitForVisibility(findTransactionsPage.typeSelect,10);

        findTransactionsPage.makeSelection(textOfSelection);
    }


    @But("results table should show no result under {string}")
    public void resultsTableShouldShowNoResultUnder(String columnHead) {
        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.waitForVisibility(findTransactionsPage.firstHeadCell, 10);
        List<String> actualColumnCellValues = findTransactionsPage.getColumnValuesOf(columnHead);

        Assert.assertTrue("there is NO result under" + columnHead,
                actualColumnCellValues.isEmpty());
    }

}


