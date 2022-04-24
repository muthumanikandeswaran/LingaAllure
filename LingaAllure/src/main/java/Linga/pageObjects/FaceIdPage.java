package Linga.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FaceIdPage {
	
	public FaceIdPage(AppiumDriver<AndroidElement> dr)  
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	

	
	
	@AndroidFindBy(xpath="//android.view.View[@text='FaceId']")
	public WebElement FaceIdHeadingText ;
	
	@AndroidFindBy(xpath="(//android.widget.EditText)[1]")
	public WebElement FaceIdUserSearch ;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[5]")
	public WebElement FifthUserPlusButton ;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Done']")
	public WebElement Done ;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Reset']")
	public WebElement Reset ;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Cancel']")
	public WebElement Cancel ;
}
