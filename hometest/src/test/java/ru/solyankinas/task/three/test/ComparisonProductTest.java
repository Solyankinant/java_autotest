package ru.solyankinas.task.three.test;


import org.testng.Assert;
import org.testng.annotations.Test;

public class ComparisonProductTest extends TestBase {

    @Test
    public void testComparisonProduct() {
        getYandexPage().startYandexMarket();
        getPageYandexMarket().selectCategoryLapTop();
        getPagePcLopTop().selectItemsToComparison(2);
        getPagePcLopTop().goToComparisonPage();
        Assert.assertTrue(getPageCompariGoods().checkPresenceElementsComparison(2));
        getPageCompariGoods().clickButtonDeleteList("Удалить список");
        Assert.assertTrue(getPageCompariGoods().checkDeletionComparisonList("Товаров нет."));
    }

}
