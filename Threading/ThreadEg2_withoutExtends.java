package Threading;

	//directly we use thread class without extend
	//with and without set name we can name the thread
	public class ThreadEg2_withoutExtends{
	public void run() {
		System.out.println("Hello ");
	}
	public static void main(String[] args) {
		//creating an object of the thread class using the thread constructor
		Thread t= new Thread("Anudip");//thread 0
		Thread t1= new Thread();
		t.start();
		t1.start();
		t1.setName("Foundation");//thread 2
		System.out.println("Thread 0: "+t.getName());
		System.out.println("Thread 1: "+t1.getName());
	}
	}