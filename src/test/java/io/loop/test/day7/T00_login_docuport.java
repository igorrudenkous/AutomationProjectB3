package io.loop.test.day7;

import io.loop.test.base.TestBase;
import io.loop.test.utillitis.DocuportConstants;
import io.loop.test.utillitis.DocuportUtils;
import org.testng.annotations.Test;

public class T00_login_docuport extends TestBase {
    @Test
    public void test_login_logout_docuport () throws InterruptedException {
        DocuportUtils.login(driver, DocuportConstants.CLIENT);
    }

    @Test
    public void sample () throws InterruptedException {
        DocuportUtils.login(driver, DocuportConstants.CLIENT);
    }
}
