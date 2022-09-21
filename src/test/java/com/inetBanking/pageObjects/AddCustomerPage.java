package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkAddCustomer;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(xpath="//*[@id=\"dob\"]")
	@CacheLookup
	WebElement txtdob;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")
	@CacheLookup
	WebElement txtaddress;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")
	@CacheLookup
	WebElement txtcity;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")
	@CacheLookup
	WebElement txtstate;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")
	@CacheLookup
	WebElement txtPIN;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input")
	@CacheLookup
	WebElement txttelephonenumber;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input")
	@CacheLookup
	WebElement txtemail;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input[1]")
	@CacheLookup
	WebElement btnsubmit;
	
	public void clickAddNewCustomer() {
		lnkAddCustomer.click();
	}
	
	public void custName(String cname) {
		txtCustomerName.sendKeys(cname);
	}
	
	public void custGender(String cgender) {
		rdGender.click();
	}
	
	public void custdob(String mm, String dd, String yy) {
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
	}
	
	public void custAddress(String caddress) {
		txtaddress.sendKeys(caddress);
	}
	
	public void custcity(String ccity) {
		txtcity.sendKeys(ccity);
	}
	
	public void custstate(String cstate) {
		txtstate.sendKeys(cstate);
	}
	
	public void custPIN(String cPIN) {
		txtPIN.sendKeys(String.valueOf(cPIN));
	}
	
	public void custtelephonenumber(String ctelephonenumber) {
		txttelephonenumber.sendKeys(ctelephonenumber);
	}
	
	public void custemail(String cemail) {
		txtemail.sendKeys(cemail);
	}
	
	public void custsubmit() {
		btnsubmit.click();
	}
	
	
	

}
