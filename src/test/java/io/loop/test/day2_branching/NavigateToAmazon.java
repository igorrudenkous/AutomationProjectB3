package io.loop.test.day2_branching;
/*
    navigate to amazon
    maximize
    navigate back
    navigate forward
    refresh
     */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToAmazon {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.com");

        driver.manage().window().maximize();

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();
    }
}
