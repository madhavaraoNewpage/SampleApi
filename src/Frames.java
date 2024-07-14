import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\T420\\\\Documents\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions m = new Actions(driver);
	   m.dragAndDrop(source, target).build().perform();
	   System.out.println(driver.findElement(By.cssSelector("div[id = 'draggable'] p")).getText());
	   driver.switchTo().defaultContent();
	    List<WebElement> name = driver.findElements(By.cssSelector("li[class = 'menu-item'] a"));
	   for(int i = 0; i<=name.size();i++ ) {
		  String icons =  name.get(i).getText();
		   
	   if(icons.equalsIgnoreCase("Demos"))
	   {
		   System.out.println(icons);
		   driver.findElements(By.cssSelector("li[class = 'menu-item'] a")).get(i).click();
		   break;
	   }
	   }
	   
	   driver.navigate().to("https://the-internet.herokuapp.com/");
	   driver.navigate().refresh();
//	   driver.navigate().back();
//	   driver.navigate().forward();
	   driver.findElement(By.linkText("Nested Frames")).click();
	   driver.switchTo().frame("frame-top");
	   driver.switchTo().frame("frame-middle");
	   System.out.println(driver.findElement(By.id("content")).getText());
	   driver.quit();
	}

}
