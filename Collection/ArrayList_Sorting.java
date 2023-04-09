package Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList_Sorting {
	public static void main(String[] args) {
		List<String> all=new ArrayList<String>();
		all.add("Ram");
		all.add("Shyam");
		all.add("David");
		all.add("Rahul");
		 String element =all.get(0);
		 System.out.println("GEt index: "+element);
		 
		 System.out.println("Array List is "+all.isEmpty());// gives true or false value
		 
		 String element1 =all.remove(2); // remove the elemnt at index 2 
		 System.out.println("Remove Index "+element1);
		 
		 System.out.println("before traversing the loop");
		 for(int i=0;i<all.size();i++) {
			 System.out.println(all.get(i));
		 }
		  // sorting with the help of collection
		 Collections.sort(all);
		 System.out.println("After Traversing using the for Loop");
		 for(String name:all) {
			 System.out.println(name);
		 }
		 
	}

}
