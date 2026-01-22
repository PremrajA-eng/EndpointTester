import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// wait for 3 sec on page if any element is not visible and its applicable for every element
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("arupremraj@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("Prem@2626");
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector(".error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("prem@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("premraj");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("arupremraj@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("8381054474");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.className("go-to-login-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[placeholder*='User']")).sendKeys("PremrajA");
        driver.findElement(By.cssSelector("input[placeholder*='Pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//input[@value='rmbrUsername']")).click();
        driver.findElement(By.className("submit")).click();
	}

}
