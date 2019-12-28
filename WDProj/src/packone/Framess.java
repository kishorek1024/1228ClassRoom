package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Framess {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		driver.manage().window().maximize();
		
		WebElement f1=driver.findElement(By.name("packageListFrame"));
		WebElement f2=driver.findElement(By.name("packageFrame"));
		
		List<WebElement> links=driver.switchTo().frame(f1).findElements(By.tagName("a"));
		
		int i; int j;
		for(i=2; i<links.size(); i++){			
			links.get(i).click();
			System.out.println("Links in " + links.get(i).getText() + " are Below");
			driver.switchTo().parentFrame();	
			List<WebElement> l1=driver.switchTo().frame(f2).findElements(By.tagName("a"));
			for(j=0; j<l1.size(); j++){				
				System.out.println(l1.get(j).getText());				
			}
			System.out.println("------------------------------------");
			driver.switchTo().parentFrame();
			driver.switchTo().frame(f1);
			
			
		}
		
		
		/*List<WebElement> frames=driver.findElements(By.tagName("frame"));
		
		int i; int j;
		for(i=0; i<frames.size(); i++){
			List<WebElement> links=driver.switchTo().frame(i).findElements(By.tagName("a"));
			for(j=0; j<links.size(); j++){
				System.out.println(links.get(j).getText());
			}
			System.out.println("---------------------------------------------------");
			driver.switchTo().parentFrame();
		}*/
		
		/*// Create Webelement for Frame1
		WebElement f1=driver.findElement(By.name("packageListFrame"));
		// Switch to Frame1 and click on link
		driver.switchTo().frame(f1).findElement(By.xpath("/html/body/div[2]/ul/li[1]/a")).click();
		
		driver.switchTo().parentFrame();
		
		// Create Webelement for Frame2
		WebElement f2=driver.findElement(By.name("packageFrame"));
		// Switch to Frame2 and click on link
		driver.switchTo().frame(f2).findElement(By.xpath("/html/body/div/ul[1]/li[2]/a/span")).click();*/
		
		

	}

}
