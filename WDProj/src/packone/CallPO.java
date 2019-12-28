package packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class CallPO {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		/*PO_HomePage p1=new PO_HomePage();
		driver.findElement(p1.uid).sendKeys("Kishore");
		driver.findElement(p1.pwd).sendKeys("abcdefgh");*/
		
		PO_HomePage p=PageFactory.initElements(driver, PO_HomePage.class);
		p.uid1.sendKeys("Kishore");
		p.pwd1.sendKeys("ghjk");
		
		PO_Page2 p2=PageFactory.initElements(driver, PO_Page2.class);
		p2.email.sendKeys("jhkl");
		
		
		
		
		
		

	}
	
}
