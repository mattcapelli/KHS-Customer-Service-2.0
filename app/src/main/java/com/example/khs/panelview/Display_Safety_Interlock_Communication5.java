package com.example.khs.panelview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by KHS on 7/22/2015.
 */
public class Display_Safety_Interlock_Communication5 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "\n"+"\n"+"KHS: 910-1541" + "\n" + "Description: ACCESSORY, ELECTRICAL COMPONENTS" + "\n" +
                "Vendor: Phoenix" + "\n" + "Model: 2700642" +"\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        t2.setText(Html.fromHtml("<b>Phoenix Contact: </b>" +
                "<a href=\"https://www.phoenixcontact.com/online/portal/us?urile=pxc-oc-itemdetail:pid=2700642&library=usen&tab=1\">" +
                "Router- FL MGUARD RS2000 TX/TX VPN- 2700642</a>"));
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
    }
}
