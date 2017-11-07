package com.example.user.userlogin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by USER on 11/7/2017.
 */

public class CustomGridAdapter extends BaseAdapter {
    private Context context;
    private final String[] gridValues;

    //Constructor to initialize values
    public CustomGridAdapter(Context context, String[ ] gridValues) {

        this.context        = context;
        this.gridValues     = gridValues;
    }


    @Override
    public int getCount() {
        return gridValues.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {

            gridView = new View(context);

            // get layout from grid_item.xml ( Defined Below )

            gridView = inflater.inflate( R.layout.grid_item , null);

            // set value into textview

            TextView textView = (TextView) gridView
                    .findViewById(R.id.grid_item_label);

            textView.setText(gridValues[position]);

            // set image based on selected text

            ImageView imageView = (ImageView) gridView
                    .findViewById(R.id.grid_item_image);

            String arrLabel = gridValues[ position ];

            if (arrLabel.equals("Windows")) {

                imageView.setImageResource(R.mipmap.ic_launcher);

            } else if (arrLabel.equals("iOS")) {

                imageView.setImageResource(R.mipmap.ic_launcher);

            } else if (arrLabel.equals("Blackberry")) {

                imageView.setImageResource(R.mipmap.ic_launcher);

            } else {

                imageView.setImageResource(R.mipmap.ic_launcher);
            }

        } else {

            gridView = (View) convertView;
        }
        return gridView;
    }
}
