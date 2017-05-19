/**
 * 
 */
package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author Shambhu Thakur
 *
 */
public class ConfigReader {
	
	Properties pro;
	
	public ConfigReader(){
		
		
		
		try {
			File src = new File("./Configuration/config.property");
			
			FileInputStream fis = new FileInputStream(src);
			
			pro = new Properties();
			
			pro.load(fis);
			
		} catch (Exception e) {
			System.out.println("Exception is"+ e.getMessage());
		} 
		
	
	}
	
	public String getURL(){
		
		String Link =pro.getProperty("URL");
		
		return Link;
		
	}
	
	public String getNimbusUserName(){
		
		
		return pro.getProperty("UserNameNim");
		
	}
	
	public String getNimbusPassword(){
		
		return pro.getProperty("PasswordNim");
		
	}


}
