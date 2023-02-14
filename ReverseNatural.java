package ControlStatement;
import java.util.*;
public class ReverseNatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter any number : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=num;i>=1;i--) {
			System.out.println(i);
		}
	}

}
