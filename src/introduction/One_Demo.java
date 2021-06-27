package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class One_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Selenium files 2021\\chromedriver_win32 (1)\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("123");
		
		driver.findElement(By.id("btnLogin")).click();
		System.out.println(driver.findElement(By.id("spanMessage")).getText());
		//xapth syntax : //tagname[@Attribute='value']
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		System.out.println("close");
		
	}

}
