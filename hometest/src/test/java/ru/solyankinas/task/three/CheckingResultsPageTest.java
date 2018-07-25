package ru.solyankinas.task.three;

import org.testng.annotations.Test;


public class CheckingResultsPageTest extends TestBase {


    @Test
    public void marketCheckingResultsPage() {
        getPageYandexMarket().startYandexMarket();
        getPageYandexMarket().clickCategoty();
        getPagePcLopTop().clickButtonSelect();
        getPagePcLopTop().getSelectText("Показывать по 12").click();
        getPagePcLopTop().getResultEqualsList(12);
        getPagePcLopTop().clickButtonSelect();
        getPagePcLopTop().getSelectText("Показывать по 48").click();
        getPagePcLopTop().getResultEqualsList(48);


    }

}