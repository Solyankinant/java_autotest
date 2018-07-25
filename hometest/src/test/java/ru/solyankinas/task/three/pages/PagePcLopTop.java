package ru.solyankinas.task.three.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;


public class PagePcLopTop {
    protected WebDriver driver;

    @FindBy(css = "[role='listbox']")
    protected WebElement buttonSelectSizeList;

    public PagePcLopTop(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void moveTo(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public void clickButtonSelect() {
        moveTo(buttonSelectSizeList);
        buttonSelectSizeList.click();
    }

    public WebElement getSelectText(String selectText) {
        List<WebElement> listSelectText = driver.findElements(By.cssSelector("[class=\"select__text\"]"));
        for (WebElement list : listSelectText) {
            if (selectText.equals(list.getText())) {
                return list;
            }
        }
        return null;
    }

    public void getResultEqualsList(int numberRowsResult) {
        driver.navigate().refresh();
        List<WebElement> listSelectText = driver.findElements(By.cssSelector("[class='n-snippet-card2__title']"));
        Assert.assertEquals(numberRowsResult, listSelectText.size());

    }


}