package com.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launnch {

	public static void main(String[] args)
	{

		   System.setProperty("webdriver.chrome.driver", "Users/labbuser/git/repository/Leadschool/driiver/chromedriver.exe");  
		    WebDriver driver=new ChromeDriver();  
		      
		// Launch website  
		    driver.navigate().to("http://www.google.com/");  
		          
		    // Click on the search text box and send value  
		    driver.findElement(By.id("lst-ib")).sendKeys("javatpoint tutorials");  
		          
		    // Click on the search button  
		    driver.findElement(By.name("btnK")).click();  
		
	}
	
	
}
