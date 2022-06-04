package Linga.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BatchPage {

	public BatchPage(AppiumDriver<AndroidElement> dr)  
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	
	

	@AndroidFindBy(xpath="//android.view.View[@text='Batch/Tip Adjustment']")
	public WebElement BatchOrTipAdjustmentText ;
	
	@AndroidFindBy(xpath="//android.widget.CheckBox[@text='Apply Total']")
	public WebElement ApplyTotalToggle ;
	
	
	
	@AndroidFindBy(xpath="(//android.widget.Spinner)[1]")                            
	public WebElement DeviceSelection ;
	
	@AndroidFindBy(xpath="(//android.widget.Spinner)[2]")                                          
	public WebElement UserSelection ;
	
	
	/*
	 * @AndroidFindBy(id="mat-select-4") public WebElement DeviceSelection ;
	 * 
	 * @AndroidFindBy(id="mat-select-6") public WebElement UserSelection ;
	 */
	
	
	
	@AndroidFindBy(xpath="(//android.widget.EditText)[1]")
	public WebElement Search ;
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Submit Batch']")
	public WebElement SubmitBatch ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Process Offline']")
	public WebElement ProcessOffline ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text=' Print']")
	public WebElement Print ;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Gift Card']")
	public WebElement GiftCardDevice ;
	
	@AndroidFindBy(xpath="//android.view.View[@text='shri admin 1234']")
	public WebElement ShriUser ;
}
