package Input_output;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
//read the data from my source file by using BufferedInputStream
public class BufferedIS {
public static void main(String[] args) {
try {
	//source file
	FileInputStream f= new FileInputStream("D:\\New folder\\stringcode.txt");
	BufferedInputStream b= new BufferedInputStream(f);	
int i;
while((i=b.read())!=-1){
	System.out.print((char)i);//convert in into character
}
f.close();
b.close();
}catch(Exception e) {
	System.out.println(e);
}
}
}