package String;
//represent any object to string
public class To_String {
int rollno;//integer type variable
String name,addr;//string type variable
To_String(int rollno,String name,String addr){

	this.rollno=rollno;
	this.name=name;
	this.addr=addr;
}
public String toString() {//return object to string
	//return super.toString();//object of string
	
return rollno+" "+name+" "+addr;	
}
public static void main(String[] args) {
	To_String s1= new To_String(1,"Harinder","BahadurGarh");
	
	//return the hashcode of the object(haxadecimal)
	
	To_String s2= new To_String (2,"Ashu","Delhi ");
	
	System.out.println(s1);//compiler write s1.tostring()
	
	System.out.println(s2);
}
}