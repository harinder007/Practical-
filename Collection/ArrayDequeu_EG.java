package Collection;

import java.util.*;
public class ArrayDequeu_EG {
public static void main(String[] args) {
Deque<String> dq= new ArrayDeque<String>();
dq.add("Ram");
dq.add("Karan");
dq.add("Riya");
dq.add("Priya");
dq.add("Sam");
dq.add("Ajay");
//dq.add(null);//null are not allow in Queue List
System.out.println(dq);
dq.addFirst("Shree");//add on the top
dq.addLast("Riya");//add on the bottom
System.out.println("New List");
for(String s1: dq) {//for each loop
	System.out.println(s1);//to print the new list
}
dq.removeFirst();
dq.removeLast();
System.out.println("New list After removal");
for(String s2:dq) {//for each loop
	System.out.println(s2);
}
}
}
