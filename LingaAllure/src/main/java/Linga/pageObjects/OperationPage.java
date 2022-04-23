package Linga.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OperationPage {
	
	public OperationPage(AppiumDriver<AndroidElement> dr)  
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	
	@AndroidFindBy(xpath="(//android.widget.Button)[1]")
	public WebElement OperationList ;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[2]")
	public WebElement Logout ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Operation']")
	public WebElement Operation ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='POS']")
	public WebElement POS ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Till Management']")
	public WebElement TillManagement ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Batch/Tip Adjustment']")
	public WebElement BatchTipAdjustment ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Refund']")
	public WebElement Refund ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Hardware Settings']")
	public WebElement HardwareSettings ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='POS Settings']")
	public WebElement POSSettings ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Close Day']")
	public WebElement CloseDay ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Employee']")
	public WebElement Employee ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='FaceId']")
	public WebElement FaceId ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Sync Back Office']")
	public WebElement SyncBackOffice ;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Sync Back Office']")
	public WebElement SyncBackOfficeHeadingText ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Your Back Office Is Up To Date']")
	public WebElement YourBackOfficeIsUpToDateText;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Sync']")
	public WebElement Sync ;
	

}
