/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mealplanweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author starr
 */
public class MealPlanWeb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        
       
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\starr\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://watcard.uwaterloo.ca/OneWeb/Account/LogOn");
        
        WebElement account = driver.findElement(By.name("Account"));
        account.sendKeys("20823441");
        
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys(Dontlook.password);
        
        //driver.wait(1500);
        
        WebElement login = driver.findElements(By.className("glyphicon glyphicon-log-in")).get(0);
        System.out.println(login.getSize());
        
        
        driver.wait(1500);
    }
    
}
