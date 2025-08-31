package com.demowebshop.qa48;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @Test
    public void LoginPositiveTest(){
        //click on Register link
        click(By.xpath("//a[@href='/login']"));
        //enter Email
        type(By.id("Email"), "JaneBlack@gmail.com");
        //Enter Password
        type(By.id("Password"), "Jb123456789!");
        //click checkBox Remember me?
        click(By.name("RememberMe"));
        //click on Log in button
        click(By.xpath("//input[@value='Log in']"));
        //verify LogOut is displayed
        Assert.assertTrue(isElementPresent(By.xpath("//a[@href='/logout']")));

    }
}
