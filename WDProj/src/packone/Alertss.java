package packone;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertss {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		// Click on Go Button
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		// Reading text from alert
		/*System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		*/
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
		a.accept();
		
		
		a.sendKeys("gffjl");
		

	}

}
