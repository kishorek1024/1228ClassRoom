package gridd;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_Sample {

	public static void main(String[] args) throws Exception{
		
		// Specify node information
		URL u=new URL("http://localhost:5555/wd/hub");
		
		// Setup Desired Capabilitities
		DesiredCapabilities d=new DesiredCapabilities().firefox();
		
		// Connecting To Node Machine
		RemoteWebDriver r=new RemoteWebDriver(u, d);
		
		WebDriver driver=r;
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		driver.close();
		
		
		//RemoteWebDriver r=new RemoteWebDriver(new URL(""), new DesiredCapabilities().firefox())
		
		

	}

}
