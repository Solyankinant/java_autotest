package ru.solyankinas.task.three.test;

import org.testng.Assert;
import org.testng.annotations.Test;


public class MarketCheckItemDisplayPage extends TestBase {


    @Test
    public void marketCheckItemDisplayPage() {
        getYandexPage().startYandexMarket();
        getPageYandexMarket().selectCategoryLapTop();
        getPagePcLopTop().moveToButtonShowBy();
        getPagePcLopTop().selectNumbersItemsInList("Показывать по 12");
        Assert.assertTrue(getPagePcLopTop().checkDisplayQuantityGoods(12));
        getPagePcLopTop().moveToButtonShowBy();
        getPagePcLopTop().selectNumbersItemsInList("Показывать по 48");
        Assert.assertTrue(getPagePcLopTop().checkDisplayQuantityGoods(48));


        //Тест номер 3
       /* getPageCompariGoods().selectItemsToComparison(2);
        getPageCompariGoods().goToComparisonPage();
        Assert.assertTrue(getPageCompariGoods().checkPresenceElementsComparison(2));
        getPageCompariGoods().clickButtonDeleteList("Удалить список");
        Assert.assertTrue(getPageCompariGoods().checkDeletionComparisonList("Как добавить товар в сравнение"));*/




    }

}