package io.loop.test.day9;

import io.loop.test.base.TestBase;
import io.loop.test.utillitis.ConfigurationReader;
import io.loop.test.utillitis.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

/*
 1. Go to https://www.google.com
 2. Hover over on Search button
 3. Hover over on Feeling Lucky button
  */
public class T1_actions_hoverover extends TestBase {
    @Test
    public void googleActionHoverover () throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperties("google.url"));
        WebElement googleSearch = Driver.getDriver().findElement(By.xpath("//input[@id='gbqfbb']/preceding-sibling::input"));
        WebElement feelingLucky = Driver.getDriver().findElement(By.xpath("//input[@id='gbqfbb']"));

        Actions actions = new Actions(Driver.getDriver());
        Thread.sleep(3000);

        actions.moveToElement(googleSearch).perform();
        Thread.sleep(3000);
        actions.moveToElement(feelingLucky).perform();

        actions.sendKeys(Keys.F12);
    }
}
