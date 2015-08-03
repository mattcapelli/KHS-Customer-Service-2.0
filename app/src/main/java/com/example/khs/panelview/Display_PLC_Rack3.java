package com.example.khs.panelview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by KHS on 7/22/2015.
 */
public class Display_PLC_Rack3 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 301268768777" + "\n" + "Description: CONTROLLER" + "\n" +
                "Vendor: Allen-Bradley" + "\n" + "Model: 1756-EN2T" + "\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        t2.setText(Html.fromHtml("<b>Technical Data: </b>" +
                "<a href=\"http://literature.rockwellautomation.com/idc/groups/literature/documents/td/1756-td003_-en-e.pdf\">" +
                "1756 ControlLogix Communications Modules Specifications</a>"));
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
    }
}
