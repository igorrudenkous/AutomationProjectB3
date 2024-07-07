package io.loop.test.day6;
import io.loop.test.base.TestBase;
import io.loop.test.utillitis.PracticeConstanst;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
import static org.testng.Assert.*;

/*
task1
=============
go to https://demoqa.com/alerts
click - click button to see alert
handle alert
click - On button click, alert will appear after 5 seconds
handle alert
click - On button click, confirm box will appear
click ok and validate - You selected Ok
after that do it again this time cancel and validate - You selected Cancel
click - On button click, prompt box will appear
enter "Loop Academy" and validate You entered Loop Academy

 */
public class H1_Task_Alert extends TestBase{
    Alert alert;

    @Test
    public void clickButton () {
        driver.get("https://demoqa.com/alerts");
        WebElement clickButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickButton); //scroll down
        clickButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            // waiting alert appearance
            alert = wait.until(ExpectedConditions.alertIsPresent());
            // handle alert
            alert.accept();
        } catch (TimeoutException e) {
            // if alert will not appearance  ->
            System.out.println("No alert appeared.");
        }
    }

    @Test
    public void clickButton2 () {
        driver.get("https://demoqa.com/alerts");
        WebElement clickButton2 = driver.findElement(By.xpath(" //button[@id='timerAlertButton']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickButton2);
        clickButton2.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.accept();
        } catch (TimeoutException e) {
            System.out.println("No alert appeared.");
        }
    }

    @Test
    public void ClickButtonOk () {
        driver.get("https://demoqa.com/alerts");
        WebElement clickButtonOk = driver.findElement(By.xpath(" //button[@id='confirmButton']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickButtonOk);
        clickButtonOk.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.accept();
        } catch (TimeoutException e) {
            System.out.println("No alert appeared.");
        }
        WebElement successMessageForConfirmationAlert = driver.findElement(By.xpath("//span[@id='confirmResult']"));
        String actual = successMessageForConfirmationAlert.getText();
        String expected = PracticeConstanst.EXPECTED_DEMOQA_CLICKBUTTOM;
        assertEquals(actual, expected, "Actual: " + actual + " does NOT match expected: " + expected + " => TEST FAILED");
    }

    @Test
    public void ClickButtonCancel () {
        driver.get("https://demoqa.com/alerts");
        WebElement clickButtonCancel = driver.findElement(By.xpath(" //button[@id='confirmButton']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickButtonCancel);
        clickButtonCancel.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.dismiss();
        } catch (TimeoutException e) {
            System.out.println("No alert appeared.");
        }
        WebElement successMessageForConfirmationAlert = driver.findElement(By.xpath("//span[@id='confirmResult']"));
        String actual = successMessageForConfirmationAlert.getText();
        String expected = PracticeConstanst.EXPECTED_DEMOQA_CLICKBUTTOM_CANCEL;
        assertEquals(actual, expected, "Actual: " + actual + " does NOT match expected: " + expected + " => TEST FAILED");
    }

    @Test
    public void ClickButtonPrompt () {
        driver.get("https://demoqa.com/alerts");
        WebElement clickButtonPrompt = driver.findElement(By.xpath(" //button[@id='promtButton']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickButtonPrompt);
        clickButtonPrompt.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.sendKeys("Loop Academy");
            alert.accept();
        } catch (TimeoutException e) {
            System.out.println("No alert appeared.");
        }

        WebElement successMessageForConfirmationAlert = driver.findElement(By.xpath("//span[@id='promptResult']"));
        String actual = successMessageForConfirmationAlert.getText();
        String expected = PracticeConstanst.EXPECTED_DEMOQA_CLICKBUTTOM_LOOPACAREMY;
        assertEquals(actual, expected, "Actual: " + actual + " does NOT match expected: " + expected + " => TEST FAILED");
    }




}
