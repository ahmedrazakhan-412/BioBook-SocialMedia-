package maven_scripts;

import org.testng.annotations.Test;

public class TestScript3_Test {
	
	@Test(groups = "smoke")
	public void script5_test()
	{
		System.out.println("Script - 5");
	}

	
	@Test(groups = "regression")
	public void script6_test()
	{
		System.out.println("Script - 6");
	}

}
