import java.util.*;
public class Array {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of element in Array");
        n=sc.nextInt();
        int a[]=new int[n];//n is the size of array
        System.out.println("enter element of array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }
        System.out.println("Elemnt are");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }

    }
    
}
