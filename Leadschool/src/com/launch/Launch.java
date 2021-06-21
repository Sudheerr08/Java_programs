package com.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome;

public class Launch
{
	 public static void main(String[] args) {
		 System.setProperty("Webdriver.driver.Chrome", "/Users/labbuser/Desktop/eclipse-workspace/Leadschool/driiver/chromedriver.exe")
	      
	      // browser type and chromedrover.exe path as parameters
	      //System.setProperty("webdriver.chrome.driver","/Users/labbuser/Desktop/eclipse-workspace/Leadschool/driiver/chromedriver.exe");
	     // WebDriver driver = new ChromeDriver();
	     Chromedriver driver = new WebDriver();
		 String url = " https://leadschool.in/";
	      driver.get(url);
	   }
t poiinnt

}
