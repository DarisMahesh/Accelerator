package com.yh.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver obj;
	
	public static WebDriver Browserfact(String browsername,String url) {
		
	System.setProperty("webdriver.chrome.driver","F:\\Driver\\chromedriver.exe");
	obj=new ChromeDriver();
	obj.get(url);
	obj.manage().window().maximize();
	return obj;
	}

}
