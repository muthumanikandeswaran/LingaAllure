package Linga.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class StoreLoginPage {

	public StoreLoginPage(AppiumDriver<AndroidElement> dr)  
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-0']")
	public WebElement Email ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-1']")
	public WebElement Password ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Login']")
	public WebElement LoginButton ;
	
	
	
	
	
}
