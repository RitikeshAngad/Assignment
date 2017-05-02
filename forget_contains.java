package ritikesh.Facebooknew;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class  forget_contains extends Driver{
	@Test
	public void News()
	{
		driver.get("https://www.facebook.com/login/identify?ctx=recover&lwv=110");
		driver.findElement(By.xpath("//a[@href='/help/277898572230446']")).click();
		driver.findElement(By.id("loginbutton")).click();
}

}
