package Collection;
import java.util.Iterator;
import java.util.LinkedList;


class linkedList_methodEg {public static void main(String[] args) {
	LinkedList<String> l1=new LinkedList<String>();
	l1.add("Anudip");
	l1.add("Pallabi");
	System.out.println("after adding");
	//adding an element at the specific position
	l1.add(1,"Riya");
	LinkedList<String> l2=new LinkedList<String>();  //new elements & list 2
	l2.add("aa");
	l2.add("bb");
	//adding 2nd list elements to the first list
	l1.addAll(l2);
	//adding 2nd list elements to the 1st list at specific position
	l1.addAll(1,l2);
	//adding an elements at the first position
	l1.addFirst("Skill");
	//adding an elements at the last position
	l1.addLast("Development");
	//Removing specific element fro the arraylist
	l1.remove("Pallabi");
	//removing specific element on the basis of particular position
	l1.remove(1);
	//remove all the new elements
	l1.removeAll(l2);
	//remove first elements from the list
	l1.removeFirst();
	//remove last elements from the list
	l1.removeLast();
	//remove first occurance of element
	l1.removeFirstOccurrence("Pallabi");
	//remove last occurance of element
	l1.removeLastOccurrence("pallabi");
	//remove allt he elements
	l1.clear();
	Iterator<String> itr=l1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
//Transversing the list of elements in reverse order
	Iterator i=l1.descendingIterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}}