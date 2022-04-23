package Linga.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DigitalReceiptScreen {
	
	public DigitalReceiptScreen(AppiumDriver<AndroidElement> dr)  
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	
	
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-57']")                                      // ******
	public WebElement TextReceipt ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-58']")
	public WebElement EmailReceipt ;
	
	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-cb-3']")
	public WebElement PrintReceipt ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='No Thanks']")
	public WebElement NoThanks ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Send Receipt']")
	public WebElement SendReceipt ;
	
	
	@AndroidFindBy(xpath="//android.view.View[@bounds='[55,103][1867,138]']")
	public WebElement ChargeInDigitalReceiptScreen ;
	
	
	@AndroidFindBy(xpath="//android.view.View[@text='Done']")
	public WebElement Done ;
	
	
	
	@AndroidFindBy(xpath="//android.view.View[@text='Cancel']")
	public WebElement Cancel ;
}
