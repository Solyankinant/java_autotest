package ru.solyankinas.task.three.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PageCompariGoods extends BasePage {
    private By elementCompar = By.cssSelector(".price");
    private By buttonDeleteList = By.cssSelector(".link__inner");
    private By comparisonField = By.cssSelector("div[class=\"title title_size_18\"]");


    public PageCompariGoods(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean checkPresenceElementsComparison(int count) {
        driver.navigate().refresh();
        List<WebElement> listComparison = driver.findElements(elementCompar);
        if (listComparison.size() == count) {
            return true;
        } else return false;

    }

    public void clickButtonDeleteList(String textMenu) {
        List<WebElement> listComparison = driver.findElements(buttonDeleteList);
        for (int i = 0; i < listComparison.size(); i++) {
            if (textMenu.equals(listComparison.get(i).getText())) {
                listComparison.get(i).click();
                break;
            }
        }
    }

    public boolean checkDeletionComparisonList(String textMenu) {
        String list = driver.findElement(comparisonField).getText();
        if (textMenu.contains(list)) {
            return true;
        } else return false;
    }
}
