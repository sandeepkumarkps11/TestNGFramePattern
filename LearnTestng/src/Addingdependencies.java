import org.testng.Assert;
import org.testng.annotations.Test;

public class Addingdependencies {
	@Test(dependsOnMethods="doregistration")
	public void loginTest()
	{
		System.out.println("logintest");
	}
	/*@Test
	public void dologin()
	{
		System.out.println("logouttest");
	}*/
	@Test
	public void doregistration()
	{
		int x=10;
		int y=10;
		Assert.assertEquals(x, y);
		System.out.println("registration");
	}
}
