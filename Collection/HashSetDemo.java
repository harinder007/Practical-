package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//hashset allow null value nut not allow duplicate value
public class HashSetDemo {
public static void main(String[] args) {
Set<String> set= new HashSet<String>();//creating hashset
//insert the element
set.add("AC");
set.add("pencil");
set.add("mouse");
set.add("phone");
set.add(null);//show always on the TOP
set.add("AC");//not allow duplicate element
set.add("Bottol");
set.add("earphone");
set.add("pen");
System.out.println(set);
Iterator<String> itr= set.iterator();
while(itr.hasNext());
System.out.println(itr.next());	
}
}