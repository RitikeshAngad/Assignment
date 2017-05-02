package ritikesh.Facebooknew;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class Messenger extends Driver{
	@Test
	public void News2()
	{
		driver.findElement(By.xpath(".//*[@id='navItem_217974574879787']/a/div/span")).click();
}

}
