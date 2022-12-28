package ru.moscowfilmschool.courses;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;


public class mainForm {

    // кнопка "Подать заявку"
    private final SelenideElement placeOrder = $(byXpath("//*[@id=\"layer\"]/header/div/div[2]/div[3]"));

    // кнопка "Заполнить"
    private final SelenideElement feelButton = $(byXpath("//*[@id=\"apply-modal\"]/div[3]/div"));

    // поле Фамилия
    private final SelenideElement surnameField = $(byName("deb30035-8e80-b9b2-b90a-d19be63e2466"));

    // поле Имя
    private final SelenideElement nameField = $(byName("a404e303-e662-2a36-b88d-58c1adb2aeb7"));

    // поле Отчество
    private final SelenideElement patronymicField = $(byName("c52151c1-aaa1-8731-5f39-a1f72621af9a"));

    // поле Дата рождения
    private  final SelenideElement birthdayField = $(byName("98cf5074-cd22-a917-64e6-22c2a170c4ac"));

    // поле Имейл
    private final SelenideElement emailField = $(byName("6291cd7a-d508-531e-6e6d-cd5a4a3701cc"));

    // поле Подтверждение имейла
    private final SelenideElement emailConfirmField = $(byName("6291cd7a-d508-531e-6e6d-cd5a4a3701cc-confirm"));

    // поле Телефон
    private final SelenideElement phoneField = $(byName("628bb6e6-d64b-e648-78c0-e5bbeb9e204f"));

    // поле Город
    private final SelenideElement cityField = $(byName("9b6fff85-f987-6a5c-1329-a4f7e7576e10"));

    // поле Мотивация
    private final SelenideElement motivationField = $(byName("53c4ce1f-7b5c-3bca-bca4-38e5b9997776"));

    // выбор мужского пола
    private final SelenideElement sexChoose = $(byXpath(".//label[1]//span[2]"));

    // кнопка "Следующий шаг"
    private final SelenideElement nextStepButton = $(byXpath("//*[@id=\"request-modal\"]/div[4]/div/span"));

    // вторая кнопка "Следующий шаг"
    private final SelenideElement secondNextStepButton = $(byXpath("//*[@id=\"request-modal\"]/div[4]/div[1]/span"));

    // третья кнопка "Следующий шаг"
    private final SelenideElement thirdNextStepButton = $(byXpath("//*[@id=\"request-modal\"]/div[4]/div[1]/span"));

    // елемент страницы с образованием
    private final SelenideElement educationPageElement = $(byClassName("request-modal__form_title"));

    // чек-бокс образования Серднее(11 классов)
    private final SelenideElement middleGraduate = $(byXpath(".//div[2]//span[text()='\n" +
            "        Среднее (11 классов)\n" +
            "    ']"));

    // чек-бокс Не учился в UU
    private final SelenideElement noUUStudy = $(byXpath(".//label[2]//span[2]"));

    // чек-бокс Не был на дне открытых дверей
    private final SelenideElement notBeingOnOpenDoorsDayCheck = $(byXpath("//*[@id=\"request-modal\"]/div[3]/div[3]" +
            "/div/form/div/div[2]/div[2]/label[2]/span[2]"));

    // чек-бокс не посещал мероприятия
    private final SelenideElement notBeingOnParties = $(byXpath("//*[@id=\"request-modal\"]/div[3]/div[3]/div/form" +
            "/div/div[3]/div[2]/label[2]/span[2]"));

    // элемент страницы Дополнительная информация
    private final SelenideElement addInformationPageElement = $(byXpath(".//div[1][text()='\n" +
            "        Дополнительная информация\n" +
            "    ']"));

    // Я подтверждаю
    private final SelenideElement iAcceptCheckBox = $(byXpath(".//div[5]//label"));

    // клик
    public void clickIAcceptCheckBox() {
        iAcceptCheckBox.click();
    }

    // я согласен
    private final SelenideElement iAgreeCheckBox = $(byXpath(".//div[7]//label//span[1]"));

    // клик
    public void clickIAgreeCheckBox() {
        iAgreeCheckBox.click();
    }

    // кнопка "Отправить"
    private final SelenideElement sendingButton = $(byXpath("//*[@id=\"request-modal\"]/div[4]/button"));

    // click
    public void clickSendingButton() {
        sendingButton.click();
    }

