package Linga.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class closeDayPage {
	
	public closeDayPage(AppiumDriver<AndroidElement> dr)  
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	

	@AndroidFindBy(xpath="//android.view.View[@text='Close Day']")
	public WebElement CloseDayText ;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Open calendar']")
	public WebElement Opencalendar ;
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Close All Cashiers']")
	public WebElement CloseAllCashiers ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Cashier out saved successfully']")
	public WebElement CashieroutsavedsuccessfullyText  ;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Cannot close the shift, Store have 1 Active Check']")
	public WebElement CashierOutAlertHeadingText ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Cash']")
	public WebElement  Cash ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Void']")
	public WebElement  Void ;
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Close The Day']")
	public WebElement CloseTheDay ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='No']")
	public WebElement  No ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Yes']")
	public WebElement  Yes ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Cancel']")
	public WebElement  Cancel ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Submit']")
	public WebElement Submit  ;
	
	@AndroidFindBy(xpath="//(android.view.View)[10]")
	public WebElement ActiveChecks  ;
	
	@AndroidFindBy(xpath="//(android.view.View)[18]")
	public WebElement OpenCashier  ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Cashier Out']")
	public WebElement CashierOut  ;
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text=' PRINT']")
	public WebElement  PRINT ;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[8]")
	public WebElement EmployeeSelectionDropdown ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Done']")
	public WebElement Done  ;
	
	
}
