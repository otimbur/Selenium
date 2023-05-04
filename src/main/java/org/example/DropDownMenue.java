package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownMenue {
    public  static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "/Users/thedragon/Desktop/Selenium/chromedriver");

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDown= driver.findElement(By.id("dropdownMenuButton"));
        dropDown.click();

        WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
        autocompleteItem.click();

        driver.quit();
    }
}
