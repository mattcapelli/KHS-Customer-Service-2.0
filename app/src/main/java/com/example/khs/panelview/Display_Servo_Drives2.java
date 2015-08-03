package com.example.khs.panelview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by KHS on 7/23/2015.
 */
public class Display_Servo_Drives2 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 910-1288" + "\n" + "Description: SERVO SYSTEM" + "\n" +
                "Vendor: Indramat" + "\n" + "Model: HNF01.1A-F240-R0026-A-480-NNNN" +"\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        t2.setText(Html.fromHtml("<b>Mains Filter: </b>" +
                "<a href=\"http://www.boschrexroth.com/dcc/Vornavigation/Vornavi.cfm?Language=EN&VHist=g97568,g96067,g101867&PageID=p150494\">" +
                "HNF</a>"));
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
    }
}
