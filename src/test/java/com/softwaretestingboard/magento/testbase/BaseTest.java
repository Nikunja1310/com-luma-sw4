package com.softwaretestingboard.magento.testbase;


import com.softwaretestingboard.magento.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/*
 * Created by Niks
 * */
public class BaseTest extends Utility {
    String browser = "Chrome";
    @BeforeMethod
    public void setup(){
        selectBrowser(browser);
    }
    @AfterMethod
    public void tearDown(){
        closeBrowser();

    }
}