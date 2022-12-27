package ru.moscowfilmschool.courses;

import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static ru.moscowfilmschool.courses.Urls.cinematographyPageUrl;

public class cinematographyPageUrlTest {

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
        openMainForm.mainFormPageFiller("тест", "тест", "тест");

    }
}
