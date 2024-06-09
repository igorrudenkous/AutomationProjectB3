package io.loop.test.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement searchBoxWithID = driver.findElement(By.id("APjFqb"));
        WebElement searchBoxWithName = driver.findElement(By.name("q"));
        WebElement aboutLink = driver.findElement(By.linkText("About"));

//        aboutLink.click();

        String texToSearch = "Feyruz is smart";

        searchBoxWithID.sendKeys("Nadir is smart");
        Thread.sleep(3000);
        searchBoxWithID.clear();
        Thread.sleep(3000);
        searchBoxWithID.sendKeys(texToSearch + Keys.ENTER);
//        searchBoxWithID.sendKeys(texToSearch + Keys.ENTER);
//        searchBoxWithID.sendKeys(texToSearch + Keys.ENTER);

    }
}
