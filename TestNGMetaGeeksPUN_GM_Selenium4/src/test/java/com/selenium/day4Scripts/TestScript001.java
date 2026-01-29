package com.selenium.day4Scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.selenium.cura_page1;
import com.selenium.cura_page11;
//import com.selenium.cura_page2;

public class TestScript001 {
	WebDriver driver=new ChromeDriver();
	cura_page1 cpage1=new cura_page1();
	//cura_page2 cpage2=new cura_page2();
	cura_page11 cpage11=new cura_page11();
  @Test(priority=1)
  public void InvokeApp() {
	  cpage1.cura_page1_init(driver);
	  cpage1.LaunchApp("https://katalon-demo-cura.herokuapp.com");
	  //assert
  }
  
  @Test(priority=2)
  public void Click_Make_Appointment() {
	  cpage1.ClickOnMakeAppointment();
	  //assert
  }
  @Test(priority=3)
  public void performLogin_User() throws IOException {
	  cpage11.init_cura_page11(driver);
	  cpage11.Enter_Name_Login();
  }
  
  
}
