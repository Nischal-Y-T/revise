package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Selenium files 2021\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Actions a = new Actions(driver);
		WebElement dc=driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		a.doubleClick(dc).perform();
	}

}
