package mini_Project;

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

public class Flipkart{

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
		Thread.sleep(2000);
		String flip1 = driver.getWindowHandle();
		Set<String> flips = driver.getWindowHandles();
		flips.remove(flip1);

		for (String string : flips) {
			driver.switchTo().window(string);
			String title = driver.getTitle();

			if (title.contains("vivo")){
				int num = new java.util.Random().nextInt(100);
				TakesScreenshot ts = (TakesScreenshot)driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				File Destination = new File("./takescreenshot/"+num+".png");
				FileHandler.copy(source, Destination);
				WebElement rs = driver.findElement(By.xpath("//span[contains(text(),'vivo')]/ancestor::div[@class='C7fEHH']/descendant::div[@class='Nx9bqj CxhGGd']"));
				WebElement name = driver.findElement(By.xpath("//span[contains(text(),'vivo')]"));
				System.out.print(name.getText());
				System.out.print(" : ");
				System.out.println(rs.getText());
				
				}
			else {
				driver.close();
			}
		}
		driver.quit();
	}

}
