package multipleclasses;

import org.testng.annotations.Test;

public class class2 extends class1{
  @Test(priority=4)
  public void paymentdetails() {
	  System.out.println("payment successfully done");
  }
  @Test(priority=5)
  public void deliveryaddress() {
	  System.out.println("delivered to correct address");
  }
}
