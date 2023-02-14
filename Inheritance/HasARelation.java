package Inheritance;

class Adress{
	int pincode=124507;
	String country="India";
	
}

class student{
	int rollno =115;
	String name="abc";
	Adress ad=new Adress();//object of class Adress
}


public class HasARelation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student st=new student();
		System.out.println(st.rollno);
		System.out.println(st.name);
		System.out.println(st.ad.pincode);
		System.out.println(st.ad.country);

	}

}
