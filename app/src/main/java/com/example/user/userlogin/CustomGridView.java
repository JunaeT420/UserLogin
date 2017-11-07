package com.example.user.userlogin;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomGridView extends AppCompatActivity {
    GridView gridView;

    // This Data show in grid ( Used by adapter )

    static final String[ ] GRID_DATA = new String[] {
            "Windows",
            "iOS",
            "Android" ,
            "Blackberry",
            "Java" ,
            "JQuery",
            "Phonegap",
            "SQLite",
            "Thread" ,
            "Video"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_grid_view);
        gridView = (GridView) findViewById(R.id.gridView1);

        // Set custom adapter (GridAdapter) to gridview

       // gridView.setAdapter(  new GridAdapter( this, GRID_DATA ) );

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {


                Toast.makeText(
                        getApplicationContext(),
                        ((TextView) v.findViewById( R.id.grid_item_label ))
                                .getText(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
