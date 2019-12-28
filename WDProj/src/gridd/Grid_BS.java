package gridd;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_BS {

	public static void main(String[] args) throws Exception{
		
		URL u=new URL("https://sukrutakulkarni1:5T3y72F4TrtbUN1sYTnF@hub-cloud.browserstack.com/wd/hub");
		
		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability("os", "WINDOWS");
		d.setCapability("os_version", "7");
		d.setCapability("browser", "Firefox");
		d.setCapability("browser_version", "33");
		d.setCapability("browserstack.debug", true);
		
		RemoteWebDriver r=new RemoteWebDriver(u, d);
		WebDriver driver=r;
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}
