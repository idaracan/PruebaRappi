package rappi.solozano.app.pruebarappi.Structure;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import rappi.solozano.app.pruebarappi.Model.Constants;
import rappi.solozano.app.pruebarappi.Network.VolleyResponseListener;
import rappi.solozano.app.pruebarappi.Network.VolleyUtils;
import rappi.solozano.app.pruebarappi.R;

public class IFragmentTop extends Fragment {

    static String url, genre;

    public static IFragmentTop getMovie() {
        IFragmentTop fragment = new IFragmentTop();
        url = Constants.topRatedMovies;
        genre = Constants.genersMovie;
        Log.i("estoMovieGenre", genre);
        Log.i("estoMovie", url);

        return fragment;
    }

    public static IFragmentTop getShows() {
        IFragmentTop fragment = new IFragmentTop();
        url = Constants.topRatedShows;
        Log.i("estoShow", url);
        genre = Constants.genersTV;
        Log.i("estoShowGenre", genre);
        return fragment;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ifragment_popular, container, false);

        final TextView movieInfo = view.findViewById(R.id.movie_info);
        VolleyUtils.makeJsonObjectRequest(getContext(), url, new VolleyResponseListener() {
            @Override
            public void onError(String message) {
                Toast.makeText(getContext(),"Connection Error", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(Object response) {
                movieInfo.setText(response.toString());
            }
        });

        return view;
    }

}
