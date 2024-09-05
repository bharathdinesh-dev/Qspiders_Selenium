package Learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=images&oq=images&gs_lcrp=EgZjaHJvbWUyDwgAEEUYORiDARixAxiABDINCAEQABiDARixAxiABDIHCAIQABiABDIKCAMQABixAxiABDINCAQQABiDARixAxiABDIKCAUQABixAxiABDINCAYQABiDARixAxiABDIHCAcQABiABDIKCAgQABixAxiABDINCAkQABiDARixAxiABNIBCjE0MTY1ajBqMTWoAgCwAgA&sourceid=chrome&ie=UTF-8");
		driver.findElement(By.xpath("//h3[text()='Google Images']")).click();
		driver.findElement(By.id("APjFqb")).sendKeys("hackers hd logo");
		driver.findElement(By.xpath("//button[@class='HZVG1b Tg7LZd']")).click();
//		driver.findElement(By.name(null)).click();
//		driver.findElement(By.tagName(null)).click();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.partialLinkText("Learn more")).click();
//		driver.findElement(By.cssSelector(null)).click();
		
		
	}

}
