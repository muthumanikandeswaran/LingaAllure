package Linga.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TableLayoutPage {
	
	
	public TableLayoutPage(AppiumDriver<AndroidElement> dr)  
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	
	

	@AndroidFindBy(xpath="//android.widget.Button[@text='New Check']")
	public WebElement NewCheck ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Transfer']")
	public WebElement Transfer ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Merge']")
	public WebElement Merge ;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[26]")
	public WebElement MergeDone ;
	
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
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Continue']")
	public WebElement Continue ;
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='T1']")
	public WebElement Table1 ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='T2']")
	public WebElement Table2 ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='T3']")
	public WebElement Table3 ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='T4']")
	public WebElement Table4 ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='T5']")
	public WebElement Table5 ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='T6']")
	public WebElement Table6 ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='T7']")
	public WebElement Table7 ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='T8']")
	public WebElement Table8 ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='T9']")
	public WebElement Table9 ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='T10']")
	public WebElement Table10 ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='T11']")
	public WebElement Table11 ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='T16']")
	public WebElement Table16 ;
	
	
	
	
	
	
	
	
	
	//@AndroidFindBy(xpath="(//android.view.View)[11]")      //14
	//public WebElement fourthcheck ;
	
	@AndroidFindBy(xpath="//android.view.View[@bounds='[591,116][730,242]']")
	public WebElement fourthcheck ;
	
	
	
	//@AndroidFindBy(xpath="(//android.view.View)[16]")    //19
	//public WebElement ninetheenthcheck ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='QSR']")
	public WebElement QSR ;
	
}
