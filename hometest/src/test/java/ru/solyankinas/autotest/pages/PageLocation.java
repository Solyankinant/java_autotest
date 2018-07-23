package ru.solyankinas.autotest.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageLocation {
    protected WebDriver driver;
    @FindBy(id = "city__front-input")
    protected WebElement fildInputLocation;
    @FindBy(xpath = "//li[1]")
    protected WebElement linkCity;


    public PageLocation(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void inputCity(String City) {
        fildInputLocation.click();
        fildInputLocation.clear();
        fildInputLocation.sendKeys(City);
        clickLink(linkCity, driver, 10);

    }

    public void clickLink(WebElement locator, WebDriver driver, int timeout) {
        final WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.refreshed(
                ExpectedConditions.elementToBeClickable(locator)));
        locator.click();
    }


}