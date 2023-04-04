package Input_output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
//write information in the BufferedOutputStream
//object which is connected to the FileOutputStream object...
public class BufferedOS {
public static void main(String[] args) {
try {
	//we connect one stream(FileOutputStream)
	//with another(BufferedOutputStream) stream
	FileOutputStream f= new FileOutputStream("D:\\New folder\\stringcode.txt");
	BufferedOutputStream b= new BufferedOutputStream(f);
	String s="Welcome to coding world!";
	byte b1[]=s.getBytes();//converting string into byte array
	f.write(b1);
	b.flush();//flushes the data of one stream and send it to another stream
	f.close();
	b.close();
	System.out.println("done");
}catch(Exception e) {
	System.out.println(e);
}
}
}