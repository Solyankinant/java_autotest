package ru.solyankinas.autotest.test;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HomeTest extends BaseTest {

    @Test
    public void fieldSeach() {
        appManager.inputTextSearch("Погода Пенза");
        appManager.clickButtonSearch();
        String textComparison = "Погода";
        Assert.assertTrue(appManager.getTextFirstLink().contains(textComparison));
    }

}