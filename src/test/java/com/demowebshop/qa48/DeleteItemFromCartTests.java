package com.demowebshop.qa48;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteItemFromCartTests extends TestBase{

    //pre-condition login and add item to the Cart
    @BeforeMethod
    public void precondition() {
        click(By.xpath("//a[@href='/login']"));
        type(By.id("Email"), "JaneBlack@gmail.com");
        type(By.id("Password"), "Jb123456789!");
        click(By.name("RememberMe"));
        click(By.xpath("//input[@value='Log in']"));
        click(By.xpath("//li[@class='inactive']/a[@href='/computers']"));
        click(By.xpath("//ul[@class='sublist']/li[@class='inactive']/a[@href='/notebooks']"));
        click(By.xpath("//select[@id='products-orderby']"));
        click(By.xpath("//select[@id='products-orderby']/option[2]"));
        click(By.xpath("//div[contains(@class,'product-item')]//a[@href='/141-inch-laptop']"));
        click(By.xpath("//input[@id='add-to-cart-button-31']"));
        click(By.xpath("//span[@title='Close']"));
    }

    @Test
    public void deleteItemToCartPositiveTest(){

        click(By.xpath("//span[text()='Shopping cart']"));
        click(By.xpath("//input[@name='removefromcart']"));
        click(By.xpath("//input[@name='updatecart']"));
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='order-summary-content']")));

    }
}
