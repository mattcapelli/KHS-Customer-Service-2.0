package com.example.khs.panelview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by KHS on 7/22/2015.
 */
public class Display_Field_IO_Bottom3 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 240-50-15-073-7A" + "\n" + "Description: ACCESSORY, ELECTRICAL" +
                "COMPONENTS" + "\n" +
                "Vendor: Allen-Bradley" + "\n" + "Model: 1734-TBS" +"\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        t2.setText(Html.fromHtml("<b>1734 POINT I/O: </b>" +
                "<a href=\"http://www.ab.com/en/epub/catalogs/12762/2181376/104830/2416241/104832/Terminal-Base-Assemblies-and-RTBs.html\">" +
                "Terminal Base Assemblies and RTBs</a>"));
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        TextView myTextView2 = (TextView) findViewById(R.id.textview3);
        TextView t4 = (TextView) findViewById(R.id.textview4);
        t4.setText(Html.fromHtml("<b>User Manual: </b>" +
                "<a href=\"http://literature.rockwellautomation.com/idc/groups/literature/documents/um/1734-um001_-en-p.pdf\">" +
                "POINT I/O Digital and Analog Modules and POINTBlock I/O Modules</a>"));
        String textviewstring2 = "\n"+"\n"+"KHS: 240-50-15-073-15A" + "\n" + "Description: ACCESSORY, ELECTRICAL COMPONENTS" + "\n" +
                "Vendor: Allen-Bradley" + "\n" + "Model: 1734-IB8E" + "\n" ;
        t4.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView2.setText(textviewstring2);
        myTextView.setText(textviewstring);
    }
}
