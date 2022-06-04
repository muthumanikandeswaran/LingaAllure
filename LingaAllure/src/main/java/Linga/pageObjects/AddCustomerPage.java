package Linga.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AddCustomerPage {
	
	
	public AddCustomerPage(AppiumDriver<AndroidElement> dr)  
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='X']")
	public WebElement X ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='By Phone']")
	public WebElement ByPhone ;
	
	@AndroidFindBy(xpath="(//android.widget.EditText)[1]")
	public WebElement SearchCustomer ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='1']")
	public WebElement one ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='2']")
	public WebElement two ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='3']")
	public WebElement three ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='4']")
	public WebElement four ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='5']")
	public WebElement five ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='6']")
	public WebElement six ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='7']")
	public WebElement seven ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='8']")
	public WebElement eight ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='9']")
	public WebElement nine ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='0']")
	public WebElement zero ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='C']")
	public WebElement C ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='15']")
	public WebElement Backspace ;
	
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='By Name']")
	public WebElement ByName ;

	
	@AndroidFindBy(xpath="//android.widget.Button[@text='+ Add customer']")
	public WebElement AddcustomerButton ;
	
	@AndroidFindBy(xpath="(//android.view.View)[20]")
	public WebElement NameResultOne ;
	
	
}
