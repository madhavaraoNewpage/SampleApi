import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mvnpractice {

	

	public static void main(String[] args) throws InterruptedException {
		String productName = "ZARA COAT 3";
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		LandingPage LandingPage = new LandingPage(driver);
		LandingPage.submitorder("anshika@gmail.com", "Iamking@000");
		ProductCatalogue ProductCatalogue = new ProductCatalogue(driver);
		ProductCatalogue.selectTheProduct(productName).click();
		waits wait = new waits(driver);
        String match = ProductCatalogue.selectTheCart();
        Assert.assertEquals(match, productName);
        driver.findElement(By.xpath("//button[normalize-space()='Checkout']")).click();
        wait.elementtoBeAppear(By.xpath("//div[@class='payment__types']//div"));
        Actions ct =new  Actions(driver);
        ct.sendKeys(driver.findElement(By.cssSelector("div[class = 'form-group']")), "india").build().perform();
        wait.elementtoBeAppear(By.cssSelector(".ta-item"));
        driver.findElement(By.cssSelector(".ta-item:nth-of-type(2)")).click();
        WebElement element = driver.findElement(By.xpath("(//a[normalize-space()='Place Order'])[1]"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView()", element);
        jse.executeScript("arguments[0].click()", element);
        wait.elementtoBeAppear(By.cssSelector(".hero-primary"));
        String submit =  driver.findElement(By.cssSelector(".hero-primary")).getText();
        Assert.assertTrue(submit.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
        }

}
