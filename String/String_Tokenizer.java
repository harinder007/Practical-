package String;

import java.util.StringTokenizer;
public class String_Tokenizer {
public static void my() {
	StringTokenizer t= new StringTokenizer("Anudip Foundation skill and carrer Development center");
while(t.hasMoreTokens()) {//boolean method it checks if there is no more token available
System.out.println(t.nextToken());//string method it return the next token from string token
}
StringTokenizer t1= new StringTokenizer("I am living in Delhi");
while(t1.hasMoreTokens()) {
	System.out.println(t1.nextToken("&"));//to break the string
}
}
public static void main(String[] args) {//main method
	my();//without object because its static type
}
}
