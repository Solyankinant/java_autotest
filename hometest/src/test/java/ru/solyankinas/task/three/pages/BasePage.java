package ru.solyankinas.task.three.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by ASolyankin on 25.07.2018.
 */
public class BasePage {
    protected WebDriver driver;
    protected Select select;

    public BasePage (WebDriver driver){
        this.driver = driver;
    }

    public void moveTo(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();

    }

    public Select getSelect(WebElement element) {
        select = new Select(element);
        return select;
    }

    public void waitClick(WebElement locator, WebDriver driver, int timeout) {
        final WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.refreshed(
                ExpectedConditions.elementToBeClickable(locator)));
        locator.click();
    }


}
