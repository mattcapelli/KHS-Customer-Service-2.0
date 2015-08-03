package com.example.khs.panelview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by KHS on 7/21/2015.
 */
public class Display_AC_Circuit_Protection_List2 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_circuit_protection_list2);
    }
    public void send_ac_circuit_protection4(View view) {
        Intent intent = new Intent(this, Display_AC_Circuit_Protection3.class);
        startActivity(intent);
    }
    public void send_ac_circuit_protection5(View view) {
        Intent intent = new Intent(this, Display_AC_Circuit_Protection4.class);
        startActivity(intent);
    }
    public void send_ac_circuit_protection6(View view) {
        Intent intent = new Intent(this, Display_AC_Circuit_Protection5.class);
        startActivity(intent);
    }
    public void send_ac_circuit_protection7(View view) {
        Intent intent = new Intent(this, Display_AC_Circuit_Protection6.class);
        startActivity(intent);
    }
    public void send_ac_circuit_protection8(View view) {
        Intent intent = new Intent(this, Display_AC_Circuit_Protection7.class);
        startActivity(intent);
    }
}
