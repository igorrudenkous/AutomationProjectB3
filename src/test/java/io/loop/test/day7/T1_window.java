package io.loop.test.day7;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.Set;

import static org.testng.Assert.assertEquals;

/*
   1. Open a chrome browser
   2. Go to : http://the-internet.herokuapp.com/windows
   3. Assert: Title is “The Internet”
   4. Click to: “Click Here” link
   5. Switch to new Window.
   6. Assert: Title is “New Window”
    */
public class T1_window extends TestBase {
    @Test
    public void windowTest () {
        driver.get("http://the-internet.herokuapp.com/windows");
        assertEquals(driver.getTitle(), "The Internet", "Results are not matching");

        WebElement clickHere = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
        clickHere.click();

        String originalWindow = driver.getWindowHandle();

        Set <String> windowHandle = driver.getWindowHandles();
        for (String each : windowHandle) {
            System.out.println("each window handle - " + each);
            driver.switchTo().window(each);
        }

        System.out.println(driver.getTitle());

        driver.switchTo().window(originalWindow);
        System.out.println(driver.getTitle());

    }

    @Test
    public void selenium4_window () {
        driver.get("http://the-internet.herokuapp.com/windows");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.switchTo().newWindow(WindowType.TAB);
    }
}
