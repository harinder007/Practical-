import java.util.*;
public class formate {

    public static void main(String[] args) {
        System.out.println("enter name and class room");
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d\n",s1,x );
                //Complete this line
            }
            System.out.println("================================");

    }
}

