package com.pages;

import org.openqa.selenium.By;
import com.configuration.Base;

public class HomePage {
	
	By dashboardheading =By.xpath("//h6[text()='Dashboard']");
	By profileclick=By.xpath("//span[@class='oxd-userdropdown-tab']");
	By Logout =By.xpath("//a[text()='Logout']");
	
	
public String  homeDashboardDisplayedorNot() {
		
	
	return Base.driver.findElement(dashboardheading).getText();	
	
	}
public void userProfileButtonClick() {
	Base.driver.findElement(profileclick).click();
	
}

public boolean logoutButtonDisplayedorNot()
{
	return Base.driver.findElement(Logout).isDisplayed();
}

}

