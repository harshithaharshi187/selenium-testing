package testng;

import org.testng.annotations.Test;

public class program1 {
  @Test(priority=1)
  public void opening_browser() {
	  System.out.println("application successfully opened");
  }
  @Test(priority=2)
  public void customerdetails()
  {
	  System.out.println("customer details successfully updated");
  }
  @Test(priority=3)
  public void productdetails()
  {
	  System.out.println("product is successfully updated");
  }
  @Test(priority=5)
  public void paymentdetails()
  {
	  System.out.println("cash on delivery,payment successfull");
  }
  @Test(priority=4)
  public void deliveryaddress()
  {
	  System.out.println("delivered to right address");
  }
  @Test(priority=6)
  public void feedbackprocess()
  {
	  System.out.println("feedback successfully collected from customers");
  }
  @Test(priority=7)
  public void logoff()
  {
	  System.out.println("application successfully closed");
  }
}
