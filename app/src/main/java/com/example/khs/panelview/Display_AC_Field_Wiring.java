package com.example.khs.panelview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Window;
import android.widget.TextView;

/**
 * Created by KHS on 7/15/2015.
 */
public class Display_AC_Field_Wiring extends ActionBarActivity{
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 800-2451" + "\n" + "Description: TERMINAL" + "\n" +
                "Vendor: Phoenix" + "\n" + "Model: 3038464" +"\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        t2.setText(Html.fromHtml("<b>Data Sheet: </b>" +
                "<a href=\"https://www.phoenixcontact.com/online/portal/us?uri=pxc-oc-itemdetail:pid=3038464&library=usen&pdfmode=direct&pdflanguage=en\">" +
                "Double-level spring-cage terminal block</a>"));
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
    }
}
