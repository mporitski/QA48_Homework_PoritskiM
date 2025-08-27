package com.demowebshop.qa48;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{
    @Test
    public void newUserRegistrationPositiveTest(){

        //click on Register link
        WebElement linkRegister = driver.findElement(By.xpath("//a[@href='/register']"));
        linkRegister.click();

        //choose gender
        WebElement btnRadioGenderFemale = driver.findElement(By.id("gender-female"));
        btnRadioGenderFemale.click();

        //enter First Name
        WebElement inputFirstName =driver.findElement(By.name("FirstName"));
        inputFirstName.click();
        inputFirstName.clear();
        inputFirstName.sendKeys("Jane");

        //enter Last Name
        WebElement inputLastName =driver.findElement(By.name("LastName"));
        inputLastName.click();
        inputLastName.clear();
        inputLastName.sendKeys("Black");

        //enter Email
        WebElement inputEmail = driver.findElement(By.id("Email"));
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("JaneBlack@gmail.com");

        //Enter Password
        WebElement inputPassword = driver.findElement(By.id("Password"));
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys("Jb123456789!");

        //Confirm Password
        WebElement inputConfirmPassword = driver.findElement(By.id("ConfirmPassword"));
        inputConfirmPassword.click();
        inputConfirmPassword.clear();
        inputConfirmPassword.sendKeys("Jb123456789!");

        //click on Register button
        WebElement btnRegister = driver.findElement(By.id("register-button"));
        btnRegister.click();

        //verify LogOut is displayed
        Assert.assertTrue(isElementPresent(By.xpath("//a[@href='/logout']")));

    }










}
