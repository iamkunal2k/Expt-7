package selenium.org

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestHelloWorld {
	@Test
	public void testhelloworld() {
		System.setProperty("webdriver.chrome.driver", "D:\\W3schools\\JAVA\\eclipse\\chromedriver.exe");
		// Instantiate a chromedriver class.
		WebDriver driver = new ChromeDriver();
		
		//Launch Website
		driver.navigate().to("https://www.javatpoint.com/");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//scroll down the webpage by 5000px
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0, 5000)");
		
		//Click on the search text box and send value
		driver.findElement(By.id("gsc-i-id1")).sendKeys("core Java");
		
		//Click on the Search button
		driver.findElement(By.className("gsc-search-button")).click();
	}
	
}
