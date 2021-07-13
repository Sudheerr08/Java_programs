package com.launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch
{
	 public static void main(String[] args) {
		 System.setProperty("webdriver.driver.Chrome", "/Users/labbuser/IdeaProjects/Java_programs/Leadschool/driiver/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
		 String url = " https://leadschool.in/";
	      driver.get(url);
	   }

}
