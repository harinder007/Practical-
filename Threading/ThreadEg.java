package Threading;

public class ThreadEg extends Thread{
	
	public void run() {
		
		System.out.println("Implementing thread by runnable interface ");
		
	}
	
	public static void main(String args[]) {
		
		ThreadEg e=new ThreadEg();
		e.start();
		
		
	}

}
