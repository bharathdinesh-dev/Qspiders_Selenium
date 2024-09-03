package Learning_popup;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class flipkart_handles {

	public static void main(String[] args)throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class = 'Pke_EE']")).sendKeys("mobile",Keys.ENTER);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		
		for (int i = 1; i <=5; i++) {
			list.get(i).click();	
		}
		
		String flip1 = driver.getWindowHandle();
		Set<String> flips = driver.getWindowHandles();
		
		System.out.println(flip1);
		flips.remove(flip1);
		System.out.println(flips);
		
		
		for (String string : flips) {
			if (flip1.equals(string)) {
				driver.switchTo().window(string);
				driver.close();
				}
//			else {
//				driver.switchTo().window(string);
//				TakesScreenshot ts = (TakesScreenshot)driver;
//				File source = ts.getScreenshotAs(OutputType.FILE);
//				File Destination = new File("./takescreenshot/filehandle.png");
//				FileHandler.copy(source, Destination);
//				
//				
//			}
		}
		
		
		
		
		

	}

}
