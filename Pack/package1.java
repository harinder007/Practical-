package Pack;

public class package1 {
	
	// addtion method
int sum(int x,int y) {
	int add=x+y;
	System.out.println("Sum of two no. is :"+add);
	return add;
}

//subtraction method
int sub(int x,int y) {
	int sub=x-y;
	System.out.println("Sum of two no. is :"+sub);
	return sub;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
package1 obj=new package1();
obj.sum(2, 3);
obj.sub(7, 5);
	}

}
