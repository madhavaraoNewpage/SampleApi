import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\T420\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class = 'form-group']/input[@name = 'name']")).sendKeys("Rakesh");
		driver.findElement(By.xpath("//div[@class = 'form-group']/input[@name = 'email']"))
				.sendKeys("rakeshkumar@gmail.com");
		driver.findElement(By.cssSelector("#exampleInputPassword1")).sendKeys("rakesh@123");
		driver.findElement(By.cssSelector("#exampleCheck1")).click();
		WebElement dp = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dp1 = new Select(dp);
		dp1.selectByVisibleText("Male");
		dp1.getFirstSelectedOption().click();
		driver.findElement(By.cssSelector("#inlineRadio2")).click();
		driver.findElement(By.xpath("//input[@name = 'bday']")).sendKeys("12-09-1995");
		driver.findElement(By.xpath("//input[@value = 'Submit']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		driver.close();

	}

}
