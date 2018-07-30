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

    }

}