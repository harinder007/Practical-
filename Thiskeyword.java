package ConstructorEg;
// program based on this keyword
 class This {
	int id;
	String name;
	This(int id,String name){
		this.id=id;
		this.name =name;
		
	}
	    void display() {
		System.out.println(id+" "+name);
		
	}
public class Thiskeyword{
	public static void main(String args[]) {
		
		This sc=new This(11,"hello");
		
		 sc.display();
	}
}
 }


