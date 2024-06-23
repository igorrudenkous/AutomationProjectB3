package io.loop.test.day3;

import io.loop.test.utillitis.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class H_T1_google {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        WebElement buttonGmailHomePage = driver.findElement(By.className("gb_I"));
        buttonGmailHomePage.click();

        String actualTitleGmail = driver.getTitle();
        WebDriverUtil.CheckTitle("Gmail", actualTitleGmail);

        driver.navigate().back();

        String actualTitleGoogle = driver.getTitle();
        WebDriverUtil.CheckTitle("Google", actualTitleGoogle);



        Thread.sleep(19000);
        driver.quit();
    }
}
