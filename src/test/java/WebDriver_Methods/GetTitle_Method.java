package WebDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.qspiders.com/corporates");
	    String title = driver.getTitle();
	    System.out.println(title);

	}

}
