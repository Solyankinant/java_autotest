package ru.solyankinas.autotest.test;


import org.testng.annotations.Test;

public class LocationTest extends BaseTest {


    @Test
    public void testLocationYandexFildMore() {
        appManager.getPageSearch().clickLocation();
        appManager.getPageLocation().inputCity("Милан");
        appManager.getPageSearch().clickMore();
        String[] listMoreFirstCity = appManager.getPageSearch().getStringMore();
        appManager.getPageSearch().clickLocation();
        appManager.getPageLocation().inputCity("Прага");
        appManager.getPageSearch().clickMore();
        String[] listMoreSecondCity = appManager.getPageSearch().getStringMore();
        appManager.getPageSearch().comparsionMore(listMoreFirstCity, listMoreSecondCity);

    }
}