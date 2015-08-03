package com.example.khs.panelview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by KHS on 7/22/2015.
 */
public class Display_Heater_Solid_State_Relays extends ActionBarActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 905022-16" + "\n" + "Description: RELAY" + "\n" +
                "Vendor: Omron" + "\n" + "Model: G3PA-210B-US" +"\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        t2.setText(Html.fromHtml("<b>Solid State Relays G3PA: </b>" +
                "<a href=\"http://www.ia.omron.com/data_pdf/cat/g3pa_ds_e_3_2_csm168.pdf?id=987\">" +
                "Extremely Thin Relays Integrated with Heat Sinks</a>"));
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
    }
}
