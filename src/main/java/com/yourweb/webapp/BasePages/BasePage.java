package com.yourweb.webapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;



public class BasePage {
    static WebDriver driver;

    public void initDriver(){
        SafariOptions options = new SafariOptions();
        System.setProperty("webdriver.safari.driver","/usr/bin/safaridriver");
        driver = new SafariDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get("http://www.curworldofdata.com");
        
    }
    
    public void tearDown(){
        //driver.quit();
    }
    

    
    
}
