package com.selenium;

import org.openqa.selenium.WebDriver;

public class Lib1 {

	WebDriver driver;
	public void init(WebDriver driver) {
		this.driver=driver;
	}
	public String ValidateRegTitle() {
	driver.get("https://awesomeqa.com/ui/index.php?route=account/register");
	String registerPageTitle=driver.getTitle();
	return registerPageTitle;
	}
}
