package com.example.khs.panelview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by KHS on 7/22/2015.
 */
public class Display_PLC_Rack4 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 500031-346" + "\n" + "Description: CONTROLLER" + "\n" +
                "Vendor: Allen-Bradley" + "\n" + "Model: 1756-TBNH" +"\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView myTextView2 = (TextView) findViewById(R.id.textview3);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        TextView t4 = (TextView) findViewById(R.id.textview4);
        t2.setText(Html.fromHtml("<b>I/O Modules: </b>" +
                "<a href=\"http://www.ab.com/en/epub/catalogs/12762/2181376/2416247/360807/2284181/Accessories-I-O-Modules.html\">" +
                "Accessories- I/O Modules</a>"));
        t4.setText(Html.fromHtml("<b>User Manual: </b>" +
                "<a href=\"http://literature.rockwellautomation.com/idc/groups/literature/documents/um/1756-um058_-en-p.pdf\">" +
                "ControlLogix Digital I/O Modules</a>"));
        String textviewstring2 = "\n"+"\n"+"KHS: 301268768732" + "\n" + "Description: ACCESSORY, ELECTRICAL COMPONENTS" + "\n" +
                "Vendor: Allen-Bradley" + "\n" + "Model: 1756-IB16" +"\n";
        t4.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView2.setText(textviewstring2);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
    }
}
