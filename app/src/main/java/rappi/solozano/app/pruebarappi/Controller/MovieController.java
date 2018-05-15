package rappi.solozano.app.pruebarappi.Controller;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import rappi.solozano.app.pruebarappi.Model.Genre;
import rappi.solozano.app.pruebarappi.Model.Movie;

public class MovieController {

    private ArrayList<Movie> movies= null;
    private int ID, vote_count, vote_average, popularity;
    private String title, lenguage, original_title, poster_path, backdrop_path, overview, release_date;
    private boolean adult;
    private ArrayList<Genre> genre_ids;

    private ExtrasController extrasController = new ExtrasController();

    public MovieController() {
        this.movies = new ArrayList<Movie>();
        this.ID = 0;
        this.vote_count = 0;
        this.vote_average = 0;
        this.popularity = 0;
        this.title = "";
        this.lenguage = "";
        this.original_title = "";
        this.poster_path = "";
        this.backdrop_path = "";
        this.overview = "";
        this.release_date = "";
        this.adult = false;
        this.genre_ids = new ArrayList<>();
    }

    public void parseJson(String response){
        try {
            JSONObject res = new JSONObject(response);
            JSONArray array = res.optJSONArray("results");
            for (int i = 0; i < array.length(); i++) {
                JSONObject element = array.optJSONObject(i);
                vote_count = element.getInt("vote_count");
                ID = element.getInt("id");
                vote_average = element.getInt("vote_average");
                title = element.getString("title");
                popularity = element.getInt("popularity");
                poster_path = element.getString("poster_path");
                original_title = element.getString("original_title");
                lenguage = element.getString("lenguage");
                //genre_ids = extrasController.(element.getJSONArray("genre_ids"));
                backdrop_path=element.getString("lenguage");
                adult = element.getBoolean("adult");
                overview = element.getString("overview");
                release_date = element.getString("release_date");
                movies.add(new Movie(ID, vote_count,vote_average,title,popularity,lenguage,original_title,genre_ids,poster_path,backdrop_path,adult,overview,release_date));
                Log.i("datos", vote_average+ID+vote_count+title+poster_path+popularity+release_date+genre_ids.size());
            }
        }catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
