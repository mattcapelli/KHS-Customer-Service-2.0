package com.example.khs.panelview;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by KHS on 7/22/2015.
 */
public class Display_Safety_Interlock_Communication4 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 910-628" + "\n" + "Description: RELAY " + "\n" +
                "Vendor: Allen-Bradley" + "\n" + "Model: 700-HLS1Z24" +"\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView myTextView2 = (TextView) findViewById(R.id.textview3);
        TextView myTextView3 = (TextView) findViewById(R.id.textview5);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        TextView t4 = (TextView) findViewById(R.id.textview4);
        TextView t6 = (TextView) findViewById(R.id.textview6);
        t2.setText(Html.fromHtml("<b>Bulletin 700-HL Terminal Block Relay: </b>" +
                "<a href=\"http://www.ab.com/en/epub/catalogs/12768/229240/229266/229643/229703/tab5.html\">" +
                "Specifications</a>"));
        t4.setText(Html.fromHtml("<b>Bulletin 700-HL Terminal Block Relay: </b>" +
                "<a href=\"http://www.ab.com/en/epub/catalogs/12768/229240/229266/229643/229703/tab5.html\">" +
                "Specifications</a>"));
        String textviewstring2 = "\n"+"\n"+"KHS: 910-1265" + "\n" + "Description: RELAY" + "\n" +
                "Vendor: Allen-Bradley" + "\n" + "Model: 700-HLT1Z12" +"\n";
        String textviewstring3 = "\n"+"\n"+"KHS: 900503-18" + "\n" + "Description: TERMINAL" + "\n" +
                "Vendor: Allen-Bradley" + "\n" + "Model: 1492-H5" +"\n";
        t6.setText(Html.fromHtml("<b>Bulletin 1492: </b>" +
                "<a href=\"http://raise.rockwellautomation.com/raconfig/rtcache/pdf/1492_h_wfb4_spec.pdf\">" +
                "Screw Connection Terminal Blocks</a>"));
        myTextView3.setText(textviewstring3);
        t4.setMovementMethod(LinkMovementMethod.getInstance());
        t6.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView2.setText(textviewstring2);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
    }
}
