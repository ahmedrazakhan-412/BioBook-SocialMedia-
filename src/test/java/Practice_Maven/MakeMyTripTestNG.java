package Practice_Maven;
import java.util.List;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
public class MakeMyTripTestNG extends BaseClass{
	@Test
	public static void makeMyTrip() {
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println("URL : "+URL);
		System.out.println("BROWSER : "+BROWSER);
		System.out.println("USERNAME : "+USERNAME);
		System.out.println("PASSWORD : "+PASSWORD);
		System.out.println(" MakeMyTripTestNG ");
		
		launchBrowser(BROWSER,URL);
		Actions act = new Actions(driver);
		act.moveByOffset(80,90).perform();
		act.doubleClick().perform();
		for(;;) {
			try {
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[normalize-space()='Buses']")))).click();
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("fromCity")))).click();
				String fromCity = JOptionPane.showInputDialog(null,"Please Enter From");
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@placeholder='From']")))).sendKeys(fromCity);
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']//span[@class='sr_city blackText'][contains(.,'"+fromCity+"')]")))).click();
				String toCity = JOptionPane.showInputDialog(null,"Please Enter To");
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@placeholder='To']")))).sendKeys(toCity);
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']//span[@class='sr_city blackText'][contains(.,'"+toCity+"')]")))).click();
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@aria-label='Mon Jan 23 2023']")))).click();
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@id='search_button']")))).click();
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='busList']/div[1]/div[1]/img[2]")))).click();
				WebElement Buses = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@class='appendLeft5']"))));
				System.out.println(Buses.getText()+" to "+toCity);
				List<WebElement> BusesName = wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//div[@class='bus-card']/div/div/div/div/span[@class='latoBlack font22 blackText appendRight15']"))));
				int count = 1; 
				JavascriptExecutor js = (JavascriptExecutor)driver;
				for (WebElement BusName : BusesName) {
					WebElement ScrollByBus = wait.until(ExpectedConditions.visibilityOf(BusName));
					js.executeScript("arguments[0].scrollIntoView(true);",ScrollByBus);
					System.out.println(count+") "+BusName.getText());
					count++;
				}
				break;
			}
			catch (Exception e) {
				act.moveByOffset(80,80).perform();
				act.doubleClick().perform();
			}
		}
	}
}
