package eCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ajio {
  @Test
  public void ajio() throws InterruptedException
  {
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.ajio.com/");
	  Thread.sleep(5000);
	  driver.close();
  }
}
