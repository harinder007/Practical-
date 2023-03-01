package myPackage;

public class Encapsulated_eg2 {
	public static void main(String[] args) {
		Bank b=new Bank();
		b.setAccount_num(3309793442L);
		b.setAmount(2000f);
		b.setE_mail("abc@gmail.com");
		b.setName("Rohan");
		System.out.println(b.getAccount_num()+" "+b.getName()+" "+b.getE_mail()+" "+b.getAmount());
	}

}
+