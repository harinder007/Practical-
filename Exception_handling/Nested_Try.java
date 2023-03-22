package Exception_handling;

public class Nested_Try {
public static void main(String[] args) {
	//outer try block
	try {
		//1st inner try block
	try {
	int n=10/0;
	System.out.println(n);
}
catch(ArithmeticException e) {//arithmetic exception
	System.out.println(e);
}
	// 2nd inner try block
	try {
		int arr[]=new int[3];
		int a=5;
		arr[5]=22;
		System.out.println(a);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	System.out.println(" both inner try Done");
}
	catch(Exception e){
		System.out.println(e);
	}
	System.out.println("Done");	
	}}