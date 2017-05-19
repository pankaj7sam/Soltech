package sol.tech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;


public class QAengineer {
	

	
	WebDriver driver;
	
	public QAengineer(WebDriver ldriver){
		this.driver=ldriver;
	}
	
	public void cliclOnQAEngineer() throws Exception{
		
		driver.findElement(By.linkText("Quality Assurance Automation Engineer")).click();
		System.out.println("Click on Quality Assurance Automation Engineer");
		String x = driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div[1]/div/div/div/dl[1]/dd")).getText();
		System.out.println("Job ID is "+ x);
		Assert.assertTrue(x, true);
	}

}
