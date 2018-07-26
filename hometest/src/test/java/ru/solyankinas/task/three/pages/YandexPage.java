package ru.solyankinas.task.three.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by ASolyankin on 26.07.2018.
 */
public class YandexPage {
    protected WebDriver driver;

    public YandexPage(WebDriver driver){
        this.driver = driver;
    }

    public void openYandex(){
        driver.get("https://yandex.ru/");
    }

}
