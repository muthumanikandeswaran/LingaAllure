package Linga.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POSSettingsPage {

	public POSSettingsPage(AppiumDriver<AndroidElement> dr)  
	{

		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}

	@AndroidFindBy(xpath="//android.view.View[@text='POS Settings']")
	public WebElement POSSettingsHeadingText ;

	@AndroidFindBy(xpath="//android.view.View[@text='Till Settings']")
	public WebElement TillSettingsHeadingText ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Save Changes']")
	public WebElement SaveChangesTop ;

	@AndroidFindBy(xpath="//android.view.View[@text='Enable Employees To Set Till']")
	public WebElement EnableEmployeesToSetTillToggle ;

	@AndroidFindBy(xpath="//android.view.View[@text='Set Default Till as Global']")
	public WebElement SetDefaultTillasGlobalToggle ;

	@AndroidFindBy(xpath="//android.view.View[@text='Enable Cash Drop']")
	public WebElement EnableCashDropToggle ;

	@AndroidFindBy(xpath="//android.view.View[@bounds='[959,569][1336,594]']")
	public WebElement FirstCashDropLimit;

	@AndroidFindBy(xpath="//android.view.View[@bounds='[959,638][1336,662]']")
	public WebElement SecondCashDropLimit;

	@AndroidFindBy(xpath="//android.view.View[@bounds='[1183,739][1336,785]']")
	public WebElement VexenPayTillNo;


	//******************************************************************************************************************





	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-tg-4']")                            // ******
	public WebElement  EnableEmployeesToSetTill ;

	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-tg-5']")
	public WebElement  SetDefaultTillasGlobal ;

	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-tg-7']")
	public WebElement EnableCashDrop  ;

	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-tg-8']")
	public WebElement  DINEIN;

	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-tg-9']")
	public WebElement  AskSeatCountinTableLayout ;

	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-tg-10']")
	public WebElement  AskCustomerName ;

	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-tg-11']")
	public WebElement OrderType  ;

	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-tg-12']")
	public WebElement  FORHERE ;

	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-tg-13']")
	public WebElement  TOGO ;

	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-tg-14']")
	public WebElement  DELIVERY ;

	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-tg-15']")
	public WebElement  PHONETOGO ;

	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-tg-16']")
	public WebElement  PHONEDELIVERY ;

	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-tg-17']")
	public WebElement  WebOrder ;



	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-tg-18']")
	public WebElement  PrintFutureOrders ;

	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-tg-19']")
	public WebElement  RequiredPhoneNumberForForHereOrder ;

	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-tg-20']")
	public WebElement Askcustomernameifphonenumberisnotrequired  ;

	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-tg-21']")
	public WebElement  BarTabGinMill ;

	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-tg-22']")
	public WebElement  QuickBar ;

	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-tg-23']")
	public WebElement  AskCustomerNameBartab ;

	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-tg-24']")
	public WebElement  QSR ;

	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-tg-25']")
	public WebElement  Retail ;

	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-tg-27']")
	public WebElement  EnableCallerID ;

	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-6']")
	public WebElement  CallerIDPortNumber ;





























	//@AndroidFindBy(id="ion-tg-5")
	//public WebElement DineINToggle ;

	//@AndroidFindBy(id="ion-tg-6")
	//public WebElement AskSeatCountinTableLayoutToggle ;

	//@AndroidFindBy(id="ion-tg-7")
	//public WebElement AskCustomerNameDineInToggle ;


	//@AndroidFindBy(id="ion-tg-8")
	//public WebElement OrderTypeToggle ;

	//@AndroidFindBy(id="ion-tg-9")
	//public WebElement FORHEREToggle ;

	//@AndroidFindBy(id="ion-tg-10")
	//	public WebElement TOGOToggle ;

	//@AndroidFindBy(id="ion-tg-11")
	//public WebElement DELIVERYToggle ;

	//@AndroidFindBy(id="ion-tg-12")
	//	public WebElement PHONETOGOToggle ;

	//@AndroidFindBy(id="ion-tg-13")
	//public WebElement PHONEDELIVERYToggle ;

	//	@AndroidFindBy(id="ion-tg-14")
	//	public WebElement WebOrderToggle ;

	//	@AndroidFindBy(id="ion-tg-15")
	//	public WebElement PrintFutureOrdersToggle ;

	//@AndroidFindBy(id="ion-tg-16")
	//public WebElement RequiredPhoneNumberForForHereOrderToggle ;

	//@AndroidFindBy(id="ion-tg-17")
	//	public WebElement AskcustomernameifphonenumberisnotrequiredToggle ;

	//	@AndroidFindBy(id="ion-tg-18")
	//public WebElement BarTabToggle ;
	//	
	//@AndroidFindBy(id="ion-tg-19")
	//public WebElement QuickBarToggle ;

	//@AndroidFindBy(id="ion-tg-20")
	//public WebElement AskCustomerNameBarTabToggle ;

	//@AndroidFindBy(id="ion-tg-21")
	//public WebElement QSRToggle ;

	//@AndroidFindBy(id="ion-tg-22")
	//public WebElement RetailToggle ;

	//@AndroidFindBy(id="ion-tg-23")
	//	public WebElement UseCloverSettingsToggle ;

	//@AndroidFindBy(id="ion-tg-24")
	//public WebElement EnableCallerIDToggle ;

	//@AndroidFindBy(id="	mat-input-1")
	//public WebElement CallerIDPortNumber ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Save Changes']")
	public WebElement SaveChangesBottom ;







 
	@AndroidFindBy(xpath="//android.widget.RadioButton[@resource-id='mat-radio-14-input']")                                   // ******
	public WebElement LingaTheme  ;

	@AndroidFindBy(xpath="//android.widget.RadioButton[@resource-id='mat-radio-15-input']")
	public WebElement AquaBlueTheme  ;

	@AndroidFindBy(xpath="//android.widget.RadioButton[@resource-id='mat-radio-16-input']")
	public WebElement  EmeraldTheme ;

	@AndroidFindBy(xpath="//android.widget.RadioButton[@resource-id='mat-radio-17-input']")
	public WebElement  SafronTheme ;


	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-tg-26']")
	public WebElement  UseCloverSettings ;

	//@AndroidFindBy(id="mat-radio-2")
	//	public WebElement LingaTheme ;

	//	@AndroidFindBy(id="mat-radio-3")
	//	public WebElement AquaBlueTheme ;

	//	@AndroidFindBy(id="mat-radio-4")
	//public WebElement EmeraldTheme ;

	//	@AndroidFindBy(id="mat-radio-5")
	//public WebElement SafronTheme ;





	@AndroidFindBy(xpath="//android.widget.Button[@text='Done']")
	public WebElement Done ;


	@AndroidFindBy(xpath="//android.view.View[@bounds='[801,317][822,338]']")
	public WebElement CancelVexenPinPad ;

	@AndroidFindBy(id="mat-input-12")                                                                               // ******
	public WebElement EnteredNumberinPinPad ;


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
	public WebElement Clear ;


	@AndroidFindBy(xpath="//android.widget.Button[@bounds='[787,596][902,660]']")
	public WebElement BackSpacePinPad ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Continue']")
	public WebElement Continue ;



}
