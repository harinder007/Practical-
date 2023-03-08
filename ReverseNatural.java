package Assignment;

//Java Program to Print Natural Numbers in Reverse 
import java.util.Scanner;

public class ReverseNatural {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number, i;
		sc = new Scanner(System.in);
		
		System.out.println(" Please Enter the Maximum integer Value : ");
		number = sc.nextInt();	
		
		for(i = number; i >= 1; i--)
		{
			System.out.println(i +"\t"); 
		}	
	}
}
