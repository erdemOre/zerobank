package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OnlineBankingPage extends BasePage{

    public void navigateTo(String linkTitle){
        //first check if the user is on the right page
        if(!Driver.get().getTitle().equals("Zero - Free Access to Online Banking")){
            Driver.get().navigate().to(ConfigurationReader.get("onlineBankingPageUrl"));
        }

        String path = "//span[.='"+linkTitle+"']";
        //go to the given linkTitle
        WebElement link = Driver.get().findElement(By.xpath(path));
        BrowserUtils.clickWithTimeOut(link,10);

    }
}
