package ConstructorEg;

    class A {
	int a; String st;
	//method name is same as the class name
	 A() {
		a=10;
		st="Hello World";
		
	}
void show() {
	System.out.println(a+" "+st);
}
public class ConstructorSimple{
	public static void main(String args[]) {
		//we don't need to create the object of class A it is automatically created by the compiler because it is constructor
		A obj=new A();//this object is created to call show method
		obj.show();
	}
}
}
