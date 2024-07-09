package io.loop.test.day7;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T0_iFrame extends TestBase {
    @Test
    public void testiFrame() {
        driver.get("https://loopcamp.vercel.app/nested-frames.html");
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");

        WebElement left = driver.findElement(By.xpath("//*[contains(text(),'LEFT')]"));
        String actualLeft = left.getText();

        Assert.assertEquals(actualLeft.trim(), "LEFT");
    }
}
