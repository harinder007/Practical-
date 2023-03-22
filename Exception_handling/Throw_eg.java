package Exception_handling;

public class Throw_eg {
public static void mydisplay(int a) throws ArithmeticException{//throws use with method
	if(a>=0 && a<35) {
		//throw Arithmetic exception if not then fail
		throw new ArithmeticException("you are fail!");//throws use inside the method
		}
	else {
		System.out.println("you are pass");
	}
}
public static void main(String[] args) {
	mydisplay(13);
	System.out.println("rest of the code....");
	}
}