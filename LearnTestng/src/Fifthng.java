import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Fifthng {
@Test
public void validation()
{
	System.out.println("a");
	int expected=10;
	int actual=20;
	//Assert.assertEquals(actual, expected);
	SoftAssert a=new SoftAssert();
	a.assertEquals(10, 20);
	System.out.println("b");
}
}
