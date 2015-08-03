package com.example.khs.panelview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by KHS on 7/22/2015.
 */
public class Display_Motion_Control2 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 910-1316" + "\n" + "Description: SERVO SYSTEM" + "\n" +
                "Vendor: Indramat" + "\n" + "Model: R911170757" + "\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        t2.setText(Html.fromHtml("<b>GoTo R-IB IL 24 DO 16-PAC: </b>" +
                "<a href=\"http://www.boschrexroth-us.com/country_units/america/united_states/sub_websites/brus_dcc/GoTo/I_O_Main_Page/Digital_Output_Modules/inline_digital_output_en/Inline_DO16_en/index.jsp\">" +
                "Technical Data</a>"));
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
    }
}
