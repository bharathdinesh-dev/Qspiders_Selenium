package takescreeshot_method;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Flip_1 {
	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		
		//get hedder screen shot
		WebElement header = driver.findElement(By.xpath("//header[@class='_3EOQ5Q']"));
		File s1 = header.getScreenshotAs(OutputType.FILE);
		File h1 = new File("./screenshot/headder.png");
		FileHandler.copy(s1, h1);
		
		//get margue screen shot
		WebElement margue = driver.findElement(By.xpath("(//div[@class='1yQHx8 _2UnIQ _3ak8Rd _2y8Yzt'])[1]"));
		File s2 = margue.getScreenshotAs(OutputType.FILE);
		File m1 = new File("./screenshot/margue.png");
		FileHandler.copy(s2, m1);
		
		//get lap screen shot
		driver.findElement(By.xpath("//input[@class = 'Pke_EE']")).sendKeys("laptop");
		driver.findElement(By.xpath("//button[@class = '2iLD_']")).click();
		WebElement lap = driver.findElement(By.xpath("(//div[@class='tUxRFH'])[1]"));
		File s3 = lap.getScreenshotAs(OutputType.FILE);
		File l1 = new File("./screenshot/lap.png");
		FileHandler.copy(s3, l1);
		
		driver.quit();
	}

}
