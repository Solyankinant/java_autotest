package ru.solyankinas.autotest.test;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocationTest extends BaseTest {


    @Test
    public void yandexLocation() {
        appManager.pageSearch.clickLocation();
        appManager.pageLocation.fildInputLocation();
        appManager.pageLocation.inputCity("Милан");
        //appManager.pageLocation.enterInputCity();
        appManager.pageSearch.clickMore();
        String [] listTopMore = appManager.pageSearch.listMore().split("\n");
        /*for (int i = 0; i <17.; i++){
            System.out.println("Milan = " + listTopMore[i]);
        }*/
        /*String [] listTopMore = appManager.pageLocation.bottomListMore().split("\n");
        for (int i = 0; i <2; i++){
            System.out.println(listTopMore[i]);
        }*/


        //System.out.println("Список Милан = " +appManager.pageLocation.listMore());
        //System.out.println("Список Милан = " +appManager.pageLocation.returnList());
        appManager.pageSearch.clickLocation();
        appManager.pageLocation.fildInputLocation();
        appManager.pageLocation.inputCity("Прага");
        appManager.pageSearch.clickMore();
        //System.out.println("Список Прага = " + appManager.pageLocation.listMore());
        String [] listBottomMore = appManager.pageSearch.listMore().split("\n");
        for (int i = 0; i < 17; i++){
             //System.out.println("Praga = " + listBottomMore[i]);
            listTopMore[i].contains(listBottomMore[i]);
        }

    }
}