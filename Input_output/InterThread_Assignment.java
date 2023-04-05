package Input_output;

class InterThread{//aggregration
	//instance variable
	int balance=1000;
	int dep=500;
	int withdraw=200;
synchronized void deposite(int dep) {//deposite method
	this.dep=dep;
	System.out.println("previous balance: "+balance);	
		balance= balance+dep;
		System.out.println("Amount deposite: "+dep);
		System.out.println("total balance after dposite: "+balance);
		}
synchronized void withdraw(int withdraw) {//withdrawl method
	this.withdraw=withdraw;
	balance=balance-withdraw;
System.out.println("amount withdraw: "+withdraw);
System.out.println("current balance after dposite: "+balance);	
}}
class FirstThread extends Thread{//class1
	InterThread obj;//reference type entity
FirstThread(InterThread obj){//constructor
	this.obj=obj;
}
public void run() {//predefine method
	obj.deposite(obj.dep);
	}}
class SecondThread extends Thread{//class2
InterThread obj;//reference type entity
SecondThread(InterThread obj){//constructor
	this.obj=obj;
}
public void run() {//predefine method
obj.withdraw(obj.withdraw);
}
}
public class InterThread_Assignment {
	public static void main(String[] args) {//main method

		InterThread obj= new InterThread();	
		FirstThread t= new FirstThread(obj);
		 SecondThread t1= new  SecondThread(obj);
		t.start();
		t1.start();
		}
}