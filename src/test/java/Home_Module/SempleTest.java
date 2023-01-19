package Home_Module;

import org.testng.annotations.Test;

public class SempleTest {
	@Test(priority = 3)
	public void create() {
		System.out.println("Create");
	}
		@Test(priority = 2,invocationCount = 2)
	
	public void update()
	{
		System.out.println("update");
	}
	
	@Test(priority = 0)
	public void delete() {
		System.out.println("delete");
	}
}
