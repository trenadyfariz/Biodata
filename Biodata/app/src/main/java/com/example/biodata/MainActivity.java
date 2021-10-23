package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);


        // Maps
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent, chooser;
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://goo.gl/maps/v2kxaLgLRV9BSfh8A"));
                chooser = Intent.createChooser(intent, "Launch Map");
                startActivity(chooser);
            }
        });

        // Telepon
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0895414960962"));
                startActivity(intent);

            }
        });

        // Email
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("message/rtc822");
                String[] to = {"111201912352@mhs.dinus.ac.id"};
                emailIntent.putExtra(Intent.EXTRA_EMAIL, to);
                startActivity(emailIntent);

            }
        });
    }

    public void button3(View view) {
    }

    public void button2(View view) {
    }

    public void button1(View view) {
    }
}