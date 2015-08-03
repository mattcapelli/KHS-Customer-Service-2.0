package com.example.khs.panelview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by KHS on 7/20/2015.
 */
public class Display_DC_Rail8 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 301252852170" + "\n" + "Description: POWER SUPPLY" + "\n" +
                "Vendor: Siemens" + "\n" + "Model: 6EP1437-3BA10" + "\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        t2.setText(Html.fromHtml("<b>Product Datasheet: </b>" +
                "<a href=\"http://plc-trade.com/media/pdf/6EP1437-3BA10-datasheet-en.pdf\">" +
                "6EP1437-3BA10</a>"));
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
    }
}
