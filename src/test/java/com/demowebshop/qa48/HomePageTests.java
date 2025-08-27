package com.demowebshop.qa48;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase{

    @Test
    public void isHomeComponentPresentTest(){
        //driver.findElement(By.xpath("//h2[@class='topic-html-content-header']"));
        //System.out.println("Welcome to our store  -  " + isHomeComponentPresent());
        Assert.assertTrue(isHomeComponentPresent());
    }

}
