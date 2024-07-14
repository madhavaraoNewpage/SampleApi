import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeforInterview {

	public static void main(String[] args) {

          System.setProperty("WebDriver.chrome.driver", "C:\\\\Users\\\\T420\\\\Documents\\\\chromedriver-win64\\\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.get("https://www.facebook.com/");
          driver.navigate().refresh();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
          WebDriverWait wait= new WebDriverWait(driver, Duration.ofMillis(2000));
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#email")));
          driver.findElement(By.cssSelector("input#email")).sendKeys("rajesh");
          driver.navigate().to("https://the-internet.herokuapp.com/");
          driver.navigate().refresh();
          driver.findElement(By.linkText("Nested Frames")).click();
          driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-right']")));
          JavascriptExecutor je = (JavascriptExecutor)driver;
          je.executeScript("Window.ScrollBy(0,450)");
          Actions at = new Actions(driver);
          at.moveToElement(driver.findElement(By.xpath("//frame[@name='frame-right']"))).build().perform();
          Select se = new Select(driver.findElement(By.xpath("//frame[@name='frame-right']")));
          at.doubleClick(driver.findElement(By.xpath("//frame[@name='frame-right']")));
          WebElement source = null;
          WebElement target = null;
          at.dragAndDrop(source, target).build().perform();
          

	}

}
