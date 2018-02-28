package jump;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class New1Test {
	public WebDriver driver=null;
	  @Test(priority=1)
	  public void f() {
		  System.setProperty("webdriver.chrome.driver", "C:\\tarun\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://opensource.demo.orangehrmlive.com/");
		  driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");
		  driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("admin");
		  driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
	  }
 
}
