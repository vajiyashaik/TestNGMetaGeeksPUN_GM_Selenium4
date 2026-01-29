package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cura_page2 {
  WebDriver driver;
  public void init_cura_page2(WebDriver driver) {
	  this.driver=driver;
  }
  By validatepg1=By.xpath("//*[contains(text(),'Make Appointment')]");
  By mkappform=By.xpath("//h2[contains(text(),'Make Appointment')]");
  
  
  
  
  
  
}
