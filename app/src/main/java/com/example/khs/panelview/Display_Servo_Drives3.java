package com.example.khs.panelview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by KHS on 7/22/2015.
 */
public class Display_Servo_Drives3 extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String textviewstring = "KHS: 301268895224" + "\n" + "Description: SERVO SYSTEM " + "\n" +
                "Vendor: Indramat" + "\n" + "Model: HAS03.1-002-NNN-NN" +"\n";
        TextView myTextView = (TextView) findViewById(R.id.textview1);
        TextView myTextView2 = (TextView) findViewById(R.id.textview3);
        TextView myTextView3 = (TextView) findViewById(R.id.textview5);
        TextView myTextView4 = (TextView) findViewById(R.id.textview7);
        TextView t2 = (TextView) findViewById(R.id.textview2);
        TextView t4 = (TextView) findViewById(R.id.textview4);
        TextView t6 = (TextView) findViewById(R.id.textview6);
        t2.setText(Html.fromHtml("<b>Components: </b>" +
                "<a href=\"http://www.boschrexroth.com/en/us/products/product-groups/goto-products/goto-electric-drives-and-controls/drive-systems/components/components\">" +
                "Drive System Resources</a>"));
        t4.setText(Html.fromHtml("<b>Components: </b>" +
                "<a href=\"http://www.boschrexroth.com/en/us/products/product-groups/goto-products/goto-electric-drives-and-controls/drive-systems/components/components\">" +
                "Drive System Resources</a>"));
        String textviewstring2 = "\n"+"\n"+"KHS: 301268895222" + "\n" + "Description: SERVO SYSTEM " + "\n" +
                "Vendor: Indramat" + "\n" + "Model: HAS02.1-015-NNN-NN" +"\n";
        String textviewstring3 = "\n"+"\n"+"KHS: 301268895221" + "\n" + "Description: SERVO SYSTEM " + "\n" +
                "Vendor: Indramat" + "\n" + "Model: HAS01.1-050-072" +"\n";
        String textviewstring4 = "\n"+"\n"+"KHS: 910-1440" + "\n" + "Description: SERVO SYSTEM" + "\n" +
                "Vendor: Indramat" + "\n" + "Model: R911172135" +"\n";
        t6.setText(Html.fromHtml("<b>Components: </b>" +
                "<a href=\"http://www.boschrexroth.com/en/us/products/product-groups/goto-products/goto-electric-drives-and-controls/drive-systems/components/components\">" +
                "Drive System Resources</a>"));
        myTextView3.setText(textviewstring3);
        t4.setMovementMethod(LinkMovementMethod.getInstance());
        t6.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView2.setText(textviewstring2);
        myTextView4.setText(textviewstring4);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        myTextView.setText(textviewstring);
    }
}
