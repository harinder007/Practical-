public class Split{
    public static void main(String args[]){
        String str ="My name is khan";
        int i=str.length()-1;
        int j=str.length();
        //System.out.println(a);
        for(i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
           System.out.print(str.substring(i+1, j)+" ");
           j=i;
        }
        
    }
    System.out.println(str.subSequence(0, j));

    }
}