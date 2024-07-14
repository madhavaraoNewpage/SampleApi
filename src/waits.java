import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits {

	
	WebDriver driver;
	
	public waits(WebDriver driver) {
		this.driver = driver;
	}
	
	public void elementtoBeAppear(By FindBy) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("raju")));
	}

	
}
