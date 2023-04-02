package Threading;
//thread runnable object also pass string
public class Runnableinterface2 implements Runnable {
public void run() {
	System.out.println("Thread running");
}
public static void main(String[] args) {
	//creating object of Runnableinterface2
	Runnable r1= new Runnableinterface2();
	//creating object of thread class using thread(runnable ref var,string name)
	Thread t= new Thread(r1,"Harinder");
	t.start();
	String s= t.getName();
	System.out.println(s);
}
}
