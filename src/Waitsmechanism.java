import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitsmechanism {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\T420\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().window().maximize();
		String[] ItemsNeeded = {"Brocolli","Cucumber"};
		items(driver, ItemsNeeded);
		driver.findElement(By.cssSelector("img[alt = 'Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class= 'promoInfo']")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	}
	
	
	private static void webdriverwait() {
		// TODO Auto-generated method stub
		
	}


	public static void items(WebDriver driver, String[] ItemsNeeded)
	{
		int j = 0;
		List<WebElement> cname = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i = 0;i<=cname.size();i++) {
			String[] nname = cname.get(i).getText().split("-");
		String name	=nname[0].trim();
		List itemsneeded =Arrays.asList(ItemsNeeded);
		if(itemsneeded.contains(name)) {
			j++;
			driver.findElements(By.xpath("//div[@class = 'product-action']/button")).get(i).click();
			if(j==ItemsNeeded.length) {
				break;
				
			}
		}
			
		}
	}

}
