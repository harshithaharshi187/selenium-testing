package alert;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]= {10,20,30};
		String a[][]= {{"testing tools","QTP","UFT"},{"A","B","C"}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) 
				System.out.println(a[i][j]+"");
			System.out.println();
		}

}
}
