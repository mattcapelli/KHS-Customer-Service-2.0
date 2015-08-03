package com.example.khs.panelview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by KHS on 7/22/2015.
 */
public class Display_Safety_Interlock_Communication2 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 0000105617" + "\n" + "Description: RELAY" + "\n" +
                "Vendor: Allen-Bradley" + "\n" + "Model: 440R-EM4R2D" +"\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        t2.setText(Html.fromHtml("<b>Guardmaster Safety Relays: </b>" +
                "<a href=\"http://ab.rockwellautomation.com/Safety/Relays/Guardmaster-Relays#selection\">" +
                "Product Selection</a>"));
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
    }
}
