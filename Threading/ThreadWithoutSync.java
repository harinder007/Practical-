 package Threading;

 class MyThread1{
		void print(int num) {//without synchronized method
		//synchronized void print(int num)//with synchronized method
	for(int i=1;i<=5;i++) {		
		System.out.println(num*i);
		try {
			Thread.sleep(800);//to break for sec to print one the thread
		}catch(InterruptedException e) {
			System.out.println(e);
		}}}}
	class MyThread2 extends Thread{
		MyThread1 mt;//aggregration-----call the reference variable
		MyThread2(MyThread1 mt){
			this.mt=mt;
		}
		public void run() {
			mt.print(5);//5*1---
		}
	}
	class MyThread3 extends Thread{
		MyThread1 mt;//aggregration-----call the reference variable
		MyThread3(MyThread1 mt){
			this.mt=mt;
		}
		public void run() {
			mt.print(2);//2*1
		}
	}
	public class ThreadWithoutSync {
	public static void main(String[] args) {
		MyThread1 o1= new MyThread1();//object of class1
		MyThread2 t1= new MyThread2(o1);//pass the object
		MyThread3 t2= new MyThread3(o1);
		t1.start();
		t2.start();
	}
	}