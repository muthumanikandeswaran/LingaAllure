package LingaAndroid.LingaAllure;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class LingaBase {

	public static AndroidDriver<AndroidElement> capabilities(String appName) throws InterruptedException, IOException {

		
		
		//System.getProperty("user.dir");     This will get the current project path.   EX: C:\\Users\\91948\\Documents\\test2\\LingaAndroid
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\global.properties");       
		// import java.io   -   FILE INPUT STREAM   is a class in java which can read the file contents through the object fis - which file ? - the location
		// of the file that we give inside the ()............
		
		Properties prop = new Properties();    //properties class in java which works on mapping - import java.util
		prop.load(fis);                        //  asking the object of the properties class  - to load the / read the fis 's contents.
		
		File appD = new File("src");
		File app = new File(appD, (String) prop.get(appName));

		
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
		                                                            // caps.setCapability("udid", "ND4C504E2205D0164");  ALLURE
		String device = (String) prop.get("device");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, device);
		
		caps.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");

		AndroidDriver<AndroidElement> dr = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		dr.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		
		
		
		//dr.findElementByXPath("//android.widget.EditText[@resource-id='mat-input-0']").sendKeys("shri1@mail.com");
	    //dr.findElementByXPath("//android.widget.EditText[@resource-id='mat-input-1']").sendKeys("shri123");
		//dr.findElementByXPath("//android.widget.Button[@text='Login']").click();
		//dr.findElementByXPath("//android.widget.Button[@text='1']").click();
				//dr.findElementByXPath("//android.widget.Button[@text='2']").click();
				//dr.findElementByXPath("//android.widget.Button[@text='3']").click();
				//dr.findElementByXPath("//android.widget.Button[@text='4']").click();
				//dr.findElementByXPath("//android.widget.Button[@text='Login']").click();
		
		
		//Utilities u = new Utilities(dr);
		//u.storeLogin("shri1@mail.com","sri1234");
		
		//Thread.sleep(10000);
		
		//u.defaultPin();
		
		return dr;
	}

}
