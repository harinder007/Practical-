package Collection;

import java.util.*;  
public class Stackeg{  
public static void main(String args[]){  
Stack<String> stack = new Stack<String>();  
stack.push("Harinder");  
stack.push("Garvit");  
stack.push("Amit");  
stack.push("Ashish");  
stack.push("Deepak");  
stack.pop();  
Iterator<String> itr=stack.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  