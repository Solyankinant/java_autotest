package ru.solyankinas.task.three.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class NavigationYandexTest extends TestBase {
    @Test
    public void testNavigationYandex() {


        SoftAssert asert = new SoftAssert();

        getYandexNavigationPage().selectNavigation("Видео");
        asert.assertTrue(getYandexNavigationPage().waitLink("Свежее видео", getYandexNavigationPage().elementYandexVideo, 10));
        asert.assertTrue(getYandexNavigationPage().compersionUrl("https://yandex.ru/video/"));

        getYandexPage().openYandex();
        getYandexNavigationPage().selectNavigation("Картинки");
        asert.assertTrue(getYandexNavigationPage().waitLink("Мои коллекции", getYandexNavigationPage().elementYandexImages, 10));
        asert.assertTrue(getYandexNavigationPage().compersionUrl("https://yandex.ru/images/"));

        getYandexPage().openYandex();
        getYandexNavigationPage().selectNavigation("Новости");
        asert.assertTrue(getYandexNavigationPage().waitLink("ПОЛИТИКА", getYandexNavigationPage().elementYandexNews,10));
        asert.assertTrue(getYandexNavigationPage().compersionUrl("https://news.yandex.ru/"));

        getYandexPage().openYandex();
        getYandexNavigationPage().selectNavigation("Карты");
        asert.assertTrue(getYandexNavigationPage().waitLink("Поиск мест и адресов", getYandexNavigationPage().elementYandexMaps, 10));
        asert.assertTrue(getYandexNavigationPage().compersionUrl("https://yandex.ru/maps/"));

        getYandexPage().openYandex();
        getYandexNavigationPage().selectNavigation("Маркет");
        asert.assertTrue(getYandexNavigationPage().waitLink("Компьютеры", getYandexNavigationPage().elementYandexMarket, 10));
        asert.assertTrue(getYandexNavigationPage().compersionUrl("https://market.yandex.ru/"));

        getYandexPage().openYandex();
        getYandexNavigationPage().selectNavigation("Переводчик");
        asert.assertTrue(getYandexNavigationPage().waitLink("Переводчик", getYandexNavigationPage().elementYandexTranslate, 10));
        asert.assertTrue(getYandexNavigationPage().compersionUrl("https://translate.yandex.ru/"));

        getYandexPage().openYandex();
        getYandexNavigationPage().selectNavigation("Музыка");
        asert.assertTrue(getYandexNavigationPage().waitLink("Жанры", getYandexNavigationPage().elementYandexMusic, 10));
        asert.assertTrue(getYandexNavigationPage().compersionUrl("https://music.yandex.ru/"));

        getYandexPage().openYandex();
        getYandexNavigationPage().selectNavigation("ТВ онлайн");
        asert.assertTrue(getYandexNavigationPage().waitLink("Что посмотреть", getYandexNavigationPage().elementYandexTv, 10));
        asert.assertTrue(getYandexNavigationPage().compersionUrl("https://yandex.ru/1tv?stream_active=storefront"));

        asert.assertAll();

    }
}
