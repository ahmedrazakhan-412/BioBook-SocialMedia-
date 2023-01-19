package Practice_Maven;
import org.testng.annotations.Test;
public class GroupsExcetueTest_3 {
	@Test(groups = "Smoke")
	public void create() {
		System.out.println("Smoke Testing Account is Created ");
	}
	
	@Test(groups = {"Sanity","Regression"})
	public void update() {
		System.out.println("Sanity & Regression Testing Account is Updated ");
	}
	
	@Test(groups = "Integration")
	public void edit() {
		System.out.println("Integration Testing Account is Edited ");
	}
}
