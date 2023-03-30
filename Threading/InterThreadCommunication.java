package Threading;
class A{//class1
	int num=10;//instance variable
	boolean valueSet=false;
	public synchronized void put(int num) {//synchronized method
		while(valueSet) {
			try {
				wait();
			}catch(Exception e){
			}}
		System.out.println("put: "+num);
		this.num=num;
		valueSet=true;
		notify();//notify the second thread   
		}
	public synchronized void get() {//synchronized method
		while(!valueSet) {
			try {
				wait();
			}catch(Exception e){
			}}
		System.out.println("get: "+num);
		valueSet=false;
		notify();//notify the second thread 	
	}
}
class Producer implements Runnable{//class 2--thread type
	A a;//aggregration reference type entity
	public Producer(A a) {//pass the reference variable
		this.a=a;
		Thread t1= new Thread(this,"Producer");//create thread
		t1.start();//start the thread1
	}
	public void run() {//predefine method
		int i=0;
		while(true) {
			a.put(i++);
			try {
				Thread.sleep(800);//to take time few sec
			}catch(Exception e){
			}}}}
class Consumer implements Runnable{//class3
	A a;//aggregration reference type entity
	public Consumer(A a) {
		this.a=a;
		Thread t2= new Thread(this,"Consumer");//create thread
		t2.start();//start the thread2
	}
	public void run() {//predefine method
		int i=0;
		while(true) {
			a.get();
			try {
				Thread.sleep(800);//to take time few sec
			}catch(Exception e){
			}}}}
public class InterThreadCommunication {//main class
public static void main(String[] args) {//main method
A a= new A();//create class1 object
new Producer(a);//pass the a object of A
new Consumer(a);//pass the a object of A
}
}