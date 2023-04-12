package Collection;

import java.util.Iterator;
import java.util.LinkedList;
public class LinkedList_EG {
	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>(); //create list
		l1.add("Misbah");
		l1.add("Abhishek");
		l1.add("Kapil");
		l1.add("Niladri");
		l1.add("Soumya");
		l1.add("Sourav");
		System.out.println(l1);
		Iterator<String>itr=l1.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		//adding an element at the specific position 
		l1.add(2,"Nisha");  //add(int index,element)
		System.err.println("After adding"+" "+l1);
		LinkedList<String>l12=new LinkedList<String>();
		l12.add("Peso");
		l12.add("Shifa");
		l12.add("Elijah");
		System.err.println("List 2 elements: "+" "+l12);
		//adding all 2nd list elements to the 1st list
		l1.addAll(l12);
		System.err.println("After adding all elements of lost 2 at specific position: "+""+l1);
		//adding element at the 1st postition
		l12.addFirst("Pallabi");
		System.err.println("Add elements at 1st: "+" "+l12);
		//adding elements at the last position
		l12.addLast("Megha");
		System.err.println("Add elements at last: "+""+l12);
		}
}