package com.example.khs.panelview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by KHS on 7/22/2015.
 */
public class Display_Heater_Contactors_Fuses3 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 900523-23" + "\n" + "Description: FUSE" + "\n" +
                "Vendor: Bussman" + "\n" + "Model: FNQ-R-5" +"\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView myTextView2 = (TextView) findViewById(R.id.textview3);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        TextView t4 = (TextView) findViewById(R.id.textview4);
        t2.setText(Html.fromHtml("<b>LIMITRON Class CC: </b>" +
                "<a href=\"http://www.cooperindustries.com/content/dam/public/bussmann/Electrical/Resources/product-datasheets-b/Bus_Ele_DS_1014_FNQ-R.pdf\">" +
                "FNQ-R-600Vac, 1/4-30A, Time-Delay Fuses</a>"));
        t4.setText(Html.fromHtml("<b>Bulletin 1492-FB: </b>" +
                "<a href=\"http://literature.rockwellautomation.com/idc/groups/literature/documents/pp/1492fb-pp001_-en-p.pdf\">" +
                "Fuse Holders</a>"));
        String textviewstring2 = "\n"+"\n"+"KHS: 500064-116" + "\n" + "Description: FUSE" + "\n" +
                "Vendor: Allen-Bradley" + "\n" + "Model: 1492-FB3C-L" +"\n";
        t4.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView2.setText(textviewstring2);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
    }
}
