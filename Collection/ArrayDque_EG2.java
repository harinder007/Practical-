package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDque_EG2 {
public static void main(String[] args) {
//creating and Adding
	Deque<String> dq= new ArrayDeque<String>();
	dq.add("Pallabi");
	dq.add("Shubu");
	dq.add("mamta");
	dq.add("monmai");
	//first offer
	dq.offerFirst("anju");
	System.out.println("After offer first");
	//traversing
	for(String s1:dq) {
		System.out.println(s1);
	}
	//last offer
	dq.offerLast("Monalisa");
	System.out.println("After offer Last");
	//traversing
		for(String s2:dq) {
			System.out.println(s2);
		}
	//dq.peek() & dq.peekFirst same s peek()
	System.out.println("Peek : "+dq.peek());
	System.out.println("Peek first : "+dq.peekFirst());
	System.out.println("Peek last : "+dq.peekLast());
	System.out.println("After peek: ");
	for(String s2:dq) {
		System.out.println(s2);
	}
		//dq.poll() & dq.pollFirst() same as poll()
		System.out.println("poll :"+dq.poll());
		System.out.println("poll first :"+dq.pollFirst());
		System.out.println("poll Last:"+dq.pollLast());
		System.out.println("After poll");
	
for(String s3:dq) {
	System.out.println(s3);
}
}
}