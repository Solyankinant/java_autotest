package ru.solyankinas.task.three.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class YandexPage extends BasePage {

    @FindBy(css = "[data-id='market']")
    protected WebElement pageYandexMarket;

    public YandexPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void openYandex() {
        driver.get("https://yandex.ru/");
    }

    public void startYandexMarket() {
        pageYandexMarket.click();
    }

}
