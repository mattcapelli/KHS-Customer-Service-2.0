package com.example.khs.panelview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by KHS on 7/22/2015.
 */
public class Display_Safety_Interlock_Communication_List1 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.safety_interlock_communication_list1);
    }
    public void send_safety_interlock_communication1(View view) {
        Intent intent = new Intent(this, Display_Safety_Interlock_Communication1.class);
        startActivity(intent);
    }
    public void send_safety_interlock_communication2(View view) {
        Intent intent = new Intent(this, Display_Safety_Interlock_Communication2.class);
        startActivity(intent);
    }
}
