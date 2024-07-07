package io.loop.test.day6;

import io.loop.test.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/*
    Information alert practice
    1. Open browser
    2. Go to website: https://loopcamp.vercel.app/javascript-alerts.html
    3. Click to “Click for JS Alert” button
    4. Click to OK button from the alert
    5. Validate “You successfully clicked an alert” text is displayed

    Confirmation alert practice
    1. Click to “Click for JS Confirm” button
    2. Click to OK button from the alert
    3. Verify “You clicked: Ok” text is displayed.
    4. Click to “Click for JS Confirm” button
    5. Click to Cancel button from the alert
    6. Validate “You clicked: Cancel” text is displayed.

    Prompt alert practice
    1. Click to “Click for JS Prompt” button
    2. Send "Loop Academy"
    3. Click Ok
    4. Validate "You entered: Loop Academy" text is displayed
     */
public class T1_alerts extends TestBase {
    @Test
    public void informationAlert () {
        driver.get("https://loopcamp.vercel.app/javascript-alerts.html");
        WebElement clickForJSAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        clickForJSAlert.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement successMessageForInformationAlert = driver.findElement(By.xpath("//p[@id='result']"));
        String expected = "You successfully clicked an alert";
        String actual = successMessageForInformationAlert.getText();
        assertEquals(actual, expected, "Actual: " + actual + " does NOT match expected: " + expected + " => TEST FAILED");
    }

    @Test
    public void confirmationAlert () {
        driver.get("https://loopcamp.vercel.app/javascript-alerts.html");
        WebElement clickForJSConfirm = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));

        clickForJSConfirm.click();
        driver.switchTo().alert().accept();
        WebElement successMessageForConfirmationAlert = driver.findElement(By.xpath("//p[@id='result']"));
        String expected = "You clicked: Ok";
        String actual = successMessageForConfirmationAlert.getText();
        assertEquals(actual, expected, "Actual does not match the expected");

        clickForJSConfirm.click();
        driver.switchTo().alert().dismiss(); // will click cancel = will dismiss the alert
        expected = "You clicked: Cancel";
        actual = successMessageForConfirmationAlert.getText();
        assertEquals(actual, expected, "Actual does not match the expected");
    }

    @Test
    public void promtAlert () {
        driver.get("https://loopcamp.vercel.app/javascript-alerts.html");
        WebElement clickForJSConfirm = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        String text = "loopcamp";
        clickForJSConfirm.click();
//        driver.switchTo().alert().sendKeys(text);      -----> First Way
//        driver.switchTo().alert().accept();
        Alert alert = driver.switchTo().alert();   //    -----> Second Way
        alert.sendKeys(text);
        alert.accept();

        WebElement successMessagePromtAlert = driver.findElement(By.xpath("//p[@id='result']"));
        String expected = "You entered: " + text;
        String actual = successMessagePromtAlert.getText();
        assertEquals(actual, expected, "Actual does not match the expected");

        clickForJSConfirm.click();
        driver.switchTo().alert().dismiss(); // will click cancel = will dismiss the alert
        expected = "You entered: " + null;
        actual = successMessagePromtAlert.getText();
        assertEquals(actual, expected, "Actual does not match the expected");


    }
}
