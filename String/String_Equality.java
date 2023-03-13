package String;

//check equality by using equal() method
import java.util.Scanner;
public class String_Equality {
	public static void main(String[] args) {
		String str1, str2;
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter first String");
		str1=ab.nextLine();
		System.out.println("Enter second String");
		str2=ab.nextLine();
		//comparing two input string(java string compare)
		//if(str1.equals(str2))  //equals()-compare original content of string
			//if (str1==str2)  //==compare reference not value
			if(str1.compareTo(str2)>0)  //comapre lexicographically
			System.out.println("Equal Strings");
		else
			System.out.println("Unequal Strings");
	}
}
