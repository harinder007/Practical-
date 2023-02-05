//enter new value in array
import java.util.*;
public class addValue {
    public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter no. of element in array");
int n=sc.nextInt();
int a[]=new int[n];  //first array

int b[]=new int[n+1]; //second array
System.out.println("enter values");
for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
}
System.out.println("enter index of new value inserted");
int m=sc.nextInt();
System.out.println("enter new value inserted");
int p=sc.nextInt();

for(int i=0;i<n+1;i++){
    if(i<m){
        b[i]=a[i];
    }
    else if(i==m){
        b[i]=p;
        
    }
    else b[i]=a[i-1];

}
System.out.println("Element are: ");
for(int i=0;i<n+1;i++){
    System.out.println(b[i]);
}

    }
}
