package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//driver.navigate().refresh();
		
		Actions a=new Actions(driver);
		
		WebElement email=driver.findElement(By.id("email"));
		a.contextClick(email).build().perform();
		
		/*a.dragAndDrop(email, email).build().perform();
		a.clickAndHold(email).build().perform();
		a.release().build().perform();*/
		
		int i;
		for(i=1; i<5; i++){
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		}
		/*a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);*/
		a.sendKeys(Keys.ENTER).build().perform();
		
		
		
		/*WebElement loginbutton=driver.findElement(By.id("Login"));
		a.doubleClick(loginbutton).build().perform();*/
		
		/*a.sendKeys(Keys.F5).build().perform();
		a.sendKeys(Keys.CONTROL+"t").build().perform();*/
		
		
		
		/*// Creating Webelement for companies
		WebElement companies=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/a/div"));
		
		// Move cursoer to Companies
		a.moveToElement(companies).build().perform();
		
		// Click on About Companies Link
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/div/ul/li[2]/a")).click();*/

	}

}
