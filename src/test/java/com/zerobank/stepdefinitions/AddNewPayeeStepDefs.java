package com.zerobank.stepdefinitions;

import com.zerobank.pages.AddNewPayeePage;
import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;

public class AddNewPayeeStepDefs {

    @Then("creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String, String> registrationInfo) {
        AddNewPayeePage addNewPayeePage = new AddNewPayeePage();
        BrowserUtils.waitForVisibility(addNewPayeePage.addButton,10);

        for (String boxTitle : registrationInfo.keySet()) {
            WebElement inputBox = addNewPayeePage.getInputBoxFor(boxTitle);
            inputBox.sendKeys(registrationInfo.get(boxTitle));
        }

        addNewPayeePage.addButton.click();
        BrowserUtils.waitFor(3);

    }


    @Then("Below message  should be displayed")
    public void belowMessageShouldBeDisplayed() {

    }

    @Then("message {string} should be displayed")
    public void messageShouldBeDisplayed(String expectedMessage) {
        BrowserUtils.waitForPageToLoad(10);
        PayBillsPage payBillsPage = new PayBillsPage();
        String actaulMessage = payBillsPage.alertContent.getText();
        WebDriverWait wait = new WebDriverWait(Driver.get(),10);
        ExpectedCondition<Alert> isPresent = ExpectedConditions.alertIsPresent();



        Assert.assertEquals("verify alert message is " + expectedMessage,
                expectedMessage,actaulMessage);
    }
}
