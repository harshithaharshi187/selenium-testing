package alert;

public class polymorphism {
	public void add() {
		System.out.println("null parameters");
	}
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void add(double c,double d) {
		double e=c+d;
		System.out.println(e);
	}
	public void add(String a1,String a2) {
		System.out.println(a1+a2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polymorphism p1=new polymorphism();
		p1.add();
		p1.add(10,50);
		p1.add(46.9,6.8);
		p1.add(null, null);

	}

}
