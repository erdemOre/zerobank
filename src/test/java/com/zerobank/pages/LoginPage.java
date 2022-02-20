package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

   @FindBy(id = "user_login")
   public WebElement usernameBox;

   @FindBy(id = "user_password")
    public WebElement passwordBox;

   @FindBy(name = "submit")
    public WebElement submitButton;



}
