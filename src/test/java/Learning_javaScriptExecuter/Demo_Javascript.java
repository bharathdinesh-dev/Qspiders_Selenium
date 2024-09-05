package Learning_javaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Javascript {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		*************************************************************************************************************************************
//		register code
//		*************************************************************************************************************************************
		js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//a[@class = 'ico-register']")));
		Thread.sleep(500);
		js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//input[@id = 'gender-male']")));
		Thread.sleep(500);
		js.executeScript("arguments[0].value = 'Bharath'",driver.findElement(By.id("FirstName")));
		Thread.sleep(500);
		js.executeScript("arguments[0].value = 'Dinesh'",driver.findElement(By.id("LastName")));
		Thread.sleep(500);
		js.executeScript("arguments[0].value = 'bharathdinesh555@gmail.com'",driver.findElement(By.id("Email")));
		Thread.sleep(500);
		js.executeScript("arguments[0].value = 'crimegod001'",driver.findElement(By.id("Password")));
		Thread.sleep(500);
		js.executeScript("arguments[0].value = 'crimegod001'",driver.findElement(By.id("ConfirmPassword")));
		Thread.sleep(500);
		js.executeScript("arguments[0].click()",driver.findElement(By.id("register-button")));
		Thread.sleep(500);
		
//		*************************************************************************************************************************************
//		login code
//		*************************************************************************************************************************************
		js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//a[@class='ico-login']")));
		Thread.sleep(500);
		WebElement email = driver.findElement(By.id("Email"));
		js.executeScript("arguments[0].value='bharathdinesh555@gmail.com'",email);
		Thread.sleep(500);
		WebElement pass = driver.findElement(By.id("Password"));
		js.executeScript("arguments[0].value = 'crimegod001'",pass);
		Thread.sleep(500);
		js.executeScript("arguments[0].click()",driver.findElement(By.id("RememberMe")));
		Thread.sleep(500);
		js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//input[@class='button-1 login-button']")));
		Thread.sleep(500);
		
//		*************************************************************************************************************************************
//		change password code
//		*************************************************************************************************************************************
		js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//a[text()='bharathdinesh555@gmail.com']")));
		Thread.sleep(500);
		js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//a[@href='/customer/changepassword']")));
		Thread.sleep(500);
		js.executeScript("arguments[0].value = 'OldPassword'",driver.findElement(By.id("OldPassword")));
		Thread.sleep(500);
		js.executeScript("arguments[0].value = 'crimegod001'",driver.findElement(By.id("NewPassword")));
		Thread.sleep(500);
		js.executeScript("arguments[0].value = 'crimegod001'",driver.findElement(By.id("ConfirmNewPassword")));
		Thread.sleep(500);
		js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//input[@value='Change password']")));
		Thread.sleep(500);


//		*************************************************************************************************************************************
//		log out code
//		*************************************************************************************************************************************
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//a[@class='ico-logout']")));
		Thread.sleep(2000);
		
//		exit code
		driver.quit();
		
		
		
		
		
		
	}

}
