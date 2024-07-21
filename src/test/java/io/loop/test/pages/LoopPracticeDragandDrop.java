package io.loop.test.pages;

import io.loop.test.utillitis.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoopPracticeDragandDrop {
    public LoopPracticeDragandDrop () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//div[@id='draggable']")
    public WebElement smallCircle;

    @FindBy (id = "droptarget")
    public WebElement bigCircle;
}
