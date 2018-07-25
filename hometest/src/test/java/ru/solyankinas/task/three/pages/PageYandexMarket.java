package ru.solyankinas.task.three.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageYandexMarket {
    protected WebDriver driver;

    @FindBy(css = "[data-id='market']")
    protected WebElement pageYandexMarket;
    @FindBy(css = "[data-department='Компьютеры']")
    protected WebElement categoryElectronics;
    @FindBy(css = "a[href='/catalog/54544/list?hid=91013&track=menuleaf']")
    protected WebElement categoryElectronicsLopTop;

    public PageYandexMarket(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void startYandexMarket() {
        pageYandexMarket.click();
    }

    public void moveTo(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();

    }

    public void waitClick(WebElement locator, WebDriver driver, int timeout) {
        final WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.refreshed(
                ExpectedConditions.elementToBeClickable(locator)));
        locator.click();
    }

    public void clickCategoty() {
        moveTo(categoryElectronics);
        waitClick(categoryElectronicsLopTop, driver, 10);

    }


}
