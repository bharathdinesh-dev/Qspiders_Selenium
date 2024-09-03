package WebDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceCode_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		driver.close();
		

	}

}
