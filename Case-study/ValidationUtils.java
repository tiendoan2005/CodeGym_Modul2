import java.util.regex.Pattern;

public class ValidationUtils {
    private static final Pattern MOVIE_ID_PATTERN = Pattern.compile("^MV\\d{3}$");
    private static final Pattern GENRE_PATTERN = Pattern.compile("^[\\p{L}\\s]+$", Pattern.UNICODE_CHARACTER_CLASS);
    private static final Pattern MOVIE_TIME_PATTERN = Pattern.compile("^\\d+$");

    public static boolean isValidMovieId(String id) {
        return MOVIE_ID_PATTERN.matcher(id).matches();
    }

    public static boolean isValidGenre(String genre) {
        return GENRE_PATTERN.matcher(genre).matches();
    }
    public static boolean isValidMovieTime(String time) {
        return MOVIE_TIME_PATTERN.matcher(time).matches();
    }
}
