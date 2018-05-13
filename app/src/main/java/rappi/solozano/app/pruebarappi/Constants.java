package rappi.solozano.app.pruebarappi;

public class Constants {
    static String apiVer   = "3";
    static String rootUrl  = "https://api.themoviedb.org/"+apiVer;
    static String apiKey = "?api_key=4d3ed9f97c86ff450485d15b92d7edd5";
    public static String popularMovies    = rootUrl+"/movie/popular"+apiKey;
    public static String topRatedMovies   = rootUrl+"/movie/top_rated"+apiKey;
    public static String upcomingMovies   = rootUrl+"/movie/upcoming"+apiKey;
    public static String popularShows    = rootUrl+"/tv/popular"+apiKey;
    public static String topRatedShows   = rootUrl+"/tv/top_rated"+apiKey;
    public static String upcomingShows   = rootUrl+"/tv/latest"+apiKey;
    public static int popularMoviesNum  = 0;
    public static int topRatedMoviesNum = 1;
    public static int upcomingMoviesNum = 2;
    public static int popularShowsNum   = 3;
    public static int topRatedShowsNum  = 4;
    public static int upcomingShowsNum  = 5;
}
