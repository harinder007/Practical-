package Collection;

import java.util.HashSet;

public class HashsetEg {
public static void main(String[] args) {
HashSet<String> set= new HashSet();
set.add("ram");
set.add("rima");
set.add("shyam");
set.add("ram");
set.add("ramesh");
System.out.println("orignal list"+set);
//removing specific element from hash set
set.remove("ram");
System.out.println("after invoking remove:"+set);
HashSet<String> set1= new HashSet();
set1.add("pallabi");
set1.add("rahul");
System.out.println("new set: "+set1);
set.addAll(set1);
System.out.println("updated list: "+set);
//remove all the new element
set.removeAll(set1);
set.clear();
System.out.println("present list: "+set);
}
}