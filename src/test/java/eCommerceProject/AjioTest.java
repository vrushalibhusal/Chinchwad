package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AjioTest {
  @Test
  public void Ajio() throws InterruptedException {
	  {
			 WebDriver driver=new ChromeDriver();
			 Reporter.log("Openng Ajio", true);
			  driver.get("https://www.ajio.com");
			  Thread.sleep(2000);
			  driver.close();
			}
  }
}
