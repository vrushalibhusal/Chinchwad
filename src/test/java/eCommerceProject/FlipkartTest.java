package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlipkartTest {
  @Test
  public void Flipkart() throws InterruptedException {
	  {
			 WebDriver driver=new ChromeDriver();
			 Reporter.log("Openng flipkart", true);
			  driver.get("https://www.flipkart.com");
			  Thread.sleep(2000);
			  driver.close();
			}
  }
}
