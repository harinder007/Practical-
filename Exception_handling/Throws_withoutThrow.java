package Exception_handling;
//checked exception
import java.io.IOException;//input output exception

class Test{//class 1
	void display() throws IOException{//user define method
		//without throw
		//System.out.println("Throws exception perfectly");
	throw new IOException("Throws exception error");//with throw
	}
}
public class Throws_withoutThrow {//main class
public static void main(String[] args) throws IOException {
	Test ob= new Test();
	ob.display();
}
}