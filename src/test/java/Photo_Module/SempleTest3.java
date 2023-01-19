package Photo_Module;

import org.testng.annotations.Test;

public class SempleTest3 {
	@Test(groups="regression")
	public void create() {
		System.out.println("Create");
		System.out.println("Lak");
	}
		@Test()
	
	public void update()
	{
		System.out.println("update");
		System.out.println("Pat");
	}
	
	@Test(groups = {"regression","smoke"})
	public void delete() {
		System.out.println("delete");
		System.out.println("Lak");
	}

}
