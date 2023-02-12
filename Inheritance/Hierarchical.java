package Inheritance;
class Campus{
	void name() {
		System.out.println("MDU");
	}
}
class course extends Campus{
	void courseName() {
		System.out.println("MCA");
	}
}

class Rollno extends Campus{
	void rollno() {
		System.out.println("21140");
	}
	
}
public class Hierarchical extends Campus {
	void student() {
		System.out.println("This is Student details.");
	}

	public static void main(String[] args) {
		Hierarchical h=new Hierarchical();
		h.student();
		h.name();
		course c=new course();
		c.courseName();
		c.name();

	}

}
