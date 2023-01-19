package Practice_Maven;
import org.testng.annotations.Test;
public class GroupsExcetueTest_1 {
	@Test(groups = "Sanity")
	public void eduLoan() {
		System.out.println("Sanity Testing LOAN FOR EDUCATION ");
	}
	
	@Test(groups = {"Integration","Regression"})
	public void marriageLoan() {
		System.out.println("Integration & Regression Testing LOAN FOR MARRIAGE ");
	} 
	
	@Test(groups = "Smoke")
	public void goldLoan() {
		System.out.println("Smoke Testing LOAN FOR GOLD ");
	}
}
