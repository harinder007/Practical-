package Exception_handling;

public class ThrowsEg1 {

	public static void checknum(int num) {//static method
		if(num<0) {
			throw new ArithmeticException("number is negetive");
		}
		else {
			System.out.println("number is positive");
		}
	}
	public static void main(String[] args) {
		checknum(-1);
		System.out.println("executed");
	}
	}