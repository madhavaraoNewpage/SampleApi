import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends waits {
	
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id = 'userEmail']")
	WebElement userEmail;
	@FindBy(xpath = "//input[@id = 'userPassword']")
	WebElement password;
	@FindBy(css = "#login")
	WebElement submit;
	
	public void submitorder(String email , String pass) {
		
		userEmail.sendKeys(email);
		password.sendKeys(pass);
		submit.click();
	}

}
