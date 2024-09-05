package Learning_javaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Disabled_Webelement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//input[@class = 'form-control']"));
		
//		type cast the driver into javascriptExecutor interface
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		then call the method present in javascriptexecuter interface
		js.executeScript("arguments[0].value = 'crimegod@gamil.com'", element);
				

	}

}
