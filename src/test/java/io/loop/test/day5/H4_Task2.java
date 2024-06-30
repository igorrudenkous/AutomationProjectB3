package io.loop.test.day5;

import io.loop.test.utillitis.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

/*
1. go to https://www.etsy.com/
2. search for rings
3. validate that Estimated Arrival shows any time
3. click Estimated Arrival dropdown
4. click Select custom date
5. choose July 30 from dropdown
6. validate Estimated Arrival shows July 30

 */
public class H4_Task2 {
    WebDriver driver;
    String expectedDate = "By Jul 13";

    @BeforeMethod
    public void setupMethod () {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDownMethod () {
//        driver.close();
    }
    @Test
    public void validateEstimateArrival () {
        System.out.println("((RemoteWebDriver) driver).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        searchBox.sendKeys("rings" + Keys.ENTER);


        Select arrivalDateDropBox = new Select(driver.findElement(By.xpath("//span[contains(text(), 'Any time')]")));
        String actual = arrivalDateDropBox.getFirstSelectedOption().getText();
        String expected = "Any time";
        arrivalDateDropBox.getFirstSelectedOption().isSelected();
        Assert.assertEquals(actual, expected, "Actual: " + actual + " does NOT match expected: " + expected + " => TEST FAILED");

        arrivalDateDropBox.selectByValue("4");
        String expectedOption = "By Jul 13";
        String actualOption = arrivalDateDropBox.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption, expectedOption, "Actual: " + actualOption + " does NOT match expected: " + expectedOption + " => TEST FAILED");


        WebElement dateArrival = driver.findElement(By.xpath("//span[contains(text(), 'By Jul 13')]"));
        String actualDate = dateArrival.getText();
        Assert.assertEquals(actualDate, expectedDate, "Actual: " + actualDate + " does NOT match expected: " + expectedDate + " => TEST FAILED");

    }

}
