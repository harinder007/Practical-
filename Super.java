class Shape { // parent class
	String name= "circule"; // data member of parent class
}
class Size extends Shape { // child class
	String nmae="no size";// data member of child class
	void print() { // child class method
		System.out.println(name); // it represent child class
		System.out.println(super.name); // it represent immidiate parent class

	}
}
 class Super {
	 public static void main(String[] args) {
		Size obj= new Size();
		obj.print();
	}

}