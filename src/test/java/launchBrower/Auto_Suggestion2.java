package launchBrower;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Auto_Suggestion2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		
//		driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone ')]/ancestor::div[@class = 'yKfJKb row']/descendant::div[@class = 'Nx9bqj _4b5DiR']"));
//		List<WebElement> list1 = driver.findElements(By.xpath("//div[@class = 'KzDlHZ']"));
		
		List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Add to Compare']/ancestor::div[@class='tUxRFH']/descendant::div[@class='KzDlHZ']"));
		List<WebElement> elements1 = driver.findElements(By.xpath("//span[text()='Add to Compare']/ancestor::div[@class='tUxRFH']/descendant::div[@class='Nx9bqj _4b5DiR']"));
		for(int i=0;i<elements.size();i++) {
			WebElement name = elements.get(i);
			WebElement rs = elements1.get(i);
			System.out.print(name.getText());
			System.out.print(" : ");
			System.out.println(rs.getText());
			
		}
		
		
//		for(int i=0;i<list.size();i++) {
//		WebElement l1=list1.get(i);
//			WebElement l2=list.get(i);
//		    System.out.print(l1.getText());
//		    System.out.print(" : ");
//			System.out.println(l2.getText());
//		}
//	
		
		driver.quit();
	}

}
