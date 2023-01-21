import java.util.*;
public class Largest3 {
    public static void main(String args[]){
        System.out.println("enter first no. = ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enter second no. = ");
        int b=sc.nextInt();
        System.out.println("enter Third no. = ");
        int c=sc.nextInt();

        if(a>b&&a>c){
            System.out.println("first no. is greater");

        }
         else if(b>a&&b>c){
            System.out.println("Second no. is Greater");
        }
        else if(c>a&&c>b){
            System.out.println("Third no. is Greater");
        }
        else{
            System.out.println("No. are equal");
        }

    }
    
}
