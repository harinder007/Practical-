package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap_EG {
public static void main(String[] args) {
//creating map
	HashMap<Integer,String>  map= new HashMap<Integer,String>();
map.put(101, "Mango");
map.put(108,"Orange");
map.put(105,"Banana");//duplicacy will not allow 
map.put(103, null);
map.put(105,"Banana");
map.put(null, null);//it will not print
map.put(102, null);
map.put(null, "Apple");
System.out.println(map);
//traversing
for(Map.Entry m:map.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());//print the integer and string value
}
}
}