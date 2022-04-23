package Linga.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RefundPage {

	public RefundPage(AppiumDriver<AndroidElement> dr)  
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	
	
	@AndroidFindBy(xpath="//android.view.View[@text='Refund']")
	public WebElement RefundHeadingText ;
	
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-8']")                       // ******
	public WebElement CheckSearch  ;
	
	
	
	@AndroidFindBy(xpath="//android.widget.Spinner[@text='Open calendar']")
	public WebElement OpenCalendar ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Search']")
	public WebElement Search ;
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text=' Refund Without Receipt']")
	public WebElement  RefundWithoutReceipt ;
	
	
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-9']")                         // ******
	public WebElement EnteredAmountInRefundWithoutReceipt  ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-10']")
	public WebElement  ReasonForRefundWithoutReceipt ;
	
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-11']")
	public WebElement EnteredAmountInRefundWithReceipt  ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-12']")
	public WebElement  ReasonForRefundWithReceipt ;

	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Cancel']")
	public WebElement  Cancel ;
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='1']")
	public WebElement One ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='2']")
	public WebElement Two ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='3']")
	public WebElement Three ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='4']")
	public WebElement Four ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='5']")
	public WebElement Five ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='6']")
	public WebElement Six ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='7']")
	public WebElement Seven ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='8']")
	public WebElement Eight ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='9']")
	public WebElement Nine ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='0']")
	public WebElement Zero ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='C']")
	public WebElement C ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='00']")
	public WebElement DoubleZero ;
	
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text=' Refund']")
	public WebElement  Refund ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Done']")
	public WebElement  Done ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='No']")
	public WebElement  No ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Yes']")
	public WebElement  Yes ;
	
	
	
}
