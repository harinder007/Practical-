package Assignment;

abstract class MCA{
	
	MCA(){
		System.out.println("course is selected");
	}

abstract void sem();
}

class msc extends MCA{
	
	void sem() {
		System.out.println("This is semester ");
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MCA m=new msc();
m.sem();
m.sem();
	}

}
