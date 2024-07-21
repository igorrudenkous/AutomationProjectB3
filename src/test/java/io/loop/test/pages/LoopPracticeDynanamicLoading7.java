package io.loop.test.pages;

import io.loop.test.utillitis.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoopPracticeDynanamicLoading7 {
    public LoopPracticeDynanamicLoading7(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id="alert")
    public WebElement doneMessage;

    @FindBy(xpath = "//img[@src='/img/a-few-moments.jpg']")
    public WebElement image;

    @FindBy(xpath = "//a[@href='dynamic_loading.html']")
    public WebElement dynamicLoading;

    @FindBy(xpath = "//a[@href='dynamic_loading/7.html']")
    public WebElement dynamicLoading7;

}
