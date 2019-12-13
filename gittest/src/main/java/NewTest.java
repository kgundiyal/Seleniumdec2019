import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\kgundiyal\\Documents\\Selenium\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://google.com");
	  System.out.println("hello!!");
	  
  }
}
