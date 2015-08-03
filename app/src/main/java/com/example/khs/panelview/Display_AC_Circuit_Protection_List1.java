package com.example.khs.panelview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;

/**
 * Created by KHS on 7/21/2015.
 */
public class Display_AC_Circuit_Protection_List1 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_circuit_protection_list1);
    }
    public void send_ac_circuit_protection1(View view) {
        Intent intent = new Intent(this, Display_AC_Circuit_Protection1.class);
        startActivity(intent);
    }
    public void send_ac_circuit_protection2(View view) {
        Intent intent = new Intent(this, Display_AC_Circuit_Protection2.class);
        startActivity(intent);
    }
    public void send_ac_circuit_protection3(View view) {
        Intent intent = new Intent(this, Display_AC_Circuit_Protection2.class);
        startActivity(intent);
    }
}
