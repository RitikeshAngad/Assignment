package ritikesh.Facebooknew;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Page_Feed extends Driver{
	@Test
	public void News12()
	{
	
		driver.findElement(By.xpath(".//*[@id='navItem_140472815972081']/a/div/span")).click();
}
	}
