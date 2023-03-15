package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//1st way

public class Regex_eg1 {
public static void main(String[] args) {
Pattern p= Pattern.compile(".s");//(.) dot represent single character
Matcher m= p.matcher("ks");
boolean b= m.matches();

//2nd way

boolean b2= Pattern.compile(".s").matcher("ks").matches();

//3rd way

boolean b3= Pattern.matches(".s", "ks");
System.out.println(b+"\n"+b2+"\n"+b3);
}
}