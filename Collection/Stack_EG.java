package Collection;

import java.util.Stack;
//push(),pop(),search(),peek(),empty()---five most useful method in stack
public class Stack_EG {
	public static void main(String[] args) {		
	//creating stack class
Stack<Integer> s1= new Stack<Integer>();
//checking empty or not
boolean result=s1.isEmpty();
System.out.println("is the stack empty ?"+result);
//adding element push
s1.push(25);
s1.push(20);
s1.push(75);
s1.push(56);
s1.push(80);
s1.push(43);
s1.push(34);

System.out.println("Stack element:"+s1);//result print the element
Integer digit=s1.peek();//access element from the top of the stack
System.out.println("top element:"+digit);
System.out.println("Stack element after peek:"+s1);
Integer digit2=s1.pop();
System.out.println("top element:"+digit2);
System.out.println("Stack element after pop:"+s1);
s1.add(4, 90);//in-between add the another elements
int digit1=s1.search(75);//search any element
System.out.println("  adding element 90 in position 4th:"+s1);
System.out.println("search element:"+digit2);
int x=s1.size();//find the size of  the stack
System.out.println("Stack size:"+x);
result=s1.isEmpty();//checking empty or not
System.out.println("is the stack empty ?"+result);
}
}