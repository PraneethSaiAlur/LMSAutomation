package com.lms.base;

import com.lms.utils.ConfigReader;
import com.lms.utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        ConfigReader.loadConfig();
        driver = DriverFactory.getDriver();
        driver.get(ConfigReader.getProperty("url"));
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
