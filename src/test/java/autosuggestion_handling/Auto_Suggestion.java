package autosuggestion_handling;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion {

	public static void main(String[] args)throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine(); 
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='lnnVSe']"));
//		for (int i = 0; i < suggestions.size(); i++) {
//			WebElement suggestion = suggestions.get(i);
//			System.out.println(suggestion.getText());
//			if(suggestion.getText().equals(data)) {
//				suggestion.click();
//				break;
//			}
			
		

	for (WebElement suggestion : suggestions) {
			System.out.println(suggestion.getText());
			if(suggestion.getText().equals("selenium testing")) {
				suggestion.click();
			}
			
		}
		

	}

}
