package ru.solyankinas.task.three.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;


public class PagePcLopTop {
    protected WebDriver driver;

    @FindBy(css = "[role='listbox']")
    protected WebElement buttonSelectSizeList;
    By resultList = By.cssSelector("[class='n-snippet-card2__title']");
    By selectTextButton = By.cssSelector("[class='select__text']");
    By selectSortByPrice = By.cssSelector(".n-filter-sorter");
    By price = By.cssSelector(".n-snippet-list div[class ='price']");


    public PagePcLopTop(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void moveTo(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public void moveToButtonSelect() {
        moveTo(buttonSelectSizeList);
        buttonSelectSizeList.click();
    }

    public void selectNumberResultRows (String selectText){
        getSelectText(selectText,selectTextButton ).click();
    }

    public WebElement getSelectText(String selectText, By locator) {
        List<WebElement> listSelectText = driver.findElements(locator);
        for (WebElement list : listSelectText) {
            if (selectText.equals(list.getText())) {
                return list;
            }
        }
        return null;
    }

    public void getResultEqualsList(int numberRowsResult) {
        driver.navigate().refresh();
        List<WebElement> listSelectText = driver.findElements(resultList);
        Assert.assertEquals(numberRowsResult, listSelectText.size());

    }

    public void sortByPrice (String text){
        getSelectText(text, selectSortByPrice).click();
    }
    public boolean priceComparison (){
        return parset(stringText(getResultEqualsPrice(price)));
    }

    public List<WebElement> getResultEqualsPrice (By locator) {
        driver.navigate().refresh();
        List<WebElement> listSelectText = driver.findElements(locator);
        return listSelectText;

    }


    public List<String> stringText (List<WebElement> list) {
        List<String> listString = new ArrayList<String>();
        for (int i = 0; i<list.size(); i++){
            String text = list.get(i).getText();
            listString.add(replaceSymbol(text));
        }
        return listString;
    }

    public String replaceSymbol(String str){
        str = str.replaceAll("\\s+","");
        str = str.replaceAll("\\u20BD","");
        str = str.replaceAll("от","");
        return str;
    }

    public Boolean parset (List<String> text){
        for ( int i = 0; i < text.size()-1; i++ ){
            if(!(Integer.parseInt(text.get(i)) <= Integer.parseInt(text.get(i+1)))){
                    return false;
                }
        }
        return true;
    }



}