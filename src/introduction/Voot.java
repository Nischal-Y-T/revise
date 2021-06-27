package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Voot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Selenium files 2021\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.voot.com/");
	   
	   driver.findElement(By.xpath("//button[contains(text(),'Vote Now')]")).click();
       driver.findElement(By.className("jss318")).click();
       driver.findElement(By.className("jss190")).click();
       driver.findElement(By.className("jss323")).click();
       
	}

}
