package com.bye.project;

/**
 * Created by webster on 9/7/16.
 */
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import com.bye.project.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    GridView grid;
    List<ImageGridModel> data_cover = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data_cover.add(new ImageGridModel(ContextCompat.getDrawable(getBaseContext().getApplicationContext(),R.drawable.blink), "Blink 182"));
        data_cover.add(new ImageGridModel(ContextCompat.getDrawable(getBaseContext().getApplicationContext(),R.drawable.green_day), "Green Day"));
        data_cover.add(new ImageGridModel(ContextCompat.getDrawable(getBaseContext().getApplicationContext(),R.drawable.grace_jones), "Grace Jones"));
        data_cover.add(new ImageGridModel(ContextCompat.getDrawable(getBaseContext().getApplicationContext(),R.drawable.kiss), "Kiss"));
        data_cover.add(new ImageGridModel(ContextCompat.getDrawable(getBaseContext().getApplicationContext(),R.drawable.motley_crue), "Motley Crue"));
        data_cover.add(new ImageGridModel(ContextCompat.getDrawable(getBaseContext().getApplicationContext(),R.drawable.the_sounds), "The Sounds"));
        data_cover.add(new ImageGridModel(ContextCompat.getDrawable(getBaseContext().getApplicationContext(),R.drawable.ramones), "Ramones"));
        data_cover.add(new ImageGridModel(ContextCompat.getDrawable(getBaseContext().getApplicationContext(),R.drawable.david_bowie), "David Bowie"));

        CustomGrid adapter = new CustomGrid(MainActivity.this, data_cover);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at Cover : " +data_cover.get(position).getCaption(), Toast.LENGTH_SHORT).show();

            }
        });

    }

}