package ControlStatement;
import java.util.*;

public class CheckOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number, i;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		
		for(i = 1; i <= number; i++)
		{
			if(i % 2 != 0)
			{
				System.out.print(i +"\t"); 
			}
		}	
	}

}
