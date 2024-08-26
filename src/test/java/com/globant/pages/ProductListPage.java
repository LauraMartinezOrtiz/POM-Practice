package com.globant.pages;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.globant.utils.basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductListPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class, 'inventory_item')]//button[contains(@class, 'btn_inventory')]")
    private List<WebElement> addProductsBtn;

    @FindBy(css = ".shopping_cart_link")
    private WebElement cartBtn;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement menu;

    @FindBy(xpath = "//div[contains(@class, 'bm-menu')]//nav[contains(@class, 'bm-item-list')]//a[contains(@id, 'logout_sidebar_link')]")
    private WebElement logoutBtn;

    @FindBy(css = ".login_credentials_wrap-inner")
    private WebElement loginCredentials;

    public void addProduct(int index){
        addProductsBtn.get(index).click();
    }

    public CartPage selectCartBtn(){
        super.isElementClickable(cartBtn);
        return new CartPage(super.driver);
    }

    public LoginPage goBackToLogin(){
        super.isElementClickable(menu);
        super.isElementClickable(logoutBtn);
        return new LoginPage(super.driver);
    }

    public boolean checkLoginPage(){
        return super.isElementDisplayed(loginCredentials);
    }

    public ProductListPage(WebDriver driver) {
        super(driver);
    }
}
