package Collection;

import java.util.ArrayList;
import java.util.Iterator;

 class Bank {//class1
	 //instance variable
long accountno;
String customerName;
double balance;
int age;
//perameter constructor
public Bank(long accountno,String customerName,double balance,int age) {
this.accountno=accountno;
this.customerName=customerName;
this.balance=balance;
this.age=age;
}
}
//main class and method
public class ArrayList_UserDefine {
public static void main(String[] args) {
	//pass all the value of bank class
Bank b= new Bank(12345,"Ram",5000.67,20);	
Bank b1= new Bank(46758,"Shyam",7000.67,22);	
Bank b2= new Bank(49671,"Rahul",5400.67,21);	
Bank b3= new Bank(98709,"Tanvi",4000.67,23);	
Bank b4= new Bank(10101,"Mohit",8000.67,27);	
Bank b5= new Bank(12677,"Janvi",9000.67,25);
//array list
ArrayList<Bank> al= new ArrayList<Bank>();
al.add(b);
al.add(b1);
al.add(b5);
al.add(b3);
al.add(b2);
al.add(b4);
Iterator itr=al.iterator();
while(itr.hasNext()) {
Bank obj=(Bank)itr.next();//casting
System.out.println(obj.accountno+" "+obj.customerName+" "+obj.balance+" "+obj.age+" ");
}
}}