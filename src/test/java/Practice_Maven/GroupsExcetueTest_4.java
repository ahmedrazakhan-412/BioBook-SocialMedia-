package Practice_Maven;
import org.testng.annotations.Test;
public class GroupsExcetueTest_4 {
	@Test(groups = "Sanity")
	public void delete() {
		System.out.println("Sanity Testing Account is Deleted ");
	}
	
	@Test(groups = {"Smoke","Regression"})
	public void freeze() {
		System.out.println("Smoke & Regression Testing Account is Freezed ");
	}
}
