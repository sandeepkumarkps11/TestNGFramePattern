import org.testng.annotations.Test;

public class Filtertingtestcase {
	@Test(groups="Sanity")
	public void first()
	{
		System.out.println("abc");
	}
	@Test(groups="regression")
	public void second()
	{
		System.out.println("def");
	}
	@Test(groups="Sanity")
	public void third()
	{
		System.out.println("ghi");
	}
	@Test(groups="regression")
	public void fourth()
	{
		System.out.println("klm");
	}
	@Test(groups="Sanity")
	public void fivth()
	{
		System.out.println("nop");
	}
	
}
