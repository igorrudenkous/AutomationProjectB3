package io.loop.test.day3;

import io.loop.test.utillitis.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class H_T2_etsy {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");
        Thread.sleep(10000);
        WebElement searBox = driver.findElement(By.id("global-enhancements-search-query"));

        String textToSearch = "wooden spoon";
        searBox.sendKeys(textToSearch + Keys.ENTER);
        Thread.sleep(3000);

        String actualTitle = driver.getTitle();
        WebDriverUtil.CheckTitle("Wooden spoon | Etsy", actualTitle);
    }
}
