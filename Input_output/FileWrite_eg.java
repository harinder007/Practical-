package Input_output;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWrite_eg {
public static void main(String[] args) {
	try {
		//file reader also used to read the file
		FileWriter fw= new FileWriter("D:\\\\New folder\\\\stringcode.txt");
		fw.write("wlc to anudip foundtion skill development center");
		fw.close();
		FileReader fr= new FileReader("D:\\\\New folder\\\\stringcode.txt");//source code
		int i=0;
		while((i=fr.read())!=-1) {//to print the all string
			System.out.print((char)i);//convert into to character
		}
		fr.close();
		System.out.println();
		System.out.println("It's done");
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
