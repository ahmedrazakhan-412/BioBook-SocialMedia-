package Practice_Maven;
import org.testng.annotations.Test;
public class GroupsExcetueTest_2 {
	
	@Test(groups = {"System","Regression"})
	public void carLoan() {
		System.out.println("System & Regression Testing LOAN FOR CAR ");
	}
	
	@Test(groups = {"Smoke","Regression"})
	public void homeLoan() {
		System.out.println("Smoke & Regression Testing LOAN FOR HOME ");
	}
}
