package ru.solyankinas.autotest.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLocation {
    protected WebDriver driver;
    @FindBy(id = "city__front-input")
    protected  WebElement fildInputLocation;
    @FindBy(xpath = "//li[1]")
    protected  WebElement linkCity;



    public PageLocation(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void inputCity(String City) {
        fildInputLocation.click();
        fildInputLocation.clear();
        fildInputLocation.sendKeys(City);
        linkCity.click();

    }


}