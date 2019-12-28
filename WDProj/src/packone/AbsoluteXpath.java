package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("html/body/div[2]/div/div[2]/a[1]")).click();

	}

}
