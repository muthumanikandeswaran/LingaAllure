package Linga.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HardwareSettingsPage {

	public HardwareSettingsPage(AppiumDriver<AndroidElement> dr)  
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Card Reader']")
	public WebElement CardReader ;
	
	
	

	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Printer Settings']")
	public WebElement PrinterSettings ;
	
	@AndroidFindBy(xpath="//android.widget.Spinner[@resource-id='mat-select-8']")                                     // ******
	public WebElement ReceiptPrintLanguageSelection ;
	
	//@AndroidFindBy(id="mat-select-value-9")
	//public WebElement  ReceiptPrintLanguageSelection;
	
	@AndroidFindBy(xpath="//android.widget.Spinner[@resource-id='mat-option-62']")
	public WebElement RPLang1 ;
	
	@AndroidFindBy(xpath="//android.widget.Spinner[@resource-id='mat-option-63']")
	public WebElement RPLang2 ;
	
	@AndroidFindBy(xpath="//android.widget.Spinner[@resource-id='mat-option-64']")
	public WebElement RpLang3 ;
	
	//@AndroidFindBy(id="mat-option-0")
	//public WebElement RPLang1 ;
	
	//@AndroidFindBy(id="mat-option-1")
	//public WebElement RPLang2 ;
	
	//@AndroidFindBy(id="mat-option-2")
	//public WebElement RpLang3 ;
	
	
	
	
	@AndroidFindBy(xpath="//android.view.View[@text='210CustomerReceipt-10.10.180.210']")
	public WebElement  ReceiptPrintSelection ;
	
	
	
	@AndroidFindBy(xpath="//android.widget.Spinner[@resource-id='mat-select-10']")                                     // ******
	public WebElement KitchenPrintLanguageSelection  ;
	
	@AndroidFindBy(xpath="//android.view.View[@resource-id='mat-option-65']")
	public WebElement KpLang1  ;
	
	@AndroidFindBy(xpath="//android.view.View[@resource-id='mat-option-66']")
	public WebElement  KpLang2 ;
	
	@AndroidFindBy(xpath="//android.view.View[@resource-id='mat-option-67']")
	public WebElement KpLang3  ;
	
	//@AndroidFindBy(id="mat-option-3")
	//public WebElement KpLang1 ;
	
	//@AndroidFindBy(id="mat-option-4")
	//public WebElement KpLang2 ;
	
	//@AndroidFindBy(id="mat-option-5")
	//public WebElement KpLang3 ;
	
                            
	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-tg-3']")                                     // ******
	public WebElement USBReceiptPrinterToggle  ;                                                              
	
	
	
	
	

	

	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Customer Display']")
	public WebElement  CustomerDisplay ;
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Disconnect']")
	public WebElement Disconnect  ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Connect']")
	public WebElement Connect  ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Done']")
	public WebElement Done  ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Cancel']")
	public WebElement Cancel  ;
	
}
