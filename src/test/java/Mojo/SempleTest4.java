package Mojo;

import org.testng.annotations.Test;

public class SempleTest4 {
	@Test(groups={"regression","smoke"})
	public void create() {
		System.out.println("Create");
		System.out.println("Mum");
	}
		@Test(groups={"regression","smoke"})
	
	public void update()
	{
		System.out.println("update");
		System.out.println("Kochi");
	}
	
	@Test()
	public void delete() {
		System.out.println("delete");
		System.out.println("Mum");
	}
}
