package io.loop.test.day7;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/*
go to https://loopcamp.vercel.app/nested-frames.html
    validate "LEFT", "MIDDLE", "RIGHT", "BOTTOM"
 */
public class H1_task  extends TestBase {
    @Test
    public void leftValidate () {
        driver.get("https://loopcamp.vercel.app/nested-frames.html");
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");

        WebElement left = driver.findElement(By.xpath("//*[contains(text(),'LEFT')]"));
        String actualLeft = left.getText();
        assertEquals(actualLeft.trim(), "LEFT");
    }

    @Test
    public void middleValidate () {
        driver.get("https://loopcamp.vercel.app/nested-frames.html");
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");

        WebElement left = driver.findElement(By.xpath("//*[contains(text(),'MIDDLE')]"));
        String actualLeft = left.getText();
        assertEquals(actualLeft.trim(), "MIDDLE");
    }
    @Test
    public void rightValidate () {
        driver.get("https://loopcamp.vercel.app/nested-frames.html");
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-right");

        WebElement left = driver.findElement(By.xpath("//*[contains(text(),'RIGHT')]"));
        String actualLeft = left.getText();
        assertEquals(actualLeft.trim(), "RIGHT");
    }

    @Test
    public void bottomValidate () {
        driver.get("https://loopcamp.vercel.app/nested-frames.html");
        driver.switchTo().frame("frame-bottom");

        WebElement left = driver.findElement(By.xpath("//*[contains(text(),'BOTTOM')]"));
        String actualLeft = left.getText();
        assertEquals(actualLeft.trim(), "BOTTOM");
    }
}

