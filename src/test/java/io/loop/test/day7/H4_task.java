package io.loop.test.day7;

import io.loop.test.base.TestBase;
import io.loop.test.utillitis.DocuportWebTableUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/*
 1. go to https://loopcamp.vercel.app/web-tables.html
    2. create a method to test given field for a given name
    3. test type
    4. test amount
    5. test date
    6. test street
    7. test city
    8. test state
    9. test zip
    10. test card
    11. test card number
    12. test exp
 */
public class H4_task extends TestBase {
    @Test
    public void testType () throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String expected = "Pepperoni";
        String actual = DocuportWebTableUtils.returnAnyFieldLoopC(driver, "John Doe", "type");
        assertEquals(expected, actual, "Actual does not match the expected");
        System.out.println("actual = " + actual);
    }

    @Test
    public void testAmount () throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String expected = "3";
        String actual = DocuportWebTableUtils.returnAnyFieldLoopC(driver, "John Doe", "amount");
        assertEquals(expected, actual, "Actual does not match the expected");
        System.out.println("actual = " + actual);
    }

    @Test
    public void testDate () throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String expected = "01/08/2021";
        String actual = DocuportWebTableUtils.returnAnyFieldLoopC(driver, "John Doe", "date");
        assertEquals(expected, actual, "Actual does not match the expected");
        System.out.println("actual = " + actual);
    }

    @Test
    public void testStreet () throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String expected = "12, Cherry Ave";
        String actual = DocuportWebTableUtils.returnAnyFieldLoopC(driver, "John Doe", "street");
        assertEquals(expected, actual, "Actual does not match the expected");
        System.out.println("actual = " + actual);
    }

    @Test
    public void testCity () throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String expected = "Arlington, VA";
        String actual = DocuportWebTableUtils.returnAnyFieldLoopC(driver, "John Doe", "city");
        assertEquals(expected, actual, "Actual does not match the expected");
        System.out.println("actual = " + actual);
    }

    @Test
    public void testState () throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String expected = "Canada";
        String actual = DocuportWebTableUtils.returnAnyFieldLoopC(driver, "John Doe", "state");
        assertEquals(expected, actual, "Actual does not match the expected");
        System.out.println("actual = " + actual);
    }

    @Test
    public void testZip () throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String expected = "76743";
        String actual = DocuportWebTableUtils.returnAnyFieldLoopC(driver, "John Doe", "zip");
        assertEquals(expected, actual, "Actual does not match the expected");
        System.out.println("actual = " + actual);
    }

    @Test
    public void testCard () throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String expected = "MasterCard";
        String actual = DocuportWebTableUtils.returnAnyFieldLoopC(driver, "John Doe", "card");
        assertEquals(expected, actual, "Actual does not match the expected");
        System.out.println("actual = " + actual);
    }

    @Test
    public void testCardNum () throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String expected = "980077987700";
        String actual = DocuportWebTableUtils.returnAnyFieldLoopC(driver, "John Doe", "card number");
        assertEquals(expected, actual, "Actual does not match the expected");
        System.out.println("actual = " + actual);
    }

    @Test
    public void cardExp () throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String expected = "01/23";
        String actual = DocuportWebTableUtils.returnAnyFieldLoopC(driver, "John Doe", "exp");
        assertEquals(expected, actual, "Actual does not match the expected");
        System.out.println("actual = " + actual);
    }
}
