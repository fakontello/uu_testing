package ru.moscowfilmschool.courses;

import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static ru.moscowfilmschool.courses.Urls.showrunnerPageUrl;
import static ru.moscowfilmschool.courses.mainForm.actualEmail;

public class ShowrunnerPageTest {

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
    public void feelMainForm() {
        openMainForm.clickPlaceOrder();
        openMainForm.waitForLoadFeelButton();
        openMainForm.clickFeelButton();
        openMainForm.waitForLoadFormPage();
        openMainForm.personalDataFiller("тест", "тест", "тест", "11111111");
        openMainForm.clickSexChoose();
        openMainForm.contactsShowDataFiller(actualEmail, actualEmail, "9151231111");
        openMainForm.clickNextStepButton();
        openMainForm.waitForLoadGraduatePage();
        openMainForm.clickIAgreeShowCheckBox();
        openMainForm.clickIAcceptShowCheckBox();
        openMainForm.clickSendingButton();
        openMainForm.waitForLoadShowSendingPage();
    }
}
