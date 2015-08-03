package com.example.khs.panelview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by KHS on 7/23/2015.
 */
public class Display_VFD extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 910-1546 " + "\n" + "Description: DRIVE" + "\n" +
                "Vendor: Allen-Bradley" + "\n" + "Model: 25B-D1P4N104" +"\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        t2.setText(Html.fromHtml("<b>Technical Data: </b>" +
                "<a href=\"http://literature.rockwellautomation.com/idc/groups/literature/documents/td/520-td001_-en-e.pdf\">" +
                "PowerFlex 520-Series AC Drive Specifications</a>"));
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
    }
}
