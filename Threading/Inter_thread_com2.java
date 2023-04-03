package Threading;

//with wait(),notify(),notifyAll()
class A2{//aggregration class
	int i;
	boolean flag=false;
	synchronized void display(int i) {
		if(flag) 
		try {
			wait();
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		this.i=i;
		flag=true;
		System.out.println("Data display"+i);
		notify();
		}
	synchronized int receive() {
		if(!flag)
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println(e);
			}
	System.out.println("Data receive"+i);
		flag=false;
		notify();
		return i;
	}
}
class First_Thread2 extends Thread{//class1
A2 obj;//reference type entity
First_Thread2(A2 obj){//constructor
	this.obj=obj;
}
public void run() {//predefine method
for(int j=1;j<=10;j++) {
	obj.display(j);//it will print 1 to 10
}
}
}
class Second_Thread3 extends Thread{//class2
A2 obj;//reference type entity
Second_Thread3(A2 obj){//constructor
	this.obj=obj;
	}
	public void run() {//predefine method
	for(int j=1;j<=10;j++) {
	//because there is no communication between both thread
		obj.receive();//it will print 10 times 10
	}
	}
	}

public class Inter_thread_com2 {
	public static void main(String[] args) {//main method
		A2 obj= new A2();	
		First_Thread2 t= new First_Thread2(obj);
		 Second_Thread3 t1= new  Second_Thread3(obj);
		t.start();
		t1.start();
		}
    }