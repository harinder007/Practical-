package Exception_handling;

//its a necessary block in exception to execute
//in every condition it will be execute--either exception occur or not
public class Finally_block {
	public static void main(String[] args) {
		
//exception not occur
	try {
		int a=4/2;
		System.out.println(a);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	//exception occur
	try {
		int a=4/0;
		System.out.println(a);
	}
	catch(NullPointerException e) {
		System.out.println(e);
	}
	finally {
		System.out.println("Always finally block will executed");
	}
}}
