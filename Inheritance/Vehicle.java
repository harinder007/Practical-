package Inheritance;
class vehicle1{
	void run() {
		
	System.out.println("it is running");
}}
class vehicle2 extends vehicle1{
	void speed() {
		System.out.println("Speed is high");
	}
}
public class Vehicle extends vehicle1 {
void last() {
	System.out.println("It is stopped");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v=new Vehicle();
		v.last();
		v.run();
		vehicle2 v2=new vehicle2();
		v2.speed();
		
		

	}

}
