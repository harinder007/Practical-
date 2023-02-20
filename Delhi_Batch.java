class Batch { // parent class
	int id;
	String name;
	double fees;
	Batch(int id, String name,  double fees){
		// parent class cons 
		this.id=id;
		this.name=name;
		this.fees=fees;
	}

}
class BatchMember extends Batch{
	long phone_no; // child class property
	BatchMember(int id, String name, double fees, long phone_no){ // child class cons
	super(id, name, fees); // reusing parent cons
	this.phone_no=phone_no;
	}
	void show () // child class method
	{
		System.out.println(id +" "+name+" "+fees+" "+phone_no);
	}}
	public class Delhi_Batch{
		public static void main(String[] args) {
			BatchMember obj = new BatchMember(1,"kajol", 1500, 125438 );
		obj.show();
	}
	
}