
package com.practise.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class webautomation {
private static WebDriver driver;
public static void loadDriver()
{
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\91819\\\\Documents\\\\sng\\\\chromedriver.exe" );
	driver = new ChromeDriver();
}
public static void openBrowser(String url)
{
    driver.navigate().to(url);
}
public static void closeBrowser()
{
   
    driver.close();
}


public static void register() 
{
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html/body/header/div/div/section[1]/ul/li/a")).click();
	
	driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/aside/a")).click();
    	driver.findElement(By.id("user[first_name]")).sendKeys("namratha");
    	driver.findElement(By.id("user[last_name]")).sendKeys("u");
      	driver.findElement(By.id("user[email]")).sendKeys("na@gmail.com");
      	driver.findElement(By.id("user[password]")).sendKeys("123456789");
      	driver.findElement(By.id("user[terms]")).click();
    	driver.findElement(By.xpath("/html/body/main/div/div/article/form/div[5]/input")).click();

}
public static void main(String args[]) throws InterruptedException {
	loadDriver();
	openBrowser("https://courses.ultimateqa.com");
	register();
	closeBrowser();
	
	
	}
}
