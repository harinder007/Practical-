package Input_output;
import java.io.FileInputStream;
//we can read all character --using FileInputStream
//read all character

public class AllCharFIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			
			FileInputStream f =new FileInputStream("D:\\test.txt");
			int i=0;
			while((i=f.read())!=-1){//to read the file
				//it will print one by one all character
				
				System.out.println((char)i);//convert it into character series
			}
			f.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
