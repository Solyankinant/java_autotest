package ru.solyankinas.task.three.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class YandexNavigationPage {
    protected WebDriver driver;

    By navigation = By.cssSelector("[role=\"navigation\" ] .home-link");
    @FindBy(css = "[class=\"related-serp__title\"]")
    public WebElement elementYandexVideo;
    @FindBy(css = "[href=\"/collections/user/\"]")
    public WebElement elementYandexImages;
    @FindBy (css = "[data-name='Финансы']")
    public WebElement elementYandexNews;



    public YandexNavigationPage(WebDriver driver){
        this.driver = driver;
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

    public void waitLink( WebElement element, int timeout){
        final WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOf(element));


    }

    public void link (){
        waitLink(elementYandexVideo, 10);
    }

    public boolean compersionUrl(String url){
        if (driver.getCurrentUrl().contains(url)) {
            return true;
        } else return false;
    }




}
