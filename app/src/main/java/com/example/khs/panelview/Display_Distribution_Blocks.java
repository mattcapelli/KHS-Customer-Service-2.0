package com.example.khs.panelview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by KHS on 7/21/2015.
 */
public class Display_Distribution_Blocks extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 240-50-15-023/16A" + "\n" + "Description: ACCESSORY, " +
                "ELECTRICAL COMPONENTS" + "\n" +
                "Vendor: Ferraz Shawmut" + "\n" + "Model: FSPD83C" +"\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView myTextView2 = (TextView) findViewById(R.id.textview3);
        TextView myTextView3 = (TextView) findViewById(R.id.textview5);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        TextView t4 = (TextView) findViewById(R.id.textview4);
        TextView t6 = (TextView) findViewById(R.id.textview6);
        t2.setText(Html.fromHtml("<b>Catalog: </b>" +
                "<a href=\"https://www.galco.com/techdoc/shaw/fspdb3c_cat.pdf\">" +
                "FSPDB Finger-Safe Power Distribution Blocks</a>"));
        t4.setText(Html.fromHtml("<b>Mersen, formerly Ferraz Shawmut, Accessory: </b>" +
                "<a href=\"http://www.galco.com/buy/Mersen-formerly-Ferraz-Shawmut/FSPIN1\">" +
                "Accessory Pin to Form Multi-Pole Distribution Block</a>"));
        String textviewstring2 = "\n"+"\n"+"KHS: 240-50-15-023/12A" + "\n" + "Description: ACCESSORY, ELECTRICAL COMPONENTS" + "\n" +
                "Vendor: Ferraz Shawmut" + "\n" + "Model: FSPIN1" +"\n";
        String textviewstring3 = "\n"+"\n"+"KHS: 240-50-15-023/13A" + "\n" + "Description: ACCESSORY, ELECTRICAL COMPONENTS" + "\n" +
                "Vendor: Ferraz Shawmut" + "\n" + "Model: N233544" +"\n";
        t6.setText(Html.fromHtml("<b>Mersen, formerly Ferraz Shawmut, Accessory: </b>" +
                "<a href=\"http://www.galco.com/buy/Mersen-formerly-Ferraz-Shawmut/FSEA\">" +
                "Fuse, PAIR OF FSPDB END ANCHORS</a>"));
        myTextView3.setText(textviewstring3);
        t4.setMovementMethod(LinkMovementMethod.getInstance());
        t6.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView2.setText(textviewstring2);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
    }
}
