package eCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import org.testng.reporters.jq.Main;
//import org.testng.reporters.jq.Main;

public class Nykaa {
  @Test
  public void nykaatest() throws InterruptedException 
  {
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.nykaa.com/");
	  Thread.sleep(5000);
	  driver.close();
  }
}
