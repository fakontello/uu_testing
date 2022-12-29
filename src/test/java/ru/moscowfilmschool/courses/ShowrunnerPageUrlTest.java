package ru.moscowfilmschool.courses;

import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static ru.moscowfilmschool.courses.Urls.showrunnerPageUrl;

public class ShowrunnerPageUrlTest {

    private mainForm openMainForm;

    @Before
    public void preconditions() {
        openMainForm = open(showrunnerPageUrl, mainForm.class);
        openMainForm.waitForLoadPage();
    }

    @After
    public void postConditions() {
        Selenide.closeWebDriver();
    }

    @Test
    public void feelMainFormTest() {
        openMainForm.clickPlaceOrder();
        openMainForm.waitForLoadFeelButton();
        openMainForm.clickFeelButton();
        openMainForm.waitForLoadFormPage();
        openMainForm.personalDataFiller("тест", "тест", "тест", "11111111");
        openMainForm.clickSexChoose();
        openMainForm.contactsShowDataFiller("asd@asd.as", "asd@asd.as", "9151231111");
        openMainForm.clickNextStepButton();
        openMainForm.waitForLoadGraduatePage();
        openMainForm.clickIAgreeShowCheckBox();
        openMainForm.clickIAcceptShowCheckBox();
        openMainForm.clickSendingButton();
        openMainForm.waitForLoadShowSendingPage();

    }
}
