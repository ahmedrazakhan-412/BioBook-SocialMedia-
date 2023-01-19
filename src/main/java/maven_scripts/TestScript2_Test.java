package maven_scripts;

import org.testng.annotations.Test;

public class TestScript2_Test {
	
	@Test(groups = "smoke")
	public void script3_test()
	{
		System.out.println("Script - 3");
	}

	
	@Test(groups = "regression")
	public void script4_test()
	{
		System.out.println("Script - 4");
	}

}
