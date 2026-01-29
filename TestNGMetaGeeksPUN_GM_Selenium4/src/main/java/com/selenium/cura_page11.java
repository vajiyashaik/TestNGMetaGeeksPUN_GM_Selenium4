package com.selenium;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cura_page11 {
	WebDriver driver;
	FileReader fr;
	Properties p=new Properties();
	//locators
	By unm=By.name("username");
	By psw=By.name("password");
	By login=By.id("btn-login");
	public void init_cura_page11(WebDriver driver ) {
		this.driver=driver;
		
	}
    
	public void Enter_Name_Login() throws IOException {
		String path1="C://Users//shaik.vajiya//eclipse-workspace//TestNGMetaGeeksPUN_GM_Selenium4//TestData//dataone.properties";
		fr=new FileReader(path1);
		p.load(fr);
		driver.findElement(unm).sendKeys(p.getProperty("username1"));
		driver.findElement(psw).sendKeys(p.getProperty("password1"));
		System.out.println(p.getProperty("username1"));
		System.out.println(p.getProperty("password1"));
//		driver.findElement(psw).sendKeys("ThisIsNotAPassword");
		driver.findElement(login).click();
	}
}
