package ritikesh.Facebooknew;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Setting extends Driver {
	@Test
	public void News()
	{
		driver.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
		
		driver.findElement(By.xpath(".//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[11]/a/span/span")).click();
	}
	}