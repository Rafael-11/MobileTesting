import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	public static void main(String[] args) throws MalformedURLException {

		// This is Appium Code

		File file = new File("src");
		File file1 = new File(file, "ApiDemos-debug.apk");
		
	

		DesiredCapabilities capilities = new DesiredCapabilities();
		capilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus");
		capilities.setCapability(MobileCapabilityType.APP, file1.getAbsolutePath());// getAbsolutePath works every machine
		
		
			AndroidDriver<AndroidElement> driver = new AndroidDriver<>(
					new URL("http://127.0.0.1:4723/wd/hub"), capilities);
	
		
		

	}
}
