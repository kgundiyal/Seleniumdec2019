package day1package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1class
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C://Users//kgundiyal//Documents//Selenium//chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("http://google.com");
		String pgtitle=driver1.getTitle();
		System.out.println("hello world! hello world!");
		System.out.println(pgtitle);
		driver1.close();
	}
}
