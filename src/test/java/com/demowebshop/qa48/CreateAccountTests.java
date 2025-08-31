package com.demowebshop.qa48;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{
    @Test
    public void newUserRegistrationPositiveTest(){
        int i = (int)((System.currentTimeMillis()/1000)%3600);

        //click on Register link
        click(By.xpath("//a[@href='/register']"));
        //choose gender
        click(By.id("gender-female"));
        //enter First Name
        type(By.name("FirstName"), "Jane");
        //enter Last Name
        type(By.name("LastName"), "Black");
        //enter Email
        type(By.id("Email"), "JaneBlack" + i + "@gmail.com");
        //Enter Password
        type(By.id("Password"), "Jb123456789!");
        //Confirm Password
        type(By.id("ConfirmPassword"), "Jb123456789!");
        //click on Register button
        click(By.id("register-button"));
        //verify LogOut is displayed
        Assert.assertTrue(isElementPresent(By.xpath("//a[@href='/logout']")));

    }

    @Test
    public void existedUserRegistrationNegativeTest(){

        //click on Register link
        click(By.xpath("//a[@href='/register']"));
        //choose gender
        click(By.id("gender-female"));
        //enter First Name
        type(By.name("FirstName"), "Jane");
        //enter Last Name
        type(By.name("LastName"), "Black");
        //enter Email
        type(By.id("Email"), "JaneBlack@gmail.com");
        //Enter Password
        type(By.id("Password"), "Jb123456789!");
        //Confirm Password
        type(By.id("ConfirmPassword"), "Jb123456789!");
        //click on Register button
        click(By.id("register-button"));
        //verify element is displayed
        Assert.assertTrue(isElementPresent(By.xpath("//li[text()='The specified email already exists']")));

    }

}
