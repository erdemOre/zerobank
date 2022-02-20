package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummary;
import com.zerobank.pages.LoginPage;
import com.zerobank.pages.OnlineBankingPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountsActivityNavigationStepDefs {

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        LoginPage loginPage = new LoginPage();


        if(Driver.get().getTitle().equals("Zero - Log in")){
            loginPage.usernameBox.sendKeys(ConfigurationReader.get("username"));
            loginPage.passwordBox.sendKeys(ConfigurationReader.get("password"));

            loginPage.submitButton.click();

        }
    }


    @And("the user navigates to {string} page")
    public void theUserNavigatesToPage(String linkText) {
        OnlineBankingPage onlineBankingPage = new OnlineBankingPage();
        onlineBankingPage.navigateTo(linkText);
    }

    @When("the user clicks on	{string}	link on	the	Account	Summary	page")
    public void theUserClicksOnLinkOnTheAccountSummaryPage(String link) {
        AccountSummary accountSummary = new AccountSummary();
        accountSummary.getLinkElement(link).click();
    }

    @Then("the {string} page should be displayed")
    public void thePageShouldBeDisplayed(String expectedPageTitle) {
        String actualPageTitle = Driver.get().getTitle();
        expectedPageTitle = "Zero - " + expectedPageTitle;

        Assert.assertEquals(expectedPageTitle,actualPageTitle);

    }

    @And("Account drop down should have {string} selected")
    public void accountDropDownShouldHaveSelected(String expectedSelection) {
        AccountActivityPage accountActivity = new AccountActivityPage();
        String actualSelection = accountActivity.getFirstSelected();

        Assert.assertEquals("First Selection is correct",expectedSelection,actualSelection);
    }

}
