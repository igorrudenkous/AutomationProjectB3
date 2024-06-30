package io.loop.test.day5;
/*
1. go to http://the-internet.herokuapp.com/dropdown
2. validate "Please select an option" is selected by default
3. Choose option 1 and validate that it is selected
4. Choose option 2 and validate that it is selected
5. Validate dropdown name is "Dropdown List"

 */
import io.loop.test.utillitis.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class H4_Task1 {
    WebDriver driver;
    String expected = "Please select an option";
    String actual;

    @BeforeMethod
    public void sutupMethod () {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void teardownMethod () {
        driver.close();
    }

    @Test
    public void validateTheInternetPage () {
        System.out.println("((RemoteWebDriver) driver).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        actual = dropdown.getFirstSelectedOption().getText();
        dropdown.getFirstSelectedOption().isSelected();
        Assert.assertEquals(actual, expected, "Actual: " + actual + " does NOT match expected: " + expected + " => TEST FAILED");
    }

    @Test
    public void validateOption1 () {
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        dropdown.selectByValue("1");
        String expectedOption1 = "Option 1";
        String actualOption1 = dropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption1, expectedOption1, "Actual: " + actualOption1 + " does NOT match expected: " + expectedOption1 + " => TEST FAILED");
        }

     @Test
     public void validateOption2 () {
         Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
         dropdown.selectByValue("2");
         String expectedOption1 = "Option 2";
         String actualOption1 = dropdown.getFirstSelectedOption().getText();
         Assert.assertEquals(actualOption1, expectedOption1, "Actual: " + actualOption1 + " does NOT match expected: " + expectedOption1 + " => TEST FAILED\"");
     }

    @Test
    public void validateName () {
        WebElement dropdownName = driver.findElement(By.xpath("//h3[contains(text(), 'Dropdown List')]"));
        String expectedName = "Dropdown List";
        String actualName = dropdownName.getText();
        Assert.assertEquals(actualName, expectedName, "Actual: " + actualName + " does NOT match expected: " + expected + " => TEST FAILED\"");
    }
}







