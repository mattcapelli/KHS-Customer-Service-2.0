package com.example.khs.panelview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by KHS on 7/23/2015.
 */
public class Display_Square_Relay1 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 900358-7" + "\n" + "Description: RELAY" + "\n" +
                "Vendor: Allen-Bradley" + "\n" + "Model: 700-HA32Z24" +"\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView myTextView2 = (TextView) findViewById(R.id.textview3);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        TextView t4 = (TextView) findViewById(R.id.textview4);
        t2.setText(Html.fromHtml("<b>Bulletin 700-HA Tube Base Relay: </b>" +
                "<a href=\"http://www.ab.com/en/epub/catalogs/12768/229240/229266/229643/229691/Product-Selection.html\">" +
                "Product Selection</a>"));
        t4.setText(Html.fromHtml("<b>Bulletin 700-HA Tube Base Relay: </b>" +
                "<a href=\"http://www.ab.com/en/epub/catalogs/12768/229240/229266/229643/229691/Accessories.html\">" +
                "Accessories</a>"));
        String textviewstring2 = "\n"+"\n"+"KHS: 900384-1" + "\n" + "Description: RELAY" + "\n" +
                "Vendor: Allen-Bradley" + "\n" + "Model: 700HN-100" +"\n";
        t4.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView2.setText(textviewstring2);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
    }
}
