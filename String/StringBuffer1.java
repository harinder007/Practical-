package String;
//string buffer append(),insert(),delete(),reverse(),replace()
public class StringBuffer1{
public static void my() {
	StringBuffer s= new StringBuffer("Hello");
	s.append("world");
	System.out.println("String is:"+s);//hello world
	s.insert(2,"Riya");
	System.out.println("insert is:"+s);//insert the word
	s.replace(1, 3, "Java");
	System.out.println("replace is:"+s);//replace it
	System.out.println("capacity is:"+s.capacity());//5+16
	//String builder
	StringBuilder s1= new StringBuilder("world");
	s1.replace(1, 3, "java");
	System.out.println("replace is:"+s1);
	s1.delete(1, 3);
	System.out.println("delete is:"+s1);
	s1.reverse();
	System.out.println("reverse is:"+s1);
}
public static void main(String[] args) {
my();//call the methos without object because it type static
}
}