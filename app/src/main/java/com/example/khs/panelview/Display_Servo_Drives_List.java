package com.example.khs.panelview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by KHS on 7/22/2015.
 */
public class Display_Servo_Drives_List extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.servo_drives_list);
    }
    public void send_servo_drives1(View view) {
        Intent intent = new Intent(this, Display_Servo_Drives1.class);
        startActivity(intent);
    }
    public void send_servo_drives2(View view) {
        Intent intent = new Intent(this, Display_Servo_Drives2.class);
        startActivity(intent);
    }
}
