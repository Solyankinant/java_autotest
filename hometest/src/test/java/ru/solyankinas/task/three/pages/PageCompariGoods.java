package ru.solyankinas.task.three.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PageCompariGoods {
    protected WebDriver driver;

    By listelement = By.cssSelector(".n-snippet-card2__image");
    By compari = By.cssSelector(".n-user-lists_type_compare");
    By elementCompar = By.cssSelector(".price");
    By buttonDeleteList = By.cssSelector(".link__inner");
    By comparisonField = By.cssSelector("[href=\"https://yandex.ru/support/market/choice-goods/comparison.html\"]");

    @FindBy(css = "[href=\"/compare?track=head\"]")
    protected WebElement selectCompars;
    @FindBy(css = ".image_name_remove")
    protected WebElement imageDeletion;


    public PageCompariGoods(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    public void getResultElemaentPage(int count) {
        Actions action = new Actions(driver);
        List<WebElement> listCompari = driver.findElements(compari);
        for (int i = 0; i < count; i++) {
            action.moveToElement(listCompari.get(i)).perform();
            listCompari.get(i).click();
        }

    }

    public void selectCompar() {
        driver.navigate().refresh();
        Actions action = new Actions(driver);
        /*action.moveToElement(crossClose).perform();
        crossClose.click();*/
        action.moveToElement(selectCompars).perform();
        selectCompars.click();
    }

    public boolean countElementsCompar(int count) {
        List<WebElement> listCompari = driver.findElements(elementCompar);
        if (listCompari.size() == count) {
            return true;
        } else return false;

    }

    public void buttonDeleteList(String textMenu) {/*
        List<WebElement> listComparison = driver.findElements(buttonDeleteList);
        for (int i = 0; i < listComparison.size(); i++){
            if(textMenu.equals(listComparison.get(i).getText())){
                listComparison.get(i).click();
                break;
            }
        }*/
        imageDeletion.click();
    }

    /*public boolean checkDeletionComparisonList (String textMenu){
        List<WebElement> listCompari = driver.findElements(cjmparisonField);
        for (WebElement list : listCompari){
            System.out.println(list.getText());
            if(textMenu.equals(list.getText())){
                return true;
            } else return false;
        }
    }*/

    public boolean checkDeletionComparisonList(String textMenu) {
        String list = driver.findElement(comparisonField).getText();
        if (textMenu.contains(list)) {
            return true;
        } else return false;
    }


}
