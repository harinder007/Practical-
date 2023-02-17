package Assignment;

class sbi{
	
	void interest() {
		System.out.println("10%");
	}
	
	
}

class HDFC extends sbi{
	
	void interest() {
		System.out.println("13%");
	}
	
	
}


class icci extends sbi{
	
	void interest() {
		System.out.println("15%");
	}
	
	
}




public class MethodOveride  {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sbi s=new sbi();
		s.interest();
		HDFC h=new HDFC();
		h.interest();
		icci i=new icci();
		i.interest();

	}

}
