package ru.solyankinas.autotest;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HomeTest extends BaseTest{

    @Test
    public void fieldSeach() {
        inputTextSearch("Погода Пенза");
        clickButtonSearch();
        String textComparison = "Погода";
        Assert.assertTrue(getTextFirstLink().contains(textComparison));
    }

}