package com.globant.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriver {

    private WebDriver driver;

    public MyDriver() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.navigate().to("https://www.saucedemo.com/");
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}