package ritikesh.Facebooknew;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class News_Feed extends Driver{
	@Test
	public void News1(){
		
		driver.findElement(By.id("u_0_p")).click();
		driver.findElement(By.xpath("//*[@id='navItem_4748854339']/a/div/span")).click();
	}


	}

