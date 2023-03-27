package Threading;

public class ThreadEg3 extends Thread{
public void run() {//pre define method
for(int i=0;i<5;i++) {
	try {
		//Running statement
		//inside one thread print gap one after another
		Thread.sleep(800);//break for a time inside single thread
	}catch(InterruptedException e) {
		System.out.println(e);
	}
	System.out.println(i);
}
}
public static void main(String[] args) {//main method
	ThreadEg3 t1= new ThreadEg3();//object 1
	ThreadEg3 t2= new ThreadEg3();//object 2
	ThreadEg3 t3= new ThreadEg3();//object 3
	t1.start();
	System.out.println("First thread executed");
	try {
	t1.join();	
	}catch(InterruptedException e) {
		System.out.println(e);
	}
	t2.start();
	System.out.println("Second thread executed");
	try {
		t2.join();	
		}catch(InterruptedException e) {
			System.out.println(e);
		}
	t3.start();
	System.out.println("Third thread executed");
	try {
		t3.join();	
		}catch(InterruptedException e) {
			System.out.println(e);
		}
}
}