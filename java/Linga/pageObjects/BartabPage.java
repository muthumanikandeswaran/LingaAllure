package Linga.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BartabPage {
	
	
	public BartabPage(AppiumDriver<AndroidElement> dr)  
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	
	

	@AndroidFindBy(xpath="//android.widget.Button[@text='New Tab']")
	public WebElement NewTab ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Transfer']")
	public WebElement Transfer ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Merge']")
	public WebElement Merge ;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[26]")
	public WebElement Done ;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[24]")
	public WebElement MergeHider ;
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Split']")
	public WebElement Split ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Pay Check']")
	public WebElement PayCheck ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Print']")
	public WebElement Print ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Operation']")
	public WebElement Operation ;
	
	
	
}
