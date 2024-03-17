package com.example.e_ghuraphera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class system_navigation extends AppCompatActivity implements View.OnClickListener {

    private Button map_Button;
    private Button details_Button;
    private TextView from;
    private TextView to;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_navigation);

        map_Button = findViewById(R.id.mapButton);
        details_Button = findViewById(R.id.nextButton);
        from = findViewById(R.id.fromText);
        to = findViewById(R.id.toText);

        map_Button.setOnClickListener(this);
        details_Button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mapButton:
                mapSection();
                break;
            case R.id.nextButton:
                nextPages();
                break;
        }

    }

    private void nextPages() {
        String f = from.getText().toString();
        String t = to.getText().toString();
        Intent intent = new Intent(system_navigation.this, details.class);
        intent.putExtra("from", f);
        intent.putExtra("to", t);

        startActivity(intent);
    }

    private void mapSection() {
        String f = from.getText().toString();
        String t = to.getText().toString();
        Intent intent = new Intent(system_navigation.this, map.class);
        intent.putExtra("from", f);
        intent.putExtra("to", t);

        startActivity(intent);

    }
}