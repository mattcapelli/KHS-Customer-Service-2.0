package com.example.khs.panelview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by KHS on 7/22/2015.
 */
public class Display_PLC_Rack_List extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plc_rack_list);
    }
    public void send_plc_rack2(View view) {
        Intent intent = new Intent(this, Display_PLC_Rack2.class);
        startActivity(intent);
    }
    public void send_plc_rack3(View view) {
        Intent intent = new Intent(this, Display_PLC_Rack3.class);
        startActivity(intent);
    }
    public void send_plc_rack4(View view) {
        Intent intent = new Intent(this, Display_PLC_Rack4.class);
        startActivity(intent);
    }
    public void send_plc_rack5(View view) {
        Intent intent = new Intent(this, Display_PLC_Rack5.class);
        startActivity(intent);
    }
    public void send_plc_rack6(View view) {
        Intent intent = new Intent(this, Display_PLC_Rack6.class);
        startActivity(intent);
    }
}
