package com.example.android.miwok;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Anumeha Agrawal on 7/14/2017.
 */

public class WordAdapter extends ArrayAdapter<word> {

    public WordAdapter(Context context, ArrayList<word> wordarraylist){
        super(context,0,wordarraylist);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listview = convertView;
        if (listview == null)
            listview = LayoutInflater.from(getContext()).inflate( R.layout.list_item, parent,false);
        word currentword=getItem(position);
        TextView miwokview= (TextView) listview.findViewById(R.id.miwokword);
        miwokview.setText(currentword.getMmiwokword());
        TextView engview= (TextView) listview.findViewById(R.id.engword);
        engview.setText(currentword.getMdefaultworddefault());

        return listview;


    }
}
