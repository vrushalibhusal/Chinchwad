package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AmazonTest {
  @Test
  public void Amazon() throws InterruptedException {
	  {
			 WebDriver driver=new ChromeDriver();
			 Reporter.log("Openng Amazon", true);
			  driver.get("https://www.amazon.com");
			  Thread.sleep(2000);
			  driver.close();
			}
  }
}
