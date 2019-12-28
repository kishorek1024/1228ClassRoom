package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\WD8Nov\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/sectors/bse/auto");
		driver.manage().window().maximize();
		
		// Reading Specific cell value from Table
		//System.out.println(driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody/tr[3]/td[3]")).getText());
		
		// Counting Number Of Rows
		List<WebElement> r=driver.findElements(By.tagName("tr"));
		System.out.println(r.size());
		

	}

}
