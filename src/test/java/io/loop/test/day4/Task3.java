package io.loop.test.day4;

import io.loop.test.utillitis.DocuportConstants;
import io.loop.test.utillitis.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
task 3
=============
1. navigate to docuport application
2. validate placeholders for user name and password
3. without sending username and password click login button
4. validate username and password error messages
 */
public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://beta.docuport.app");

        WebElement userNameOrEmailInputBox = driver.findElement(By.xpath("//input[contains(@id, 'input-14')]"));
        WebElement passwordInputBox = driver.findElement(By.xpath("//input[contains(@id, 'input-15')]"));
        WebElement logInButtom = driver.findElement(By.xpath("//span[normalize-space() = 'Log in']"));
        logInButtom.click();
        Thread.sleep(2000);

        WebElement actualLoginErrorMessage = driver.findElement(By.xpath("//div[contains(text(), 'Please enter your username')]"));
        String textActualLoginErrorMessage = actualLoginErrorMessage.getText();
        WebElement actualPasswordErrorMessage = driver.findElement(By.xpath("//div[contains(text(), 'Please enter your password')]"));
        String textActualPasswordErrorMessage = actualPasswordErrorMessage.getText();


        WebDriverUtil.elementEquals(DocuportConstants.ERROR_MESSAGE_EMPTY_LOGIN, textActualLoginErrorMessage);
        WebDriverUtil.elementEquals(DocuportConstants.ERROR_MESSAGE_EMPTY_PASSWORD, textActualPasswordErrorMessage);


    }
}
