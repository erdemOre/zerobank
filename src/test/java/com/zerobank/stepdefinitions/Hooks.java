package com.zerobank.stepdefinitions;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
        //navigate to zero bank page
        Driver.get().navigate().to(ConfigurationReader.get("loginPageUrl"));
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @After
    public void tearDown(Scenario sc){
        if(sc.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            sc.attach(screenshot,"image/png","screenshot");
        }

        Driver.closeDriver();
    }




}
