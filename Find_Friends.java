package ritikesh.Facebooknew;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Find_Friends extends Driver{
	@Test
	public void News14()
	{
		driver.findElement(By.xpath("//*[@id='appsNav']/ul/li[19]/a")).click();
		driver.findElement(By.xpath(".//*[@id='navItem_2356318349']/a/div/span")).click();

}
	}
