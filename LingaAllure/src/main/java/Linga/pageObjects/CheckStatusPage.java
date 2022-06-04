package Linga.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CheckStatusPage {
	
	
	public CheckStatusPage(AppiumDriver<AndroidElement> dr)  
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	
	
	

	//@AndroidFindBy(xpath="(//android.view.View)[9]")
	//public WebElement Options ;
	
	
	
	@AndroidFindBy(xpath="(//android.widget.Button)[1]")
	public WebElement OperationListButton ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='QSR']")
	public WebElement QSR ;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[3]")
	public WebElement Checksync ;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[4]")
	public WebElement Logout ;
	
	
	//@AndroidFindBy(xpath="//android.widget.Button[@bounds='[1590,5][1655,71]']")  
	//public WebElement Checksync ; 
	
	//@AndroidFindBy(xpath="//android.widget.Button[@bounds='[1667,5][1731,71]']")
	//public WebElement Logout ;
	
	
	@AndroidFindBy(xpath="//android.view.View[@='']")  //21(index)assumption
	public WebElement PosUser ; 
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Check Status']")
	public WebElement CheckStatus ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Table layout']")
	public WebElement Tablelayout ;

	@AndroidFindBy(xpath="//android.widget.Button[@bounds='[495,78][743,136]']")
	public WebElement Bartab ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Phone Order']")
	public WebElement PhoneOrder ;
	
	@AndroidFindBy(xpath="(//android.widget.EditText)[1]")                                          
	public WebElement CheckSearch ;
	
	//@AndroidFindBy(id="mat-input-1")
	//public WebElement CheckSearch ;
	
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Active']")
	public WebElement Active ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Pay Check']")
	public WebElement PayCheck ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Open Check']")
	public WebElement OpenCheck ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Re-Print Check']")
	public WebElement RePrintCheck ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Operation']")
	public WebElement Operation ;
	

	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Closed']")
	public WebElement Closed ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Re-Open Check']")
	public WebElement ReOpenCheck ;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Open calendar']")
	public WebElement Opencalendar ;
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Void']")
	public WebElement Void ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Hold']")
	public WebElement Hold ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Future']")
	public WebElement Future ;
	

}
