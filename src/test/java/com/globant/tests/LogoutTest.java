package com.globant.tests;

import com.globant.pages.*;
import com.globant.utils.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {
    @Test
    public void checkSuccessfulLogout(){
        ProductListPage productListPage = super.loadProductListPage();
        productListPage.goBackToLogin();
        Assert.assertTrue(productListPage.checkLoginPage());
    }
}
