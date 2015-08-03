package com.example.khs.panelview;

/**
 * Created by KHS on 7/13/2015.
 */
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class DetailsActivity extends Activity{
    String title;
    Bitmap bitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        title = getIntent().getStringExtra("title");
        bitmap = getIntent().getParcelableExtra("image");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        try {
            if (SameAs(bitmap, BitmapFactory.decodeResource(getResources(),
                    getResources().obtainTypedArray(R.array.image_ids).getResourceId(0, -1)))) {
                setContentView(R.layout.ac_circuit_protection);
                TextView titleTextView = (TextView) findViewById(R.id.title);
                titleTextView.setText(title);
                ImageView imageView = (ImageView) findViewById(R.id.image);
                imageView.setImageBitmap(bitmap);
            } else if (SameAs(bitmap, BitmapFactory.decodeResource(getResources(),
                    getResources().obtainTypedArray(R.array.image_ids).getResourceId(1, -1)))) {
                setContentView(R.layout.ac_field_wiring);
                title = getIntent().getStringExtra("title");
                bitmap = getIntent().getParcelableExtra("image");
                TextView titleTextView = (TextView) findViewById(R.id.title);
                titleTextView.setText(title);
                ImageView imageView = (ImageView) findViewById(R.id.image);
                imageView.setImageBitmap(bitmap);
            } else if (SameAs(bitmap, BitmapFactory.decodeResource(getResources(),
                    getResources().obtainTypedArray(R.array.image_ids).getResourceId(2, -1)))) {
                setContentView(R.layout.dc_fuses);
                title = getIntent().getStringExtra("title");
                bitmap = getIntent().getParcelableExtra("image");
                TextView titleTextView = (TextView) findViewById(R.id.title);
                titleTextView.setText(title);
                ImageView imageView = (ImageView) findViewById(R.id.image);
                imageView.setImageBitmap(bitmap);
            } else if (SameAs(bitmap, BitmapFactory.decodeResource(getResources(),
                    getResources().obtainTypedArray(R.array.image_ids).getResourceId(3, -1)))) {
                setContentView(R.layout.dc_rail);
                title = getIntent().getStringExtra("title");
                bitmap = getIntent().getParcelableExtra("image");
                TextView titleTextView = (TextView) findViewById(R.id.title);
                titleTextView.setText(title);
                ImageView imageView = (ImageView) findViewById(R.id.image);
                imageView.setImageBitmap(bitmap);
            } else if (SameAs(bitmap, BitmapFactory.decodeResource(getResources(),
                    getResources().obtainTypedArray(R.array.image_ids).getResourceId(4, -1)))) {
                setContentView(R.layout.distribution_blocks);
                title = getIntent().getStringExtra("title");
                bitmap = getIntent().getParcelableExtra("image");
                TextView titleTextView = (TextView) findViewById(R.id.title);
                titleTextView.setText(title);
                ImageView imageView = (ImageView) findViewById(R.id.image);
                imageView.setImageBitmap(bitmap);
            } else if (SameAs(bitmap, BitmapFactory.decodeResource(getResources(),
                    getResources().obtainTypedArray(R.array.image_ids).getResourceId(5, -1)))) {
                setContentView(R.layout.field_io_bottom);
                title = getIntent().getStringExtra("title");
                bitmap = getIntent().getParcelableExtra("image");
                TextView titleTextView = (TextView) findViewById(R.id.title);
                titleTextView.setText(title);
                ImageView imageView = (ImageView) findViewById(R.id.image);
                imageView.setImageBitmap(bitmap);
            } else if (SameAs(bitmap, BitmapFactory.decodeResource(getResources(),
                    getResources().obtainTypedArray(R.array.image_ids).getResourceId(6, -1)))) {
                setContentView(R.layout.field_io_top);
                title = getIntent().getStringExtra("title");
                bitmap = getIntent().getParcelableExtra("image");
                TextView titleTextView = (TextView) findViewById(R.id.title);
                titleTextView.setText(title);
                ImageView imageView = (ImageView) findViewById(R.id.image);
                imageView.setImageBitmap(bitmap);
            } else if (SameAs(bitmap, BitmapFactory.decodeResource(getResources(),
                    getResources().obtainTypedArray(R.array.image_ids).getResourceId(7, -1)))) {
                setContentView(R.layout.heater_circuit_protection);
                title = getIntent().getStringExtra("title");
                bitmap = getIntent().getParcelableExtra("image");
                TextView titleTextView = (TextView) findViewById(R.id.title);
                titleTextView.setText(title);
                ImageView imageView = (ImageView) findViewById(R.id.image);
                imageView.setImageBitmap(bitmap);
            } else if (SameAs(bitmap, BitmapFactory.decodeResource(getResources(),
                    getResources().obtainTypedArray(R.array.image_ids).getResourceId(8, -1)))) {
                setContentView(R.layout.heater_contactors_fuses);
                title = getIntent().getStringExtra("title");
                bitmap = getIntent().getParcelableExtra("image");
                TextView titleTextView = (TextView) findViewById(R.id.title);
                titleTextView.setText(title);
                ImageView imageView = (ImageView) findViewById(R.id.image);
                imageView.setImageBitmap(bitmap);
            } else if (SameAs(bitmap, BitmapFactory.decodeResource(getResources(),
                    getResources().obtainTypedArray(R.array.image_ids).getResourceId(9, -1)))) {
                setContentView(R.layout.heater_solid_state_relays);
                title = getIntent().getStringExtra("title");
                bitmap = getIntent().getParcelableExtra("image");
                TextView titleTextView = (TextView) findViewById(R.id.title);
                titleTextView.setText(title);
                ImageView imageView = (ImageView) findViewById(R.id.image);
                imageView.setImageBitmap(bitmap);
            } else if (SameAs(bitmap, BitmapFactory.decodeResource(getResources(),
                    getResources().obtainTypedArray(R.array.image_ids).getResourceId(10, -1)))) {
                setContentView(R.layout.motion_control);
                title = getIntent().getStringExtra("title");
                bitmap = getIntent().getParcelableExtra("image");
                TextView titleTextView = (TextView) findViewById(R.id.title);
                titleTextView.setText(title);
                ImageView imageView = (ImageView) findViewById(R.id.image);
                imageView.setImageBitmap(bitmap);
            } else if (SameAs(bitmap, BitmapFactory.decodeResource(getResources(),
                    getResources().obtainTypedArray(R.array.image_ids).getResourceId(11, -1)))) {
                setContentView(R.layout.plc_rack);
                title = getIntent().getStringExtra("title");
                bitmap = getIntent().getParcelableExtra("image");
                TextView titleTextView = (TextView) findViewById(R.id.title);
                titleTextView.setText(title);
                ImageView imageView = (ImageView) findViewById(R.id.image);
                imageView.setImageBitmap(bitmap);
            } else if (SameAs(bitmap, BitmapFactory.decodeResource(getResources(),
                    getResources().obtainTypedArray(R.array.image_ids).getResourceId(12, -1)))) {
                setContentView(R.layout.safety_interlock_communication);
                title = getIntent().getStringExtra("title");
                bitmap = getIntent().getParcelableExtra("image");
                TextView titleTextView = (TextView) findViewById(R.id.title);
                titleTextView.setText(title);
                ImageView imageView = (ImageView) findViewById(R.id.image);
                imageView.setImageBitmap(bitmap);
            } else if (SameAs(bitmap, BitmapFactory.decodeResource(getResources(),
                    getResources().obtainTypedArray(R.array.image_ids).getResourceId(13, -1)))) {
                setContentView(R.layout.servo_drives);
                title = getIntent().getStringExtra("title");
                bitmap = getIntent().getParcelableExtra("image");
                TextView titleTextView = (TextView) findViewById(R.id.title);
                titleTextView.setText(title);
                ImageView imageView = (ImageView) findViewById(R.id.image);
                imageView.setImageBitmap(bitmap);
            } else if (SameAs(bitmap, BitmapFactory.decodeResource(getResources(),
                    getResources().obtainTypedArray(R.array.image_ids).getResourceId(14, -1)))) {
                setContentView(R.layout.square_relay);
                title = getIntent().getStringExtra("title");
                bitmap = getIntent().getParcelableExtra("image");
                TextView titleTextView = (TextView) findViewById(R.id.title);
                titleTextView.setText(title);
                ImageView imageView = (ImageView) findViewById(R.id.image);
                imageView.setImageBitmap(bitmap);
            } else if (SameAs(bitmap, BitmapFactory.decodeResource(getResources(),
                    getResources().obtainTypedArray(R.array.image_ids).getResourceId(15, -1)))) {
                setContentView(R.layout.vfd);
                title = getIntent().getStringExtra("title");
                bitmap = getIntent().getParcelableExtra("image");
                TextView titleTextView = (TextView) findViewById(R.id.title);
                titleTextView.setText(title);
                ImageView imageView = (ImageView) findViewById(R.id.image);
                imageView.setImageBitmap(bitmap);
            }
        }
        catch (Exception e) {
            finish();
        }
    }

    public void send_ac_circuit_protection_list1(View view) {
        Intent intent = new Intent(this, Display_AC_Circuit_Protection_List1.class);
        startActivity(intent);
    }

    public void send_ac_circuit_protection_list2(View view) {
        Intent intent = new Intent(this, Display_AC_Circuit_Protection_List2.class);
        startActivity(intent);
    }

    public void send_ac_field_wiring(View view) {
        Intent intent = new Intent(this, Display_AC_Field_Wiring.class);
        startActivity(intent);
    }

    public void send_dc_fuses1(View view) {
        Intent intent = new Intent(this, Display_DC_Fuses.class);
        startActivity(intent);
    }

    public void send_dc_rail_list(View view) {
        Intent intent = new Intent(this, Display_DC_Rail_List.class);
        startActivity(intent);
    }

    public void send_dc_rail8(View view) {
        Intent intent = new Intent(this, Display_DC_Rail8.class);
        startActivity(intent);
    }
    public void send_distribution_blocks(View view) {
        Intent intent = new Intent(this, Display_Distribution_Blocks.class);
        startActivity(intent);
    }
    public void send_field_io_bottom1(View view) {
        Intent intent = new Intent(this, Display_Field_IO_Bottom1.class);
        startActivity(intent);
    }
    public void send_field_io_bottom_list(View view) {
        Intent intent = new Intent(this, Display_Field_IO_Bottom_List.class);
        startActivity(intent);
    }
    public void send_field_io_bottom6(View view) {
        Intent intent = new Intent(this, Display_Field_IO_Bottom5.class);
        startActivity(intent);
    }
    public void send_field_io_top1(View view) {
        Intent intent = new Intent(this, Display_Field_IO_Top1.class);
        startActivity(intent);
    }
    public void send_field_io_top_list1(View view) {
        Intent intent = new Intent(this, Display_Field_IO_Top_List1.class);
        startActivity(intent);
    }
    public void send_field_io_top_list2(View view) {
        Intent intent = new Intent(this, Display_Field_IO_Top_List2.class);
        startActivity(intent);
    }
    public void send_field_io_top_list3(View view) {
        Intent intent = new Intent(this, Display_Field_IO_Top_List3.class);
        startActivity(intent);
    }
    public void send_heater_circuit_protection1(View view) {
        Intent intent = new Intent(this, Display_Heater_Circuit_Protection1.class);
        startActivity(intent);
    }
    public void send_heater_circuit_protection2(View view) {
        Intent intent = new Intent(this, Display_Heater_Circuit_Protection2.class);
        startActivity(intent);
    }
    public void send_heater_contactors_fuses1(View view) {
        Intent intent = new Intent(this, Display_Heater_Contactors_Fuses1.class);
        startActivity(intent);
    }
    public void send_heater_contactors_fuses2(View view) {
        Intent intent = new Intent(this, Display_Heater_Contactors_Fuses2.class);
        startActivity(intent);
    }
    public void send_heater_contactors_fuses3(View view) {
        Intent intent = new Intent(this, Display_Heater_Contactors_Fuses3.class);
        startActivity(intent);
    }
    public void send_heater_solid_state_relays(View view) {
        Intent intent = new Intent(this, Display_Heater_Solid_State_Relays.class);
        startActivity(intent);
    }
    public void send_motion_control2(View view) {
        Intent intent = new Intent(this, Display_Motion_Control2.class);
        startActivity(intent);
    }
    public void send_motion_control1(View view) {
        Intent intent = new Intent(this, Display_Motion_Control1.class);
        startActivity(intent);
    }
    public void send_plc_rack_list(View view) {
        Intent intent = new Intent(this, Display_PLC_Rack_List.class);
        startActivity(intent);
    }
    public void send_plc_rack(View view) {
        Intent intent = new Intent(this, Display_PLC_Rack7.class);
        startActivity(intent);
    }
    public void send_plc_rack1(View view) {
        Intent intent = new Intent(this, Display_PLC_Rack1.class);
        startActivity(intent);
    }
    public void send_safety_interlock_communication_list1(View view) {
        Intent intent = new Intent(this, Display_Safety_Interlock_Communication_List1.class);
        startActivity(intent);
    }
    public void send_safety_interlock_communication3(View view) {
        Intent intent = new Intent(this, Display_Safety_Interlock_Communication3.class);
        startActivity(intent);
    }
    public void send_safety_interlock_communication4(View view) {
        Intent intent = new Intent(this, Display_Safety_Interlock_Communication4.class);
        startActivity(intent);
    }
    public void send_safety_interlock_communication_list2(View view) {
        Intent intent = new Intent(this, Display_Safety_Interlock_Communication_List2.class);
        startActivity(intent);
    }
    public void send_servo_drives_list(View view) {
        Intent intent = new Intent(this, Display_Servo_Drives_List.class);
        startActivity(intent);
    }
    public void send_servo_drives3(View view) {
        Intent intent = new Intent(this, Display_Servo_Drives3.class);
        startActivity(intent);
    }
    public void send_servo_drives4(View view) {
        Intent intent = new Intent(this, Display_Servo_Drives4.class);
        startActivity(intent);
    }
    public void send_square_relay1(View view) {
        Intent intent = new Intent(this, Display_Square_Relay1.class);
        startActivity(intent);
    }
    public void send_square_relay2(View view) {
        Intent intent = new Intent(this, Display_Square_Relay2.class);
        startActivity(intent);
    }
    public void send_vfd(View view) {
        Intent intent = new Intent(this, Display_VFD.class);
        startActivity(intent);
    }
    public boolean SameAs(Bitmap bitmap1, Bitmap bitmap2) {
        ByteBuffer buffer1 = ByteBuffer.allocate(bitmap1.getHeight() * bitmap1.getRowBytes());
        bitmap1.copyPixelsToBuffer(buffer1);

        ByteBuffer buffer2 = ByteBuffer.allocate(bitmap2.getHeight() * bitmap2.getRowBytes());
        bitmap2.copyPixelsToBuffer(buffer2);

        return Arrays.equals(buffer1.array(), buffer2.array());
    }
   }