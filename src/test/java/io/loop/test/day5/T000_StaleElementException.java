package io.loop.test.day5;

//1. Open Chrome browser
//        2. Go to http://the-internet.herokuapp.com/add_remove_elements/
//        3. Click to “Add Element” button
//        4. Verify “Delete” button is displayed after clicking.
//        5. Click to “Delete” button.
//        6. Verify “Delete” button is NOT displayed after clicking.
//        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

import io.loop.test.utillitis.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T000_StaleElementException {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverUtil.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement addElement = driver.findElement(By.xpath("//button[contains(text(), 'Add Element')]"));
        addElement.click();


        WebElement deleteButtom = driver.findElement(By.xpath("//button[@class='added-manually']"));
        WebDriverUtil.VerifyElementsAreDisplayed(deleteButtom);
        deleteButtom.click();

        try {
            deleteButtom.isDisplayed();
        } catch (StaleElementReferenceException e) {
            System.out.println("Exception handled");
            System.out.println("Element is not displayed anymore");
        }



    }
}
