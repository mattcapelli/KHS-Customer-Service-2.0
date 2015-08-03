package com.example.khs.panelview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by KHS on 7/22/2015.
 */
public class Display_Motion_Control1 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 910-1575" + "\n" + "Description: SERVO SYSTEM" + "\n" +
                "Vendor: Indramat" + "\n" + "Model: R911170900+R911334611+R911299856" +"\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView myTextView2 = (TextView) findViewById(R.id.textview3);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        TextView t4 = (TextView) findViewById(R.id.textview4);
        t2.setText(Html.fromHtml("<b>Control Hardware: </b>" +
                "<a href=\"http://www.boschrexroth.de/dcc/content/internet/en/pdf/PDF_p150097_en.pdf\">" +
                "IndraControl L65</a>"));
        t4.setText(Html.fromHtml("<b>GoTo Drive Systems: </b>" +
                "<a href=\"http://www.boschrexroth.com/country_units/america/united_states/sub_websites/brus_dcc/GoTo/IndraDrive_CS/EDC_Cables/\">" +
                "Cables</a>"));
        String textviewstring2 = "\n"+"\n"+"KHS: 910-1351" + "\n" + "Description: SERVO SYSTEM" + "\n" +
                "Vendor: Indramat" + "\n" + "Model: R911316888" +"\n";
        t4.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView2.setText(textviewstring2);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
        TextView myTextView3 = (TextView) findViewById(R.id.textview5);
        TextView t6 = (TextView) findViewById(R.id.textview6);
        String textviewstring3 = "KHS: 910-1320" + "\n" + "Description: SERVO SYSTEM" + "\n" +
                "Vendor: Indramat" + "\n" + "Model: R911170789" +"\n"+"\n";
        t6.setText(Html.fromHtml("<b>Power supply/segment modules: </b>" +
                "<a href=\"http://www.boschrexroth.com/dcc/Vornavigation/VorNavi.cfm?Language=EN&VHist=g97568%2Cg96076%2Cg226769%2Cg96669%2Cg100171&PageID=p181294\">" +
                "Power Module</a>"));
        myTextView3.setText(textviewstring3);
        t6.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
