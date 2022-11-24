package package1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class New1 {
	@BeforeClass
	public void login()
	{
		System.out.println("welcome to amazon page");
	}
  @Test
  public void operation()
  {
	  System.out.println("performed operation");
  }
  @AfterClass
  public void logout()
  {
	  System.out.println("amazon page closed");
  }
}
