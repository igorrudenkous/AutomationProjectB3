package io.loop.test.day4;

import io.loop.test.utillitis.DocuportConstants;
import io.loop.test.utillitis.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://beta.docuport.app");

        WebElement userNameOrEmailInputBox = driver.findElement(By.xpath("//input[contains(@id, 'input-14')]"));
        WebElement passwordInputBox = driver.findElement(By.xpath("//input[contains(@id, 'input-15')]"));
        WebElement logInButtom = driver.findElement(By.xpath("//span[normalize-space() = 'Log in']"));
        userNameOrEmailInputBox.sendKeys(DocuportConstants.USERNAME_CLIENT);
        passwordInputBox.sendKeys(DocuportConstants.PASSWORD_CLIENT);
        logInButtom.click();
        Thread.sleep(2000);

        WebElement afterLoginWindow = driver.findElement(By.xpath("//div[contains(@class, 'd-modal__header')]"));
        try {
            System.out.println(afterLoginWindow.getText());
        } catch (NoSuchElementException e) {
            System.out.println("Еhe element is not yet displayed");
        }
        WebDriverUtil.ValidateLogIn(afterLoginWindow);

        Thread.sleep(1000);
        WebElement continueButtom = driver.findElement(By.xpath("//button[@type='submit']"));
        continueButtom.click();
        Thread.sleep(1000);
        WebElement profileButtom = driver.findElement(By.xpath("//span[normalize-space() = 'Batch1 Group3']"));
        profileButtom.click();
        WebElement logOutButtom = driver.findElement(By.xpath("//span[normalize-space() = 'Log out']"));
        logOutButtom.click();
        Thread.sleep(1000);
        WebElement loginPageText = driver.findElement(By.xpath("//h1[@class='text-h5 font-weight-medium mb-6']"));
        WebDriverUtil.ValidateLogOut(loginPageText);

        Thread.sleep(20000);
        driver.close();














    }
}
