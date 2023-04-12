package Collection;
import java.util.Iterator;
import java.util.LinkedList;
//link list remove
public class LinkedList_Remove {
	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>(); //create list 1
		l1.add("Kapil");
		l1.add("Abhishek");
		l1.add("Harinder");
		l1.add("Sahil");
		l1.add("Soumya");
		l1.add("Sourav");
	System.out.println("List 1 elements:"+""+l1);
	LinkedList<String> l2=new LinkedList<String>();   //creating list 2
	l2.add("Peso");
	l2.add("Rahul");
	l2.add("Deepak");
	System.out.println("List 2 elements: "+" "+l2);
	//adding new element to the list 1
	l1.addAll(l2);
	System.out.println("After adding new elements:"+""+l1);

	//removing specific element from arrayList 1
	l1.remove("Sahil");
	System.out.println("After Removing:"+""+l1);
	//removing specific element on the basis of particular position
	l1.remove(1);
	System.out.println("After Removing from specific position:"+""+l1);
	//remove all the new elements of list 2
	l1.removeAll(l2);
	System.out.println("Afetr Removing all new elements:"+""+l1);
	//remove 1st element from the list
	l1.removeFirst();
	System.out.println("after removing first elements:"+""+l1);
	//remove last elements from the list
	l1.removeLast();
	System.out.println("After Removing last elements:"+""+l1);
	//adding new elements to the list 1
	l1.add("Pallabi");
	l1.add("Anudip");
	l1.add("Java");
	l1.add("Pallabi");
	l1.add("Collection");
	System.out.println("updated list elements:"+""+l1);
	//remomve first occurance of element
	l1.removeFirstOccurrence("Pallabi");
	System.out.println("Removing 1st occurance:"+""+l1);
	//remove last occurance of element
	l1.removeLastOccurrence("Pallabi");
	System.out.println("Removing last occurance:"+""+l1);
	//Transvering the list of elements in reverse order
	Iterator i=l1.descendingIterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	//remove all the elements 
	l1.clear();
	Iterator<String> itr=l1.iterator();
	while(i.hasNext()) {
		System.out.println(itr.next());
	}
	}
}