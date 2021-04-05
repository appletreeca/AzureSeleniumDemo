package WebDriverBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class id {
	
	 public static void pause(Integer milliseconds){
		    try {
		        TimeUnit.MILLISECONDS.sleep(milliseconds);
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
	 }
	 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32_v88\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(1500);
		WebElement Unm = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement Unp = driver.findElement(By.name("pass"));
		Unm.sendKeys("test@gmail.com");
		pause(600);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Unp.sendKeys("abcdefg");
		
		pause(600);
		/*driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.id("loginbutton")).click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		pause(1200);
		driver.findElement(By.id("userNavigationLabel")).click();
		pause(600);
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		*/
		
		driver.close();
		driver.quit();
	}

}
