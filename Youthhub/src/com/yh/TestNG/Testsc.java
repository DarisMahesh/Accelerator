package com.yh.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.yh.page.Pagefactory;
import com.yh.testdataengine.Testdata;
import com.yh.utilities.Browser;

public class Testsc {
	public static WebDriver para;
	@Test(dataProvider="Test",priority=0)
	public void Login(String user1,String pass1) throws Exception {
		
		  
		 Pagefactory obj=PageFactory.initElements(para, Pagefactory.class);
		 obj.Signin(user1, pass1);
		
	}
  @BeforeMethod
  public void beforeMethod() {
	  para = Browser.Browserfact("chrome", "https://check.youthhub.co.nz");
  
	 }

  @AfterMethod
  public void afterMethod() {
  }
  @DataProvider
  public Object[][] Test(){
	  Testdata RR = new Testdata("E:\\Downloads\\Selenium\\login.xlsx");	
     int rows = RR.getrowcount(0);
     Object  [][] data = new Object [rows][2];
     for(int i=0;i<rows;i++)
     {
    	 data[i][0] = RR.getData(0,i,0);
    	 data[i][1] = RR.getData(0,i,1);		 
    	 } 
     return data;
  }

}
