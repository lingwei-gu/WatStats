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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author starr
 */
public class MealPlanWeb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://watcard.uwaterloo.ca/OneWeb/Account/LogOn");

        WebElement account = driver.findElement(By.name("Account"));
        account.sendKeys("username");

        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("password");
        
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");

        //driver.wait(1500);
//        WebElement login = driver.findElements(By.className("glyphicon glyphicon-log-in")).get(0);
//        System.out.println(login.getSize());

//        Use the following xpath to identify the Button element. //button[@class='btn ow-btn-primary btn-block-xs pull-right' and contains(.,'Log On')]
//                Induce WebDriverWait and elementToBeClickable
//        ()

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn ow-btn-primary btn-block-xs pull-right' and contains(.,'Log On')]")));
        
        System.out.println(element.getTagName());
        
        element.click();

//        driver.wait(1500);
    }

}
