package Exception_handling;

public class MultipleCatch {
static void MyFunc() {
try {
	int i=50/0;//Arithmetic //50/2
	System.out.println(i);//Arithmetic
	int arr[]=new int[3];//ArrayIndexOutOfBound
	arr[7]=24;
}
catch(ArithmeticException e) {
System.out.println("Only 1st Arithmetic exception will execute");	
}
catch(ArrayIndexOutOfBoundsException ae) {
	System.out.println("Now Array index out of bound will occure");
}
finally {
	System.out.println("I am finally block");
}}
public static void main(String[] args) {
	MyFunc();
}
}