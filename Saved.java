package ritikesh.Facebooknew;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Saved extends Driver{
	@Test
	public void News20()
	{
	
		driver.findElement(By.xpath("//*[@id='appsNav']/ul/li[19]/a")).click();
		driver.findElement(By.xpath(".//*[@id='navItem_586254444758776']/a/div/span")).click();

}
	}
