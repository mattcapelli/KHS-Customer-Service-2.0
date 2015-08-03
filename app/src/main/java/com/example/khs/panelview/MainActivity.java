package com.example.khs.panelview;

import java.util.ArrayList;
import android.content.Intent;
import android.os.Bundle;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class MainActivity extends ActionBarActivity {
    private GridView gridView;
    private GridViewAdapter gridAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridView);
        gridAdapter = new GridViewAdapter(this, R.layout.grid_item_layout, getData());
        gridView.setAdapter(gridAdapter);
        gridView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                ImageItem item = (ImageItem) parent.getItemAtPosition(position);
                    //Create intent
                    Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                    intent.putExtra("title", item.getTitle());
                    intent.putExtra("image", item.getImage());
                    //Start details activity
                    startActivity(intent);
            }
        });

    }

    public ArrayList<ImageItem> getData() {
        final ArrayList<ImageItem> imageItems = new ArrayList<>();
        TypedArray imgs = getResources().obtainTypedArray(R.array.image_ids);
        for (int i = 0; i < imgs.length(); i++) {
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
            imageItems.add(new ImageItem(bitmap, "View#" + i));
        }
        /*You need to input the standardized customer-seen grid titles*/
        imageItems.get(0).setTitle("AC Circuit Protection");
        imageItems.get(1).setTitle("AC Field Wiring");
        imageItems.get(2).setTitle("DC Fuses");
        imageItems.get(3).setTitle("DC Rail");
        imageItems.get(4).setTitle("Distribution Blocks");
        imageItems.get(5).setTitle("Field I/O (Bottom)");
        imageItems.get(6).setTitle("Field I/O (Top)");
        imageItems.get(7).setTitle("Heater Circuit Protection");
        imageItems.get(8).setTitle("Heater Contactors + Fuses");
        imageItems.get(9).setTitle("Heater Solid State Relays");
        imageItems.get(10).setTitle("Motion Control");
        imageItems.get(11).setTitle("PLC Rack");
        imageItems.get(12).setTitle("Safety Interlock Communication");
        imageItems.get(13).setTitle("Servo Drives");
        imageItems.get(14).setTitle("Square Relay");
        imageItems.get(15).setTitle("VFD");
        return imageItems;
    }
}
