package ru.moscowfilmschool.courses;

import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static ru.moscowfilmschool.courses.Urls.*;
import static ru.moscowfilmschool.courses.mainForm.actualEmail;

public class FeelMainFormTests {

    private mainForm openMainForm;

    @After
    public void postConditions() {
        openMainForm.waitForLoadPage();
        openMainForm.clickPlaceOrder();
        openMainForm.waitForLoadFeelButton();
        openMainForm.clickFeelButton();
        openMainForm.waitForLoadFormPage();
        openMainForm.personalDataFiller("тест", "тест", "тест", "11111111");
        openMainForm.clickSexChoose();
        openMainForm.contactsDataFiller(actualEmail, actualEmail, "9151231111", "мск");
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
        Selenide.closeWebDriver();
    }

    @Test
    public void feelActingPage() {
        openMainForm = open(actingPageUrl, mainForm.class);
    }

    @Test
    public void feelAnimationPage() {
        openMainForm = open(animationPageUrl, mainForm.class);
    }

    @Test
    public void feelCinematographyPage() {
        openMainForm = open(cinematographyPageUrl, mainForm.class);
    }

    @Test
    public void feelCostumesPage() {
        openMainForm = open(costumesPageUrl, mainForm.class);
    }

    @Test
    public void feelCriticsPage() {
        openMainForm = open(criticsPageUrl, mainForm.class);
    }

    @Test
    public void feelDirectionPage() {
        openMainForm = open(directionPageUrl, mainForm.class);
    }

    @Test
    public void feelEditingPage() {
        openMainForm = open(editingPageUrl, mainForm.class);
    }

    @Test
    public void feelFilmScoringPage() {
        openMainForm = open(filmScoringPageUrl, mainForm.class);
    }

    @Test
    public void feelMakeupArtistPage() {
        openMainForm = open(makeupArtistPageUrl, mainForm.class);
    }

    @Test
    public void feelNewDocPage() {
        openMainForm = open(newDocPageUrl, mainForm.class);
    }

    @Test
    public void feelProducerPage() {
        openMainForm = open(producerPageUrl, mainForm.class);
    }

    @Test
    public void feelScreenwritingPage() {
        openMainForm = open(screenwritingPageUrl, mainForm.class);
    }

    @Test
    public void feelSettingPage() {
        openMainForm = open(settingPageUrl, mainForm.class);
    }

    @Test
    public void feelShortFormDirectingPage() {
        openMainForm = open(shortFormDirectingPageUrl, mainForm.class);
    }

    @Test
    public void feelSoundEngineeringPage() {
        openMainForm = open(soundEngineeringPageUrl, mainForm.class);
    }

    @Test
    public void feelThreeDPage() {
        openMainForm = open(threeDPageUrl, mainForm.class);
    }

    @Test
    public void feelVfxPage() {
        openMainForm = open(vfxPageUrl, mainForm.class);
    }
}
