import java.util.*;
class Movie {
    String title;
    String director;
    String genre;
    int year;
    double rating;

    public Movie(String title, String director, String genre, int year, double rating) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }

    public String toString() {
        return String.format("%-20s %-15s %-10s %-5d %.1f", title, director, genre, year, rating);
    }
}

public class MovieManager {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
      
        movies.add(new Movie("Inception", "Christopher Nolan", "Sci-Fi", 2010, 8.8));
        movies.add(new Movie("The Godfather", "Francis Ford Coppola", "Crime", 1972, 9.2));
        movies.add(new Movie("Interstellar", "Christopher Nolan", "Sci-Fi", 2014, 8.6));
        movies.add(new Movie("Titanic", "James Cameron", "Romance", 1997, 7.8));
      
        removeMovie(movies, "Titanic");
      
        System.out.println("\nFiltered by Genre (Sci-Fi):");
        displayMovies(filterByGenre(movies, "Sci-Fi"));

        System.out.println("\nSorted by Rating:");
        sortByRating(movies);
        displayMovies(movies);
    }

    public static void removeMovie(ArrayList<Movie> movies, String title) {
        movies.removeIf(movie -> movie.title.equalsIgnoreCase(title));
    }

    public static List<Movie> filterByGenre(ArrayList<Movie> movies, String genre) {
        List<Movie> filtered = new ArrayList<>();
        for (Movie m : movies) {
            if (m.genre.equalsIgnoreCase(genre)) {
                filtered.add(m);
            }
        }
        return filtered;
    }

    public static void sortByTitle(ArrayList<Movie> movies) {
        movies.sort(Comparator.comparing(m -> m.title.toLowerCase()));
    }

    public static void sortByYear(ArrayList<Movie> movies) {
        movies.sort(Comparator.comparingInt(m -> m.year));
    }

    public static void sortByRating(ArrayList<Movie> movies) {
        movies.sort((m1, m2) -> Double.compare(m2.rating, m1.rating));
    }

    public static void displayMovies(List<Movie> movies) {
        System.out.printf("\n%-20s %-15s %-10s %-5s %s\n", "Title", "Director", "Genre", "Year", "Rating");
        System.out.println("--------------------------------------------------------------------");
        for (Movie m : movies) {
            System.out.println(m);
        }
    }
}
