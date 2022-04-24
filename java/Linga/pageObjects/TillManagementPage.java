package Linga.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TillManagementPage {

	public TillManagementPage(AppiumDriver<AndroidElement> dr)  
	{

		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}

	@AndroidFindBy(xpath="//android.view.View[@text='Till Management']")
	public WebElement TillManagementText ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Till']")
	public WebElement Till ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Cash Drop']")
	public WebElement CashDrop ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Pay In']")
	public WebElement PayIn ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Pay Out']")
	public WebElement PayOut ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Open Cash Drawer']")
	public WebElement OpenCashDrawer ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Reports']")
	public WebElement Reports ;



	@AndroidFindBy(xpath="//android.widget.Button[@text='Set Till']")
	public WebElement SetTill ;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='OPEN TILL']")
	public WebElement OPENTILLText ;








	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-13']")                             // ******
	public WebElement TillInput1 ;

	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-14']")
	public WebElement TillInput2 ;

	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-15']")
	public WebElement TillInput3 ;

	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-16']")
	public WebElement TillInput4 ;

	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-17']")
	public WebElement TillInput5 ;

	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-18']")
	public WebElement TillInput6 ;




	//@AndroidFindBy(id="mat-input-1")
	//public WebElement TillInput1 ;

	//@AndroidFindBy(id="mat-input-2")
	//public WebElement TillInput2 ;

	//@AndroidFindBy(id="mat-input-3")
	//public WebElement TillInput3 ;

	//@AndroidFindBy(id="mat-input-4")
	//public WebElement TillInput4 ;

	//@AndroidFindBy(id="mat-input-5")
	//public WebElement TillInput5 ;

	//@AndroidFindBy(id="mat-input-6")
	//public WebElement TillInput6 ;



	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='ion-tg-1']")                 // ******
	public WebElement GlobalTillToggleButton ;


	@AndroidFindBy(xpath="//android.widget.EditText[@bounds='[793,743][932,787]']")
	public WebElement OtherTotal ;



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

	@AndroidFindBy(xpath="//android.widget.Button[@text='Continue']")
	public WebElement Continue ;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Total']")
	public WebElement TotalText ;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Other Total:']")
	public WebElement OtherTotalText ;




	@AndroidFindBy(xpath="//android.widget.Button[@text='Active Till']")
	public WebElement ActiveTill ;

	@AndroidFindBy(xpath="//android.view.View[@bounds='[12,301][468,363]']")
	public WebElement DateAndTimeActiveTill ;

	@AndroidFindBy(xpath="//android.view.View[@bounds='[466,301][694,363]']")
	public WebElement TillNameActiveTill ;

	@AndroidFindBy(xpath="//android.view.View[@bounds='[693,301][970,363]']")
	public WebElement UserActiveTill ;

	@AndroidFindBy(xpath="//android.view.View[@bounds='[968,301][1610,363]']")
	public WebElement DeviceActiveTill ;

	@AndroidFindBy(xpath="//android.view.View[@bounds='[1608,301][1907,363]']")
	public WebElement TillBalanceActiveTill ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Hold Till']")
	public WebElement HoldTill ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Close Till']")
	public WebElement CloseTill  ;

	@AndroidFindBy(xpath="(//android.widget.TextView)[1]")
	public WebElement  CashExpected ;






	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-32']")                       // ******
	public WebElement TillInputclose1 ;

	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-33']")
	public WebElement TillInputclose2 ;

	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-34']")
	public WebElement TillInputclose3 ;

	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-35']")
	public WebElement TillInputclose4 ;

	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-36']")
	public WebElement TillInputclose5 ;

	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-37']")
	public WebElement TillInputclose6 ;


	//	@AndroidFindBy(id="mat-input-155")
	//	public WebElement TillInput155 ;

	//	@AndroidFindBy(id="mat-input-155")
	//	public WebElement TillInput156 ;

	//	@AndroidFindBy(id="mat-input-155")
	//	public WebElement TillInput334 ;

	//	@AndroidFindBy(id="mat-input-155")
	//	public WebElement TillInput43r ;

	//	@AndroidFindBy(id="mat-input-155")
	//	public WebElement TillInput5we ;

	//	@AndroidFindBy(id="mat-input-155")
	//	public WebElement TillInput6e ;








	@AndroidFindBy(xpath="//android.widget.Button[@text='Cancel']")
	public WebElement  Cancel ;

	@AndroidFindBy(xpath="//android.view.View[@bounds='[662,380][1258,449]']")
	public WebElement DiscrepancyAmount  ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Done']")
	public WebElement  Done ;

	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-38']")              // ******
	public WebElement DiscrepancyNotes ;





	@AndroidFindBy(xpath="//android.widget.Button[@text='No']")
	public WebElement No  ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Yes']")
	public WebElement Yes  ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Print']")
	public WebElement Print  ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Submit']")
	public WebElement Submit  ;



	@AndroidFindBy(xpath="//android.widget.Button[@text='Held Till']")
	public WebElement HeldTill ;



	@AndroidFindBy(xpath="//android.widget.Button[@text='Closed Till']")
	public WebElement ClosedTill ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Adjust Till']")
	public WebElement AdjustTill ;




	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-39']")         // ******
	public WebElement CashDropAmount ;

	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-13']")
	public WebElement PaidBy ;

	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='']")
	public WebElement PayInAmount ;

	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-6']")
	public WebElement PaidTo ;

	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-7']")
	public WebElement PayOutAmount ;


	//@AndroidFindBy(id="mat-input-11")
	//public WebElement CashDropAmount ;

	//@AndroidFindBy(id="mat-input-34")
	//public WebElement PaidBy ;

	//@AndroidFindBy(id="mat-input-35")
	//public WebElement PayInAmount ;

	////@AndroidFindBy(id="mat-input-36")
	//public WebElement PaidTo ;

	//@AndroidFindBy(id="mat-input-37']")
	//	public WebElement PayOutAmount ;
	////


	@AndroidFindBy(xpath="//android.widget.Button[@text='Cashier Out']")
	public WebElement CashierOut ;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Close Day']")
	public WebElement CloseDay ;

}
