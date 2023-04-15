package Collection;
import java.util.Iterator;
import java.util.TreeSet;
// trees set always mainatain asscending order

public class TreeSetEg {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();
		set.add("A");
		set.add("R");
		set.add("M");
		set.add("N");
		set.add("K");
		set.add("H");
		set.add("D");
		set.add("C");
		set.add("B");
		System.out.println("Original set : "+set);
		//traversng elements thorough iterator in descending order
		Iterator itr=set.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());}
		System.out.println("Lowest value :"+set.pollFirst());
		System.out.println("updated set after pollfirst "+set);
		System.out.println("Highest value :"+set.pollLast());
		System.out.println("updated set after pollLast "+set);
		
		System.out.println("Revese set "+set.descendingSet());
		
		System.out.println("Head set "+set.headSet("N"));
		System.out.println("Sub set "+set.subSet("M","H"));
		System.out.println("Head set "+set.headSet("C"));
		}
	}

