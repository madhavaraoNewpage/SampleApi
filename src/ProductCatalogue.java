import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCatalogue extends waits{
	
	WebDriver driver;
	
	public ProductCatalogue(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
   @FindBy(css = ".mb-3")
   List<WebElement> products;
   @FindBy(xpath = "//button[normalize-space()='Add To Cart']")
   WebElement cart;
   @FindBy(xpath = "//div[@class = 'cartSection']/h3")
   WebElement cart2;
   
   By element = By.xpath("//button[normalize-space()='Add To Cart']");
   By productBy = By.cssSelector(".mb-3");
   By element1 = By.xpath("//div/h3");
   
   public  WebElement selectTheProduct(String productName) {
	   elementtoBeAppear(productBy);
	   WebElement prod = products.stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
       WebElement elementBy = prod.findElement(element);
	  return elementBy;
   }
   
   public String selectTheCart() {
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     cart.click();
     elementtoBeAppear(element1);
     String match = cart2.getText();
     return match;
   }
 }
