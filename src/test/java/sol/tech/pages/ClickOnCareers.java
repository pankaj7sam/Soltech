/**
 * 
 */
package sol.tech.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




/**
 * @author Shambhu Thakur
 *
 */
public class ClickOnCareers {
	

	WebDriver driver;
	
	public ClickOnCareers(WebDriver ldriver){
		this.driver=ldriver;


	}

	//-----UI elements_________///
	@FindBy(xpath=".//*[@id='navbar']/div/ul/li[5]/a")
	

	WebElement CID;
	

	//-----UI elements_________//

	
	public void careers() throws Exception {
		
		CID.click();
		System.out.println("Click on Careers");
						
	}
	

}
