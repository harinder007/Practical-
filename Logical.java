class Logical{
    public static void main(String args[]){
        int a=2;

        int b=3;
        
        System.out.println(a<b&&b>a);//both value shuld be same for true result
        System.out.println(a>b&&b>a);
        System.out.println(a<b&&b<a);

        System.out.println(a<b||b<a);//any one condition should be same for true result
        System.out.println(a>b||b<a);
        System.out.println(a>b||b<a);

        


    }
}