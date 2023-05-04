package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtn {
    public static  void main(String [] args ){
        System.setProperty("webdriver.chrome.driver", "/Users/thedragon/Desktop/Selenium/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Automate radio buttons
        driver.get("https://formy-project.herokuapp.com/radiobutton");

        //Find the first button
        WebElement radioBtn1 = driver.findElement(By.id("radio-button-1"));
        radioBtn1.click();

        WebElement radioBtn2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioBtn2.click();

        WebElement radioBtn3 = driver.findElement(By.xpath("/html/body/div/div[3]/label"));
        radioBtn3.click();

        driver.quit();


    }
}
