package Assignment;

public class OverLoading {
	//method 1
	static  int add(int a,int b) {
		
		int sum=a+b;
		return sum;
	}
	//method 2
	
   static  int add(int a,int b,int c) {
		
		int sum=a+b+c;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(OverLoading.add(4, 5));
		System.out.println(OverLoading.add(4, 5,6));
		
		
	}

}
