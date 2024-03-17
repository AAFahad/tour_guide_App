package com.example.e_ghuraphera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class details extends AppCompatActivity implements View.OnClickListener {
    private Button transportation;
    private Button hotel;
    private Button place;
    private Button hospital;
    private Button bank;
    private Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        transportation = findViewById(R.id.Transportation);
        hotel = findViewById(R.id.Hotel);
        place = findViewById(R.id.Place);
        hospital = findViewById(R.id.Hospital);
        bank = findViewById(R.id.Bank);
        logout = findViewById(R.id.Logout);

        transportation.setOnClickListener(this);
        hotel.setOnClickListener(this);
        place.setOnClickListener(this);
        hospital.setOnClickListener(this);
        bank.setOnClickListener(this);
        logout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Transportation:
                transportationSection();
                break;
            case R.id.Hotel:
                hotelSection();
                break;
            case R.id.Place:
                placeSection();
                break;
            case R.id.Hospital:
                hospitalSection();
                break;
            case R.id.Bank:
                bankSection();
                break;
            case R.id.Logout:
                logoutSection();
                break;
        }

    }

    private void logoutSection() {
        startActivity(new Intent(details.this, MainActivity.class));
    }

    private void bankSection() {
        String f=getIntent().getStringExtra("from");
        String t=getIntent().getStringExtra("to");
        Intent intent = new Intent(details.this, bank.class);
        intent.putExtra("from", f);
        intent.putExtra("to", t);

        startActivity(intent);
    }

    private void hospitalSection() {
        String f=getIntent().getStringExtra("from");
        String t=getIntent().getStringExtra("to");
        Intent intent = new Intent(details.this, hospital.class);
        intent.putExtra("from", f);
        intent.putExtra("to", t);

        startActivity(intent);
    }

    private void placeSection() {
        String f=getIntent().getStringExtra("from");
        String t=getIntent().getStringExtra("to");
        Intent intent = new Intent(details.this, places.class);
        intent.putExtra("from", f);
        intent.putExtra("to", t);

        startActivity(intent);
    }

    private void hotelSection() {
        String f=getIntent().getStringExtra("from");
        String t=getIntent().getStringExtra("to");
        Intent intent = new Intent(details.this, hotel.class);
        intent.putExtra("from", f);
        intent.putExtra("to", t);

        startActivity(intent);
    }

    private void transportationSection() {
        String f=getIntent().getStringExtra("from");
        String t=getIntent().getStringExtra("to");
        Intent intent = new Intent(details.this, full_details.class);
        intent.putExtra("from", f);
        intent.putExtra("to", t);

        startActivity(intent);
    }
}