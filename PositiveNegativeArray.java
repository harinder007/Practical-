// count positive and negative element in array
public class PositiveNegativeArray {
    public static void main(String args[]){
        int[] a ={-2,3,-5,6,7,8};

        int positiveCount=0;
        int negativeCount=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                
                positiveCount++;
           
            }
            else{
                negativeCount++;
            }
        }
                System.out.println("Total no. positive element : "+positiveCount);
                System.out.println("Total no. Negative element : "+negativeCount);
        

    }
    
}