package Exception_handling;

public class ThrowKeyword {
	//throw unchecked
	//whether a student is eligible of java code or not
	
	public static void check(int marks) {
		if(marks>60) {
			//throw instance=throw keyword new and then exception class
		throw new ArithmeticException("Student is  not eligible for course");	
		}
		else {
			System.out.println("Student is  eligible for course");
		}
	}
	public static void main(String[] args) {
		check(78);
	}
	}