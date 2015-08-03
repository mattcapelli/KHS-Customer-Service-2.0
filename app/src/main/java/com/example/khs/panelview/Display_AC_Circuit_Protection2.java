package com.example.khs.panelview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by KHS on 7/15/2015.
 */
public class Display_AC_Circuit_Protection2 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 910-727" + "\n" + "Description: CIRCUIT BREAKER" + "\n" +
                "Vendor: Allen-Bradley" + "\n" + "Model: 1489-M3D100" +"\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        t2.setText(Html.fromHtml("<b>Product Overview: </b>" +
                "<a href=\"http://www.ab.com/en/epub/catalogs/12768/229240/471158/1213081/5725120/print.html\">" +
                "Bulletin 1489-M AC Circuit Breaker</a>"));
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
    }
}