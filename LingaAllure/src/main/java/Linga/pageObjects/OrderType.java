package Linga.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OrderType {

	public OrderType(AppiumDriver<AndroidElement> dr)  
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='FORHERE']")
	public WebElement FORHERE ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='TOGO']")
	public WebElement TOGO ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='DELIVERY']")
	public WebElement DELIVERY ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Phone TOGO']")
	public WebElement PhoneTOGO ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Phone DELIVERY']")
	public WebElement PhoneDELIVERY ;
	
	@AndroidFindBy(xpath="//android.widget.RadioButton[@resource-id='mat-radio-11-input']")                             // ******
	public WebElement Now  ;
	
	@AndroidFindBy(xpath="//android.widget.RadioButton[@resource-id='mat-radio-12-input']")
	public WebElement  Later ;
	
	//@AndroidFindBy(id="mat-radio-2-input")
	//public WebElement Now ;
	
	//@AndroidFindBy(id="mat-radio-3-input")
	//public WebElement Later ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Cancel']")
	public WebElement Cancel ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Done']")
	public WebElement Done ;
	
	
}
