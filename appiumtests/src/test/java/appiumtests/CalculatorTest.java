package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobilePlatform;

public class CalculatorTest {

	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		try {
			openCalculator();	
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		
		

	}
	public static void openCalculator() throws Exception {
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		//capabilities setup for device
		cap.setCapability("noReset", "true");
		cap.setCapability("fullReset", "false");
		cap.setCapability("deviceName","Redmi K30");  
		cap.setCapability("platformName", "Android" );
		cap.setCapability("platformVersion", "11");
		cap.setCapability("udid", "b9b38dec");
		cap.setCapability("appPackage", "com.miui.calculator");
		cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,cap);
		
		System.out.println("Application Started!!");
		
		MobileElement two = driver.findElement(By.id("com.miui.calculator:id/btn_2_s"));
		MobileElement Plus = driver.findElement(By.id("com.miui.calculator:id/btn_plus_s"));
		MobileElement one = driver.findElement(By.id("com.miui.calculator:id/btn_1_s"));
		MobileElement equals = driver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
		MobileElement result = driver.findElement(By.className("android.widget.TextView")); 
		two.click();
		two.click();
		two.click();
		two.click();
		two.click();
		two.click();
		Plus.click();
		one.click();
		one.click();
		equals.click();
		
		String res = result.getText();
		System.out.println("\n Result is : " + res);
		
		System.out.println("Completed..........");
		
		
	}

} 
//RKQ1.200826.002
