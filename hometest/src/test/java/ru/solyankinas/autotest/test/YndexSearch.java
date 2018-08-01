package ru.solyankinas.autotest.test;

import org.testng.Assert;
import org.testng.annotations.Test;


public class YndexSearch extends BaseTest {

    @Test
    public void fieldSeach() {
        appManager.getPageSearch().inputTextSearch("Погода Пенза");
        appManager.getPageSearch().clickButtonSearch();
        String textComparison = "Погода";
        String textFirstLink = appManager.getResultSearch().getTextFirstLink();
        Assert.assertTrue(textFirstLink.contains(textComparison));
    }

}