package com.example.student.imagelist1;

/**
 * Created by student on 25-Jan-18.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;

public class ImagedListFragment extends ListFragment {

    String[] brandsNames = new String[] { "Cupcake","Donut","Eclair","Froyo","Gingerbread","Honeycomb","Icecream Sandwich","Jellybean","KitKat","Lollipop","Marshmello","Nougat","Oreo" };

    int[] brandsImages = new int[] {R.drawable.cupcake,R.drawable.donut,R.drawable.eclair,R.drawable.froyo,R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.ics,R.drawable.jellybean,R.drawable.kitkat,R.drawable.lollipop,R.drawable.marshmello,R.drawable.nougat,R.drawable.oreo};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < brandsNames.length; i++) {
            HashMap<String, String> map = new HashMap<String, String>();
            map.put("brand_names", brandsNames[i]);
            map.put("brand_images", Integer.toString(brandsImages[i]));
            aList.add(map);
        }

        // Keys used in Hashmap
        String[] from = { "brand_images", "brand_names"};

        // Ids of views in listview_layout
        int[] to = { R.id.brand_image, R.id.brand_name};

        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(getActivity()
                .getBaseContext(), aList, R.layout.single_list_item, from, to);

        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}