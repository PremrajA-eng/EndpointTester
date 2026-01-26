import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DropdownUpdated {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());		
		int i=0;
		while(i<3) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	
	/*	for(int i=0;i<3;i++) {
			
			driver.findElement(By.id("hrefIncAdt")).click();			
		} */
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']  //a[@value='BHO']")).click();
		
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BHO']")).click();
		//      //a[@value='MAA']
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		

	}

}
