package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ActiveWindow {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "/Users/thedragon/Desktop/Selenium/chromedriver");

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement openNewTabBtn = driver.findElement(By.id("new-tab-button"));
        openNewTabBtn.click();

        //get window handle
        String originalHandle = driver.getWindowHandle();
        for(String handle1: driver.getWindowHandles()){
            driver.switchTo().window(handle1);
        }
        //switch to the original window
        driver.switchTo().window(originalHandle);

        driver.quit();
    }
}
