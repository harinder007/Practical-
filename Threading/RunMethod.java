package Threading;

public class RunMethod extends Thread {
public void run() {
	System.out.println("Thread activated");
}
public static void main(String[] args) {
 RunMethod r1= new RunMethod();
	//because we are using thread in place of implemets runnable
	r1.run();
	r1.setName("HArinder");
	String s=r1.getName();
	System.out.println(s);
}
}