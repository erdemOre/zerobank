package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewPayeePage extends BasePage{

    @FindBy(id = "add_new_payee")
    public WebElement addButton;

    public WebElement getInputBoxFor(String inputBoxName){
        inputBoxName = inputBoxName.replace(' ','_');
        inputBoxName = inputBoxName.toLowerCase();
        String idName = "np_new_" + inputBoxName;
        System.out.println("idName = " + idName);

        BrowserUtils.waitForPageToLoad(10);
        return Driver.get().findElement(By.id(idName));
    }

}
