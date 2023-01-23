import java.util.*;
public class deleteArray {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of element in Array");
        n=sc.nextInt();
        int a[]=new int[n];//n is the size of array
        int b[]=new int[n-1];
        System.out.println("enter element of array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }
        System.out.println("Elemnt are");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }

        System.out.println("Enter index of value to be deleted");
        int m=sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(i<m){
                 b[i]=a[i];

            }
            else if(i==m)
            continue;
            else{
                b[i-1]=a[i];
            }
        }
        System.out.println("After deleted the element");
        for(int i=0;i<n-1;i++){
            System.out.println(b[i]);
        }

    }
    
}