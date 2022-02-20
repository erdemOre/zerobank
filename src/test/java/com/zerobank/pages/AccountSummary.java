package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccountSummary extends BasePage{

    public WebElement getLinkElement(String link){
        return Driver.get().findElement(By.linkText(link));
    }
}
