package Input_output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
//this concept is used the COPY one file t another file
public class Copy_eg {
public static void main(String[] args) {
	try {
FileInputStream f1= new FileInputStream("D:\\\\New folder\\\\stringcode.txt");//this location for read the data
		FileOutputStream f2= new FileOutputStream("D:\\New folder//copy.txt");//this location for write/copy the data
		byte[]arr= new byte[1024];
		int i;
while((i=f1.read(arr))>0) {//read the file with the help of input object
f2.write(arr);	//copy the read file in source location	
}
f2.close();
System.out.println("Done");}
catch(Exception e) {
	System.out.println(e);
}
}
}