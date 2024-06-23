package io.loop.test.day4;

import io.loop.test.utillitis.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
   verify forget password
   identify reser password heading using css and go from parent to child
    */
public class T0_forget_password {
    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://beta.docuport.app");

        WebElement forgetPasswordLink = driver.findElement(By.cssSelector("div[class='text-right']>a")); // from parent --> to child
//        WebElement forgetPasswordLink = driver.findElement(By.cssSelector("a[href='/reset-password']"));
        forgetPasswordLink.click();

        WebElement forgetPasswordHeading = driver.findElement(By.cssSelector("div[class='login-layout__form']>h1"));
        String forgetPasswordHeadingTEXT = forgetPasswordHeading.getText();








    }
}
