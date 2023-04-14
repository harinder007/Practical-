package Collection;

import java.util.EmptyStackException;
import java.util.Stack;

public class Stack_EG1 {
public static void main(String[] args) {
	Stack<Integer> s= new Stack<Integer>();
System.out.println("Stack:"+s);//blank stack print	
//pushing elements
pushelement(s,15);
pushelement(s,45);
pushelement(s,20);
pushelement(s,30);
//poping elements
popelement(s);
popelement(s);
//checking empty stack if es throw exception
try {
	popelement(s);
}catch(EmptyStackException e) {
	System.out.println("Stack empty");
}
}
//push operation
private static void pushelement(Stack<Integer> s,int i) {
//invoke push() method
s.push(new Integer(i));
System.out.println("push:"+i);//push one by one
System.out.println("Stack:"+s);//modified stack
}
//pop operation
	private static void popelement(Stack<Integer> s) {
	//invoke pop() method
		Integer i=(Integer)s.pop();
		System.out.println("pop:"+i);//pop one by one
		System.out.println("Stack:"+s);//modified stack	
	}

}