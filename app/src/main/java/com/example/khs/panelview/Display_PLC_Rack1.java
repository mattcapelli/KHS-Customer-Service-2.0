package com.example.khs.panelview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by KHS on 7/22/2015.
 */
public class Display_PLC_Rack1 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 500031-341" + "\n" + "Description: CONTROLLER" + "\n" +
                "Vendor: Allen-Bradley" + "\n" + "Model: 1756-PB72" +"\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView myTextView2 = (TextView) findViewById(R.id.textview3);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        TextView t4 = (TextView) findViewById(R.id.textview4);
        t2.setText(Html.fromHtml("<b>Technical Data: </b>" +
                "<a href=\"http://literature.rockwellautomation.com/idc/groups/literature/documents/td/1756-td005_-en-e.pdf\">" +
                "1756 ControlLogix Power Supplies Specifications</a>"));
        t4.setText(Html.fromHtml("<b>Technical Data: </b>" +
                "<a href=\"http://literature.rockwellautomation.com/idc/groups/literature/documents/td/1756-td006_-en-e.pdf\">" +
                "1756 ControlLogix Chassis Specifications</a>"));
        String textviewstring2 = "\n"+"\n"+"KHS: 910-274" + "\n" + "Description: CONTROLLER" + "\n" +
                "Vendor: Allen-Bradley" + "\n" + "Model: 1756-A10" +"\n";
        t4.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView2.setText(textviewstring2);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
    }
}
