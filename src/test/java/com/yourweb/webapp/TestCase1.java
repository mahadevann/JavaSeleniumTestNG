package com.yourweb.webapp;

import org.testng.annotations.*;
import org.testng.Assert;


public class TestCase1 extends BasePage
{
    @DataProvider (name="datainp")
    public static Object[][] datainp(){
        return TestUtil.datainput();
    }
    
@BeforeTest
public void Befor(){
    //initDriver();
    System.out.println("Before Method");
}

@Test (priority=1, dataProvider = "datainp")
public void homePageTest(String a, String b){
    System.out.println("Test " + a + b);
}

@Test (priority = 2)
public void homePageTest1(){
System.out.println(" Test 2");
}

@AfterTest
public void After(){
    tearDown();
    System.out.println("After Method");
}

}
