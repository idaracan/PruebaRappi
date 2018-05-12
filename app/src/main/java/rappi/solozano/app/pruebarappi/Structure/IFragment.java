package rappi.solozano.app.pruebarappi.Structure;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import rappi.solozano.app.pruebarappi.R;

public class IFragment extends Fragment {


    private int option = 0;
    public IFragment() {    }

    public static IFragment getInstace(int op) {
        IFragment fragment = new IFragment();
        fragment.option = op;
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        return view;
    }

}
