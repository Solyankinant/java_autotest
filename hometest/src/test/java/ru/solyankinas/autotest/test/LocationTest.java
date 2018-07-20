package ru.solyankinas.autotest.test;


import org.testng.annotations.Test;

public class LocationTest extends BaseTest {


    @Test
    public void yandexLocation() {
        appManager.pageSearch.clickLocation();
        appManager.pageLocation.fildInputLocation();
        appManager.pageLocation.inputCity("Милан");
        appManager.pageLocation.enterInputCity();
        appManager.pageSearch.clickMore();
        String [] listMoreTop = appManager.pageSearch.listMore().split("(?=\\p{Lu})");
        /*for (int i = 0; i <21; i++){
            System.out.println("Milan = " + listMoreTop[i]);
        }*/

        appManager.pageSearch.clickLocation();
        appManager.pageLocation.fildInputLocation();
        appManager.pageLocation.inputCity("Прага");
        appManager.pageSearch.clickMore();
        String [] listBottomMore = appManager.pageSearch.listMore().split("(?=\\p{Lu})");
        for (int i = 0; i < 21; i++){
             //System.out.println("Praga = " + listBottomMore[i]);
            listMoreTop[i].contains(listBottomMore[i]);
        }

    }
}