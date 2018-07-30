package ru.solyankinas.task.three.test;


import org.testng.Assert;
import org.testng.annotations.Test;

public class MarketSortByPrice  extends TestBase{

    @Test
    public void marketSortByPriceTest(){
        getYandexPage().startYandexMarket();
        getPageYandexMarket().selectCategoryLapTop();
        getPagePcLopTop().selectSort("по цене");
        Assert.assertTrue(getPagePcLopTop().checkSortByPrice());
        Assert.assertTrue(getPagePcLopTop().checkPresenceSortSing());

    }

}
