/**
 * 
 */
package utility;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import sol.tech.screenshot.ScreenShotandReports;






/**
 * @author Shambhu Thakur
 *
 */


public class UtilityClass {


	public static ExtentReports reports;
	public static ExtentTest logger;



	
	public WebDriver driver;


	
		@BeforeTest
		public void setupDriver() throws Exception{
			//The following code is to get rid of log4 error message.
			System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
			
			ConfigReader config = new ConfigReader();

			
			Reporter.log("======++++ Browser Session Started ++++======",true);
			//driver = new FirefoxDriver();
			System.setProperty("webdriver.chrome.driver", "./chromeDriver/chromedriver.exe");
			driver = new ChromeDriver();
			//driver = new RemoteWebDriver(new URL("http://30.128.83.94:4444/wd/hub"), DesiredCapabilities.chrome());
			//driver.manage().window().maximize();
			driver.manage().window().setSize(new Dimension(1814, 974));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(config.getURL());
			reports = new ExtentReports("./Reports/Soltech.html");
			logger=reports.startTest("Start Soltech Test Cases");
			Reporter.log("======++++ Application Started ++++======",true);
		}
		
		@AfterTest
		public void closeApp(){
			
			reports.endTest(logger);
			reports.flush();
			
			driver.quit();
			Reporter.log("======++++ Brwoser Session Ended ++++======",true);
		}
		


	    

		
		//Take screenshot method.
		

		
		
		@AfterMethod
		public void captureScreenshot(ITestResult result) {
			
			if(ITestResult.SUCCESS==result.getStatus()){
				
				String screenshot_path = 
					ScreenShotandReports.takeScreenshots(driver, result.getName());
				String image = logger.addScreenCapture(screenshot_path);
				logger.log(LogStatus.PASS, "LoginVerification", image);
//				System.out.println(image);
//				System.out.println("capturescreen got executed");
			
			}


			
			
			
		}
		


}
