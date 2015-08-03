package com.example.khs.panelview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by KHS on 7/22/2015.
 */
public class Display_Heater_Circuit_Protection2 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 0000101333" + "\n" + "Description: INDICATOR" + "\n" +
                "Vendor: Ferraz Shawmut" + "\n" + "Model: N/A" +"\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView myTextView2 = (TextView) findViewById(R.id.textview3);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        TextView t4 = (TextView) findViewById(R.id.textview4);
        t2.setText(Html.fromHtml("<b>CLASS J: </b>" +
                "<a href=\"http://www.ferrazshawmutsales.com/pdfs/CLASSJ.pdf\">" +
                "600 V/Fuse Blocks</a>"));
        t4.setText(Html.fromHtml("<b>Low-Peak Class J: </b>" +
                "<a href=\"http://www.mouser.com/ds/2/87/Bus_Ele_DS_1006_LPJ_0-60-479186.pdf\">" +
                "LPJ- 600Vac/300Vdc, 1-60A, Dual Element, Time-Delay Fuses</a>"));
        String textviewstring2 = "\n"+"\n"+"KHS: 910-557" + "\n" + "Description: FUSE" + "\n" +
                "Vendor: Bussman" + "\n" + "Model: LPJ-30SP" +"\n";
        t4.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView2.setText(textviewstring2);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
    }
}
