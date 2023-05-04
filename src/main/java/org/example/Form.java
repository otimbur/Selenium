package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Form {
    public  static  void  main(String[] args){
        System.setProperty("webdriver.chrome.driver", "/Users/thedragon/Desktop/Selenium/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");
        // enter first name
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Olga");

        //enter last name
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Timbur");

        //jpb title
        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("SDET");

        //Level of education
        WebElement levelEduacationCollage = driver.findElement(By.id("radio-button-2"));
        levelEduacationCollage.click();

        //Sex
        WebElement sex = driver.findElement(By.id("checkbox-2"));
        sex.click();

        //Experince
        WebElement experience = driver.findElement(By.id("select-menu"));
        experience.click();
        WebElement option = driver.findElement(By.cssSelector("option[value='1']"));
        option.click();

        //date
        driver.findElement(By.id("datepicker")).sendKeys("07/07/2024");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        //After submitting the for we need to add an explicit for in ord to confirm the success of the submit button
        WebDriverWait await = new WebDriverWait(driver, 10);
        WebElement alert = await.until(ExpectedConditions.visibilityOfElementLocated(By.className(".alert")));

    }
}
