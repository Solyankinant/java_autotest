package ru.solyankinas.task.three.test;

import org.testng.Assert;
import org.testng.annotations.Test;


public class NavigationYandexTest extends TestBase{
    @Test
    public void testNavigationYandex() {

        getYandexNavigationPage().selectNavigation("Видео");
        getYandexNavigationPage().link();
        Assert.assertTrue(getYandexNavigationPage().compersionUrl("https://yandex.ru/video/"));

        /*getYandexPage().openYandex();
        getYandexNavigationPage().selectNavigation("Картинки");
        Assert.assertTrue(getYandexNavigationPage().compersionUrl("https://yandex.ru/images/"));
        getYandexPage().openYandex();
        getYandexNavigationPage().selectNavigation("Новости");
        Assert.assertTrue(getYandexNavigationPage().compersionUrl("https://news.yandex.ru/"));
        getYandexPage().openYandex();
        getYandexNavigationPage().selectNavigation("Карты");
        Assert.assertTrue(getYandexNavigationPage().compersionUrl("https://yandex.ru/maps/"));
        getYandexPage().openYandex();
        getYandexNavigationPage().selectNavigation("Маркет");
        Assert.assertTrue(getYandexNavigationPage().compersionUrl("https://market.yandex.ru/"));
        getYandexPage().openYandex();
        getYandexNavigationPage().selectNavigation("Переводчик");
        Assert.assertTrue(getYandexNavigationPage().compersionUrl("https://translate.yandex.ru/"));
        getYandexPage().openYandex();
        getYandexNavigationPage().selectNavigation("Музыка");
        Assert.assertTrue(getYandexNavigationPage().compersionUrl("https://music.yandex.ru/"));
        getYandexPage().openYandex();
        getYandexNavigationPage().selectNavigation("ТВ онлайн");
        Assert.assertTrue(getYandexNavigationPage().compersionUrl("https://yandex.ru/1tv?stream_active=storefront"));*/





    }
}
