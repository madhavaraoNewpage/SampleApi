import java.rmi.AccessException;
import java.time.Duration;
import java.util.List;

import javax.lang.model.element.Element;
import javax.swing.text.Highlighter.Highlight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\T420\\Documents\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			driver.manage().window().maximize();
			driver.navigate().refresh();
			driver.findElement(By.name("email")).sendKeys("madhavare99@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("Koti&&34");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Create new account")));
			Actions at = new Actions(driver);
			at.moveToElement(driver.findElement(By.linkText("Create new account"))).build().perform();
			driver.findElement(By.linkText("Create new account")).click();
//			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains(@name,'firstname')]")).sendKeys("nuvvu dongavi");
			Select se = new Select(driver.findElement(By.xpath("//select[@name='birthday_day'  and @id='day']")));
			se.selectByIndex(1);
			driver.findElement(By.xpath("//span[starts-with(@data-name,'gender')]/child::span[1]/child::input")).click();
			driver.navigate().refresh();
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().to("https://www.facebook.com/");
	}
}

