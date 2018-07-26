package ru.solyankinas.task.three.test;

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


    }

}