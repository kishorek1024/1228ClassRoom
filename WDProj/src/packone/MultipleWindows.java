package packone;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {

	public static void main(String[] args) throws Exception{
		
		MethodsScrrens m=new MethodsScrrens();
		m.launchApp("http://rediff.com", "C:\\Users\\DELL\\Desktop\\WD8Nov\\1227Rediff.png");
		
		
	/*	WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\DELL\\Desktop\\WD8Nov\\1227.png"));*/
		
		/*// Click on Data Policy and Cookie Policy Links
		driver.findElement(By.id("privacy-link")).click();
		driver.findElement(By.id("cookie-use-link")).click();
		
		Set<String> a=driver.getWindowHandles();
		ArrayList windows=new ArrayList(a);
		
		driver.switchTo().window((String)windows.get(0)).findElement(By.id("email")).sendKeys("Kishore");
		Thread.sleep(3000);
		driver.switchTo().window((String)windows.get(1)).findElement(By.id("pass")).sendKeys("abcdefgh");*/
		
		//System.out.println(windows.size());
		
		/*int i; int j;
		
		for(i=0; i<windows.size(); i++){
			
			List<WebElement> links=driver.switchTo().window((String)windows.get(i)).findElements(By.tagName("a"));
			//System.out.println(links.size());
			for(j=0; j<links.size(); j++){
				System.out.println(links.get(j).getText());
			}
			System.out.println("----------------------------------------");
			driver.switchTo().window((String)windows.get(i)).close();
		}*/
		
		

	}

}
