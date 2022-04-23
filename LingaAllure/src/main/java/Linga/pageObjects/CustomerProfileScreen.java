package Linga.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CustomerProfileScreen {
	
	public CustomerProfileScreen(AppiumDriver<AndroidElement> dr)  
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	

	@AndroidFindBy(xpath="//android.widget.Button[@text='Add New']")
	public WebElement AddNew ;
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Close']")
	public WebElement Close ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Remove']")
	public WebElement Remove ;
	
	@AndroidFindBy(xpath="(//android.view.View)[14]")        //    17  - add seat(+)        15 not works       22- expanded all - not works      14 finally - plain orderscreen
	public WebElement CustomerNameDisplay ;
	
	@AndroidFindBy(xpath="(//android.widget.EditText)[1]")
	public WebElement CustomerListSearch ;
	
	
	
	
	@AndroidFindBy(xpath="(//android.widget.Button)[1]")
	public WebElement CancelCustomerProfileScreen ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-27']")                            // ******
	public WebElement CustomerProfileScreenSearch ;
	
	
	@AndroidFindBy(xpath="//android.view.View[@resource-id='mat-option-65']")
	public WebElement Searchone ;
	
	@AndroidFindBy(xpath="//android.view.View[@resource-id='mat-option-66']")
	public WebElement Searchtwo ;
	
	@AndroidFindBy(xpath="//android.view.View[@resource-id='mat-option-67']")
	public WebElement Searchthree ;
	
	@AndroidFindBy(xpath="//android.view.View[@resource-id='mat-option-68']")
	public WebElement Searchfour ;
	
	@AndroidFindBy(xpath="//android.view.View[@resource-id='mat-option-69']")
	public WebElement Searchfive ;
	
	
	
	

	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-28']")
	public WebElement FirstName ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-29']")
	public WebElement LastName ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-30']")
	public WebElement Customeridentificationnumber ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-31']")
	public WebElement Birthday ;
	
	@AndroidFindBy(xpath="//android.widget.Spinner[@text='Open calendar']")
	public WebElement BirthdayOpencalendar ;
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='addPhnNo']")                                  // ******
	public WebElement  AddMobileNo ;
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='addressAdd']")
	public WebElement  AddAddress ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Cancel']")
	public WebElement  CancelAddAddress ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Enter Address']")
	public WebElement  EnterAddress ;
	
	//Manual Address Enter
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-36']")                                     // ******
	public WebElement AddressLine1 ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-37']")
	public WebElement AddressLine2 ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-38']")
	public WebElement  City ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-39']")
	public WebElement State ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-40']")
	public WebElement ZipCode ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-41']")
	public WebElement Country ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-42']")
	public WebElement GateCode ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-43']")
	public WebElement Latitude ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-44']")
	public WebElement Longitude ;
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Cancel']")
	public WebElement AddAddressCancel ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Save']")
	public WebElement AddAddressSave ;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AndroidFindBy(xpath="//android.widget.Spinner[@resource-id='mat-select-10']")                                     // ******
	public WebElement SelectMobileNo ;
	
	@AndroidFindBy(xpath="//android.widget.Spinner[@resource-id='mat-select-6']")
	public WebElement SelectAddress ;
	
	
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-35']")
	public WebElement EnterMobileNumber ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='savePhnNo']")
	public WebElement SaveMobile ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='cancelPhnNo']")
	public WebElement CancelMobileNo ;
	

	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-32']")
	public WebElement EmailId ;
	
	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='mat-slide-toggle-2-input']")
	public WebElement TaxExempt ;
	
	@AndroidFindBy(xpath="//android.widget.Spinner[@resource-id='mat-select-8']")
	public WebElement CreditCard ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-34']")
	public WebElement Nationality ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='mat-input-33']")
	public WebElement Notes ;
	
	
	
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Customer Plan']")
	public WebElement CustomerPlan ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Display Order']")
	public WebElement DisplayOrder ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Repeat Order']")
	public WebElement RepeatOrder ;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Save']")
	public WebElement SAVECUSTOMER ;
	
	@AndroidFindBy(xpath="(//android.widget.Button)[2]")
	public WebElement Loyalty ;
	
	
	
	
	
	
	

}
