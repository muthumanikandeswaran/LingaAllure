package TestPos.LingaRos;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import Linga.pageObjects.CheckStatusPage;
import Linga.pageObjects.DashboardPage;
import Linga.pageObjects.HardwareSettingsPage;
import Linga.pageObjects.OperationPage;
import Linga.pageObjects.OrderType;
import Linga.pageObjects.PinPage;
import Linga.pageObjects.TableLayoutPage;
import LingaAndroid.LingaAllure.LingaBase;
import LingaAndroid.LingaAllure.Utilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class mobile_Allureest extends LingaBase {



	@Test
	public void tryOne() throws InterruptedException, IOException {



		AndroidDriver<AndroidElement> dr = Capabilities();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		Utilities u =new Utilities(dr); 
		u.storeLogin("newland@mail.com","newland1");
		Thread.sleep(5000); 
		PinPage pp = new PinPage(dr); 
		u.defaultPin(); 

		OrderType ot =new OrderType(dr); 







		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");                                        //1    //2(a space after comma is not allowed)  //3 (small -webdriver)
		WebDriver dr2 = new ChromeDriver();     
		dr2.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);                                                                                                                     //4       (chromed(no)Driver)
		dr2.manage().window().maximize();

		dr2.get("http://web.lingapos.com");    
		String name = dr2.getTitle();
		System.out.println("Title = " +name);
		String page =dr2.getCurrentUrl();
		System.out.println("URL= " +page);
		dr2.findElement(By.xpath(".//*[text()=\" Continue Without Plugin \"]")).click();

		Thread.sleep(2000);
		dr2.findElement(By.id("mat-input-0")).sendKeys("newland@mail.com");
		dr2.findElement(By.id("mat-input-1")).sendKeys("newland1");
		Thread.sleep(1000);
		dr2.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(500);
		WebElement pops=dr2.findElement(By.xpath(".//*[text()=\"Signed In Successfully\"]"));

		String message= pops.getText();
		System.out.println(message);
		Thread.sleep(2000);
		dr2.findElement(By.xpath(".//*[text()=\"1\"]")).click();
		dr2.findElement(By.xpath(".//*[text()=\"2\"]")).click();
		dr2.findElement(By.xpath(".//*[text()=\"3\"]")).click();
		dr2.findElement(By.xpath(".//*[text()=\"4\"]")).click();
		dr2.findElement(By.xpath(".//*[text()=\"Login\"]")).click();




		for(int i=0; i<50;i++) {
			//Thread.sleep(2000);

			ot.Cancel.click();
			dr2.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			DashboardPage dp = new DashboardPage(dr);
			dp.ServiceTypesDropdown.click();
			dr2.findElement(By.xpath(".//*[@class=\"mat-focus-indicator mat-menu-trigger order-header-menu mat-button mat-button-base _mat-animation-noopable ng-star-inserted\"]")).click();
			dp.DINEINService.click();
			dr2.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
			Thread.sleep(1000);
			dr2.findElement(By.xpath(".//*[text()=\"T1\"]")).click();
			dr.findElement(By.xpath("//*[@text='T1']")).click();
			dr2.findElement(By.xpath(".//*[text()= \"PEYNİRLİ LEVREKLİ SALATA 28,90TL\"]")).click();
			dr.findElement(By.xpath("//*[@text='PEYNİRLİ LEVREKLİ SALATA 28,90TL']")).click();


			dr2.findElement(By.xpath(".//*[text()= \"PEYNİRLİ SOMONLU SALATA 30,90TL\"]")).click();
			dr.findElement(By.xpath("//*[@text='PEYNİRLİ SOMONLU SALATA 30,90TL']")).click();


			Thread.sleep(2000);
			dp.Finish.click();
			dr2.findElement(By.xpath(".//*[text()= \"All\"]")).click();
			Thread.sleep(1000);
			TableLayoutPage tlp= new TableLayoutPage(dr);
			tlp.NewCheck.click();
			dr2.findElement(By.xpath(".//*[text()= \"New Check\"]")).click();
			dr.findElement(By.xpath("//*[@text='T1']")).click();
			dr2.findElement(By.xpath(".//*[text()=\"T1\"]")).click();
			tlp.One.click();
			dr2.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			tlp.Continue.click();
			dr2.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			//Thread.sleep(2000);
			dr2.findElement(By.xpath(".//*[text()= \"PEYNİRLİ ÇUPRA SALATA 28,90TL\"]")).click();
			dr.findElement(By.xpath("//*[@text='PEYNİRLİ ÇUPRA SALATA 28,90TL']")).click();
			Thread.sleep(2000);
			dp.Finish.click();
			dr2.findElement(By.xpath(".//*[text()= \"All\"]")).click();
			CheckStatusPage csp = new CheckStatusPage(dr);
			csp.QSR.click();
			dr2.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();


		}
		
		
		DashboardPage dp = new DashboardPage(dr);
		dp.All.click();
		dr2.findElement(By.xpath(".//*[text()= \"All\"]")).click();


		







		//int d = dr.findElementsByClassName("android.view.View").size();   //   orderscreen   78
		//System.out.println(d);


		//DashboardPage dp = new DashboardPage(dr);
		//dp.CustomerAdd.click();
		//dp.CustomerListsearch.sendKeys("shri");
		//dp.CustomerNameDisplay.click();
		//dp.EnterNameWalkInCustomer.sendKeys("Meenatchi");
		//dp.Ok.click();
		//dp.CustomerNameDisplay.click();

		//dp.Close.click();
		//dp.AddSeats.click();
		//dp.SeatsDisplayDropdownButton.click();
		//Thread.sleep(3000);
		//dp.SeatsDisplayDropdownButton.click();
		//int dd = dr.findElementsByClassName("android.view.View").size();   //   order screen after a change - small    80
		//System.out.println(dd);
		//Thread.sleep(3000);
		//int ddd = dr.findElementsByClassName("android.widget.Spinner").size();   //   orderscreen    3
		//System.out.println(ddd);

		//String st = dp.CheckNumber.getText();
		//System.out.println(st);

		//dp.ServiceTypesDropdown.click();

		//dp.FirstSeat.click();
		//dp.TableSelection.click();

		//dp.CategoryDropdown.click();
		//dp.CategoryDropdown.click();


	}

}