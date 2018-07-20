package ru.solyankinas.autotest.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.Keys.ENTER;

public class PageLocation {
    protected WebDriver driver;
    @FindBy(css = "#city__front-input")
    private WebElement fildInputLocation;
    @FindBy(xpath = "//li[2]")
    private WebElement linkCity;
    @FindBy(css = "[data-statlog='tabs.more']")
    private WebElement linkMore;
    @FindBy(css = ".home-tabs__more-top")
    private WebElement listMore;
    @FindBy(css = ".home-tabs__more-bottom")
    private WebElement bottomListMore;


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
        linkCity.click();
    }
    public void enterInputCity(){
        fildInputLocation.sendKeys(Keys.ENTER);
    }

    public void clickMore() {
        linkMore.click();
    }
    public String listMore(){
        String list;
        list = listMore.getText();
        return list;
    }
    public String bottomListMore(){
        String list;
        list = bottomListMore.getText();
        return list;
    }



}