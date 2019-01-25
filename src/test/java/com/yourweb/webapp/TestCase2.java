package com.yourweb.webapp;

import org.testng.annotations.*;
import org.testng.Assert;


public class TestCase2 extends BasePage
{
    
    @BeforeSuite
    public void Befor(){
        //initDriver();
        System.out.println("TC2 - Before Method");
    }
    
    @Test (priority=1)
    public void homePageTest(){
        System.out.println("TC2 Test 1");
    }
    
    @Test (priority = 2)
    public void homePageTest1(){
        System.out.println("TC2 Test 2");
    }
    
    @AfterSuite
    public void After(){
        tearDown();
        System.out.println("TC2 After Method");
    }
    
}
