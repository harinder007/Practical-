package String;

import java.util.StringTokenizer;

public class StringToken_Eg {
	String str="Welcome to Java World";
	String st= new String(str);
	public void show() {
		System.out.println("the 5th position is:"+str.charAt(5));//to find the position
		str=str.concat(" let us learn");//concatination the string
		System.out.println("after concat:"+st);
		System.out.println("position of a:"+str.indexOf('a'));//to find the position a
		System.out.println("replace a with e:"+str.replace('a', 'e'));//replace a to e
		System.out.println("substring is:"+str.substring(4,10));//find the sub part of string
		System.out.println("lower case is:"+str.toLowerCase());//lower case
		if(str.compareTo(st)>0) {
			System.out.println("equal");
		}
		else {
			System.out.println("unequal");
		}
		System.out.println();
	}
	public static void my() {
		StringBuffer s= new StringBuffer("this is String buffer  ");
		s.append("This is a Simple program");//add the string
		System.out.println("String is:"+s);
		s.insert(21,"Object");
		System.out.println("insert is:"+s);//insert the word
		s.replace(15,20,"builder");
		System.out.println("replace is:"+s);//replace it
		System.out.println("reverse is:"+s.reverse());
		System.out.println();
		StringTokenizer t1= new StringTokenizer("Drive:C:&Folder:IBM||DB2||PROGRAM &File:DB2COPY1.EXC");
		while(t1.hasMoreTokens()) {
			System.out.println(t1.nextToken("&"));//to break the string
	}
		System.out.println();
		}
		
public static void main(String[] args) {
	StringToken_Eg a1= new StringToken_Eg();
	a1.show();
	my();
}
}