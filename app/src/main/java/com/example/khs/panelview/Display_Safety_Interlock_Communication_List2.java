package com.example.khs.panelview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by KHS on 7/22/2015.
 */
public class Display_Safety_Interlock_Communication_List2 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.safety_interlock_communication_list2);
    }
    public void send_safety_interlock_communication5(View view) {
        Intent intent = new Intent(this, Display_Safety_Interlock_Communication5.class);
        startActivity(intent);
    }
    public void send_safety_interlock_communication6(View view) {
        Intent intent = new Intent(this, Display_Safety_Interlock_Communication6.class);
        startActivity(intent);
    }
}
