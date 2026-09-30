package FRQPracticeAssignment;

public class MovieTester {
    public static void main(String[] args) {
        Movie one = new Movie("Inception", 9);
        Movie two = new Movie("Interstellar", 8);
        Movie three = new Movie("Tenet", 7);
        one.printInfo();
        two.printInfo();
        three.printInfo();
    }
}

class Movie {
    private String movieTitle;
    private int rating;

    public Movie(String t, int r) {
	    movieTitle = t;
	    rating = r;
 	}

    public void printInfo() {
      	System.out.println(movieTitle + " — Rating: " + rating);
    }
}
