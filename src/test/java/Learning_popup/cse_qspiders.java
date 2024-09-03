package Learning_popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cse_qspiders {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ml-1' and text()='Placements']")).click();
		
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
//		remove the parent
		child.remove(parent);
		for (String string : child) {
			driver.switchTo().window(string);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text() = 'CSE']")).click();
			Thread.sleep(2000);
			driver.close();
		}
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ml-1' and text()='Batches']")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
