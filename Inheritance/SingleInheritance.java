package Inheritance;

class simple{
	int age=12;
	void good() {
		System.out.println("my age is :"+age);
	}
}

public class SingleInheritance extends simple {

	
	void easy() {
		System.out.println("This is single inhertance");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleInheritance sc= new SingleInheritance();
		sc.good();
		sc.easy();

	}

}
