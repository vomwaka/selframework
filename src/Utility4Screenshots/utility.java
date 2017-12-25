package Utility4Screenshots;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utility {
	
private static final Throwable e = null;
 public static void captureScreenShot(WebDriver driver, String screenshotName) {
		try 
		{
		//create ts object
		TakesScreenshot ts = (TakesScreenshot)driver;
			
				//call method 
				File source = ts.getScreenshotAs(OutputType.FILE);
				
				//copy file
				FileUtils.copyFile(source, new File("./screenshots/" + screenshotName+ ".png"));
				
				//confirm screenshot
				System.out.println("Screenshot captured successfully!");
				
		} catch (Exception e) {
			
		}
		
		System.out.println("Excemption while taking screenshot" + e.getMessage() );
	}

}
