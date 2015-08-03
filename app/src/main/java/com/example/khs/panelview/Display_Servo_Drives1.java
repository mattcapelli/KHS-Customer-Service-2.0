package com.example.khs.panelview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by KHS on 7/23/2015.
 */
public class Display_Servo_Drives1 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 910-1285" + "\n" + "Description: SERVO SYSTEM" + "\n" +
                "Vendor: Indramat" + "\n" + "Model: HMV01.1R-W0018-A-07-NNNN" +"\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        t2.setText(Html.fromHtml("<b>Power Supply Units: </b>" +
                "<a href=\"http://www.boschrexroth.com/dcc/Vornavigation/Vornavi.cfm?Language=EN&VHist=g97568,g96067,g102867&PageID=p151294\">" +
                "IndraDrive M- HMV</a>"));
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
    }
}
