package Input_output;

/* serialization writing state of an object into byte stream & the
 *  reverse and this is known as deserialization*/

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{//serializable interface
	int id;
	String name;
	int fees;
	public Student(int id,String name,int fees) {//pera constructor
this.id=id;
this.name=name;
this.fees=fees;
	}
}
public class ObjectOutputStream_eg {//main class
public static void main(String[] args) {//main method
try {
Student s= new Student(101,"Harinder",2000);//it is an object of class1	
FileOutputStream fo= new FileOutputStream("D:\\\\New folder\\\\input.txt");
ObjectOutputStream obj= new ObjectOutputStream(fo);
obj.writeObject(s);//object into byte stream
obj.close();
System.out.println("done");
}catch(Exception e) {
	System.out.println(e);
}
}
}