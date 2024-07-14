import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class First {

	public static void main(String[] args) {
	
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\T420\\Documents\\edgedriver_win64\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		driver.findElement(By.id("inputUsername")).sendKeys("Rakesh");
//		driver.findElement(By.name("inputPassword")).sendKeys("ghjkjduyehjd");
//		driver.findElement(By.className("signInBtn")).click();
//		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//		driver.quit();
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\T420\\Documents\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("http:rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.id("inputUsername")).sendKeys("rakesh");
		driver.findElement(By.name("inputPassword")).sendKeys("yujkdsuyhs");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.getTitle();
		driver.getTitle();
	    driver.findElement(By.linkText("Forgot your password?")).click();
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("kumar");
	    driver.findElement(By.cssSelector("input[placeholder='Name']")).clear();
	    driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("hajsa@hgusu.com");
	    driver.findElement(By.xpath("//form/input[3]")).sendKeys("6789268798");
	    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	    System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	    driver.findElement(By.xpath("//button[contains(@class,'go-to-login-btn')]")).click();
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
	    driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.id("chkboxOne")).click();
	    driver.findElement(By.cssSelector(".signInBtn")).click();	    
//	    		driver.quit();
//		
}

}