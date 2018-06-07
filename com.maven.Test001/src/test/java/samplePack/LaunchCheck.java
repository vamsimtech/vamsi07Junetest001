// comments added
package samplePack;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import objectDetailPack.ObjectDetails;

public class LaunchCheck {
	Properties prop;
	WebDriver driver;
	ObjectDetails obj=new ObjectDetails();
	
	@Test(enabled=true,priority=1)
	public void launchBrowser() throws IOException{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium software\\Chromedriver\\latest\\chromedriver.exe");
		driver=new ChromeDriver();
		Properties prop=obj.getObjectData();
		driver.get(prop.getProperty("url"));
		String urlCheck=driver.getCurrentUrl();
		System.out.println("current url is:"+urlCheck);
		Assert.assertEquals(urlCheck, "https://www.google.com/?gws_rd=ssl");
	
	}
	
@Test(enabled=true,priority=2)
	public void closeBrowser(){
		driver.close();
	}
}
