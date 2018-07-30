package ru.solyankinas.task.three.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.solyankinas.task.three.test.TestBase;

import java.util.List;

public class PageCompariGoods extends BasePage{
    //protected WebDriver driver;

    /*private By listelement = By.cssSelector(".n-snippet-card2__image");
    private By compari = By.cssSelector(".n-user-lists_type_compare");*/
    private By elementCompar = By.cssSelector(".price");
    private By buttonDeleteList = By.cssSelector(".link__inner");
    private By comparisonField = By.cssSelector("[href=\"https://yandex.ru/support/market/choice-goods/comparison.html\"]");

   /* @FindBy(css = "[href=\"/compare?track=head\"]")
    protected WebElement selectCompars;*/
   /* @FindBy(css = ".image_name_remove")
    protected WebElement imageDeletion;*/


    public PageCompariGoods(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    /*public void selectItemsToComparison(int count) {
        Actions action = new Actions(driver);
        List<WebElement> listCompari = driver.findElements(compari);
        for (int i = 0; i < count; i++) {
            action.moveToElement(listCompari.get(i)).perform();
            listCompari.get(i).click();
        }

    }

    public void goToComparisonPage() {
        driver.navigate().refresh();
        moveTo(selectCompars);
        Actions action = new Actions(driver);
        action.moveToElement(selectCompars).perform();
        selectCompars.click();
    }*/

    public boolean checkPresenceElementsComparison(int count) {
        List<WebElement> listComparison = driver.findElements(elementCompar);
        if (listComparison.size() == count) {
            return true;
        } else return false;

    }

    public void clickButtonDeleteList(String textMenu) {
        List<WebElement> listComparison = driver.findElements(buttonDeleteList);
        for (int i = 0; i < listComparison.size(); i++){
            if(textMenu.equals(listComparison.get(i).getText())){
                listComparison.get(i).click();
                break;
            }
        }
        //imageDeletion.click();
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
