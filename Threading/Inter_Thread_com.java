package Threading;
//without wait(),notify(),notifyAll()
class A1{//aggregration class
	int i;
	synchronized void display(int i) {
		this.i=i;
		System.out.println("Data display"+i);
		}
	synchronized int receive() {
		System.out.println("Data receive"+i);
		return i;
	}
}
class Thread2 extends Thread{//class1
A1 obj;//reference type entity
Thread2(A1 obj){//constructor
	this.obj=obj;
}
public void run() {//predefine method
for(int j=1;j<=10;j++) {
	obj.display(j);//it will print 1 to 10
}
}
}
class Thread3 extends Thread{//class2
A1 obj;//reference type entity
Thread3(A1 obj){//constructor
	this.obj=obj;
}
public void run() {//predefine method
for(int j=1;j<=10;j++) {
//because there is no communication between both thread
	obj.receive();//it will print 10 times 10
}
}
}
public class Inter_Thread_com {//main class
public static void main(String[] args) {//main method
A1 obj= new A1();	
Thread2 t= new Thread2(obj);
Thread3 t1= new Thread3(obj);
t.start();
t1.start();
}
}