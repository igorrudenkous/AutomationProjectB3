package io.loop.test.day8;

import io.loop.test.utillitis.ConfigurationReader;
import io.loop.test.utillitis.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_upload {
    @Test
    public void uploadFile () throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperties("guru.url"));
        WebElement guru = Driver.getDriver().findElement(By.xpath("//input[@type='file']"));
        String path = "doc/doc/decstop/test.txt";
        guru.sendKeys(path);

        WebElement checkBox = Driver.getDriver().findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        WebElement submitButton = Driver.getDriver().findElement(By.xpath("//button[@id='submitbutton']"));
        submitButton.click();

        Thread.sleep(3000);

    }
}
