package rappi.solozano.app.pruebarappi.Model;

public class Constants {

    static String apiVer    = "3";
    static String rootUrl   = "https://api.themoviedb.org/"+apiVer;
    static String apiKey    = "?api_key=4d3ed9f97c86ff450485d15b92d7edd5";
    public static String popularMovies  = rootUrl+"/movie/popular"+apiKey;
    public static String topRatedMovies = rootUrl+"/movie/top_rated"+apiKey;
    public static String upcomingMovies = rootUrl+"/movie/upcoming"+apiKey;
    public static String popularShows   = rootUrl+"/tv/popular"+apiKey;
    public static String topRatedShows  = rootUrl+"/tv/top_rated"+apiKey;
    public static String upcomingShows  = rootUrl+"/tv/latest"+apiKey;

    public static String genersMovie = rootUrl+"/genre/movie/list"+apiKey;
    public static String genersTV = rootUrl+"/genre/tv/list"+apiKey;

    public static String getImage = "https://image.tmdb.org/t/p/w500/";
    public static String getLanguages = rootUrl+"/configuration/languages"+apiKey;
    public static String getCountry = rootUrl+"/configuration/countries"+apiKey;

}
