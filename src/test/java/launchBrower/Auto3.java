package launchBrower;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto3 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);
		
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		
		for (int i = 0; i < list.size(); i++) {
			
			
			String name = list.get(i).getText();
			System.out.println(name);
			
			WebElement price = driver.findElement(By.xpath("//div[text() ='" +name+ "']/ancestor::div[@class='yKfJKb row']/descendant::div[@class = 'Nx9bqj _4b5DiR']"));
			
			System.out.println(price.getText());
			System.out.println("=============================================================");

			}
			driver.quit();
        
	}

}
