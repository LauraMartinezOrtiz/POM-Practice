package com.globant.tests;

import com.globant.utils.baseTest.BaseTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PurchaseProductTest extends BaseTest {

    Logger log = LoggerFactory.getLogger(PurchaseProductTest.class);

    @Test
    @Parameters({"firstName", "lastName", "postalCode"})
    public void checkSuccessfulPurchase(String firstName, String lastName, String postalCode){
        log.info(firstName);
        Assert.assertEquals(firstName, "Laura");
    }

}