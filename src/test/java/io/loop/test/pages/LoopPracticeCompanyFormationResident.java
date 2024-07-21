package io.loop.test.pages;

import io.loop.test.utillitis.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoopPracticeCompanyFormationResident {
   public LoopPracticeCompanyFormationResident() {
       PageFactory.initElements(Driver.getDriver(), this);
   }

   // page 1 =====================================================
   @FindBy(xpath = "//img[@alt='Docuport']")
   public WebElement pageLogo;

    @FindBy(xpath = "//h3[@class='mb-2 subtitle-1 font-weight-medium']")
    public WebElement orderSummary;

    @FindBy(xpath = "//p[.=' State registration fee ']")
    public WebElement stateRegistrationFee;

    @FindBy(xpath = "//p[.=' Payment processing ']")
    public WebElement paymentProcessing;

    @FindBy(xpath = "//p[.=' Service fee ']")
    public WebElement serviceFee;

    @FindBy(xpath = "//p[.=' Total ']")
    public WebElement total;

    /// ----------------------------------------------------

    @FindBy(xpath = "//h1[.=' LLC Registration ']")
    public WebElement llcRegistration;

    @FindBy(xpath = "//span[.='1']")
    public WebElement number1;

    @FindBy(xpath = "//span[.='2']")
    public WebElement number2;

    @FindBy(xpath = "//span[.='3']")
    public WebElement number3;

    @FindBy(xpath = "//span[.='4']")
    public WebElement number4;

    @FindBy(xpath = "//p[.=' Company Information ']")
    public WebElement companyInformation;

    @FindBy(xpath = "//p[.=' Registered Agent and Business Address ']")
    public WebElement regAgentandBusiness;

    @FindBy(xpath = "//p[.=' Management Structure ']")
    public WebElement managementStructure;

    @FindBy(xpath = "//p[.=' Payment Information ']")
    public WebElement paymentInformation;

 /// ----------------------------------------------------

    @FindBy(xpath = "//h4[@class='subtitle-1 font-weight-medium __web-inspector-hide-shortcut__']")
    public WebElement typeOfBusiness;

    @FindBy(xpath = "//label[.='LLC']")
    public WebElement llcRaioButton;

    @FindBy(xpath = "//label[.='Corporation']")
    public WebElement CorporationRaioButton;

 /// ----------------------------------------------------

    @FindBy(xpath = "//h4[.=' Formation State * ']")
    public WebElement formationState;

    @FindBy(xpath = "//label[.='Delaware']")
    public WebElement delaverButton;

    @FindBy(xpath = "//label[.='Maryland']")
    public WebElement marylandButton;

    @FindBy(xpath = "//label[.='Virginia']")
    public WebElement virginiaButton;

    @FindBy(xpath = "//label[.='Washington D.C.']")
    public WebElement washingtonButton;

    @FindBy(xpath = "//div[.='Legal Company Name  *']//following-sibling::input")
    public WebElement nameCompany;

    @FindBy(xpath = "//div[.='DBA (Doing Business As)']//following-sibling::input")
    public WebElement dbaInfo;

    @FindBy(xpath = "//div[.='Industry *']//following-sibling::input")
    public WebElement industryDropBox;

    @FindBy(xpath = "//div[contains(text(), 'Accounting')]")
    public WebElement selectAccounting;

    @FindBy(xpath = "//div[.='First name *']//following-sibling::input")
    public WebElement firstName;

    @FindBy(xpath = "//div[.='Last name *']//following-sibling::input")
    public WebElement lastName;

    @FindBy(xpath = "//div[.='Email address *']//following-sibling::input")
    public WebElement email;

    @FindBy(xpath = "//div[.='Phone number *']//following-sibling::input[1]")
    public WebElement phoneNumber;

    @FindBy(xpath = "//div[.='Fax']//following-sibling::input[1]")
    public WebElement fax;

    @FindBy(xpath = "//span[.=' Next ']/..")
    public WebElement next;

 // page 2 ========================================================
    @FindBy(xpath = "(//label[text()='First name *']/following-sibling::input)[2]")
    public WebElement firstNamePage2;

    @FindBy(xpath = "(//label[text()='Last name *']/following-sibling::input)[2]")
    public WebElement lastNamePage2;

    @FindBy(xpath = "(//label[text()='Email address *']/following-sibling::input)[2]")
    public WebElement emailPage2;

    @FindBy(xpath = "(//label[text()='Phone number *']/following-sibling::input)[2]")
    public WebElement phoneNumberPage2;

    @FindBy(xpath = "(//label[text()='First name *']/following-sibling::input)[2]")
    public WebElement streetAdres;

    @FindBy(xpath = "(//label[text()='First name *']/following-sibling::input)[2]")
    public WebElement city;

    @FindBy(xpath = "(//label[text()='First name *']/following-sibling::input)[2]")
    public WebElement zipCode;

    @FindBy(xpath = "//label[.='Jurisdiction *']//following-sibling::input")
    public WebElement jurisdictionDropBox;
///// befor this - need fix 
    @FindBy(xpath = "//div[text()='Washington D.C.']")
    public WebElement washingtonDropDown;

    @FindBy(xpath = "//label[.='Individual']")
    public WebElement individualRadio;

    @FindBy(xpath = "//label[.='Company']")
    public WebElement companyRadio;

    @FindBy(xpath = "//label[.='Use Registered Agent Address']")
    public WebElement useRegRadio;

//    @FindBy(xpath = "(//label[.='Washington D.C.'])[2]")
//    public WebElement AddBusinessRadio;






}
