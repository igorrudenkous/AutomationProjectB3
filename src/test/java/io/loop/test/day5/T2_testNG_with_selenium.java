package io.loop.test.day5;

import io.loop.test.utillitis.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T2_testNG_with_selenium {
    WebDriver driver;
    String expected;
    String actual;

    @BeforeMethod
    public void setUpMethod () {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public  void tearDownMethod () {
        driver.close();
    }

    @Test
    public void googleTitle () {
        driver.get("https://www.google.com/");
        System.out.println("((RemoteWebDriver) driver).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());
        expected = "Google";
        actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Actual: " + actual + " does not match expected: " + expected);
    }

    @Test
    public void docuportTitle () {
        driver.get("https://beta.docuport.app/");
        System.out.println("((RemoteWebDriver) driver).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());
        expected = "Docuport";
        actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Actual: " + actual + " does not match expected: " + expected);
    }

}
