package com.example.khs.panelview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by KHS on 7/21/2015.
 */
public class Display_DC_Rail_List extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dc_rail_list);
    }
    public void send_dc_rail1(View view) {
        Intent intent = new Intent(this, Display_DC_Rail1.class);
        startActivity(intent);
    }

    public void send_dc_rail2(View view) {
        Intent intent = new Intent(this, Display_DC_Rail2.class);
        startActivity(intent);
    }

    public void send_dc_rail3(View view) {
        Intent intent = new Intent(this, Display_DC_Rail3.class);
        startActivity(intent);
    }

    public void send_dc_rail4(View view) {
        Intent intent = new Intent(this, Display_DC_Rail4.class);
        startActivity(intent);
    }

    public void send_dc_rail5(View view) {
        Intent intent = new Intent(this, Display_DC_Rail5.class);
        startActivity(intent);
    }

    public void send_dc_rail6(View view) {
        Intent intent = new Intent(this, Display_DC_Rail6.class);
        startActivity(intent);
    }

    public void send_dc_rail7(View view) {
        Intent intent = new Intent(this, Display_DC_Rail7.class);
        startActivity(intent);
    }
}
