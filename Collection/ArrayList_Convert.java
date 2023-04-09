package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_Convert {
public static void main(String[] args) {
ArrayList<String> al=new ArrayList<String>();//creating array list	
al.add("Welcome");
al.add("To");
al.add("Anudip");
al.add("Foundation");
al.add("To");
al.add("Learn");
al.add("Java");
al.add("Full");
al.add("Stack");
al.add("Course");	
//convertion of list to array
System.out.println("List to array:");
//toArray() method used to convert list to array
String []arr=al.toArray(new String[al.size()]);
for(String s:arr) {
	System.out.println(s);
}
//array list
System.out.println("Array to list:");
List<String> all= new ArrayList<String>();
all=Arrays.asList(arr);//asList method convert array to list
System.out.println(all);
}
}