package com.yh.page;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Pagefactory {
	 WebDriver eims ;
	 static Logger log =  Logger.getLogger(Pagefactory.class.getName());
		
		{ 
			PropertyConfigurator.configure("C:\\Users\\Jeeva\\eclipse-workspace\\Youthhub\\src\\com\\yh\\log4j.properties");
		}
		
		public static WebDriver driver;
		public Pagefactory (WebDriver ipara)
		{
		this.eims =ipara;
		}
		@FindBy(name="identity") WebElement id;
		@FindBy(name="password") WebElement pss;
		@FindBy(xpath="//button[text()='Login' and @type='submit' and @class='btn login_btn d-sm-none d-none d-lg-inline-block']") WebElement lg;
		
		public void Signin(String user,String pass) {
			id.sendKeys(user);
			log.info("username sends successfully");
			pss.sendKeys(pass);
			log.info("password sends successfully");
			lg.click();
			log.info("application logins successfully");
			//exp.click();
			//log.info("Explore opened successfully");

}
}
