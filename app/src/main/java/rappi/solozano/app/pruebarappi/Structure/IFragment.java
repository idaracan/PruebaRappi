package rappi.solozano.app.pruebarappi.Structure;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
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

public class IFragment extends Fragment {


    private int option = 0;
    static String url;
    public IFragment() {    }

    public static IFragment getInstace(int op) {
        IFragment fragment = new IFragment();
        fragment.option = op;
        switch (op)
        {
            case 0:
                url = Constants.popularMovies;
                break;
            case 1:
                url = Constants.topRatedMovies;
                break;
            case 2:
                url = Constants.upcomingMovies;
                break;
            case 3:
                url = Constants.popularShows;
                break;
            case 4:
                url = Constants.topRatedShows;
                break;
            case 5:
                url = Constants.upcomingShows;
                break;
        }
        return fragment;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getData(view);
    }

    private void getData(@NonNull View view) {
        final TextView movieInfo = view.findViewById(R.id.movie_info);
        VolleyUtils.makeJsonObjectRequest(getContext(), url, new VolleyResponseListener() {
            @Override
            public void onError(String message) {
                Toast.makeText(getContext(),"Connection Error", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(Object response) {
                Log.i("url", url);
                Log.i("number", String.valueOf(option));
                movieInfo.setText(response.toString());
            }
        });
    }


}
