package Practice_Maven;
import org.testng.annotations.Test;
public class CreateTest extends BaseClass {
	@Test
	public void eduLoan() {
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
	}
	
	@Test
	public void marriageLoan() {
		System.out.println(" LOAN FOR MARRIAGE ");
	}
	
	@Test
	public void goldLoan() {
		System.out.println(" LOAN FOR GOLD ");
	}
}
