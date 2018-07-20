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





}