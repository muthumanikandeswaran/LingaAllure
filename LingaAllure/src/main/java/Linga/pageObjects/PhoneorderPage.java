package Linga.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PhoneorderPage {
	
	
	public PhoneorderPage(AppiumDriver<AndroidElement> dr)  
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	
	

	
	@AndroidFindBy(xpath="//android.widget.Button[@text='New']")
	public WebElement New ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Add']")
	public WebElement Add ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Edit']")
	public WebElement Edit ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Departure']")
	public WebElement Departure ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Cancel Order']")
	public WebElement CancelOrder ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Pay Check']")
	public WebElement PayCheck ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Print']")
	public WebElement Print ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Operation']")
	public WebElement Operation ;
	
	
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Out']")
	public WebElement Out ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Arrival']")
	public WebElement Arrival ;
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Complete']")
	public WebElement Complete ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Future']")
	public WebElement Future ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Driver']")
	public WebElement Driver ;
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Map']")
	public WebElement Map ;
	
	
	
	@AndroidFindBy(xpath="(//android.widget.EditText)[1]")
	public WebElement CheckSearchInPhoneOrder ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@bounds='[1843,259][1907,310]']")
	public WebElement DriverSearch ;
	
	
}
