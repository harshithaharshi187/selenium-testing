package classesandobjects;

public class passingparameters {
	public void add(int x,int y) {
		int z;
		z=x*y;
		System.out.println(z);
	}
	public void sub(int a,int b) {
		int c;
		c=a-b;
		System.out.println(c);
	}
	public void mul(int x1,int y1) {
		int z1;
		z1=x1*y1;
		System.out.println(z1);
	}
	public static void main(String[] args) {
		passingparameters a1=new passingparameters();
		a1.add(12,12);
		a1.sub(90,20);
		a1.mul(10,20);
	}

}
