import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouseoverlocations {
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\T420\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver); 
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		a.moveToElement(driver.findElement(By.cssSelector(".nav-line-1-container"))).build().perform();
		a.moveToElement(driver.findElement(By.cssSelector("form[id = nav-search-bar-form]"))).click().keyDown(Keys.SHIFT).sendKeys("hello").keyUp(Keys.SHIFT).sendKeys("madhav").build().perform();
		
		
	   
	    
		

	}

}
