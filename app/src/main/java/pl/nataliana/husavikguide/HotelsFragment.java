package pl.nataliana.husavikguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of hotels.
 */
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> words = new ArrayList<Place>();
        words.add(new Place(getString(R.string.hotelsName1), getString(R.string.hotels1), R.drawable.gamli));
        words.add(new Place(getString(R.string.hotelsName2), getString(R.string.hotels2), R.drawable.fosshotel));
        words.add(new Place(getString(R.string.hotelsName3), getString(R.string.hotels3), R.drawable.arbol));
        words.add(new Place(getString(R.string.hotelsName4), getString(R.string.hotels4), R.drawable.hofdi));
        words.add(new Place(getString(R.string.hotelsName5), getString(R.string.hotels5), R.drawable.port));
        words.add(new Place(getString(R.string.hotelsName6), getString(R.string.hotels6), R.drawable.sigtun));
        words.add(new Place(getString(R.string.hotelsName7), getString(R.string.hotels7), R.drawable.solbakki));
        words.add(new Place(getString(R.string.hotelsName8), getString(R.string.hotels8), R.drawable.cape));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), words, R.color.category_hotels);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}