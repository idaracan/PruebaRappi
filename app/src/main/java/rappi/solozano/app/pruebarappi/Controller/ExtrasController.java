package rappi.solozano.app.pruebarappi.Controller;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import rappi.solozano.app.pruebarappi.Model.Country;
import rappi.solozano.app.pruebarappi.Model.Genre;
import rappi.solozano.app.pruebarappi.Model.Language;
import rappi.solozano.app.pruebarappi.Network.VolleyResponseListener;
import rappi.solozano.app.pruebarappi.Network.VolleyUtils;

public class ExtrasController {

    private ArrayList<Language> language = null;
    private ArrayList<Country> country = null;
    private ArrayList<Genre> genre_list = null;
    private ArrayList<String> genre_name = null;

    public ExtrasController() {
        this.language = new ArrayList<>();
        this.genre_list = new ArrayList<>();
        this.country = new ArrayList<>();
        this.genre_name = new ArrayList<>();
    }

    public ArrayList<Language> getLanguage(String response, final Activity activity){
        VolleyUtils.makeJsonObjectRequest(activity.getApplicationContext(), response, new VolleyResponseListener() {
            @Override
            public void onError(String message) {
                Toast.makeText(activity.getApplicationContext(),"Connection Error", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(Object response) {
                try {
                    JSONArray array = new JSONArray(response.toString());
                    for (int i = 0; i<array.length(); i++){
                        JSONObject element = array.optJSONObject(i);
                        String id = element.getString("iso_639_1");
                        String english_name = element.getString("english_name");
                        String name = element.getString("name");
                        language.add(new Language(id, english_name, name));
                        Log.i("datoLanguage", name+id);
                    }
                } catch (JSONException e1) {
                    e1.printStackTrace();
                }
            }
        });

        return language;
    }

    public ArrayList<Country> getCountries(String response, final Activity activity){

        VolleyUtils.makeJsonObjectRequest(activity.getApplicationContext(), response, new VolleyResponseListener() {
            @Override
            public void onError(String message) {
                Toast.makeText(activity.getApplicationContext(),"Connection Error", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(Object response) {
                try {
                    JSONArray array = new JSONArray(response.toString());
                    for (int i = 0; i<array.length(); i++){
                        JSONObject element = array.optJSONObject(i);
                        String id = element.getString("iso_3166_1");
                        String name = element.getString("english_name");
                        country.add(new Country(id, name));
                        Log.i("datoCountries", name+id);
                    }
                } catch (JSONException e1) {
                    e1.printStackTrace();
                }
            }
        });
        return country;
    }

    public ArrayList<Genre> getGenre(String response, final Activity activity){

        VolleyUtils.makeJsonObjectRequest(activity.getApplicationContext(), response, new VolleyResponseListener() {
            @Override
            public void onError(String message) {
                Toast.makeText(activity.getApplicationContext(),"Connection Error", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(Object response) {
                try {
                    JSONArray aux = new JSONArray(response.toString());
                    //JSONArray array = aux.optJSONArray("genres");
                    for (int i = 0; i<aux.length(); i++){
                        JSONObject element = aux.optJSONObject(i);
                        int id = element.getInt("id");
                        String name = element.getString("name");
                        genre_list.add(new Genre(id, name));
                        Log.i("datoGenre", name+id);
                    }
                } catch (JSONException e1) {
                    e1.printStackTrace();
                }
            }
        });

        return genre_list;
    }

}
