package com.zerobank.stepdefinitions;

import com.github.javafaker.Faker;
import com.zerobank.pages.PurchaseForeignCurrencyPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

import java.util.List;

public class PurchaseForeignCurrencyStepDef {

    @Then("following currencies should be available")
    public void following_currencies_should_be_available(List<String> expectedCurrencyList) {
        PurchaseForeignCurrencyPage purchaseForeignCurrencyPage = new PurchaseForeignCurrencyPage();
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.waitForVisibility(purchaseForeignCurrencyPage.currencySelection,10);

        Assert.assertTrue("verify expected currencies are available",
                purchaseForeignCurrencyPage.getActualCurrencyList().containsAll(expectedCurrencyList));

    }


    @When("user tries to calculate cost without selecting a currency")
    public void userTriesToCalculateCostWithoutSelectingACurrency() {
        PurchaseForeignCurrencyPage purchaseForeignCurrencyPage = new PurchaseForeignCurrencyPage();
        Faker faker = new Faker();
        BrowserUtils.waitForVisibility(purchaseForeignCurrencyPage.purchaseButton,10);

        purchaseForeignCurrencyPage.amountBox.sendKeys(faker.number().digit());
        purchaseForeignCurrencyPage.purchaseButton.click();
    }

    @Then("error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        Alert alert = Driver.get().switchTo().alert();
        System.out.println("alert.getText() = " + alert.getText());

        Assert.assertTrue("JS Error message displayed and not null",
                !alert.getText().isEmpty());
    }

    @When("user tries to calculate cost without entering a value")
    public void userTriesToCalculateCostWithoutEnteringAValue() {
        PurchaseForeignCurrencyPage purchaseForeignCurrencyPage = new PurchaseForeignCurrencyPage();
        BrowserUtils.waitForVisibility(purchaseForeignCurrencyPage.currencySelection,10);

        //selecting a currency from select dropdown
        purchaseForeignCurrencyPage.makeRandomSelection();
        //click one radio button
        purchaseForeignCurrencyPage.usdRadioButton.click();
        //we do not enter any amount

        //click purchase
        purchaseForeignCurrencyPage.purchaseButton.click();

    }
}
