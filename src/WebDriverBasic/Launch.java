package WebDriverBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://maps.google.com");

//		System.setProperty("webdriver.ie.driver", "D:\\Software\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
//		WebDriver driver=new InternetExplorerDriver(); 
//		driver.get("http://maps.google.com");

	}

}
