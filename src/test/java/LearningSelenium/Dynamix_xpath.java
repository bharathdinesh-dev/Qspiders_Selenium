package LearningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamix_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("https://www.flipkart.com/");
		ch.findElement(By.xpath("//input[@class=\"Pke_EE\"]")).sendKeys("iphone 13");
		ch.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		WebElement element = ch.findElement(By.xpath("//div[text()='Apple iPhone 13 (Starlight, 128 GB)']"));
		String name = element.getText();
		System.out.println(name);
		WebElement element2 = ch.findElement(By.xpath("//div[text()='Apple iPhone 13 (Starlight, 128 GB)']/../..//div[text()='₹50,499']"));
		String price = element2.getText();
		System.out.println(price);
		
		ch.quit();
}}
