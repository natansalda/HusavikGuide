package pl.nataliana.husavikguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of tours.
 */
public class ToursFragment extends Fragment {

    public ToursFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> words = new ArrayList<Place>();
        words.add(new Place(getString(R.string.toursName1), getString(R.string.tours1), R.drawable.giants));
        words.add(new Place(getString(R.string.toursName2), getString(R.string.tours2), R.drawable.adventures));
        words.add(new Place(getString(R.string.toursName3), getString(R.string.tours3), R.drawable.north));
        words.add(new Place(getString(R.string.toursName4), getString(R.string.tours4), R.drawable.salka));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), words, R.color.category_tours);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}