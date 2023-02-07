package ConstructorEg;

public class Parameterized {
    int num;
    String str;

    Parameterized (int n, String s){
          System.out.println("Parameterized Constructor called.");
          num = n;
          str = s;
    }

    public static void main(String args[]){
         //constructor call
         Parameterized sc=new Parameterized(12,"Harinder");

         //print values of object properties
         System.out.println("num = " + sc.num);
         System.out.println("str = " + sc.str);
    }
}