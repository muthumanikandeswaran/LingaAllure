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

public class WebRandomTest extends LingaBase {

	@Test
	public void tryOne() throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver102.exe"); // 1 //2(a space after comma is not
																					// allowed) //3 (small -webdriver)
		WebDriver dr = new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS); // 4 (chromed(no)Driver)
		dr.manage().window().maximize();

		
		dr.get("http://web.lingapos.com");
		String name = dr.getTitle();
		System.out.println("Title = " + name);
		String page = dr.getCurrentUrl();
		System.out.println("URL= " + page);
		dr.findElement(By.xpath(".//*[text()=\" Continue Without Plugin \"]")).click();

		Thread.sleep(1000);
		dr.findElement(By.id("mat-input-0")).sendKeys("newland@mail.com");
		dr.findElement(By.id("mat-input-1")).sendKeys("newland1");
		// Thread.sleep(1000);
		dr.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(500);
		WebElement pops = dr.findElement(By.xpath(".//*[text()=\"Signed In Successfully\"]"));

		String message = pops.getText();
		System.out.println(message);
		Thread.sleep(2000);
		dr.findElement(By.xpath(".//*[text()=\"1\"]")).click();
		dr.findElement(By.xpath(".//*[text()=\"2\"]")).click();
		dr.findElement(By.xpath(".//*[text()=\"3\"]")).click();
		dr.findElement(By.xpath(".//*[text()=\"4\"]")).click();
		dr.findElement(By.xpath(".//*[text()=\"Login\"]")).click();

		dr.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		String checkno = dr.findElement(By.xpath("//p[@class='order-header-checkno']")).getText();
		System.out.println(checkno);

		
		
		
		
		/*
		 * for(int i=0;i<100;i++) {
		 * 
		 * dr.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		 * dr.findElement(By.xpath(".//*[text()= \"PEYN??RL?? LEVREKL?? SALATA 28,90TL\"]")
		 * ).click();
		 * dr.findElement(By.xpath(".//*[text()= \"PEYN??RL?? SOMONLU SALATA 30,90TL\"]"))
		 * .click(); Thread.sleep(1000);
		 * dr.findElement(By.xpath(".//*[text()= \"Sidecc\"]")).click();
		 * Thread.sleep(2000);
		 * 
		 * 
		 * WebElement element = dr2.findElement(By.xpath(".//*[text()= \"Cash\"]"));
		 * Actions actions = new Actions(dr2);
		 * actions.moveToElement(element).click().perform();
		 * 
		 * 
		 * 
		 * dr.findElement(By.xpath(".//*[text()= \"Submit\"]")).click();
		 * 
		 * 
		 * }
		 */

	}

}
