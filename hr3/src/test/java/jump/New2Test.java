package jump;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class New2Test extends New1Test {
	 @Test(priority=2)
	  public void f1() throws InterruptedException {
		  driver.findElement(By.xpath("//b[text()='Leave']")).click();
		  driver.findElement(By.xpath(".//*[@id='frmFilterLeave']/fieldset/ol/li[1]/img")).click();
		
		  while(true)
		  {
			  try {
			
				  driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]")).click();
				  driver.findElement(By.xpath("//a[text()='28']")).click();
				 
			  }catch(Exception e) {
				 
				 // break;
				 // driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click
			  
				  
				  driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[2]")).click();
				  Thread.sleep(5000);
				  driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
				  driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]")).click();
				  driver.findElement(By.xpath("//a[text()='6']")).click();
				  break;
			  }
		  }
	 }
}
