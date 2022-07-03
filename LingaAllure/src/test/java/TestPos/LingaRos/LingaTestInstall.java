package TestPos.LingaRos;

import java.io.IOException;
import org.testng.annotations.Test;
import LingaAndroid.LingaAllure.LingaBase;
import LingaAndroid.LingaAllure.Utilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LingaTestInstall extends LingaBase {


	@Test
	public void tryOne() throws InterruptedException, IOException {

		AndroidDriver<AndroidElement> dr = Capabilities();

		Utilities u = new Utilities(dr);
		u.storeLogin("cassanobro@mail.com","bro123");

	}

}
