package Threading;

//Implementing runnable interface by extending Thread class  

public class ThreadEg extends Thread{
	// run method
	public void run() {
		
		System.out.println("Implementing thread by runnable interface ");
		
	}
	
	public static void main(String args[]) {
		
		 // Creating instance of the class extend Thread class
		ThreadEg e=new ThreadEg();
		
        //calling start method to execute the run() method of the Thread class  
		e.start();
		
		
	}

}
