package Linga.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PinPage {
	
	
	public PinPage(AppiumDriver<AndroidElement> dr)  
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	
	
	
	
	
	//@AndroidFindBy(xpath="(//android.view.View)[6]")  
	//public WebElement PinpageOptions ;     
	
	@AndroidFindBy(xpath="(//android.view.View)[6]")  
    public WebElement NodeAndDeviceInfo ;   
	
	//@AndroidFindBy(xpath="//android.view.View[@bounds='[5,26][209,53]']")
	//public WebElement NodeAndDeviceInfo ;
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Sync Checks']") 
	public WebElement SyncChecks ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Sync Checks ']")
	public WebElement  SyncChecksText  ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Cancel']") 
	public WebElement Cancel ;
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Sync']")
	public WebElement Sync ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Syncing with backoffice ']")
	public WebElement SyncingwithbackofficeText  ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Synced successfully']")
	public WebElement SyncedsuccessfullyText ;
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Clock In']")
	public WebElement ClockIn ;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Clock In']")
	public WebElement ClockInHeading ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='C']")
	public WebElement C ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Continue']")
	public WebElement Continue ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Clock Out']")
	public WebElement ClockOut ;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Clock Out']")
	public WebElement ClockOutHeading ;
	                                                                                  //@AndroidFindBy(xpath="//android.widget.Button[@text='']")
	                                                                                  //public WebElement  ;
	//@AndroidFindBy(xpath="//android.view.View[@bounds='[233,869][576,896]']")          
	//public WebElement Version ;
	
	@AndroidFindBy(xpath="(//android.view.View)[14]")  
    public WebElement Version ; 
	
	                                                                                  //@AndroidFindBy(xpath="//android.view.View[@bounds='']")
	                                                                                  //public WebElement Version ;
	@AndroidFindBy(xpath="//android.widget.Button[@text='Back Office']")
	public WebElement BackOffice ;
	                                                                                //@AndroidFindBy(id="")
                                                                                    //public WebElement  ;
	@AndroidFindBy(id="android:id/alertTitle")
    public WebElement ConfirmNavigationTitleText ;
	
	@AndroidFindBy(id="android:id/message")
    public WebElement NavigationMessageText ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='STAY ON THIS PAGE']")
	public WebElement STAYONTHISPAGE ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='LEAVE THIS PAGE']")
	public WebElement LEAVETHISPAGE ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Operation']")
	public WebElement Operation ;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Operation']")
    public WebElement OperationText ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Enter Pin']")
    public WebElement EnterPinText ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Devices']")
	public WebElement Devices ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Connected Devices']")
	public WebElement ConnectedDevicesHeadingText ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Close']")
	public WebElement Close ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Sign Out']")
	public WebElement SignOut ;
	
	@AndroidFindBy(xpath="//*[@resource-id='changes-confirm']")
	public WebElement changesconfirmSignoutPopup  ;
	
	
	@AndroidFindBy(xpath="//android.view.View[@text='Do you want to Sign Out?']")
	public WebElement DoyouwanttoSignOutText ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='No']")
	public WebElement No ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Yes']")
	public WebElement Yes ;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Sign Out']")
	public WebElement SignOutHeadingText ;
	
	@AndroidFindBy(xpath="//android.view.View[@bounds='[1098,312][1119,334]']")   //******cannot be used for CLOCKIN AND CLOCKOUT if faceid is enabled****** 
	public WebElement PinPadCancelNormal ;
	
	@AndroidFindBy(xpath="//android.view.View[@bounds='[1098,288][1119,309]']")   //*****IF Face id enabled, this is for clockin and clockout****** 
	public WebElement PinPadCancelIfFaceidEnabled ;
	
	@AndroidFindBy(xpath="(//android.view.View)[16]")  
    public WebElement StoreName ; 
	
	//@AndroidFindBy(xpath="//android.view.View[@bounds='[694,213][1226,242]']")
	//public WebElement StoreName ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='To login enter your ID number']")
	public WebElement TologinenteryourIDnumberText ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='1']")
	public WebElement One ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='2']")
	public WebElement Two ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='3']")
	public WebElement Three ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='4']")
	public WebElement Four ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='5]")
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
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Clear']")
	public WebElement Clear ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@bounds='[1038,686][1146,794]']")
	public WebElement Backspace ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Login']")
	public WebElement Login ;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Enter valid pin']")
	public WebElement EntervalidpinText ;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Clock in is required to log in']")
	public WebElement ClockinisrequiredtologinText ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Face Id']")
	public WebElement FaceId ;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Scan Your Face']")
	public WebElement ScanYourFaceHeading ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Done']")
	public WebElement FaceNotFoundDone ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Reset']")
	public WebElement FaceIdResetReset ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='BusinessDate']")
	public WebElement BusinessDateText ;
	
	@AndroidFindBy(xpath="(//android.view.View)[38]")   //37 - business date text
	public WebElement BusinessDate ;
	

}
