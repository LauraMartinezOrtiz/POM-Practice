package com.globant.utils.baseTest;

import com.globant.utils.MyDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    MyDriver driver;

    @BeforeTest()
    protected void initializeDriver() {
        driver = new MyDriver();
    }

    @AfterMethod()
    protected void closeDriver() {
        driver.getDriver().close();
    }
}