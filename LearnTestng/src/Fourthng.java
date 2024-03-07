import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Fourthng {
@BeforeSuite
public void runabletest()
{
	System.out.println("db open");
}
@AfterSuite
public void database()
{
	System.out.println("db close");
}
}
