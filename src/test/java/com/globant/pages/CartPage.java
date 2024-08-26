package com.globant.pages;

import com.globant.utils.basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(id = "checkout")
    private WebElement checkoutBtn;

    public CheckoutInfoPage clickCheckout() {
        super.isElementClickable(checkoutBtn);
        return new CheckoutInfoPage(super.driver);
    }

    public CartPage(WebDriver driver) {
        super(driver);
    }
}
