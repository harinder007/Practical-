package Input_output;

// automatic updated to text file

import java.io.FileOutputStream;
//write string to byte array--write string with file output stream
public class WriteString_FOS {
public static void main(String[] args) {
	try
	{
FileOutputStream f= new FileOutputStream("D:\\New folder\\btyecode.txt");//destination
//write byte to string
f.write(82);//byte value (ASCII value)
f.write(66);
f.close();
System.out.println("done");
	}catch(Exception e) {
		System.out.println(e);
	}
}}