package multipleclasses;

import org.testng.annotations.Test;

public class class3 extends class2{
  @Test(priority=6)
  public void feedbackprocess() {
	  System.out.println("feedback successfully collecte");
  }
  @Test(priority=7)
  public void close()
  {
	  System.out.println("window successfully closed");
  }
}
