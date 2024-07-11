package io.loop.test.day7;

import io.loop.test.base.TestBase;
import io.loop.test.utillitis.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/*
 1. go to https://loopcamp.vercel.app/
    2. click "Multiple Windows" link
    3. Validate "Powered by Loopcamp" is displayed
    4. Validate title is "Windows"
    5. Click - click here
    6. Switch to new window and validate title
 */
public class H3_task extends TestBase {
    @Test
    public void multipleWindow () {
        driver.get("https://loopcamp.vercel.app/");
        WebElement multipleWindow = driver.findElement(By.xpath("//a[contains(text(), 'Multiple Windows')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", multipleWindow);
        multipleWindow.click();

        WebElement poweredBy = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        poweredBy.isDisplayed();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        assertEquals(actualTitle, expectedTitle, "Actual: " + actualTitle + " does NOT match expected: " + expectedTitle + " => TEST FAILED");

        WebElement clickHere = driver.findElement(By.xpath("//a[contains(text(), 'Click Here')]"));
        clickHere.click();
        BrowserUtils.switchToWindow(driver, "New Window");
        String actualTitleNew = driver.getTitle();
        String expectedTitleNew = "New Window";
        assertEquals(actualTitle, expectedTitle, "Actual: " + actualTitle + " does NOT match expected: " + expectedTitle + " => TEST FAILED");
    }
}
