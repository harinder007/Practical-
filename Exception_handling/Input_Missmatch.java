package Exception_handling;

	//input miss match ----when by mistake user do some mistake
	import java.util.Scanner;
	public class Input_Missmatch {

	//main class
	public static void main(String[] args) {//main method
		Scanner sc= new Scanner(System.in);//taking input from the user
		System.out.println("Enter any two values");
		try {
			int X= sc.nextInt();//pass the variable in try block
			int Y=sc.nextInt();
			System.out.println("Result:"+X/Y);
		}
		catch(Exception e) {
		System.out.println("only take integer");	
		}
		}
	}