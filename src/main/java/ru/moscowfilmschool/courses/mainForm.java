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

    // метод клика по кнопке "Подать заявку"
    public void clickPlaceOrder() {
        placeOrder.click();
    }

    // метод клика по кнопке "Заполнить"
    public void clickFeelButton() {
        feelButton.click();
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

    // метод заполнения страницы формы подачи завки
    public void mainFormPageFiller(String surname, String name, String patronymic) {
        setSurnameField(surname);
        setNameField(name);
        setPatronymicField(patronymic);
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

}
