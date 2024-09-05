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

public class Myntra {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.out.println("==============================================");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.myntra.com/");
		Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shirts",Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> all = dr.findElements(By.xpath("//a[@target='_blank']"));
		
		for (int i = 1; i <= 5; i++) {
			int n = new java.util.Random().nextInt(all.size()-1);
			all.get(n).click();
		}
		String parentWindowHandle = dr.getWindowHandle();
		Set<String> allwindowHandles = dr.getWindowHandles();
		allwindowHandles.remove(parentWindowHandle);
		List<WebElement> listNames = dr.findElements(By.xpath("//h3[@class='product-brand']"));
		List<WebElement> listRs = dr.findElements(By.xpath("//span[@class='product-discountedPrice']"));
		for (String string : allwindowHandles) {
			dr.switchTo().window(parentWindowHandle);
			int n = new java.util.Random().nextInt(listNames.size());
			String name = listNames.get(n).getText();
//			WebElement name = dr.findElement(By.xpath("//h1[contains(text(),'"+name+"')]/ancestor::div[@class='pdp-price-info']/descendant::h1[@class='pdp-title']"));
			System.out.print(name);
			System.out.print(" : ");
//			WebElement rs = dr.findElement(By.xpath("//h1[contains(text(),'"+name+"')]/ancestor::div[@class='pdp-price-info']/descendant::span[@class='pdp-price']"));
			String rs = listRs.get(n).getText();
			System.out.println(rs);
			System.out.println("==============================================");
			dr.switchTo().window(string);
			TakesScreenshot ts = (TakesScreenshot)dr;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File Destination = new File("./takescreenshot/"+n+".png");
			FileHandler.copy(source, Destination);
//			WebElement rs = dr.findElement(By.xpath("//h1[@class='pdp-title']/ancestor::div[@class='pdp-price-info']/descendant::span[@class='pdp-price']"));
//			WebElement name = dr.findElement(By.xpath("//h1[@class='pdp-title']"));
			
			
			
		}
		dr.quit();
	}

}