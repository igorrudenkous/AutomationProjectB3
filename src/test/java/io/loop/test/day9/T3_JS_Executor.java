package io.loop.test.day9;

import io.loop.test.utillitis.ConfigurationReader;
import io.loop.test.utillitis.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/*
   1. Go to https://www.etsy.com
   2. Scroll down
   3. Generate random email and enter into subscribe box
   4. Click on Subscribe
   5. Verify "Great! We've sent you an email to confirm your subscription." is displayed
    */
public class T3_JS_Executor {

    @Test
    public void etsy_scroll_test() {
        Driver.getDriver().get(ConfigurationReader.getProperties("etsy"));
        WebElement emailBox = Driver.getDriver().findElement(By.xpath(""));

        //how to scroll?
        // #1 use actions move to element

        Actions actions = new Actions(Driver.getDriver());
//        actions.moveToElement(emailBox).perform();
        // #2 use actions scroll to element
//        actions.scrollToElement(emailBox).perform();

        // #3 use Key PRESS

        // № 4 JS Executor

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
//        js.executeScript("window.scroll(5000)");
        js.executeScript("arguments[0].scrollIntoView(true)", emailBox);
        js.executeScript("arguments[0].click", emailBox);


    }

}


