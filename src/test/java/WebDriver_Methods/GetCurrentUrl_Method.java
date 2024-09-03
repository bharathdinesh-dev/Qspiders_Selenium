package WebDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.qspiders.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}

}
