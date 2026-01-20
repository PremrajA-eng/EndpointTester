import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// wait for 3 sec on page if any element is not visible and its applicable for every element
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("arupremraj@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("Prem@2626");
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector(".error")).getText());
		

	}

}
