package io.loop.test.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocatorsPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://loopcamp.vercel.app/registration_form.html");

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Loop");


        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Academy");

//        WebElement famele = driver.findElement(By.());
//        famele.click();

        Thread.sleep(19000);
        driver.quit();
    }

}
