import java.util.List;

public interface MovieServiceInterface {
    void addMovie(Movie movie);
    boolean deleteMovie(String id);
    boolean editMovie(String id, String newName, String newGenre, int newDuration);
    void displayMovies();
    Movie findMovieById(String id);
    List<Movie> searchMovieByName(String name);
    void sortMovies(int option);
    void exportMoviesToCSV(String fileName);
    void importMoviesFromCSV(String filename);
}
