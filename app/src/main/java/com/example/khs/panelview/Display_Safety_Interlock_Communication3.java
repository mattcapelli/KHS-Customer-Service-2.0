package com.example.khs.panelview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by KHS on 7/22/2015.
 */
public class Display_Safety_Interlock_Communication3 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 910-462" + "\n" + "Description: RELAY" + "\n" +
                "Vendor: Allen-Bradley" + "\n" + "Model: 100S-C09EJ404C" +"\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        t2.setText(Html.fromHtml("<b>Bulletion 100S-C/104S-C: </b>" +
                "<a href=\"https://www.rexelusa.com/medias/sys_master/rexelusa/rexelusaimages/8978802343966.pdf?mime=application%2Fpdf&realname=Allen-Bradley-AB_473080_PDF.pdf\">" +
                "IEC Safety Contactors</a>"));
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
    }
}
