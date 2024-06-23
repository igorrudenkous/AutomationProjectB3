package io.loop.test.day4;

import io.loop.test.utillitis.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
    http://the-internet.herokuapp.com/forgot-password
     */
public class T00_css_isDisplayed {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/forgot_password");
        WebElement forgotPsswordHeading = driver.findElement(By.cssSelector("div[class='example']>h2"));
        System.out.println(forgotPsswordHeading.getText());


// isDisplayed show us is visible our value or not
        if (forgotPsswordHeading.isDisplayed()) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        Thread.sleep(15000);
        driver.quit();

    }

}
