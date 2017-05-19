/**
 * 
 */
package sol.tech.screenshot;



import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



/**
 * @author Shambhu Thakur
 *
 */
public class ScreenShotandReports {
	
	public ScreenShotandReports(WebDriver ldriver) {
		this.driver=ldriver;

	}

	WebDriver driver;
	

	public static String takeScreenshots(WebDriver driver,String screenshotsName){
		
		
		
		try {
			
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String dest="./ScreenShots/"+screenshotsName+".png";
			File destination=new File(dest);
			FileUtils.copyFile(source, destination);
			System.out.println("Screenshot was taken");
			return dest;
			
			
		} catch (Exception e) {
			
			System.out.println("Screenshot exception is "+e.getMessage());
			return e.getMessage();

		} 
		
		
	}


}
