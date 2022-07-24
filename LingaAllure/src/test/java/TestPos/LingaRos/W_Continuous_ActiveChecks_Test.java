package TestPos.LingaRos;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


import Linga.pageObjects.CheckStatusPage;
import Linga.pageObjects.DashboardPage;
import Linga.pageObjects.DigitalReceiptScreenPage;
import Linga.pageObjects.OperationPage;
import Linga.pageObjects.OrderType;
import LingaAndroid.LingaAllure.LingaBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class W_Continuous_ActiveChecks_Test extends LingaBase {


	@Test
	public void Continuous_ActiveChecks_Test() throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver103.exe");                                        //1    //2(a space after comma is not allowed)  //3 (small -webdriver)
		WebDriver dr2 = new ChromeDriver();     
		dr2.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);                                                                                                                     //4       (chromed(no)Driver)
		dr2.manage().window().maximize();

		dr2.get("http://web.lingapos.com");    
		String name = dr2.getTitle();
		System.out.println("Title = " +name);
		String page =dr2.getCurrentUrl();
		System.out.println("URL= " +page);
		dr2.findElement(By.xpath(".//*[text()=\" Continue Without Plugin \"]")).click();

		Thread.sleep(1000);
		dr2.findElement(By.id("mat-input-0")).sendKeys("testm@mail.com");
		dr2.findElement(By.id("mat-input-1")).sendKeys("test123");
		//Thread.sleep(1000);
		dr2.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(500);
		//WebElement pops=dr2.findElement(By.xpath(".//*[text()=\"Signed In Successfully\"]"));

		//String message= pops.getText();
		//System.out.println(message);
		Thread.sleep(2000);
		dr2.findElement(By.xpath(".//*[text()=\"1\"]")).click();
		dr2.findElement(By.xpath(".//*[text()=\"2\"]")).click();
		dr2.findElement(By.xpath(".//*[text()=\"3\"]")).click();
		dr2.findElement(By.xpath(".//*[text()=\"4\"]")).click();
		dr2.findElement(By.xpath(".//*[text()=\"Login\"]")).click();




		//for(int i=0;i<100;i++) 
		//{



		dr2.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		dr2.findElement(By.xpath(".//*[@class=\"mat-focus-indicator mat-menu-trigger order-header-menu mat-button mat-button-base _mat-animation-noopable ng-star-inserted\"]")).click();
		Thread.sleep(500);
		dr2.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
		Thread.sleep(1000);

		// driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
		//Thread.sleep(500);


		dr2.findElement(By.xpath(".//*[text()=\"T4\"]")).click();


		dr2.findElement(By.xpath(".//*[text()= \"JCuisine\"]")).click();
		dr2.findElement(By.xpath(".//*[text()= \"menu zzz\"]")).click();
		dr2.findElement(By.xpath(".//*[text()= \"displaygrp testmenu\"]")).click();
		Thread.sleep(1000);
		dr2.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
		Thread.sleep(1000);
		dr2.findElement(By.xpath(".//*[text()= \"New Check\"]")).click();
		dr2.findElement(By.xpath(".//*[text()=\"T4\"]")).click();
		dr2.findElement(By.xpath(".//*[text()=\"1\"]")).click();
		dr2.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
		dr2.findElement(By.xpath(".//*[text()= \"JCuisine\"]")).click();
		dr2.findElement(By.xpath(".//*[text()= \"menu zzz\"]")).click();
		dr2.findElement(By.xpath(".//*[text()= \"displaygrp testmenu\"]")).click();
		Thread.sleep(1000);
		dr2.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
		dr2.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();

		//dr2.findElement(By.xpath(".//*[text()= \"Sidecc\"]")).click();
		//Thread.sleep(2000);

		/*
		 * WebElement element = dr2.findElement(By.xpath(".//*[text()= \"Cash\"]"));
		 * Actions actions = new Actions(dr2);
		 * actions.moveToElement(element).click().perform();
		 * 
		 */

		//dr2.findElement(By.xpath(".//*[text()= \"Submit\"]")).click();


		//}

	}

}
