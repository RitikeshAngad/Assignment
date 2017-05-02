package ritikesh.Facebooknew;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Offers extends Driver{
	@Test
	public void News16()
	{
	
		driver.findElement(By.xpath("//*[@id='appsNav']/ul/li[19]/a")).click();
		driver.findElement(By.xpath(".//*[@id='navItem_526732794016279']/a/div/span")).click();
}
	} 
