import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\T420\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//	     WebElement element = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select dropdown = new Select(element);
//		dropdown.selectByIndex(1);
//		dropdown.getFirstSelectedOption().getText();
//		dropdown.selectByVisibleText("AED");
//		dropdown.getFirstSelectedOption().getText();
//		dropdown.selectByValue("USD");
//		dropdown.getFirstSelectedOption().getText();
//		driver.findElement(By.id("divpaxinfo")).click();
//		Thread.sleep(2000);
//		for(int i=1; i<5;i++) {
//			driver.findElement(By.id("hrefIncAdt")).click();	
//		}
//		driver.findElement(By.id("btnclosepaxoption")).click();
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@id = 'glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value = 'COK']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@id = 'glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value = 'PBD']")).click();
		
		driver.findElement(By.id("autosuggest")).sendKeys("aus");
		driver.findElement(By.id("autosuggest")).clear();
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		//li[@class = 'ui-menu-item']/a[@id = 'ui-id-79']
		Thread.sleep(2000);
		List<WebElement> elements =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement  element : elements)
		{
			
			if(element.getText().equalsIgnoreCase("india")) {
				element.click();
				break;
				
			}
		}
		driver.navigate().to("https://rahulshettyacademy.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
		
	}

}