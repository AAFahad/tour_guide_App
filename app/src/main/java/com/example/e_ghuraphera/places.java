package com.example.e_ghuraphera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class places extends AppCompatActivity {

    private WebView webViewPlaces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        webViewPlaces = findViewById(R.id.webViewPlacesId);
        WebSettings webSettings = webViewPlaces.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webViewPlaces.setWebViewClient(new WebViewClient());
        //webView.loadUrl("https://docs.google.com/document/d/172HO2UkY2FOfpq57WxA5TIHnKodcle0k6sEXfsWf7-o/edit?usp=sharing");

        link();
    }

    private void link() {
        String f=getIntent().getStringExtra("from").trim().toString().toLowerCase();
        String t=getIntent().getStringExtra("to").trim().toString().toLowerCase();
        //Toast.makeText(places.this, "String.."+t, Toast.LENGTH_SHORT).show();


        if(t.equals("dhaka")) {
            webViewPlaces.loadUrl("https://drive.google.com/file/d/1hNoMw167GyR6Kly6demf2hO_rHFVsEmu/view?usp=sharing");
        }
        else if(t.equals("sylhet")){
            webViewPlaces.loadUrl("https://drive.google.com/file/d/1FFicakhIOE78rY2mpV3qIGfuVPFIn7O6/view?usp=sharing");
        }
        else if(t.equals("rajshahi")){
            webViewPlaces.loadUrl("https://drive.google.com/file/d/1qZqU1Fhc7T1gQdww0GMZ8JBkBRqzZus6/view?usp=sharing");
        }
        else if(t.equals("rangpur")){
            webViewPlaces.loadUrl("https://drive.google.com/file/d/1MOS9gQi8tgQGiL7FA8S0mz2ooe4FojJH/view?usp=sharing");
        }
        else if(t.equals("mymensingh")){
            webViewPlaces.loadUrl("https://drive.google.com/file/d/1BLrcgZeEHItmrikC0iGdLKzfHy4C6YJR/view?usp=sharing");
        }
        else if(t.equals("chittagong")){
            webViewPlaces.loadUrl("https://drive.google.com/file/d/1S6wGqrcewgwNhIoDUz4PMItQx6DMqfug/view?usp=sharing");
        }
        else if(t.equals("khulna")){
            webViewPlaces.loadUrl("https://drive.google.com/file/d/1bO7Wd-ZVo4EKQk6nRRCbqG25UMwSKu49/view?usp=sharing");
        }
        else if(t.equals("barisal")){
            webViewPlaces.loadUrl("https://drive.google.com/file/d/1Oll4TkSt77J-wVDQm2ymj8rTiYpnp6dI/view?usp=sharing");
        }
        else{
            webViewPlaces.loadUrl("https://www.google.com/");
        }
    }
}