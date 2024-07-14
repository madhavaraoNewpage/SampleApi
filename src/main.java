import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class main {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\T420\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\T420\\Documents\\edgedriver_win64\\msedgedriver.exe");
//		WebDriver driver1 = new EdgeDriver();
		
	}

}
