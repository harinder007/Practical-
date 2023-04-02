package Threading;
//if you are extending to thread class the object is also not in thread
//as a thread object we need to create thread class object explicitly
//we are passing object of our class which implement runnable so that
//class run() method execute but not start
public class RunnableInterface implements Runnable{
public void run() {//pre define method
	System.out.println("i am thread....");
}
public static void main(String[] args) {
	RunnableInterface r1= new RunnableInterface();
	Thread t= new Thread(r1);
	t.start();//start is the method of thread
}
}