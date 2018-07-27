package ru.solyankinas.task.three.test;

import org.testng.Assert;
import org.testng.annotations.Test;


public class NavigationYandexTest extends TestBase {
    @Test
    public void testNavigationYandex() {

        getYandexNavigationPage().selectNavigation("Видео");
        Assert.assertTrue(getYandexNavigationPage().waitLink("Свежее видео", getYandexNavigationPage().elementYandexVideo, 10));
        Assert.assertTrue(getYandexNavigationPage().compersionUrl("https://yandex.ru/video/"));

        getYandexPage().openYandex();
        getYandexNavigationPage().selectNavigation("Картинки");
        Assert.assertTrue(getYandexNavigationPage().waitLink("Мои коллекции", getYandexNavigationPage().elementYandexImages, 10));
        Assert.assertTrue(getYandexNavigationPage().compersionUrl("https://yandex.ru/images/"));

        getYandexPage().openYandex();
        getYandexNavigationPage().selectNavigation("Новости");        
        Assert.assertTrue(getYandexNavigationPage().waitLink("ПОЛИТИКА", getYandexNavigationPage().elementYandexNews,10));
        Assert.assertTrue(getYandexNavigationPage().compersionUrl("https://news.yandex.ru/"));

        getYandexPage().openYandex();
        getYandexNavigationPage().selectNavigation("Карты");
        Assert.assertTrue(getYandexNavigationPage().waitLink("Поиск мест и адресов", getYandexNavigationPage().elementYandexMaps, 10));
        Assert.assertTrue(getYandexNavigationPage().compersionUrl("https://yandex.ru/maps/"));

        getYandexPage().openYandex();
        getYandexNavigationPage().selectNavigation("Маркет");
        Assert.assertTrue(getYandexNavigationPage().waitLink("Компьютеры", getYandexNavigationPage().elementYandexMarket, 10));
        Assert.assertTrue(getYandexNavigationPage().compersionUrl("https://market.yandex.ru/"));

        getYandexPage().openYandex();
        getYandexNavigationPage().selectNavigation("Переводчик");
        Assert.assertTrue(getYandexNavigationPage().waitLink("Переводчик", getYandexNavigationPage().elementYandexTranslate, 10));
        Assert.assertTrue(getYandexNavigationPage().compersionUrl("https://translate.yandex.ru/"));

        getYandexPage().openYandex();
        getYandexNavigationPage().selectNavigation("Музыка");
        Assert.assertTrue(getYandexNavigationPage().waitLink("Жанры", getYandexNavigationPage().elementYandexMusic, 10));
        Assert.assertTrue(getYandexNavigationPage().compersionUrl("https://music.yandex.ru/"));

        getYandexPage().openYandex();
        getYandexNavigationPage().selectNavigation("ТВ онлайн");
        Assert.assertTrue(getYandexNavigationPage().waitLink("Что посмотреть", getYandexNavigationPage().elementYandexTv, 10));
        Assert.assertTrue(getYandexNavigationPage().compersionUrl("https://yandex.ru/1tv?stream_active=storefront"));


    }
}
