package Input_output;

import java.io.FileInputStream;

//we can read single character ---using FileInputStream
public class SingleCharFIS {
public static void main(String[] args) {
	try {
		FileInputStream f= new FileInputStream("D:\\New folder\\singlechar.txt");//source path
	int i=f.read();{//read single character
		System.out.println((char)i);//convert into character
		//integer i because of ASCII/byte value
		f.close();
	}
	}catch(Exception e) {
		System.out.println(e);
	}
}
}