package com.globant.pages;

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

    public void addProduct(int index){
        addProductsBtn.get(index).click();
    }

    public CartPage selectCartBtn(){
        super.isElementClickable(cartBtn);
        return new CartPage(super.driver);
    }

    public ProductListPage(WebDriver driver) {
        super(driver);
    }
}
