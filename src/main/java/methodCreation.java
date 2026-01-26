import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methodCreation {

	public static void main(String[] args) throws InterruptedException {
		String name="premraj";
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// wait for 3 sec on page if any element is not visible and its applicable for every element
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
	   
		 Thread.sleep(2000);
		String password= getPassword(driver);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
         driver.findElement(By.id("inputUsername")).sendKeys(name);
		 driver.findElement(By.name("inputPassword")).sendKeys(password);
		 Thread.sleep(1000);
		 driver.findElement(By.className("submit")).click();
	     
	}
	
	public static String getPassword(WebDriver driver) {
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("premraj");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("arupremraj@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("8381054474");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();     
        String passwordstring=driver.findElement(By.cssSelector("form p")).getText();
        System.out.println(passwordstring);
       String[] splString= passwordstring.split("'");   //Please use temporary password 'rahulshettyacademy' to Login.
        System.out.println(splString[0]);   //Please use temporary password 
        System.out.println(splString[1]);   //rahulshettyacademy' to Login.
       return splString[1];
   
	}

}
