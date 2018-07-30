package ru.solyankinas.task.three.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageYandexMarket extends BasePage{


    @FindBy(css = "[data-department='Компьютеры']")
    protected WebElement categoryPC;
    @FindBy(css = "a[href='/catalog/54544/list?hid=91013&track=menuleaf']")
    protected WebElement categoryPCLapTop;

    public PageYandexMarket(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void selectCategoryLapTop() {
        moveTo(categoryPC);
        waitClick(categoryPCLapTop, driver, 10);

    }

}
