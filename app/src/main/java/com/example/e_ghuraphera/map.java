package com.example.e_ghuraphera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class map extends AppCompatActivity {

    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        String f=getIntent().getStringExtra("from");
        String t=getIntent().getStringExtra("to");
        webView = findViewById(R.id.Map);
        WebSettings websettings = webView.getSettings();
        websettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com/maps/dir/" + f + "/" +t);
        //Toast.makeText(map.this,"Error :"+ f,Toast.LENGTH_SHORT).show();
    }

}