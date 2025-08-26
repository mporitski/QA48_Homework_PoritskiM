package com.telran.qa48;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Hw3FindElementsCssXpath {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


//---------------------------------Search elements by CSS---------------------------------
    @Test
    public void findElementsCss(){
        WebElement listComputers = driver.findElement(By.cssSelector("li[class='inactive']"));
        System.out.println("----------------------------------------------------------");
        if(listComputers != null){
            System.out.println("Element 1 found by CSS");
        }

        WebElement listComputersClick = driver.findElement(By.cssSelector("li[class='inactive'] a[href='/computers']"));
        if(listComputersClick != null){
            System.out.println("Element 2 found by CSS");
        }
        listComputersClick.click();
        pause(1);

        WebElement notebooks = driver.findElement(By.cssSelector("ul[class='sublist'] li:nth-child(2)"));
        if(notebooks !=null){
            System.out.println("Element 3 found by CSS");
        }

        WebElement notebooksClick = driver.findElement(By.cssSelector("ul[class='sublist'] li[class= 'inactive'] [href='/notebooks']"));
        if(notebooksClick !=null){
            System.out.println("Element 4 found by CSS");
        }
        notebooksClick.click();
        pause(1);

        WebElement sortBy = driver.findElement(By.cssSelector("#products-orderby"));
        if(sortBy !=null){
            System.out.println("Element 5 found by CSS");
        }
        sortBy.click();
        pause(1);

        WebElement sortByNameAtoZ = driver.findElement(By.cssSelector("select[id='products-orderby'] option:nth-child(2)"));
        if (sortByNameAtoZ !=null){
            System.out.println("Element 6 found by CSS");
        }
        sortByNameAtoZ.click();
        pause(1);

        WebElement  inch14Laptop = driver.findElement(By.cssSelector(".product-item .picture a[href='/141-inch-laptop']"));
        if (inch14Laptop !=null){
            System.out.println("Element 7 found by CSS");
        }
        inch14Laptop.click();
        pause(1);

        WebElement btnAddToCart = driver.findElement(By.cssSelector("#add-to-cart-button-31"));
        if (btnAddToCart != null) {
            System.out.println("Element 8 found by CSS");
        }
        btnAddToCart.click();
        pause(1);

        WebElement shopCart = driver.findElement(By.cssSelector("div[class='header-links'] li:nth-child(3)"));
        if (shopCart != null) {
            System.out.println("Element 9 found by CSS");
        }
        shopCart.click();
        pause(1);

        WebElement removeCheckBox = driver.findElement(By.cssSelector("input[name='removefromcart']"));
        if (removeCheckBox != null) {
            System.out.println("Element 10 found by CSS");
        }
        removeCheckBox.click();
        pause(1);
        System.out.println("----------------------------------------------------------");
    }
//---------------------Search elements by XPath-------------------------------------
    @Test
    public void findElementsXpath(){
        System.out.println("----------------------------------------------------------");
        WebElement listComputers = driver.findElement(By.xpath("//li[@class='inactive']"));
        if(listComputers != null){
            System.out.println("Element 1 found by XPath");
        }
        pause(1);

        WebElement listComputersClick = driver.findElement(By.xpath("//li[@class='inactive']/a[@href='/computers']"));
        if(listComputersClick != null){
            System.out.println("Element 2 found by XPath");
        }
        listComputersClick.click();
        pause(1);

        WebElement notebooks = driver.findElement(By.xpath("//ul[contains(@class,'sublist')]/li[2]"));
        if(notebooks != null){
            System.out.println("Element 3 found by XPath");
        }

        WebElement notebooksClick = driver.findElement(By.xpath("//ul[@class='sublist']/li[@class='inactive']/a[@href='/notebooks']"));
        if(notebooksClick != null){
            System.out.println("Element 4 found by XPath");
        }
        notebooksClick.click();
        pause(1);

        WebElement sortBy = driver.findElement(By.xpath("//select[@id='products-orderby']"));
        if(sortBy != null){
            System.out.println("Element 5 found by XPath");
        }
        sortBy.click();
        pause(1);

        WebElement sortByNameAtoZ = driver.findElement(By.xpath("//select[@id='products-orderby']/option[2]"));
        if(sortByNameAtoZ != null){
            System.out.println("Element 6 found by XPath");
        }
        sortByNameAtoZ.click();
        pause(1);

        WebElement  inch14Laptop = driver.findElement(By.xpath("//div[contains(@class,'product-item')]//a[@href='/141-inch-laptop']"));
        if(inch14Laptop != null){
            System.out.println("Element 7 found by XPath");
        }
        inch14Laptop.click();
        pause(1);

        WebElement btnAddToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button-31']"));
        if(btnAddToCart != null){
            System.out.println("Element 8 found by XPath");
        }
        btnAddToCart.click();
        pause(1);

        WebElement shopCart = driver.findElement(By.xpath("//div[@class='header-links']//li[3]"));
        if(shopCart != null){
            System.out.println("Element 9 found by XPath");
        }
        shopCart.click();
        pause(1);

        WebElement removeCheckBox = driver.findElement(By.xpath("//input[contains(@name,'removefromcart')]"));
        if(removeCheckBox != null){
            System.out.println("Element 10 found by XPath");
        }
        removeCheckBox.click();
        pause(1);
        System.out.println("----------------------------------------------------------------");

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
