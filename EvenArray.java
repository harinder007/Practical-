// List of even no. in array
public class EvenArray {
    public static void main(String args[]){
        int[] a ={2,3,5,6,7,8};

        int evenCount=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
                evenCount++;
           
            }
        }
                System.out.println("Total no. of even no. : "+evenCount);
        

    }
    
}