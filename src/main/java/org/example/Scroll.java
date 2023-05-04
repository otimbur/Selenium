package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Scroll {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/thedragon/Desktop/Selenium/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));
        //use the actions class
        Actions actions =  new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Olga Timbur");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("04/20/2023");

        driver.quit();
    }

}
