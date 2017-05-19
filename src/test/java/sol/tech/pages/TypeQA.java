/**
 * 
 */
package sol.tech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;



/**
 * @author Shambhu Thakur
 *
 */
public class TypeQA {
	
	
	WebDriver driver;
	
	public TypeQA(WebDriver ldriver){
		this.driver=ldriver;
	}

	
	public void typeQA() throws Exception{
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,850)", "");
		System.out.println("Page Down");
		
		driver.switchTo().frame(driver.findElement(By.name("icims_content_iframe")));
		driver.findElement(By.cssSelector(".iCIMS_Logo_Text")).getText();
		
		driver.findElement(By.id("jsb_f_keywords_i")).sendKeys("QA");
		System.out.println("Type QA in search box");
		driver.findElement(By.xpath(".//*[@id='jsb_form_submit_i']")).click();
		System.out.println("Click on submit button");
		

	}


}
