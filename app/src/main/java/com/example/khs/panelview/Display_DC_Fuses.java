package com.example.khs.panelview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by KHS on 7/16/2015.
 */
public class Display_DC_Fuses extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 900503-18" + "\n" + "Description: TERMINAL" + "\n" +
                "Vendor: Allen-Bradley" + "\n" + "Model: 1492-H5" +"\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView myTextView2 = (TextView) findViewById(R.id.textview3);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        TextView t4 = (TextView) findViewById(R.id.textview4);
        t2.setText(Html.fromHtml("<b>Technical Data: </b>" +
                "<a href=\"http://literature.rockwellautomation.com/idc/groups/literature/documents/td/1492-td015_-en-p.pdf\">" +
                "Terminal Block Specifications</a>"));
        t4.setText(Html.fromHtml("<b>Product Details and Specifications: </b>" +
                "<a href=\"http://www.relectric.com/Store/Fuses/ABC-1-2\">" +
                "ABC-1/2</a>"));
        String textviewstring2 = "\n"+"\n"+"KHS: 910-224" + "\n" + "Description: FUSE" + "\n" +
                "Vendor: Bussman" + "\n" + "Model: ABC-1/2" +"\n";
        t4.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView2.setText(textviewstring2);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
    }
}
