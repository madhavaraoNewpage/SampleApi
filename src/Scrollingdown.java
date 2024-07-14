import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\T420\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,450)");
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		List<WebElement> values = driver.findElements(By.cssSelector(".table-display tbody tr td:nth-child(3)"));
		int sum = 0;
		for (int i = 0;i<values.size();i++) {
			int value = Integer.parseInt(values.get(i).getText());
			sum =sum+value;	
		}
		System.out.println(sum);
//		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
//		System.out.println(total);
		driver.quit();
		
}
}
