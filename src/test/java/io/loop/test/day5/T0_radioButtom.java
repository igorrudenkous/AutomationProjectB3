package io.loop.test.day5;

import io.loop.test.utillitis.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T0_radioButtom {
    public static void main(String[] args) {

        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://loopcamp.vercel.app/radio-buttons.html");

//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement red = driver.findElement(By.xpath("//input[@id='red']"));
        WebElement green = driver.findElement(By.xpath("//input[@id='green']"));

        //isSelected();
        System.out.println("redisSelected(): " + red.isSelected());
        red.click();
        System.out.println("greenIsSelected(): " + green.isSelected());

        //isEnabled();
        System.out.println("redIsEnabled(): " + red.isEnabled());
        System.out.println("GreenIsEnabled(): " + green.isEnabled());


    }
}
