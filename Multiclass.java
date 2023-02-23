package OverLoading;

class exam{
	
	int marks() {
		
		return 40;
	}
}

class maths extends exam{
	int marks() {
		return 50;
		
	}
}

class hindi extends maths{
	int marks() {
		return 60;
		
	}
}

class english extends hindi{
	int marks() {
		return 90;
		
	}
}
public class Multiclass extends english {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hindi h=new hindi();
		System.out.println(h.marks());
		
		english e=new english();
		e.marks();
		System.out.println(e.marks());
		
		maths m=new maths();
		m.marks();
		System.out.println(m.marks());
		
		// another way of calling by parent class reference variable
		// it will works only same method
		exam eg;
		eg =new maths();
		
	System.out.println("This is maths marks"+eg.marks());
	
	eg=new english();
	System.out.println("This is english marks"+eg.marks());
	
	
		eg=new hindi();
		System.out.println("This is hindi marks"+eg.marks());

	}

}
