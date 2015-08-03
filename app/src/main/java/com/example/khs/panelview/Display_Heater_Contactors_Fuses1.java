package com.example.khs.panelview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by KHS on 7/22/2015.
 */
public class Display_Heater_Contactors_Fuses1 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 910-1657" + "\n" + "Description: RELAY" + "\n" +
                "Vendor: Allen-Bradley" + "\n" + "Model: 100-C16EJ400" +"\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        t2.setText(Html.fromHtml("<b>Technical Data: </b>" +
                "<a href=\"http://literature.rockwellautomation.com/idc/groups/literature/documents/td/100-td013_-en-p.pdf\">" +
                "IEC Contactor Specifications</a>"));
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
    }
}
