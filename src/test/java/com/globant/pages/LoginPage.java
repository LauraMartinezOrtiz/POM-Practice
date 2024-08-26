package com.globant.pages;

import com.globant.utils.basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(name = "user-name")
    private WebElement usernameTxt;

    @FindBy(id = "password")
    private WebElement passwordTxt;

    @FindBy(id = "login-button")
    private WebElement loginBtn;

    public void setUsername(String username) {
        this.usernameTxt.sendKeys(username);
    }

    public void setPassword(String password) {
        this.passwordTxt.sendKeys(password);
    }

    public ProductListPage clickLogin() {
        loginBtn.click();
        return new ProductListPage(super.driver);
    }

    public LoginPage(WebDriver driver) {
        super(driver);
    }

}
