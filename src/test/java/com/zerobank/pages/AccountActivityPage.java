package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityPage extends BasePage{

    @FindBy(id = "aa_accountId")
    public WebElement selectDropDown;

    @FindBy(linkText = "Find Transactions")
    public WebElement findTransactionsTab;

    public String getFirstSelected(){
        BrowserUtils.waitForVisibility(selectDropDown,10);
        Select select = new Select(selectDropDown);
        return select.getFirstSelectedOption().getText();
    }

    public void clickToTab(String tabName){
        Driver.get().findElement(By.linkText(tabName)).click();
    }

}
