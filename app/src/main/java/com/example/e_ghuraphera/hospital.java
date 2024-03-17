package com.example.e_ghuraphera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class hospital extends AppCompatActivity {

    private WebView webViewHospital;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);

        webViewHospital = findViewById(R.id.webViewHospitalId);
        WebSettings webSettings = webViewHospital.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webViewHospital.setWebViewClient(new WebViewClient());
        //webView.loadUrl("https://docs.google.com/document/d/172HO2UkY2FOfpq57WxA5TIHnKodcle0k6sEXfsWf7-o/edit?usp=sharing");

        link();
    }

    private void link() {
        String f=getIntent().getStringExtra("from").trim().toString().toLowerCase();
        String t=getIntent().getStringExtra("to").trim().toString().toLowerCase();
        //Toast.makeText(hospital.this, "String.."+t, Toast.LENGTH_SHORT).show();


        if(t.equals("dhaka")) {
            webViewHospital.loadUrl("https://drive.google.com/file/d/1KvqxfHzUzzbYvdr6497Oz_gIcJhFl4Nw/view?usp=sharing");
        }
        else if(t.equals("sylhet")){
            webViewHospital.loadUrl("https://drive.google.com/file/d/1KvqxfHzUzzbYvdr6497Oz_gIcJhFl4Nw/view?usp=sharing");
        }
        else if(t.equals("rajshahi")){
            webViewHospital.loadUrl("https://drive.google.com/file/d/1KvqxfHzUzzbYvdr6497Oz_gIcJhFl4Nw/view?usp=sharing");
        }
        else if(t.equals("rangpur")){
            webViewHospital.loadUrl("https://drive.google.com/file/d/1KvqxfHzUzzbYvdr6497Oz_gIcJhFl4Nw/view?usp=sharing");
        }
        else if(t.equals("mymensingh")){
            webViewHospital.loadUrl("https://drive.google.com/file/d/1KvqxfHzUzzbYvdr6497Oz_gIcJhFl4Nw/view?usp=sharing");
        }
        else if(t.equals("chittagong")){
            webViewHospital.loadUrl("https://drive.google.com/file/d/1KvqxfHzUzzbYvdr6497Oz_gIcJhFl4Nw/view?usp=sharing");
        }
        else if(t.equals("khulna")){
            webViewHospital.loadUrl("https://drive.google.com/file/d/1KvqxfHzUzzbYvdr6497Oz_gIcJhFl4Nw/view?usp=sharing");
        }
        else if(t.equals("barisal")){
            webViewHospital.loadUrl("https://drive.google.com/file/d/1KvqxfHzUzzbYvdr6497Oz_gIcJhFl4Nw/view?usp=sharing");
        }
        else{
            webViewHospital.loadUrl("https://www.google.com/");
        }
    }
}