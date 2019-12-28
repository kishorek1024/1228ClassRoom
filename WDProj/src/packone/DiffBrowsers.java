package packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DiffBrowsers {

	public static void main(String[] args) {
		
		/*WebDriver driver=new FirefoxDriver();
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		driver.close();*/
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\WD8Nov\\Jars\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("http://yahoomail.com");
		driver1.manage().window().maximize();*/
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\DELL\\Desktop\\WD8Nov\\Jars\\IEDriverServer.exe");
		WebDriver driver2=new InternetExplorerDriver();
		driver2.get("http://facebook.com");
		driver2.manage().window().maximize();
		
		
		
		
		
		
		
		
		
		

	}

}
