package io.loop.test.day4;

import io.loop.test.utillitis.DocuportConstants;
import io.loop.test.utillitis.WebDriverUtil;
import org.openqa.selenium.*;

/*
    1. open chrome
    2. go to docuport
    3. click on forgot password
    4. validate url contains: reset password
    5. validate - Enter the email address associated with yor account
    6. enter forgotpasswordg1@gmail.com to email box
    7. validate send button is displayed
    8. validate cancel button is displayed
    9. click send button
    10. validate - We've sent you an email with a link to reset your password. Please check your email
     */
public class T000_xpath_getText {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://beta.docuport.app");


        WebElement forgotPassword = driver.findElement(By.xpath("//a[@href='/reset-password']"));
        forgotPassword.click();

        String actuaURL = driver.getCurrentUrl();

        if (actuaURL.contains(DocuportConstants.RESET_PASSWORD)) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }

        WebElement enterTheEmailField = driver.findElement(By.xpath("//*[contains(text(),'Enter the email')]"));
        String actualValidateMassage = enterTheEmailField.getText();

        if (actualValidateMassage.equals(DocuportConstants.RESET_PASSWORD_MESSAGE)) {
            System.out.println("MASSAGE - TEST PASSED");
        } else {
            System.out.println("MASSAGE - TEST FAILED");
        }

        WebElement emailInputBox = driver.findElement(By.xpath("//input[contains(@id, 'input')]"));
        emailInputBox.sendKeys(DocuportConstants.EMAIL_FOR_RESET_PASSWORD);

        WebElement cancelButtom = driver.findElement(By.xpath("//*[contains(text(), 'Cancel')]"));
        WebElement sendButtom = driver.findElement(By.xpath(" //span[normalize-space() = 'Send']"));

        if (cancelButtom.isDisplayed()) {
            System.out.println("Button \"Сancel Buttom\" is displayed => TEST PASSED");
        } else {
            System.out.println("Button - \"Сancel Buttom\" is not displayed => TEST FAILED");
        }

        if (sendButtom.isDisplayed()) {
            System.out.println("Button \"Send Buttom\" is displayed => TEST PASSED");
        } else {
            System.out.println("Button - \"Send Buttom\" is not displayed => TEST FAILED");
        }

        sendButtom.click();

        Thread.sleep(3000);
        WebElement messageReset = driver.findElement(By.xpath("//span[@class='body-1']"));
//        String actualMessageResetText = messageReset.getText();

        Thread.sleep(5000);

        try {
            System.out.println(messageReset.getText());
        } catch (StaleElementReferenceException e) {
            System.out.println("Element is not there anymore");
        }

//        if (messageReset.getText().equals(DocuportConstants.RESET_PASSWORD_TOEMAIL_MESSAGE)) {
//            System.out.println("Actual message, mathes expected message => TEST PASSED");
//        } else {
//            System.out.println("Actual message, NOT mathes expected message => TEST FAILED");
//        }


    }
}
