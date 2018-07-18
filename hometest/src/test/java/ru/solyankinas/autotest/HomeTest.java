package ru.solyankinas.autotest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomeTest extends BaseTest{

    @Test
    public void fieldSeach() {
        textSearch();
        clickButtonSearch();
        String textComparison = "Погода";
        Assert.assertTrue(getTextFirstLink().contains(textComparison));
    }

    private String getTextFirstLink() {
        return driver.findElement(By.cssSelector("a[accesskey='1']")).getText();
    }

    private void clickButtonSearch() {
        driver.findElement(By.cssSelector("form[role='search'] button[type='submit']")).click();
    }

    private void textSearch() {
        String textSearch = "Погода Пенза";
        driver.findElement(By.cssSelector(("#text"))).sendKeys(textSearch);
    }

}
