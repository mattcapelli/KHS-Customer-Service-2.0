package com.example.khs.panelview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by KHS on 7/22/2015.
 */
public class Display_Servo_Drives4 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 910-1357" + "\n" + "Description: SERVO SYSTEM " + "\n" +
                "Vendor: Indramat" + "\n" + "Model: R911295325" +"\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView myTextView2 = (TextView) findViewById(R.id.textview3);
        TextView myTextView3 = (TextView) findViewById(R.id.textview5);
        TextView myTextView4 = (TextView) findViewById(R.id.textview7);
        TextView myTextView5 = (TextView) findViewById(R.id.textview9);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        TextView t6 = (TextView) findViewById(R.id.textview6);
        TextView t8 = (TextView) findViewById(R.id.textview8);
        t2.setText(Html.fromHtml("<b>GoTo Drive Systems: </b>" +
                "<a href=\"http://www.boschrexroth-us.com/country_units/america/united_states/sub_websites/brus_dcc/GoTo/IndraDrive_CS/IndraDrive_M/\">" +
                "IndraDrive M</a>"));
        String textviewstring2 = "\n"+"\n"+"KHS: 910-1683" + "\n" + "Description: SERVO SYSTEM " + "\n" +
                "Vendor: Indramat" + "\n" + "Model: R911339883+R991339321" +"\n";
        String textviewstring3 = "\n"+"\n"+"KHS: 910-1358" + "\n" + "Description: SERVO SYSTEM " + "\n" +
                "Vendor: Indramat" + "\n" + "Model: R911306619" +"\n";
        String textviewstring4 = "\n"+"\n"+"KHS: 910-1242" + "\n" + "Description: SERVO SYSTEM" + "\n" +
                "Vendor: Indramat" + "\n" + "Model: HAS02.1-001-NNN-NN" +"\n";
        String textviewstring5 = "\n"+"\n"+"KHS: 910-1319" + "\n" + "Description: SERVO SYSTEM" + "\n" +
                "Vendor: Indramat" + "\n" + "Model: R911316888" +"\n";
        t6.setText(Html.fromHtml("<b>Components: </b>" +
                "<a href=\"http://www.boschrexroth.com/en/us/products/product-groups/goto-products/goto-electric-drives-and-controls/drive-systems/components/components\">" +
                "Drive System Resources</a>"));
        t8.setText(Html.fromHtml("<b>Components: </b>" +
                "<a href=\"http://www.boschrexroth.com/en/us/products/product-groups/goto-products/goto-electric-drives-and-controls/drive-systems/components/components\">" +
                "Drive System Resources</a>"));
        myTextView3.setText(textviewstring3);
        myTextView5.setText(textviewstring5);
        t6.setMovementMethod(LinkMovementMethod.getInstance());
        t8.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView2.setText(textviewstring2);
        myTextView4.setText(textviewstring4);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
    }
}
