package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_HomePage {
	
	// First Way Of Page Objects
	/*public By uid=By.id("email");
	public By pwd=By.id("pass");*/
	
	// SecondWay of Page Objects
	@FindBy(id="email") WebElement uid1;
	@FindBy(id="pass") WebElement pwd1;
	@FindBy(id="email") WebElement uid;
	
	
	
	
	

}
