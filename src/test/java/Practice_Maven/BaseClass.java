package Practice_Maven;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
public class BaseClass {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String title;
	public static WebDriver launchBrowser(String browserType, String url) {
		if(browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
			driver = new FirefoxDriver(); //To open FirefoxBrowser
			Reporter.log("Firefox Browser is Launched Successfully",true);
			driver.manage().window().maximize();
			driver.get(url);
			wait = new WebDriverWait(driver,20);
			title = driver.getTitle();
			Reporter.log("Opened An "+title+" Application", true);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		else if(browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			driver = new ChromeDriver(); //To open ChromeBrowser
			Reporter.log("Chrome Browser is Launched Successfully", true);
			//ListenerImplementationClass.test.log(Status.INFO,"----- Chrome Browser is Launched Successfully");
			driver.manage().window().maximize();
			driver.get(url);
			wait = new WebDriverWait(driver,20);
			title = driver.getTitle();
			Reporter.log("Opened An "+title+" Application", true);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		} 
		else if(browserType.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver", "./softwares/operadriver.exe");
			driver = new OperaDriver(); //To open OperaBrowser
			Reporter.log("Opera Browser is Launched Successfully", true);
			driver.manage().window().maximize();
			driver.get(url);
			wait = new WebDriverWait(driver,20);
			title = driver.getTitle();
			Reporter.log("Opened An "+title+" Application", true);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		} 
		else if(browserType.equalsIgnoreCase("msedge")) {
			System.setProperty("webdriver.edge.driver", "./softwares/msedgedriver.exe");
			driver = new EdgeDriver(); //To open MSEdgeBrowser
			Reporter.log("MSEdge Browser is Launched Successfully", true);
			driver.manage().window().maximize();
			driver.get(url);
			wait = new WebDriverWait(driver,20);
			title = driver.getTitle();
			Reporter.log("Opened An "+title+" Application", true);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		} 
		return driver;
	}

}