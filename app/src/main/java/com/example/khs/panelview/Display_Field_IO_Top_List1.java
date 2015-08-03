package com.example.khs.panelview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by KHS on 7/21/2015.
 */
public class Display_Field_IO_Top_List1 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.field_io_top_list1);
    }
    public void send_field_io_top2(View view) {
        Intent intent = new Intent(this, Display_Field_IO_Top2.class);
        startActivity(intent);
    }
    public void send_field_io_top3(View view) {
        Intent intent = new Intent(this, Display_Field_IO_Top3.class);
        startActivity(intent);
    }
}
