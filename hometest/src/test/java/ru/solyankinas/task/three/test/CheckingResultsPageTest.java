package ru.solyankinas.task.three.test;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CheckingResultsPageTest extends TestBase {


    @Test
    public void marketCheckingResultsPage() {
        getPageYandexMarket().startYandexMarket();
        getPageYandexMarket().clickCategoty();
        getPagePcLopTop().moveToButtonSelect();
        getPagePcLopTop().selectNumberResultRows("Показывать по 12");
        getPagePcLopTop().getResultEqualsList(12);
        getPagePcLopTop().moveToButtonSelect();
        getPagePcLopTop().selectNumberResultRows("Показывать по 48");
        getPagePcLopTop().getResultEqualsList(48);


        //Тест номер 3
        getPageCompariGoods().getResultElemaentPage(2);
        getPageCompariGoods().selectCompar();
        Assert.assertTrue(getPageCompariGoods().countElementsCompar(2));
        getPageCompariGoods().buttonDeleteList("Удалить список");
        Assert.assertTrue(getPageCompariGoods().checkDeletionComparisonList("Как добавить товар в сравнение"));




    }

}