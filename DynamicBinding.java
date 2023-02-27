package Assignment;


//When type of the object is determined at run-time, it is known as dynamic binding.


public class DynamicBinding {

	void eat(){System.out.println("animal is eating...");}  
	}  
	  
	class Dog extends DynamicBinding{  
	 void eat(){System.out.println("dog is eating...");}  
	  
	 public static void main(String args[]){  
		 DynamicBinding a= new DynamicBinding();  
	  a.eat();  
	 }  
	}  