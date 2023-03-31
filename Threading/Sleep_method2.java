package Threading;

public class Sleep_method2 extends Thread {//main class with extend thread
public static void main(String[] args) {//main method
	//to need to run method because it is in main method
	try {
		for(int i=0;i<=5;i++) {//0 1 2 3 4 5
			Thread.sleep(800);//thread will sleep for 800 mili sec
//thread.sleep(-800);---we cannot write negative value because it show exception
			System.out.println(i);}
	}catch(InterruptedException e) {
		System.out.println(e);
	}
	}
}