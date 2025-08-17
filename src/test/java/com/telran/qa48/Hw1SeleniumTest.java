package com.telran.qa48;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hw1SeleniumTest {

    WebDriver driver;

    //before    -setUp
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
    }

    //test
    @Test
    public void openDemowebshopTest(){
        System.out.println("Page Demowebshop opened!");
    }


}