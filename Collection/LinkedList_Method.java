package Collection;

import java.util.LinkedList;

public class LinkedList_Method {
	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>(); //create list
		l1.add("Rahul");
		l1.add("Abhishek");
		l1.add("Amit");
		l1.add("Kamal");
		l1.add("Kapil");
		l1.add("Sourav");
		l1.add("Nancy");
	System.out.println("List 1 elements:"+""+l1);
	//retrives the 1st elements of the line--by default
	System.out.println("retrive first element "+l1.peek());
	//retrives the 1st elements of the list
	System.out.println(l1.peekFirst());
	//retrives the last elements of the list
	System.out.println(l1.peekLast());
	//retrives and remove the 1st elements of the list--by default
	System.out.println(l1.poll());
	System.out.println("List 1 elements:"+""+l1);
	//retrives the 1st elements of the list
	System.out.println(l1.pollFirst());
	System.out.println("List 1 elements:"+""+l1);
	//retrieves the last elements of the list
	System.out.println(l1.pollLast());
	System.out.println("List 1 elements:"+""+l1);
	System.out.println(l1.poll());
	System.out.println("List 1 elements:"+""+l1);
	}
}