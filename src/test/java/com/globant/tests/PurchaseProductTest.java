package com.globant.tests;

import com.globant.pages.LoginPage;
import com.globant.utils.baseTest.BaseTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PurchaseProductTest extends BaseTest {

    Logger log = LoggerFactory.getLogger(PurchaseProductTest.class);
    LoginPage loginPage;

    @Test
    @Parameters({"username", "password"})
    public void checkSuccessfulPurchase(String username, String password){
        log.info(username);
        Assert.assertEquals(username,"standard_user");
        loginPage.setUsername(username);
        loginPage.setPassword(password);
        loginPage.clickLogin();
    }
}