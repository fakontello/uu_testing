package ru.moscowfilmschool.courses;

import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static ru.moscowfilmschool.courses.Urls.cinematographyPageUrl;

public class CinematographyPageUrlTest {

    private mainForm openMainForm;

    @Before
    public void preconditions() {
        openMainForm = open(cinematographyPageUrl, mainForm.class);
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
        openMainForm.contactsDataFiller("asd@asd.as", "asd@asd.as", "9151231111", "мск");
        openMainForm.clickNextStepButton();
        openMainForm.waitForLoadGraduatePage();
        openMainForm.clickNoUUStudy();
        openMainForm.clickMiddleGraduate();
        openMainForm.clickSecondNextStepButton();
        openMainForm.waitForLoadMotivationPage();
        openMainForm.motivationDataFiller("тест тест тест");
        openMainForm.clickThirdNextStepButton();
        openMainForm.waitForLoadAdditionalPage();
        openMainForm.clickIAcceptCheckBox();
        openMainForm.clickIAgreeCheckBox();
        openMainForm.clickNotBeingOnOpenDoorsDayCheck();
        openMainForm.clickNotBeingOnParties();
        openMainForm.clickSendingButton();
        openMainForm.waitForLoadSendingPage();

    }
}
