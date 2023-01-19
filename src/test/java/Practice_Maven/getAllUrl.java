package Practice_Maven;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class getAllUrl extends BaseClass {
	@Test
	public void getURL() throws Throwable {
		
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println("URL : "+URL);
		System.out.println("BROWSER : "+BROWSER);
		System.out.println("USERNAME : "+USERNAME);
		System.out.println("PASSWORD : "+PASSWORD);
		System.out.println(" LOAN FOR EDUCATION ");
		
		launchBrowser(BROWSER,URL);
		List<WebElement> allurl = driver.findElements(By.xpath("//a"));
		for (WebElement ur : allurl) {
			String url = ur.getAttribute("href");
			if (url!=null && url.startsWith("https://")) {
				HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				int statusCode = huc.getResponseCode();
				if(statusCode >= 400) {
					System.out.print(url+" is a broken link ");
				} else {
					System.out.print(url+" is a valid link ");
				}
				System.out.println(" and statusCode : "+statusCode);
			}
			
		}
	}
}
