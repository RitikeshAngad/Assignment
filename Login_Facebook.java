package ritikesh.Facebooknew;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login_Facebook extends Driver{
	@Test
	public void login()
	{
	driver.findElement(By.id("email")).sendKeys("demofacebook123@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("123123123demo");
	
	driver.findElement(By.id("u_0_q")).click();
	}
	
}
