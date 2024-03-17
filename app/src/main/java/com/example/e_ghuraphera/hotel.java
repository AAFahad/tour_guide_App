package com.example.e_ghuraphera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class hotel extends AppCompatActivity {

    private WebView webViewHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        webViewHotel = findViewById(R.id.webViewHotelId);
        WebSettings webSettings = webViewHotel.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webViewHotel.setWebViewClient(new WebViewClient());
        //webView.loadUrl("https://docs.google.com/document/d/172HO2UkY2FOfpq57WxA5TIHnKodcle0k6sEXfsWf7-o/edit?usp=sharing");

        link();
    }

    private void link() {
        String f=getIntent().getStringExtra("from").trim().toString().toLowerCase();
        String t=getIntent().getStringExtra("to").trim().toString().toLowerCase();
        //Toast.makeText(hotel.this, "String.."+t, Toast.LENGTH_SHORT).show();


        if(t.equals("dhaka")) {
            webViewHotel.loadUrl("https://drive.google.com/file/d/1XeQbtb2UrKP8iDdx5Bfq2R1F-DqsfyOY/view?usp=sharing");
        }
        else if(t.equals("sylhet")){
            webViewHotel.loadUrl("https://drive.google.com/file/d/17_-opGCKpRY_0-CAaz_sFeIIAoPWVU-w/view?usp=sharing");
        }
        else if(t.equals("rajshahi")){
            webViewHotel.loadUrl("https://drive.google.com/file/d/1hgwX7DLC1igGwx60Njdec_ND3G80S5IR/view?usp=sharing");
        }
        else if(t.equals("rangpur")){
            webViewHotel.loadUrl("https://drive.google.com/file/d/1ssaLJoeSNMUBum4VuV-8ynuniaId7Fmk/view?usp=sharing");
        }
        else if(t.equals("mymensingh")){
            webViewHotel.loadUrl("https://drive.google.com/file/d/1dPulDmLwzkfCT-97vYYIKi2MFB86FiHv/view?usp=sharing");
        }
        else if(t.equals("chittagong")){
            webViewHotel.loadUrl("https://drive.google.com/file/d/1a3DlPGW--bNTzQ0ncoq98UHuwi3p4BZ8/view?usp=sharing");
        }
        else if(t.equals("khulna")){
            webViewHotel.loadUrl("https://drive.google.com/file/d/1tM94IWDtYKAe4BD-1IkrYRgF7jcsJ7d-/view?usp=sharing");
        }
        else if(t.equals("barisal")){
            webViewHotel.loadUrl("https://drive.google.com/file/d/100RAoP1wZumO5xlOcN7ux5HoaYDfrPCt/view?usp=sharing");
        }
        else{
            webViewHotel.loadUrl("https://www.google.com/");
        }
    }
}