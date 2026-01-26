import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	List<WebElement> all_CheckBox= driver.findElements(By.cssSelector("input[type='checkbox']"));
                     for(int i=0; i<all_CheckBox.size();i++) {
                   	       WebElement chkBox= all_CheckBox.get(i);
                   	       chkBox.click();
                   	    WebElement UnchkBox= all_CheckBox.get(i);
                   	 UnchkBox.click();
                 System.out.println(all_CheckBox.get(i).isSelected()); 
                     }
                     int count = all_CheckBox.size();
             		System.out.println("Total number of checkboxes: " + count);
	}
}
