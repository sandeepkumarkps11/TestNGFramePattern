import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HandlingParameter {
@Test(dataProvider="getData")
public void logintest(String username,String password)
{
	System.out.println(username +" "+ password  );
}
@Test(dataProvider="getDataforregistration")
public void doregistration(String fn,String ln,String userid)
{
	System.out.println(fn +" "+ ln +" "+ userid  );
}
@DataProvider
public String [][] getData()
{
String s[][]=new String[2][2];
s[0][0]="user1";
s[0][1]="pass1";
s[1][0]="user2";
s[1][1]="pass2";
return s;
}
@DataProvider
public String [][] getDataforregistration()
{
String [][] a=new String[2][3];
a[0][0]="firstname1";
a[0][1]="lastname1";
a[0][2]="id1";
a[1][0]="firstname2";
a[1][1]="lastname2";
a[1][2]="id2";
return a;
}
}
