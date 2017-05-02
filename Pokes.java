package ritikesh.Facebooknew;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Pokes extends Driver{
	@Test
	public void News18()
	{
	
		driver.findElement(By.xpath("//*[@id='appsNav']/ul/li[19]/a")).click();
		driver.findElement(By.xpath(".//*[@id='navItem_183217215062060']/a/div/span")).click();
	}
	}
