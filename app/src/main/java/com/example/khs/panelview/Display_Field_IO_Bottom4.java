package com.example.khs.panelview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by KHS on 7/22/2015.
 */
public class Display_Field_IO_Bottom4 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 910-1435" + "\n" + "Description: POWER SUPPLY" + "\n" +
                "Vendor: Allen-Bradley" + "\n" + "Model: 1734-FPD" + "\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        t2.setText(Html.fromHtml("<b>1734 POINT I/O: </b>" +
                "<a href=\"http://www.ab.com/en/epub/catalogs/12762/2181376/104830/2416241/104832/Power-Supplies.html\">" +
                "Power Supplies</a>"));
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
    }
}
