package io.loop.test.day3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Navigate to Google search
 * maximize the page
 * get title of the page
 * get url of the page
 * validate the title, expected title is "Google"
 * validate the url of the page, expected url is "https://www.google.com/"
 * close the brower
 */
public class GoogleSearch {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Actual title: " + actualTitle + ", mathes expected title: " + expectedTitle + ". => TEST PASS");
        } else {
            System.out.println("Actual title: + " + actualTitle + ", DOES NOT MATCH expected title: " + expectedTitle + ". => TEST FAIL");
        }

        String expectedURL = "https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedURL)) {
            System.out.println("Actual URL: " + actualUrl + ", mathes expected URL: " + expectedURL + ". => TEST PASS");
        } else {
            System.out.println("Actual URL: " + actualUrl + ", DOES NOT MATCH expected URL: " + expectedURL + ". => TEST FAIL");
        }






        driver.quit();









    }
}
