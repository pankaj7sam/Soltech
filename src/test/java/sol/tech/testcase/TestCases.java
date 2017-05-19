/**
 * 
 */
package sol.tech.testcase;


import org.testng.annotations.Test;

import sol.tech.pages.TypeQA;
import sol.tech.pages.ClickOnOpenPosition;
import sol.tech.pages.QAengineer;
import sol.tech.pages.ClickOnCareers;

import org.openqa.selenium.support.PageFactory;

import utility.ConfigReader;
import utility.UtilityClass;

/**
 * @author Shambhu Thakur
 *
 */

public class TestCases extends UtilityClass{



	
	ConfigReader config = new ConfigReader();
	
	@Test(priority=1)
	public void soltechPager() throws Exception {
		
		//Create page object using page factory.
		ClickOnCareers solPage = PageFactory.initElements(driver, ClickOnCareers.class);
		//Call the method 
		solPage.careers();;


	}
	
	@Test(priority=2)
	public void openPosition() throws Exception {
//		Create page object using page factory.

			ClickOnOpenPosition OpenPositions = PageFactory.initElements(driver, ClickOnOpenPosition.class);
//		Call the method
			OpenPositions.qaOpenPostions();
		
	}
	@Test(priority=3)
	public void typeQA() throws Exception {
//		Create page object using page factory.
		TypeQA Request = PageFactory.initElements(driver, TypeQA.class);
//		Call the method 
		Request.typeQA();
		
	}
	@Test(priority=4)
	public void clickOnQAEngineer() throws Exception {
//		Create page object using page factory.
		QAengineer Request = PageFactory.initElements(driver, QAengineer.class);
//		Call the method
		Request.cliclOnQAEngineer();
		
		
	}
	

}
