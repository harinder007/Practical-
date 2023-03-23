package Exception_handling;

//constructor can throw an exception
public class Throws_Constructor {
String name;//instance variable
int age;
//exception using constructor
public Throws_Constructor(String name,int age)throws Exception {
if(age<18) {
	throw new Exception("Age should be more than 18");
}
this.name= name;
this.age=age;
}
public static void main(String[] args)throws Exception {
	Throws_Constructor t1= new Throws_Constructor("Sana",15);
System.out.println(t1.name+" "+t1.age);	
}
}