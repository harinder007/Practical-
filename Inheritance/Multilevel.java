package Inheritance;
class one{
	void Parent(){
		System.out.println("This is parent Class 1");
	}
}

class two extends one{
	void ext(){
		System.out.println("This is sub class ");
	}
}
class three extends two{ 
	void easy(){
	System.out.println("This is also a sub class");
}}

public class Multilevel extends three {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multilevel sc=new Multilevel();
		sc.Parent();
		sc.ext();
		sc.easy();
		
		
	}

}
