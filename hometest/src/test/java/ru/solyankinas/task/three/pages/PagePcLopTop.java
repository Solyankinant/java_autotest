package ru.solyankinas.task.three.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import static javax.swing.text.html.CSS.getAttribute;


public class PagePcLopTop  extends BasePage{

    /*@FindBy(css = ".n-filter-sorter_state_select a")
    protected WebElement singSort;*/
    @FindBy(css = "[role='listbox']")
    protected WebElement buttonSelectSizeList;
    @FindBy(css = "[href=\"/compare?track=head\"]")
    protected WebElement selectCompars;
    private By resultListGoods = By.cssSelector(".n-snippet-card2__title");
    private By selectTextButton = By.cssSelector(".select__text");
    private By SortBy = By.cssSelector(".link.link_theme_major ");
    private By price = By.cssSelector(".n-snippet-list div[class ='price']");
    //private By listelement = By.cssSelector(".n-snippet-card2__image");
    private By compari = By.cssSelector(".n-user-lists_type_compare");
    private String textAttributeSingSort = "link_hovered_yes";



    public PagePcLopTop(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void moveToButtonShowBy() {
        moveTo(buttonSelectSizeList);
        buttonSelectSizeList.click();
    }

    public void selectNumbersItemsInList(String selectText){
        getListSortBy(selectText,selectTextButton ).click();
    }

    public WebElement getListSortBy(String selectText, By locator) {
        List<WebElement> listSelectText = driver.findElements(locator);
        for (WebElement list : listSelectText) {
            if (selectText.equals(list.getText())) {
                return list;
            }
        }
        return null;
    }

    public boolean checkDisplayQuantityGoods(int numberRowsResult) {
        driver.navigate().refresh();
        List<WebElement> listSelectText = driver.findElements(resultListGoods);
        if (numberRowsResult == listSelectText.size()) {
            return true;
        } else return false;
    }

    public void selectSort(String text){
        getListSortBy(text, SortBy).click();
    }
    public boolean checkSortByPrice(){
        return convertNumericFormatAndComparison(convertingPurifiedToList(readPriceGoods(price)));
    }

    public List<WebElement> readPriceGoods(By locator) {
        driver.navigate().refresh();
        List<WebElement> listSelectText = driver.findElements(locator);
        return listSelectText;

    }


    public List<String> convertingPurifiedToList(List<WebElement> list) {
        List<String> listString = new ArrayList<String>();
        for (int i = 0; i<list.size(); i++){
            String text = list.get(i).getText();
            listString.add(clearingPriceExtraCharacters(text));
        }
        return listString;
    }

    public String clearingPriceExtraCharacters(String str){
        str = str.replaceAll("\\s+","");
        str = str.replaceAll("\\u20BD","");
        str = str.replaceAll("от","");
        return str;
    }

    public Boolean convertNumericFormatAndComparison(List<String> text){
        for ( int i = 0; i < text.size()-1; i++ ){
            if(!(Integer.parseInt(text.get(i)) <= Integer.parseInt(text.get(i+1)))){
                    return false;
                }
        }
        return true;
    }

    public void selectItemsToComparison(int count) {
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
        /*Actions action = new Actions(driver);
        action.moveToElement(selectCompars).perform();*/
        selectCompars.click();
    }

    public boolean checkPresenceSortSing () {
        //selectSort("по цене");
        moveTo(getListSortBy("по цене",SortBy));
        //Thread.sleep(1000);
        //driver.navigate().refresh();
        String textAttribute = getListSortBy("по цене",SortBy).getAttribute("class");
        //String textAttribute = singSort.getAttribute("class");
        //System.out.println(textAttribute);
        if (textAttribute.contains(textAttributeSingSort)){
            return true;
        }else return false;
    }


}