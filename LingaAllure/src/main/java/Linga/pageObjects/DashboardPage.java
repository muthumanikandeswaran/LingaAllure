package Linga.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DashboardPage {
	
	
	public DashboardPage(AppiumDriver<AndroidElement> dr)  
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	

	@AndroidFindBy(xpath="//android.widget.Switch[@resource-id='android:id/switch_widget']")
	public WebElement AllowSource ;
	
	@AndroidFindBy(xpath="(//android.widget.ImageButton)[1]")
	public WebElement AllowSourceBack ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")
	public WebElement ALLOW ;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[1]")
	public WebElement OperationList ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Table']")
	public WebElement TableText ;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[2]")
	public WebElement TableSelection ;
	
	@AndroidFindBy(xpath="(//android.view.View)[14]")        //    17  - add seat(+)        15 not works       22- expanded all - not works      14 finally - plain orderscreen
	public WebElement CustomerNameDisplay ;
	
	@AndroidFindBy(xpath="(//android.widget.EditText)[1]")      
	public WebElement EnterNameWalkInCustomer ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Ok']")
	public WebElement Ok ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Yes']")
	public WebElement Yes ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='No']")
	public WebElement No ;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[3]")
	public WebElement CustomerAdd ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Remove']")
	public WebElement Remove ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@bounds='[1480,46][1920,107]']")             
	public WebElement CustomerListsearch ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Close']")
	public WebElement Close ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Add New']")
	public WebElement AddNew ;
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='All']")
	public WebElement All ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Seats']")
	public WebElement SeatsText ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='1']")
	public WebElement FirstSeat ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='2']")
	public WebElement SecondSeat ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='3']")
	public WebElement ThirdSeat ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='4']")
	public WebElement FourthSeat ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='5']")
	public WebElement FifthSeat ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='6']")
	public WebElement SixthSeat ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='7']")
	public WebElement SeventhSeat ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='8']")
	public WebElement EighthSeat ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='9']")
	public WebElement NinthSeat ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='10']")
	public WebElement TenthSeat ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='+']")
	public WebElement AddSeats ;
	
	@AndroidFindBy(xpath="//android.widget.Spinner[@bounds='[583,96][627,140]']")
	public WebElement SeatsDisplayDropdownButton ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Check']")
	public WebElement CheckText ;
	
	@AndroidFindBy(xpath="(//android.view.View)[26]")         
	public WebElement CheckNumber ;
	
	@AndroidFindBy(xpath="(//android.widget.Spinner)[2]")                   
	public WebElement ServiceTypesDropdown ;
	
	@AndroidFindBy(xpath="(//android.widget.Spinner)[3]")                   
	public WebElement CategoryDropdown ;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[7]")
	public WebElement Split ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='SPLIT CHECK']")
	public WebElement SPLITCHECK ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='SPLIT BY SEAT']")
	public WebElement SPLITBYSEAT ;

	@AndroidFindBy(xpath="(//android.widget.Button)[9]")
	public WebElement OperationInOrderScreen ;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[8]")
	public WebElement SyncInOrderscreen ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Syncing with backoffice ']")
	public WebElement SyncingwithbackofficeText  ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Synced successfully']")
	public WebElement SyncedsuccessfullyText ;
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Void']")
	public WebElement Void ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Done']")
	public WebElement Done ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Print']")
	public WebElement Print ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Option']")
	public WebElement Option ;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Check Option']")
	public WebElement CheckOptionText ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Tax Exempt']")
	public WebElement TaxExempt ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Discount']")
	public WebElement Discount ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Open Item']")
	public WebElement OpenItem ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Gratuity']")
	public WebElement Gratuity ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Gift Card']")
	public WebElement GiftCardCheckOption ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Search Item']")
	public WebElement SearchItem ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Open Cash Drawer']")
	public WebElement OpenCashDrawer ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Resend To Kitchen']")
	public WebElement ResendToKitchen ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Hold']")
	public WebElement Hold ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='fireCoursing']")
	public WebElement fireCoursing ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Service Exempt']")
	public WebElement ServiceExempt ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Cancel']")
	public WebElement Cancel ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Search']")
	public WebElement Search ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@bounds='[653,103][1274,162]']")
	public WebElement EnterSearchItem ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Modify']")
	public WebElement Modify ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Order']")
	public WebElement Order ;
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Cash']")
	public WebElement FastCash ;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Cash']")
	public WebElement CashText ;
	
	@AndroidFindBy(xpath="//android.view.View[@bounds='[547,156][686,196]']")
	public WebElement CheckNumberInFastCash ;
	
	@AndroidFindBy(xpath="//*[@resource-id='mat-input-1']")                                                           // ******
	public WebElement EnteredAmountInFastCash ;
	
	
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
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Enter']")
	public WebElement Enter ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Exact']")
	public WebElement Exact ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='$100']")
	public WebElement $100 ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='$5']")
	public WebElement $5 ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='$10']")
	public WebElement $10 ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='$20']")
	public WebElement $20 ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='$50']")
	public WebElement $50 ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Cancel']")
	public WebElement FastCashCancel ;
	
	@AndroidFindBy(xpath="//android.view.View[@bounds='[569,812][961,840]']")
	public WebElement FastCashTotal ;
	
	@AndroidFindBy(xpath="//android.view.View[@bounds='[959,812][1351,840]']")
	public WebElement FastCashBalanceAmount ;
	
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Payment']")
	public WebElement Payment ;
	
	@AndroidFindBy(xpath="//android.view.View[@text='PAYMENTS']")
	public WebElement PAYMENTSHeadingText ;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Balance Due:']")
	public WebElement BalanceDueText ;
	
	@AndroidFindBy(xpath="(//android.view.View)[14]")
	public WebElement BalanceDueAmount ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Submit']")
	public WebElement Submit ;
	
	@AndroidFindBy(xpath="//*[@resource-id='mat-input-8']")                                               // ******
	public WebElement EnteredAmountInPayment ;
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Delete']")
	public WebElement Delete ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Adjust']")
	public WebElement Adjust ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Exit']")
	public WebElement Exit ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Payment methods']")
	public WebElement PaymentmethodsText ;
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='INR']")
	public WebElement INRPay ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@bounds='[457,178][624,231]']")
	public WebElement CashPay ;
	
	//@AndroidFindBy(xpath="//android.widget.Button[@text='Cash']")[457,178][624,231]
	//public WebElement CashPay ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Gift Card']")
	public WebElement GiftCardPay ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Side CC']")
	public WebElement SideCCPay ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Exit']")
	public WebElement OthersPay ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='HA Payment']")
	public WebElement HAPay ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='MPPG Auth']")
	public WebElement MPPGAuthPay ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='MPPG Sale']")
	public WebElement MPPGSalePay ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Vexen']")
	public WebElement VexenPay ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Clover Auth']")
	public WebElement CloverAuthPay ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Clover Sale']")
	public WebElement CloverSalePay ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='SPPax']")
	public WebElement PaxPaymentPay ;
	
	
	//TIP SCREEN

	@AndroidFindBy(xpath="(//android.widget.Button)[1]")
	public WebElement TipScreenCancel ;
	
	@AndroidFindBy(xpath="(//android.widget.TextView)[4]")
	public WebElement BalanceDueAmountInTipScreen ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='No Tip']")
	public WebElement NoTip ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Custom Tip']")
	public WebElement CustomTip ;
	
	@AndroidFindBy(xpath="(//android.widget.TextView)[6]")
	public WebElement BalanceDuePlusAppliedTip ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Manual']")
	public WebElement Manual ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Process Payment']")
	public WebElement ProcessPayment ;
	
	
	//CardReader Screen
	
	@AndroidFindBy(xpath="//android.widget.Button[@text=' Tip']")
	public WebElement  Tip ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='cardInput']")                              // ******
	public WebElement cardNumber ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='cardName']")
	public WebElement cardHolderName ;
	
	
	
	
	@AndroidFindBy(xpath="(//android.widget.EditText)[4]")
	public WebElement ExpiresOn ;
	
	@AndroidFindBy(xpath="(//android.widget.EditText)[5]")
	public WebElement CVV ;
	
	@AndroidFindBy(xpath="(//android.widget.EditText)[6]")
	public WebElement ZipCode ;
	
	
	
	//@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-43']")
	//public WebElement ExpiresOn ;
	
	//@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-44']")
	//public WebElement CVV ;
	
	//@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-45']")
	//public WebElement ZipCode ;
	
	
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Clear']")
	public WebElement Clear ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Process']")
	public WebElement Process ;
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Log Off']")
	public WebElement LogOff ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Finish']")
	public WebElement Finish ;
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='QSR']")
	public WebElement QSRService ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='DINE IN']")
	public WebElement DINEINService ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Retail']")
	public WebElement RetailService ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Muthumanikandes']")
	public WebElement BartabService ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='TOGO']")
	public WebElement TOGOService ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='FORHERE']")
	public WebElement FORHEREService ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='DELIVERY']")
	public WebElement DELIVERYService ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='PHONE TOGO']")
	public WebElement PHONETOGOService ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='PHONE DELIVERY']")
	public WebElement PHONEDELIVERYService ;
	
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Back']")
	public WebElement Back ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Hold']")
	public WebElement MenuOptionHold ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Fire']")
	public WebElement Fire ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Void Item']")
	public WebElement VoidItem ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Repeat']")
	public WebElement Repeat ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Quantity']")
	public WebElement Quantity ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Attach']")
	public WebElement Attach ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='TOGO']")
	public WebElement MenuOptionTOGO ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Discounts']")
	public WebElement MenuOptionDiscounts ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Open Item']")
	public WebElement MenuOptionOpenItem ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Open Discount']")
	public WebElement MenuOptionOpenDiscount ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Open Modifier']")
	public WebElement MenuOptionOpenModifier ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Change Coursing']")
	public WebElement MenuOptionChangeCoursing ;
	
	
	
	
	//@AndroidFindBy(xpath="//android.widget.Button[@resource-id='']")                                          
	//public WebElement  ;
	                                                                                                                      // ******
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='menu-item-3']")                                           //IMPPPPPPPPPPPPPPPPPPPPP
	public WebElement munch ;
	
}
