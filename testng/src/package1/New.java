package package1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class New {
  @BeforeMethod
  public void login() {
	  System.out.println("login successfully opened");
  }
  @Test
  public void operation() {
	  System.out.println("performed successfully");
  }
  @AfterMethod
  public void logoff() {
	  System.out.println("loggedout successflly");
  }
}
