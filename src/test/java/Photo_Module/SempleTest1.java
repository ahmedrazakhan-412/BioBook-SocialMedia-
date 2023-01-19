package Photo_Module;

import org.testng.annotations.Test;

public class SempleTest1 {
	
	@Test(groups={"smoke","regression"})
	public void create() {
		System.out.println("Create");
		System.out.println("Kol");
	}
		@Test(groups="regression")
	
	public void update()
	{
		System.out.println("update");
		System.out.println("Del");
	}
	
	@Test(groups={"regression","smoke"})
	public void delete() {
		System.out.println("delete");
		System.out.println("Del");
	}

}
