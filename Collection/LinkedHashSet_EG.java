package Collection;

import java.util.LinkedHashSet;

public class LinkedHashSet_EG {
public static void main(String[] args) {
	//creating hash list and adding element
LinkedHashSet<String> set= new LinkedHashSet<String>();
set.add("one");
set.add("two");
set.add("three");
set.add("four");
set.add("five");
System.out.println("orignal list: "+set);
//removing specific element from the above mentioned list
System.out.println(set.remove("two"));
System.out.println("updated list: "+set);
//six is not present so its false
System.out.println(set.remove("six"));
}
}