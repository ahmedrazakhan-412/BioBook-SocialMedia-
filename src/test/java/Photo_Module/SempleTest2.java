package Photo_Module;

import org.testng.annotations.Test;

public class SempleTest2 {
	@Test(groups="smoke")
	public void create() {
		System.out.println("Create");
		System.out.println("Ran");
	}
		@Test(groups ={"smoke","regression"})
	
	public void update()
	{
		System.out.println("update");
		System.out.println("BBSR");
	}
	
	@Test(groups="regression")
	public void delete() {
		System.out.println("delete");
		System.out.println("Ran");
	}

}
