package com.example.khs.panelview;

import android.app.Notification;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by KHS on 7/21/2015.
 */
public class Display_Field_IO_Top1 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 240-50-15-073-19A" + "\n" + "Description: ACCESSORY, ELECTRICAL COMPONENTS" + "\n" +
                "Vendor: Allen-Bradley" + "\n" + "Model: 1734-AENTR" + "\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        t2.setText(Html.fromHtml("<b>User Manual: </b>" +
                "<a href=\"http://literature.rockwellautomation.com/idc/groups/literature/documents/um/1734-um014_-en-p.pdf\">" +
                "POINT I/O and ArmorPOINT I/O 2 Port Ethernet/IP Adapters</a>"));
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
    }
}
