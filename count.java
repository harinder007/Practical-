public class count {
    public static void main(String arr[]){
        int a[]={1,23,5,3,5,3,454,4,5,5};
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==5){
             
                count=count+1;
              
            }

        }
        System.out.println(count);
    }
}
