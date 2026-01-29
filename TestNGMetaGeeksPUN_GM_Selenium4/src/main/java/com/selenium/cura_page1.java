package com.selenium;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//documentation of pom
//init
//locators
//steps automation methods
public class cura_page1 {
  WebDriver driver;
  //FileReader fr=new FileReader("//TestData//dataone.properties");
 // Properties p=new Properties();
  //init
  public void cura_page1_init(WebDriver driver) {
	  this.driver=driver;
  }
  //locators
  By validatepg1=By.xpath("//*[contains(text(),'We Care About Your Health')]");
  		By mkap=By.id("btn-make-appointment") ;
  		//By mkappform=By.xpath("//h2[contains(text(),'Make Appointment')]");
  		
  		
//steps automation methods
  		public String LaunchApp(String BaseUrl) {
  			driver.get(BaseUrl);
  			String val1="The App is Launched Successfully";
  			String val2="Check Url";
  			if(driver.findElement(mkap).isDisplayed()) {
  			return val1;
  			}else {
  				return val2;
  			}
  		}
  		
  		public void ClickOnMakeAppointment() {
  			driver.findElement(mkap).click();
  			//String mkdata=driver.findElement(mkappform).getText();
  			//return mkdata;
  		}
}
