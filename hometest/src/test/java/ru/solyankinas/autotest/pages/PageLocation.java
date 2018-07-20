package ru.solyankinas.autotest.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLocation {
    protected WebDriver driver;
    @FindBy(css = "#city__front-input")
    protected  WebElement fildInputLocation;
    @FindBy(xpath = "//li[2]")
    protected  WebElement linkCity;



    public PageLocation(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void fildInputLocation() {
        fildInputLocation.clear();
        fildInputLocation.click();
    }

    public void inputCity(String City) {
        fildInputLocation.sendKeys(City);
        //fildInputLocation.click();
        //fildInputLocation.sendKeys(Keys.ENTER);
        linkCity.click();
    }
    public void enterInputCity(){
        fildInputLocation.click();
        fildInputLocation.sendKeys(Keys.ENTER);
    }





}