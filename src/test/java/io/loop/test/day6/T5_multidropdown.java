package io.loop.test.day6;
/*
/*
    1. Open Chrome browser
    2. Go to https://demoqa.com/select-menu
    3. Select all the options from multiple select dropdown.
    4. Print out all selected values.
    5. Deselect all values.
     */

import io.loop.test.utillitis.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class T5_multidropdown {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod () {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void tearDownMethod () {
        //driver.close();
    }

    @Test
    public void multiDropDown () throws InterruptedException {
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='cars']")));
        Assert.assertTrue(dropdown.isMultiple(), "Dropdown is not multi select");

// Select 1 by 1 way
//        dropdown.selectByIndex(0);
//        Thread.sleep(3000);
//
//        dropdown.selectByValue("saab");
//        Thread.sleep(3000);
//
//        dropdown.selectByVisibleText("Opel");
//        Thread.sleep(3000);
//
//        dropdown.selectByIndex(3);


        //First REGULAR way to select all option
        List<WebElement> options;
        options = dropdown.getOptions();
//        for (WebElement option : options) {
//            option.click();
//            System.out.println(option.getText());
//        }

        //Second LAMBDA way to select all option
        options.forEach(option -> {
            option.click();
            System.out.println(option.getText());
        });


    }


}
