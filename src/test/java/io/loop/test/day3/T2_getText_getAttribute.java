package io.loop.test.day3;

import io.loop.test.utillitis.DocuportConstants;
import io.loop.test.utillitis.LoopCampConstants;
import io.loop.test.utillitis.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
    go to url: https://loopcamp.vercel.app/registration_form.html
    verify header text expected:  Registration form
    verify placeholder attribute value expected - username
     */
public class T2_getText_getAttribute {
    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://loopcamp.vercel.app/registration_form.html");


        WebElement headerForForm = driver.findElement(By.tagName("h2"));
        String actualHeaderForForm = headerForForm.getText();

        if (actualHeaderForForm.equals(LoopCampConstants.EXPECTED_HEADER_FOR_FORM)) {
            System.out.println("Expected header for form: \"" + LoopCampConstants.EXPECTED_HEADER_FOR_FORM + "\", matches header for form: \"" + actualHeaderForForm + "\" => TEST PASSED");
        } else {
            System.out.println("Expected header for form: \"" + LoopCampConstants.EXPECTED_HEADER_FOR_FORM + "\", DOES NOT MATCH header for form: \"" + actualHeaderForForm + "\" => TEST FAIL");
        }

        WebElement firstNamePlaceHolder = driver.findElement(By.name("firstname"));
        String actualPlaceholderForFirstName = firstNamePlaceHolder.getAttribute("placeholder");

        if (actualPlaceholderForFirstName.equals(LoopCampConstants.EXPECTED_PLACEHOLDER_FIRSTNAME)) {
            System.out.println("Expected placeholder form: \"" + LoopCampConstants.EXPECTED_PLACEHOLDER_FIRSTNAME + "\", matches actual placeholder form: \"" + actualPlaceholderForFirstName + "\" => TEST PASSED");
        } else {
            System.out.println("Expected placeholder form: \"" + LoopCampConstants.EXPECTED_PLACEHOLDER_FIRSTNAME + "\", DOES NOT MATCH actual placeholder form: \"" + actualPlaceholderForFirstName + "\" => TEST FAILED");
        }
    }
}
