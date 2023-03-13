package String;

import java.util.Scanner;
class String_Test {
String x="Hello";  //str is a obj of string (by using literal)
public void show() {   //method
	Scanner s=new Scanner(System.in);  //user input
	System.out.println("Enter String");  //line no 1
	String A=s.next();  //1st string
	String B=s.next();   //2nd string
	System.out.println(A.length()+B.length());  //length()
	System.out.println((A.compareTo(B)>0) ? "yes" : "No");  //compare to () -lexicographically
	System.out.println(A.substring(0,4).toUpperCase()+A.substring(2)+" "
	+B.substring(0,3).toLowerCase()+B.substring(1));
	//substring(), upper case,lower case java
	System.out.println("Substring is :"+x.substring(0,3));  //hel--o start index 3 end index
	System.out.println("Substring is :"+x.substring(2));    //llo --2 start index
	}
public static void main(String[] args) {
	String_Test t=new String_Test();
	t.show();
}
}