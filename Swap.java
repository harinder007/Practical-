
import java.util.*;

public class Swap {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number x = ");
    int x=sc.nextInt();
    System.out.println("Enter first number y = ");
    int y=sc.nextInt();
// let x=5  y=3
    x=x+y;  //x=5+3  now x=8

    y=x-y;  //y=8-3  now y=5

    x=x-y;  //x=8-5  now x=3

System.out.println("After Swapping x = "+x +" "+"y = " +y );


}
}