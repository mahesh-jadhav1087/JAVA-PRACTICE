/*
Q18.Create Movie class:
movieId
movieName
rating
Store movies in Vector and display movies having rating above 4.
Description
Condition:
rating > 4
Input
1 Pushpa 4.5
2 Leo 3.8
3 KGF 4.7
4 Jawan 4.2
Output
Top Rated Movies:

Pushpa
KGF
Jawan
 */
import java.util.Vector;

class Movie {
    int movieId;
    String movieName;
    double rating;

    // Constructor to initialize movie data
    Movie(int movieId, String movieName, double rating) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.rating = rating;
    }

    public int getMovieId() { return movieId; }
    public String getMovieName() { return movieName; }
    public double getRating() { return rating; }

    // Method to display movie details
}
class MoviesRating
{
    public static void main(String[] args) {
        // Creating a Vector to store Movie objects
        Vector<Movie> movieList = new Vector<>();

        // Adding data to the Vector
        movieList.add(new Movie(1, "Pushpa", 4.5));
        movieList.add(new Movie(2, "Leo", 3.8));
        movieList.add(new Movie(3, "KGF", 4.7));
        movieList.add(new Movie(4, "Jawan", 4.2));

        System.out.println("Top Rated Movies:");
        
        // Iterating through the Vector to check the condition
       for (Movie m : movieList) {
            // Using Getter to check the condition
            if (m.getRating() > 4) {
                System.out.println(m.getMovieId() + "\t " + m.getMovieName() + "\t " + m.getRating());
            }
        }
    }
}