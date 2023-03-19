import java.util.*;

import java.util.*;
public class Character {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any word");
        String st=sc.nextLine();
        for(int i=1;i<=st.length();i++){
            System.out.println("Chracter at "+i+ " position is :"+st.charAt(i));
        }

    }
    
}
