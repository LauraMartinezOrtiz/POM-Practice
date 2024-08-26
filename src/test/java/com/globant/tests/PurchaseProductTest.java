package com.globant.tests;

import com.globant.pages.CartPage;
import com.globant.pages.CheckoutInfoPage;
import com.globant.pages.CheckoutOverviewPage;
import com.globant.pages.ProductListPage;
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
        ProductListPage productListPage = super.loadProductListPage();
        productListPage.addProduct(2);

        CartPage cartPage = productListPage.selectCartBtn();
        CheckoutInfoPage checkoutInfoPage = cartPage.clickCheckout();

        checkoutInfoPage.setFirstName(firstName);
        checkoutInfoPage.setLastName(lastName);
        checkoutInfoPage.setPostalCode(postalCode);

        CheckoutOverviewPage checkoutOverviewPage = checkoutInfoPage.continueToOverview();
    }

}