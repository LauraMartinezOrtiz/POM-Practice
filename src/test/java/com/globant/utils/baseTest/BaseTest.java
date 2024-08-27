package com.globant.utils.baseTest;

import com.globant.pages.LoginPage;
import com.globant.pages.ProductListPage;
import com.globant.utils.MyDriver;
import org.testng.annotations.*;

public class BaseTest {

    private MyDriver driver;

    public LoginPage loadFirstPage() {
        return new LoginPage(driver.getDriver());
    }

    public ProductListPage loadProductListPage() {
        return new ProductListPage(driver.getDriver());
    }

    @BeforeTest
    protected void initializeDriver() {
        driver = new MyDriver();
        driver.getDriver().navigate().to("https://www.saucedemo.com/");
    }

    @BeforeMethod
    @Parameters({"username", "password"})
    public ProductListPage checkSuccessfulLogin(String username, String password) {
        LoginPage loginPage = loadFirstPage();

        loginPage.setUsername(username);
        loginPage.setPassword(password);

        return loginPage.clickLogin();
    }

    @AfterTest
    protected void closeDriver() {
        driver.getDriver().close();
    }
}