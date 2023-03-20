package Exception_handling;

public class Diff_types_of_UncheckedExceptionEg {
	  public void display() {  //method
		  //before try-catch block
		  String a="I am error";
		  System.out.println(a);
		  try {
			//Arithmatic exception
			  int i=50/0; 
				 System.out.println(i);
	       // null pointer Exception
	   		String s=null;
				 System.out.println(s.length());
		    //ArrayIndexOutOfBound Exception
	     	  int arr[]=new int[5];
			  arr[7]=10;
	     	//number format exception
			  String s1="riya";
				 int n=Integer.parseInt(s1);
				 System.out.println(n);
		  }
		  catch(Exception e) {
			  System.out.println(e);
		  }
		  //after try-catch block
		  String b="The End";
		  System.out.println(b); //The End
	  }
	  public static void main(String[] args) {
		  Diff_types_of_UncheckedExceptionEg o=new Diff_types_of_UncheckedExceptionEg();
		  o.display();
	}
	}