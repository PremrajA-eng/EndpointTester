import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class selIntroduction {

	public static void main(String[] args) {
		// System.setProperty(null, null)
		WebDriver driver = new ChromeDriver();
		//WebDriver driver =new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/");
        driver.getTitle();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
        // driver.quit();
	}

}
