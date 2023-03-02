package myPackage;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Movie m=new Movie();
m.setMovieName("Khatta Meetha");
m.setMovieStartTime("9 am");
m.setMovieEndTime("12 pm");
m.setMovieTicketPrice(250);


System.out.println(" Movie name "+m.getMovieName());
System.out.println(" Start timme  "+m.getMovieStartTime());
System.out.println(" end time "+m.getMovieEndTime());
System.out.println(" ticekt price"+m.getMovieTicketPrice());
	}

}
