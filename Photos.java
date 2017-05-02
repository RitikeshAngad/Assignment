package ritikesh.Facebooknew;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Photos extends Driver{
	@Test
	public void News15()
	{
	
		driver.findElement(By.xpath("//*[@id='appsNav']/ul/li[19]/a")).click();
		driver.findElement(By.xpath(".//*[@id='navItem_2305272732']/a/div/span")).click();

}
	}
