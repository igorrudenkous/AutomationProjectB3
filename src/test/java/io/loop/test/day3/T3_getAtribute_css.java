package io.loop.test.day3;

import io.loop.test.utillitis.DocuportConstants;
import io.loop.test.utillitis.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/*
    go to docuport app
    identify docuport with css
    get value of the attribute
    validate if it is "Docuport"

    the rest is home work
    locate:
    username
    password
    login
        with css
    login to docuport
    locate home icon of docuport after login or any other element after login
    validated that you logged in

     */

//input[placeholder='first name']
public class T3_getAtribute_css {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://beta.docuport.app");
        WebElement logo = driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']"));
        String docuport = logo.getAttribute("alt");

        if (DocuportConstants.LOGO_DOCUPORT.equals(docuport)) {
            System.out.println("Expected matches with actual");
            System.out.println("TEST PASSED");
        } else {
            System.out.println("Expected NOT matches with actual");
            System.out.println("TEST FAILED");
        }


        Thread.sleep(15000);
        driver.quit();
    }
}
