package io.loop.test.utillitis;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FakerData {
    /**
     * performs a pause
     * @param typeData
     * @author Igor
     */
    public static String fakerGenerator (String typeData) {
        String data = "";
        Faker faker = new Faker();
        switch (typeData.toLowerCase()) {
            case "firstname":
                data = faker.name().firstName();
                break;
            case "lastname":
                data = faker.name().lastName();
                break;
            case "fullstreetadress":
                data = faker.address().fullAddress();
                break;
            case "street":
                data = faker.address().streetAddress();
                break;
            case "city":
                data = faker.address().city();
                break;
            case "state":
                data = faker.address().state();
                break;
            case "zipcode":
                data = faker.address().zipCode();
                break;
            case "email":
                data = faker.internet().emailAddress();
                break;
            case "phone":
                data = faker.phoneNumber().cellPhone();
                break;
            case "fax":
                data = faker.phoneNumber().cellPhone();
                break;
            case "companyname":
                data = faker.company().name();
                break;
            case "companydba":
                data = faker.company().buzzword();
                break;
        }
        return data;
    }
}