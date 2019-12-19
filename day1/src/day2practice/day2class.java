package day2practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class day2class 
{
	public static void main(String args[])
	{
		// ****** Starting Chrome Driver ********
		/*
	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\kgundiyal\\Documents\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("http://google.com");
		   String sitetitle=driver.getTitle();
		   System.out.println(sitetitle);
	   	   System.out.println("Hello!" +" " +  sitetitle);
	   	   driver.close();
	   	*/
	   	
	   	// ***** Starting Firefox Driver ****** 
	   	
	   	/*
		     System.setProperty("webdriver.gecko.driver", "C:\\Users\\kgundiyal\\Documents\\Selenium\\geckodriver.exe");
			 WebDriver driver=new FirefoxDriver();
			 driver.get("http://google.com");
			 String sitetitle=driver.getTitle();
			 System.out.println(sitetitle);
	         System.out.println("Hello!" +" " +  sitetitle);
		   	 driver.close();
		   	
		*/
	   	   
	   	   
	   	// ***** Starting EdgeDriver ****** 
		   	
		   /*	
			     // This line is not needed as Windows 18 (edgehtml version) is not available so they asked to update the command in windows settings  as mentioned in url.https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/
		         // for example , run the command in elevated command prompt,  put developer mode ON etc. System.setProperty("webdriver.edge.driver", "C:\\Users\\kgundiyal\\Documents\\Selenium\\MicrosoftWebDriver.exe");
				 WebDriver driver=new EdgeDriver();
				 driver.get("http://google.com");
				 String sitetitle=driver.getTitle();
				 System.out.println(sitetitle);
		         System.out.println("Hello!" +" " +  sitetitle);
			   	 driver.close();
			   	
			*/
		
		
		// ***** Starting IE Driver *****
		
		 System.setProperty("webdriver.ie.driver", "C:\\Users\\kgundiyal\\Documents\\Selenium\\IEDriverServer_1.exe");
		 WebDriver driver=new InternetExplorerDriver();
		 driver.get("http://google.com");
		 String sitetitle=driver.getTitle();
		 System.out.println(sitetitle);
         System.out.println("Hello!" +" " +  sitetitle);
	   	 driver.close(); 
	   	
	   	   
	}

}
