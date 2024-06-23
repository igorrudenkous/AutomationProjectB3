package io.loop.test.day4;

import io.loop.test.utillitis.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
task 1
=============
1. go to https://loopcamp.vercel.app/forgot-password.html
2. locate 5 elements, forgot password, email, email input, retrieve password, powered by LOOPCAMP
3. use css
4. verify those elements are displayed
 */
public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://loopcamp.vercel.app/forgot-password.html");
        WebElement forgotPassword = driver.findElement(By.cssSelector("div[class='example']>h2  "));
        WebElement email = driver.findElement(By.cssSelector("div[class='large-6 small-12 columns']>label"));
        WebElement emailInputBox = driver.findElement(By.cssSelector("input[type='text']"));
        WebElement retrievePasswordButtom = driver.findElement(By.cssSelector("div[class='large-6 small-12 columns']>input"));
        WebElement poweredByLOOPCAMP = driver.findElement(By.cssSelector("div[id='page-footer']>div>div"));

        WebDriverUtil.VerifyElementsAreDisplayed(forgotPassword);
        WebDriverUtil.VerifyElementsAreDisplayed(email);
        WebDriverUtil.VerifyElementsAreDisplayed(emailInputBox);
        WebDriverUtil.VerifyElementsAreDisplayed(retrievePasswordButtom);
        WebDriverUtil.VerifyElementsAreDisplayed(poweredByLOOPCAMP);

        Thread.sleep(15000);
        driver.close();
    }
}
