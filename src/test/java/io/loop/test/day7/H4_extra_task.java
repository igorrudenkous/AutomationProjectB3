package io.loop.test.day7;

import io.loop.test.pages.LoopPracticeCompanyFormationResident;
import io.loop.test.utillitis.ConfigurationReader;
import io.loop.test.utillitis.Driver;
import io.loop.test.utillitis.FakerData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.loop.test.utillitis.PageUtilities.enterTextToTextBox;

public class H4_extra_task {
    LoopPracticeCompanyFormationResident loopPracticeCompanyFormationResident;

    @BeforeMethod
    public void setUpMethod(){
        loopPracticeCompanyFormationResident = new LoopPracticeCompanyFormationResident();
        Driver.getDriver().get(ConfigurationReader.getProperties("docu.reg.form"));
    }
    @Test
    public void pageRegistration1 () throws InterruptedException {
      //page - 1
       loopPracticeCompanyFormationResident.llcRaioButton.isSelected();
       loopPracticeCompanyFormationResident.washingtonButton.click();
       enterTextToTextBox("Legal Company Name  *", FakerData.fakerGenerator("companyname"), 1);
       enterTextToTextBox("DBA (Doing Business As) *", FakerData.fakerGenerator("companydba"), 1);
       enterTextToTextBox("First name *", FakerData.fakerGenerator("firstname"), 1);
       enterTextToTextBox("Last name *", FakerData.fakerGenerator("lastname"), 1);
       enterTextToTextBox("Email address *", FakerData.fakerGenerator("email"), 1);
       enterTextToTextBox("Phone number *", FakerData.fakerGenerator("phone"), 1);
       enterTextToTextBox("Fax", FakerData.fakerGenerator("fax"), 1);
       loopPracticeCompanyFormationResident.industryDropBox.click();
       loopPracticeCompanyFormationResident.selectAccounting.click();
       loopPracticeCompanyFormationResident.next.click();

        //page - 2
        loopPracticeCompanyFormationResident.individualRadio.isSelected();
        loopPracticeCompanyFormationResident.firstNamePage2.sendKeys(FakerData.fakerGenerator("firstname"));
        loopPracticeCompanyFormationResident.lastNamePage2.sendKeys(FakerData.fakerGenerator("lastname"));
        loopPracticeCompanyFormationResident.streetAdres.sendKeys(FakerData.fakerGenerator("street"));
        loopPracticeCompanyFormationResident.city.sendKeys(FakerData.fakerGenerator("city"));
        loopPracticeCompanyFormationResident.zipCode.sendKeys(FakerData.fakerGenerator("zip"));
        loopPracticeCompanyFormationResident.emailPage2.sendKeys(FakerData.fakerGenerator("email"));
        loopPracticeCompanyFormationResident.phoneNumberPage2.sendKeys(FakerData.fakerGenerator("phone"));
        loopPracticeCompanyFormationResident.jurisdictionDropBox.click();
        loopPracticeCompanyFormationResident.washingtonDropDown.click();
        loopPracticeCompanyFormationResident.useRegRadio.isSelected();
        loopPracticeCompanyFormationResident.next.click();











    }
}
