package ru.solyankinas.autotest.test;


import org.testng.annotations.Test;

public class LocationTest extends BaseTest {


    @Test
    public void yandexMore() {
        appManager.pageSearch.clickLocation();
        appManager.pageLocation.fildInputLocation();
        appManager.pageLocation.inputCity("Милан");
        appManager.pageLocation.enterInputCity();
        appManager.pageSearch.clickMore();
        String[] listMoreTop = appManager.pageSearch.getStringMore();
        appManager.pageSearch.clickLocation();
        appManager.pageLocation.fildInputLocation();
        appManager.pageLocation.inputCity("Прага");
        appManager.pageSearch.clickMore();
        String[] listBottomMore = appManager.pageSearch.getStringMore();
        for (int i = 0; i < 21; i++){
            listMoreTop[i].contains(listBottomMore[i]);
        }

    }


}