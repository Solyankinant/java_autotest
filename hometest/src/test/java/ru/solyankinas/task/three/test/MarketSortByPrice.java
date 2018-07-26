package ru.solyankinas.task.three.test;


import org.testng.Assert;
import org.testng.annotations.Test;

public class MarketSortByPrice  extends TestBase{

    @Test
    public void marketSortByPriceTest (){
        getPageYandexMarket().startYandexMarket();
        getPageYandexMarket().clickCategoty();
        getPagePcLopTop().sortByPrice("по цене");
        getPagePcLopTop().priceComparison();
        Assert.assertTrue(getPagePcLopTop().priceComparison());


    }

}
