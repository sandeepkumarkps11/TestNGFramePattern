import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestCase extends Fourthng{
@BeforeClass
public void precondition()
{
	System.out.println("open browser");
}
@Test(priority=2)
public void logintest()
{
	System.out.println("do login test");
}
@AfterClass
public void postcondition()
{
	System.out.println("close browser");
}
@Test(priority=1)
public void registration()
{
	System.out.println("doregistration");
}
@Test(priority=3)
public void operator()
{
	System.out.println("pointing");
}
}
