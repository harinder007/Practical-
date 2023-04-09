package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {
public static void main(String[] args) {
	List<String> all= new ArrayList<String>();
all.add("Ravi");
all.add("Shyam");
all.add("Liza");
all.add("Ram");
all.add("David");
all.add("Maria");

String element=all.get(4);//get() method
System.out.println("Get index: "+element);
System.out.println("Array list is: "+all.isEmpty());//isEmpty
String element1=all.remove(2);//remove()
System.out.println("Remove Index: "+element1);
System.out.println("Traversing using for loop");

for(int i=0;i<all.size();i++) {
	System.out.println(all.get(i));
}
}
}
