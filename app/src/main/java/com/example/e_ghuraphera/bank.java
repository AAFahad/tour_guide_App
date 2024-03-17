package com.example.e_ghuraphera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class bank extends AppCompatActivity {

    private WebView webViewBank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);

        webViewBank = findViewById(R.id.webViewBankId);
        WebSettings webSettings = webViewBank.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webViewBank.setWebViewClient(new WebViewClient());
        //webView.loadUrl("https://docs.google.com/document/d/172HO2UkY2FOfpq57WxA5TIHnKodcle0k6sEXfsWf7-o/edit?usp=sharing");

        link();
    }

    private void link() {
        String f=getIntent().getStringExtra("from").trim().toString().toLowerCase();
        String t=getIntent().getStringExtra("to").trim().toString().toLowerCase();
        //Toast.makeText(bank.this, "String.."+t, Toast.LENGTH_SHORT).show();


        if(t.equals("dhaka")) {
            webViewBank.loadUrl("https://drive.google.com/file/d/1SDjdGTw1-Rvsi4ZPoPD0El878cT0xhuV/view?usp=sharing");
        }
        else if(t.equals("sylhet")){
            webViewBank.loadUrl("https://drive.google.com/file/d/1SDjdGTw1-Rvsi4ZPoPD0El878cT0xhuV/view?usp=sharing");
        }
        else if(t.equals("rajshahi")){
            webViewBank.loadUrl("https://drive.google.com/file/d/1SDjdGTw1-Rvsi4ZPoPD0El878cT0xhuV/view?usp=sharing");
        }
        else if(t.equals("rangpur")){
            webViewBank.loadUrl("https://drive.google.com/file/d/1SDjdGTw1-Rvsi4ZPoPD0El878cT0xhuV/view?usp=sharing");
        }
        else if(t.equals("mymensingh")){
            webViewBank.loadUrl("https://drive.google.com/file/d/1SDjdGTw1-Rvsi4ZPoPD0El878cT0xhuV/view?usp=sharing");
        }
        else if(t.equals("chittagong")){
            webViewBank.loadUrl("https://drive.google.com/file/d/1SDjdGTw1-Rvsi4ZPoPD0El878cT0xhuV/view?usp=sharing");
        }
        else if(t.equals("khulna")){
            webViewBank.loadUrl("https://drive.google.com/file/d/1SDjdGTw1-Rvsi4ZPoPD0El878cT0xhuV/view?usp=sharing");
        }
        else if(t.equals("barisal")){
            webViewBank.loadUrl("https://drive.google.com/file/d/1SDjdGTw1-Rvsi4ZPoPD0El878cT0xhuV/view?usp=sharing");
        }
        else{
            webViewBank.loadUrl("https://www.google.com/");
        }
    }
}