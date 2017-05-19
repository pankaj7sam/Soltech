/**
 * 
 */
package sol.tech.pages;


import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;





/**
 * @author Shambhu Thakur

 */
public class ClickOnOpenPosition {



	
	public ClickOnOpenPosition(WebDriver ldriver){
		
		this.driver=ldriver;

	}

	WebDriver driver;
	
	@FindBy(xpath =".//*[@id='navbar']/div/ul/li[5]/ul/li[2]/a")
	
	WebElement Positions;
	
	public void qaOpenPostions() throws Exception {
		
		String FirstTab = driver.getWindowHandle();
		Set<String> TabIndex = driver.getWindowHandles();
		System.out.println("Total number of tabs before clicking on Positions" + TabIndex.size());
		
		Positions.click();
		System.out.println("Click on open position");
		
		TabIndex = driver.getWindowHandles();
		System.out.println("Number of Tabs " + TabIndex);
		for(String T : TabIndex){
			if(!T.equals(FirstTab))
			{
				driver.switchTo().window(T);
				System.out.println("Current url is "+ driver.getCurrentUrl());

			
			}
			
		}

	}

}
