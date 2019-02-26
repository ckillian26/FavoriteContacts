package com.example.favoritecontacts;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.net.URI;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btn1Text, btn1Call;
    TextView textViewStatus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewStatus = (TextView) findViewById(R.id.textViewStatus);
        setupButtonClickEvents();
        setupButtonClickEvents2();
        setupButtonClickEvents3();

    }

    private void setupButtonClickEvents() {
        btn1Call = (Button) findViewById(R.id.button1Call);
        btn1Call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should make a phone call.");

                //Gets the phone number from the strings.xml
                Resources res = getResources();
                String[] phoneNums = res.getStringArray(R.array.phoneNumbers);
                String phoneNumber = phoneNums[0];

                //Calls the phone intent
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + phoneNumber));
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }
            }
        });

        btn1Text = (Button) findViewById(R.id.button1Text);
        btn1Text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                // Do something in response to button click
                textViewStatus.setText("Code should open the text messaging app.");

                Intent textIntent = new Intent(Intent.ACTION_VIEW);
                textIntent.setData(Uri.parse("smsto:6512069285"));
                textIntent.putExtra("sms_body", "Hi");
                if (textIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(textIntent);
                }
            }
        });
    }

    private void setupButtonClickEvents2() {
        btn1Call = (Button) findViewById(R.id.button2Call);
        btn1Call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should make a phone call.");

                //Gets the phone number from the strings.xml
                Resources res = getResources();
                String[] phoneNums = res.getStringArray(R.array.phoneNumbers);
                String phoneNumber = phoneNums[1];

                //Calls the phone intent
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + phoneNumber));
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }
            }
        });

        btn1Text = (Button) findViewById(R.id.button2Text);
        btn1Text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should open the text messaging app.");

                Intent textIntent = new Intent(Intent.ACTION_VIEW);
                textIntent.setData(Uri.parse("smsto:6511111111"));
                textIntent.putExtra("sms_body", "Hi");
                if (textIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(textIntent);
                }
            }
        });
    }
    private void setupButtonClickEvents3() {

        btn1Call = (Button) findViewById(R.id.button3Call);
        btn1Call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should make a phone call.");

                //Gets the phone number from the strings.xml
                Resources res = getResources();
                String[] phoneNums = res.getStringArray(R.array.phoneNumbers);
                String phoneNumber = phoneNums[2];

                //Calls the phone intent
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + phoneNumber));
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }
            }
        });
        btn1Text = (Button) findViewById(R.id.button3Text);
        btn1Text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should open the text messaging app.");

                Intent textIntent = new Intent(Intent.ACTION_VIEW);
                textIntent.setData(Uri.parse("smsto:7624855482"));
                textIntent.putExtra("sms_body", "Hi");
                if (textIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(textIntent);
                }
            }
        });
    }
}
