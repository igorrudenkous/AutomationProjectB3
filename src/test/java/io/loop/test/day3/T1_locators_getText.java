package io.loop.test.day3;

import io.loop.test.utillitis.DocuportConstants;
import io.loop.test.utillitis.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * go to docuport
 * enter username
 * do NOT enter password
 * click on login button
 * verify error message - please enter password
 */
public class T1_locators_getText {
    public static void main(String[] args) {


        WebDriver driver = WebDriverUtil.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://beta.docuport.app/login?redirect=%2F");

        WebElement userName = driver.findElement(By.id("input-14"));
        userName.sendKeys(DocuportConstants.USERNAME_CLIENT);

        WebElement logInButton = driver.findElement(By.className("v-btn__content"));
        logInButton.click();

        WebElement errorMessage = driver.findElement(By.className("v-messages__message"));
        String actualErrorMessage = errorMessage.getText();

        if (actualErrorMessage.equals(DocuportConstants.ERROR_MESSAGE_EMPTY_PASSWORD)) {
            System.out.println("Expected error message: " + DocuportConstants.ERROR_MESSAGE_EMPTY_PASSWORD + ", matches actual error massage: " + actualErrorMessage + " => TEST PASS");
        } else {
            System.out.println("Expected error message: " + DocuportConstants.ERROR_MESSAGE_EMPTY_PASSWORD + ", DOES NOT MATCH actual error massage: " + actualErrorMessage + " => TEST FAIL");
        }
    }
}
