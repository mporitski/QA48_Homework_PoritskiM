package com.telran.qa48;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Hw2FindElementTests {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementByTagName(){
        WebElement a = driver.findElement(By.tagName("a"));
        System.out.println("Search by tag: " + a.getTagName());
        List<WebElement> listA = driver.findElements(By.tagName("a"));
        System.out.println("Quantity: " + listA.size());
        System.out.println("--------------------------------------");

        WebElement head = driver.findElement(By.tagName("head"));
        System.out.println("Search by tag: " + head.getTagName());
        List<WebElement> listHead= driver.findElements(By.tagName("head"));
        System.out.println("Quantity: " + listHead.size());
        System.out.println("-------------------------------------");

        WebElement strong = driver.findElement(By.tagName("strong"));
        System.out.println("Search by tag: " + strong.getTagName());
        List<WebElement> listStrong= driver.findElements(By.tagName("strong"));
        System.out.println("Quantity: " + listStrong.size());
        System.out.println("-------------------------------------");

    }

    @Test
    public void findElementBySimpleLocators(){
        WebElement divElements = driver.findElement(By.className("footer"));
        if (divElements != null)
            System.out.println("Element found by name: footer");
        System.out.println("--------------------------------------------");

        WebElement masterWrapperContent = driver.findElement(By.cssSelector(".master-wrapper-content"));
        if (masterWrapperContent != null)
            System.out.println("Element found by name: masterWrapperContent");
        System.out.println("--------------------------------------------");

        WebElement columnInformation = driver.findElement(By.cssSelector("[class='column information']"));
        if (columnInformation != null)
            System.out.println("Element found by name: columnInformation");
        System.out.println("--------------------------------------------");

        WebElement comPolRadioButton1 = driver.findElement(By.id("pollanswers-1"));
        if (comPolRadioButton1 != null)
            System.out.println("Element found by id: pollanswers-1");
        System.out.println("--------------------------------------------");

        WebElement comPolRadioButton2 = driver.findElement(By.cssSelector("#pollanswers-2"));
        if (comPolRadioButton2 != null)
            System.out.println("Element found by id: pollanswers-2");
        System.out.println("--------------------------------------------");

        WebElement comPolRadioButton3 = driver.findElement(By.cssSelector("*[id='pollanswers-3']"));
        if (comPolRadioButton3 != null)
            System.out.println("Element found by id: pollanswers-3");
        System.out.println("--------------------------------------------");
    }

    @Test
    public void findElementAndClick(){
        WebElement link1 = driver.findElement(By.linkText("Computers"));
        link1.click();
        pause(1);
        WebElement link2 = driver.findElement(By.linkText("Notebooks"));
        link2.click();
        pause(1);
    }

    public void pause(int time){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
