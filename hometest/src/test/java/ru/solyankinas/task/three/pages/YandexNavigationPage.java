package ru.solyankinas.task.three.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class YandexNavigationPage extends BasePage{

    private By navigation = By.cssSelector("[role=\"navigation\" ] .home-link");
    @FindBy(css = ".popular .related-serp__title")
    public WebElement elementYandexVideo;
    @FindBy(css = "a[href=\"/collections/user/\"]")
    public WebElement elementYandexImages;
    @FindBy(css = "[href=\"/politics.html?from=index\"]")
    public WebElement elementYandexNews;
    @FindBy(css = ".input_air-search-large__control")
    public WebElement elementYandexMaps;
    @FindBy(css = "[data-department='Компьютеры']")
    public WebElement elementYandexMarket;
    @FindBy(css = ".name span")
    public WebElement elementYandexTranslate;
    @FindBy(css = "[href='/genre']")
    public WebElement elementYandexMusic;
    @FindBy(css = "[data-statlog=\"stream.header.storefront\"]")
    public WebElement elementYandexTv;


    public YandexNavigationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getSelectText(String selectText, By locator) {
        List<WebElement> listSelectText = driver.findElements(locator);
        for (WebElement list : listSelectText) {
            if (selectText.equals(list.getText())) {
                return list;
            }
        }
        return null;
    }

    public void selectNavigation(String text) {
        getSelectText(text, navigation).click();
    }

    public boolean waitLink(String text, WebElement element, int timeout) {
        final WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
        if (text.contains(element.getText())) {
            return true;
        } else return false;

    }

    public boolean compersionUrl(String url) {
        if (driver.getCurrentUrl().contains(url)) {
            return true;
        } else return false;
    }

}