    // елемент страницы отправленной заявки
    private final SelenideElement sendingPageElement = $(byClassName("request-done__desc"));

    // метод клика по кнопке "Подать заявку"
    public void clickPlaceOrder() {
        placeOrder.click();
    }

    // метод клика по кнопке "Заполнить"
    public void clickFeelButton() {
        feelButton.click();
    }

    // метод выбора мужского пола
    public void clickSexChoose() {
        sexChoose.click();
    }

    // метод клика по кнопке "Следующий шаг"
    public void clickNextStepButton() {
        nextStepButton.click();
    }

    // метод клика по второй кнопке "Следующий шаг"
    public void clickSecondNextStepButton() {
        secondNextStepButton.click();
    }

    // метод клика по третьей кнопке "Следующий шаг"
    public void clickThirdNextStepButton() {
        thirdNextStepButton.click();
    }

    // метод выбора среднего образования
    public void clickMiddleGraduate() {
        middleGraduate.click();
    }

    // метод выбора того, что не учился в UU
    public void clickNoUUStudy() {
        noUUStudy.click();
    }

    // метод выбора того, что не был на дне открытых дверей
    public void clickNotBeingOnOpenDoorsDayCheck() {
        notBeingOnOpenDoorsDayCheck.click();
    }

    // метод выбора того что не посещал мероприятия
    public void clickNotBeingOnParties() {
        notBeingOnParties.click();
    }

    // метод заполнения поля "Фамилия"
    public void setSurnameField(String surname) {
        surnameField.setValue(surname);
    }

    // метод заполнения поля "Имя"
    public void setNameField(String name) {
        nameField.setValue(name);
    }

    // метод заполнения поля "Отчество"
    public void setPatronymicField(String patronymic) {
        patronymicField.setValue(patronymic);
    }

    // метод заполнения поля Дата рождения
    public void setBirthdayField(String birthday) {
        birthdayField.setValue(birthday);
    }

    // метод заполнения страницы формы подачи завки
    public void personalDataFiller(String surname, String name, String patronymic, String birthday) {
        setSurnameField(surname);
        setNameField(name);
        setPatronymicField(patronymic);
        setBirthdayField(birthday);
    }

    // метод заполнения поля Имейл
    public void setEmailField(String email) {
        emailField.setValue(email);
    }

    // метод заполнения поля Подтверждение имейла
    public void setEmailConfirmField(String emailConfirm) {
        emailConfirmField.setValue(emailConfirm);
    }

    // метод заполнения поля Телефон
    public void setPhoneField(String phone) {
        phoneField.setValue(phone);
    }

    // метод заполнения поля Город
    public void setCityField(String city) {
        cityField.setValue(city);
    }

    // метод заполнения контактной информации
    public void contactsDataFiller(String email, String emailConfirm, String phone, String city) {
        setEmailField(email);
        setEmailConfirmField(emailConfirm);
        setPhoneField(phone);
        setCityField(city);
    }

    // метод заполнения поля Мотивация
    public void setMotivationField(String motivation) {
        motivationField.setValue(motivation);
    }

    // филлер поля Мотивация
    public void motivationDataFiller(String motivation) {
        setMotivationField(motivation);
    }

    // метод ожидания загрузки формы перед подачей заявки
    public void waitForLoadFeelButton() {
        feelButton.shouldBe(Condition.visible);
    }

    // метод ожидания загрузки формы заполнения заявки
    public void waitForLoadFormPage() {
        surnameField.shouldBe(Condition.visible);
    }

    // метод ожидания загрузки страницы
    public void waitForLoadPage() {
        placeOrder.shouldBe(Condition.visible);
    }

    // метод ожидания страницы выбора образования
    public void waitForLoadGraduatePage() {
        educationPageElement.shouldBe(Condition.visible);
    }

    // метод оижадния страницы мотивации
    public void waitForLoadMotivationPage() {
        motivationField.shouldBe(Condition.visible);
    }

    // метод оижадния страницы Дополнительная информация
    public void waitForLoadAdditionalPage() {
        addInformationPageElement.shouldBe(Condition.visible);
    }

    // метод ожидания страницы отправленной заявки
    public void waitForLoadSendingPage() {
        sendingPageElement.shouldBe(Condition.visible);
    }

}
