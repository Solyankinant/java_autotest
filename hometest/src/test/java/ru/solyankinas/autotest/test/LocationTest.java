package ru.solyankinas.autotest.test;


import org.testng.annotations.Test;

import java.util.Arrays;

public class LocationTest extends BaseTest {


    @Test
    public void yandexMore() {
        appManager.getPageSearch().clickLocation();
        appManager.getPageLocation().inputCity("Милан");
        appManager.getPageSearch().clickMore();
        String[] listMore = appManager.getPageSearch().getStringMore();
        appManager.getPageSearch().clickLocation();
        appManager.getPageLocation().inputCity("Прага");
        appManager.getPageSearch().clickMore();
        String[] listMoreSecondCity = appManager.getPageSearch().getStringMore();
        //appManager.getPageSearch().comparsionMore(listMore, listMoreSecondCity);
        Arrays.equals(listMore,listMoreSecondCity );

    }
}