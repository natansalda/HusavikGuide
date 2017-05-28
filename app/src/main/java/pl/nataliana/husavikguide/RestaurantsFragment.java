package pl.nataliana.husavikguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of restaurants
 */
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> words = new ArrayList<Place>();
        words.add(new Place(getString(R.string.eatName1), getString(R.string.eat1), R.drawable.gamlires));
        words.add(new Place(getString(R.string.eatName2), getString(R.string.eat2), R.drawable.salkares));
        words.add(new Place(getString(R.string.eatName3), getString(R.string.eat3), R.drawable.mobydickres));
        words.add(new Place(getString(R.string.eatName4), getString(R.string.eat4), R.drawable.naustid));
        words.add(new Place(getString(R.string.eatName5), getString(R.string.eat5), R.drawable.ice));
        words.add(new Place(getString(R.string.eatName6), getString(R.string.eat6), R.drawable.heima));
        words.add(new Place(getString(R.string.eatName7), getString(R.string.eat7), R.drawable.hval));
        words.add(new Place(getString(R.string.eatName8), getString(R.string.eat8), R.drawable.chips));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), words, R.color.category_restaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}