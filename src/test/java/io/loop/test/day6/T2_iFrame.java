package io.loop.test.day6;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;

import static org.testng.Assert.*;
/*
 /*
    1- Open a chrome browser
    2- Go to: https://loopcamp.vercel.app/iframe.html
    3- Clear text from comment body
    4- Type "Loop Academy" in comment body
    5- Verify "Loop Academy" text is written in comment body
    6- Verify header "An iFrame containing the TinyMCE WYSIWYG Editor" is displayed
     */

public class T2_iFrame extends TestBase {

        @Test
        public void iframeTest(){
            driver.get("https://loopcamp.vercel.app/iframe.html");
            WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")); // with xpath
            driver.switchTo().frame(iframe);
            WebElement textBox = driver.findElement(By.xpath("//*[@id='tinymce']"));
            textBox.clear();
            textBox.sendKeys("Loop Academy");
            assertEquals(textBox.getText(), "Loop Academy", "Actual is NOT matching with the expected");

            driver.switchTo().defaultContent();

            WebElement header = driver.findElement(By.xpath("//h3[contains(text(),'An iFrame')]"));
            System.out.println("textBox = " + header.getText());


//        WebElement header = driver.findElement(By.xpath("//h3[contains(text(),'An iFrame')]"));
//        System.out.println(header.getText());
//        WebElement textBox = driver.findElement(By.xpath("//*[@id='tinymce']"));
//        System.out.println("textBox = " + textBox);

    }
    @Test
    public void nestedFrame(){
        driver.get("https://loopcamp.vercel.app/nested-frames.html");
        List<WebElement> iframes;
        iframes = driver.findElements(By.xpath("//iframe"));
        System.out.println("iframes.size() = " + iframes.size());
    }

}
