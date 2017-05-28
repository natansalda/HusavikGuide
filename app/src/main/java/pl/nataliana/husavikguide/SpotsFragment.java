package pl.nataliana.husavikguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of interesting spots.
 */
public class SpotsFragment extends Fragment {

    public SpotsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> words = new ArrayList<Place>();
        words.add(new Place(getString(R.string.spotName1), getString(R.string.spot1), R.drawable.cars));
        words.add(new Place(getString(R.string.spotName2), getString(R.string.spot2), R.drawable.exploring));
        words.add(new Place(getString(R.string.spotName3), getString(R.string.spot3), R.drawable.culture));
        words.add(new Place(getString(R.string.spotName4), getString(R.string.spot4), R.drawable.horses));
        words.add(new Place(getString(R.string.spotName5), getString(R.string.spot5), R.drawable.raudanes));
        words.add(new Place(getString(R.string.spotName6), getString(R.string.spot6), R.drawable.kadlin));
        words.add(new Place(getString(R.string.spotName7), getString(R.string.spot7), R.drawable.church));
        words.add(new Place(getString(R.string.spotName8), getString(R.string.spot8), R.drawable.husavik));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), words, R.color.category_spots);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}