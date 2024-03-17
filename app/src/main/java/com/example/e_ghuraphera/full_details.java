package com.example.e_ghuraphera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class full_details extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_details);


        webView = findViewById(R.id.needPage);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        //webView.loadUrl("https://docs.google.com/document/d/172HO2UkY2FOfpq57WxA5TIHnKodcle0k6sEXfsWf7-o/edit?usp=sharing");

        link();

    }

    private void link() {
        String f=getIntent().getStringExtra("from").trim().toString().toLowerCase();
        String t=getIntent().getStringExtra("to").trim().toString().toLowerCase();
        //Toast.makeText(full_details.this, "String.."+t, Toast.LENGTH_SHORT).show();

        // Dhaka
        if(f.equals("dhaka") && t.equals("sylhet")) {
            webView.loadUrl("https://drive.google.com/file/d/1SKVZtWwpA5z4LNHg1mCuyA9DBB8bE4Rl/view?usp=sharing");
        }
        else if(f.equals("dhaka") && t.equals("rajshahi")){
            webView.loadUrl("https://drive.google.com/file/d/18Xbn7uBG9ViJJszoyunmFt3AVeODz_Er/view?usp=sharing");
        }
        else if(f.equals("dhaka") && t.equals("rangpur")){
            webView.loadUrl("https://drive.google.com/file/d/18Xbn7uBG9ViJJszoyunmFt3AVeODz_Er/view?usp=sharing");
        }
        else if(f.equals("dhaka") && t.equals("mymensingh")){
            webView.loadUrl("https://drive.google.com/file/d/18Xbn7uBG9ViJJszoyunmFt3AVeODz_Er/view?usp=sharing");
        }
        else if(f.equals("dhaka") && t.equals("chittagong")){
            webView.loadUrl("https://drive.google.com/file/d/18Xbn7uBG9ViJJszoyunmFt3AVeODz_Er/view?usp=sharing");
        }
        else if(f.equals("dhaka") && t.equals("khulna")){
            webView.loadUrl("https://drive.google.com/file/d/18Xbn7uBG9ViJJszoyunmFt3AVeODz_Er/view?usp=sharing");
        }
        else if(f.equals("dhaka") && t.equals("barisal")){
            webView.loadUrl("https://drive.google.com/file/d/18Xbn7uBG9ViJJszoyunmFt3AVeODz_Er/view?usp=sharing");
        }


        // Sylhet
        else if(f.equals("sylhet") && t.equals("dhaka")) {
            webView.loadUrl("https://drive.google.com/file/d/1xO1OYE_zGyTwhpTgW02H8JoBrvpnKls5/view?usp=sharing");
        }
        else if(f.equals("sylhet") && t.equals("rajshahi")){
            webView.loadUrl("https://drive.google.com/file/d/1xO1OYE_zGyTwhpTgW02H8JoBrvpnKls5/view?usp=sharing");
        }
        else if(f.equals("sylhet") && t.equals("rangpur")){
            webView.loadUrl("https://drive.google.com/file/d/1xO1OYE_zGyTwhpTgW02H8JoBrvpnKls5/view?usp=sharing");
        }
        else if(f.equals("sylhet") && t.equals("mymensingh")){
            webView.loadUrl("https://drive.google.com/file/d/1xO1OYE_zGyTwhpTgW02H8JoBrvpnKls5/view?usp=sharing");
        }
        else if(f.equals("sylhet") && t.equals("chittagong")){
            webView.loadUrl("https://drive.google.com/file/d/1xO1OYE_zGyTwhpTgW02H8JoBrvpnKls5/view?usp=sharing");
        }
        else if(f.equals("sylhet") && t.equals("khulna")){
            webView.loadUrl("https://drive.google.com/file/d/1xO1OYE_zGyTwhpTgW02H8JoBrvpnKls5/view?usp=sharing");
        }
        else if(f.equals("sylhet") && t.equals("barisal")){
            webView.loadUrl("https://drive.google.com/file/d/1xO1OYE_zGyTwhpTgW02H8JoBrvpnKls5/view?usp=sharing");
        }


        // Rajshahi
        else if(f.equals("rajshahi") && t.equals("dhaka")) {
            webView.loadUrl("https://drive.google.com/file/d/1_D4rtUbbm8qG_BBasA4lg1uXbjPJCUEo/view?usp=sharing");
        }
        else if(f.equals("rajshahi") && t.equals("sylhet")){
            webView.loadUrl("https://drive.google.com/file/d/1_D4rtUbbm8qG_BBasA4lg1uXbjPJCUEo/view?usp=sharing");
        }
        else if(f.equals("rajshahi") && t.equals("rangpur")){
            webView.loadUrl("https://drive.google.com/file/d/1_D4rtUbbm8qG_BBasA4lg1uXbjPJCUEo/view?usp=sharing");
        }
        else if(f.equals("rajshahi") && t.equals("mymensingh")){
            webView.loadUrl("https://drive.google.com/file/d/1_D4rtUbbm8qG_BBasA4lg1uXbjPJCUEo/view?usp=sharing");
        }
        else if(f.equals("rajshahi") && t.equals("chittagong")){
            webView.loadUrl("https://drive.google.com/file/d/1_D4rtUbbm8qG_BBasA4lg1uXbjPJCUEo/view?usp=sharing");
        }
        else if(f.equals("rajshahi") && t.equals("khulna")){
            webView.loadUrl("https://drive.google.com/file/d/1_D4rtUbbm8qG_BBasA4lg1uXbjPJCUEo/view?usp=sharing");
        }
        else if(f.equals("rajshahi") && t.equals("barisal")){
            webView.loadUrl("https://drive.google.com/file/d/1_D4rtUbbm8qG_BBasA4lg1uXbjPJCUEo/view?usp=sharing");
        }

        // Rangpur
        else if(f.equals("rangpur") && t.equals("dhaka")) {
            webView.loadUrl("https://drive.google.com/file/d/1JnjciU5_zsJ_oSNU7LLqACgXAcNZIugd/view?usp=sharing");
        }
        else if(f.equals("rangpur") && t.equals("sylhet")){
            webView.loadUrl("https://drive.google.com/file/d/1JnjciU5_zsJ_oSNU7LLqACgXAcNZIugd/view?usp=sharing");
        }
        else if(f.equals("rangpur") && t.equals("rajshahi")){
            webView.loadUrl("https://drive.google.com/file/d/1JnjciU5_zsJ_oSNU7LLqACgXAcNZIugd/view?usp=sharing");
        }
        else if(f.equals("rangpur") && t.equals("mymensingh")){
            webView.loadUrl("https://drive.google.com/file/d/1JnjciU5_zsJ_oSNU7LLqACgXAcNZIugd/view?usp=sharing");
        }
        else if(f.equals("rangpur") && t.equals("chittagong")){
            webView.loadUrl("https://drive.google.com/file/d/1JnjciU5_zsJ_oSNU7LLqACgXAcNZIugd/view?usp=sharing");
        }
        else if(f.equals("rangpur") && t.equals("khulna")){
            webView.loadUrl("https://drive.google.com/file/d/1JnjciU5_zsJ_oSNU7LLqACgXAcNZIugd/view?usp=sharing");
        }
        else if(f.equals("rangpur") && t.equals("barisal")){
            webView.loadUrl("https://drive.google.com/file/d/1JnjciU5_zsJ_oSNU7LLqACgXAcNZIugd/view?usp=sharing");
        }


        // Mymensingh
        else if(f.equals("mymensingh") && t.equals("dhaka")) {
            webView.loadUrl("https://drive.google.com/file/d/1LLvZoNPW6AxQReYlbsTP6OVS56VdkdKf/view?usp=sharing");
        }
        else if(f.equals("mymensingh") && t.equals("sylhet")){
            webView.loadUrl("https://drive.google.com/file/d/1LLvZoNPW6AxQReYlbsTP6OVS56VdkdKf/view?usp=sharing");
        }
        else if(f.equals("mymensingh") && t.equals("rajshahi")){
            webView.loadUrl("https://drive.google.com/file/d/1LLvZoNPW6AxQReYlbsTP6OVS56VdkdKf/view?usp=sharing");
        }
        else if(f.equals("mymensingh") && t.equals("rangpur")){
            webView.loadUrl("https://drive.google.com/file/d/1LLvZoNPW6AxQReYlbsTP6OVS56VdkdKf/view?usp=sharing");
        }
        else if(f.equals("mymensingh") && t.equals("chittagong")){
            webView.loadUrl("https://drive.google.com/file/d/1LLvZoNPW6AxQReYlbsTP6OVS56VdkdKf/view?usp=sharing");
        }
        else if(f.equals("mymensingh") && t.equals("khulna")){
            webView.loadUrl("https://drive.google.com/file/d/1LLvZoNPW6AxQReYlbsTP6OVS56VdkdKf/view?usp=sharing");
        }
        else if(f.equals("mymensingh") && t.equals("barisal")){
            webView.loadUrl("https://drive.google.com/file/d/1LLvZoNPW6AxQReYlbsTP6OVS56VdkdKf/view?usp=sharing");
        }


        //Chittagong
        else if(f.equals("chittagong") && t.equals("dhaka")) {
            webView.loadUrl("https://drive.google.com/file/d/1UqyBRhkSPYTDRz0c8HWvHqYC2cY6Fffj/view?usp=sharing");
        }
        else if(f.equals("chittagong") && t.equals("sylhet")){
            webView.loadUrl("https://drive.google.com/file/d/1UqyBRhkSPYTDRz0c8HWvHqYC2cY6Fffj/view?usp=sharing");
        }
        else if(f.equals("chittagong") && t.equals("rajshahi")){
            webView.loadUrl("https://drive.google.com/file/d/1UqyBRhkSPYTDRz0c8HWvHqYC2cY6Fffj/view?usp=sharing");
        }
        else if(f.equals("chittagong") && t.equals("rangpur")){
            webView.loadUrl("https://drive.google.com/file/d/1UqyBRhkSPYTDRz0c8HWvHqYC2cY6Fffj/view?usp=sharing");
        }
        else if(f.equals("chittagong") && t.equals("mymensingh")){
            webView.loadUrl("https://drive.google.com/file/d/1UqyBRhkSPYTDRz0c8HWvHqYC2cY6Fffj/view?usp=sharing");
        }
        else if(f.equals("chittagong") && t.equals("khulna")){
            webView.loadUrl("https://drive.google.com/file/d/1UqyBRhkSPYTDRz0c8HWvHqYC2cY6Fffj/view?usp=sharing");
        }
        else if(f.equals("chittagong") && t.equals("barisal")){
            webView.loadUrl("https://drive.google.com/file/d/1UqyBRhkSPYTDRz0c8HWvHqYC2cY6Fffj/view?usp=sharing");
        }


        // Khulna
        else if(f.equals("khulna") && t.equals("dhaka")) {
            webView.loadUrl("https://drive.google.com/file/d/1dfKfeFDVxfZLNpE_Pgh-H2kg5s1rZ0ud/view?usp=sharing");
        }
        else if(f.equals("khulna") && t.equals("sylhet")){
            webView.loadUrl("https://drive.google.com/file/d/1dfKfeFDVxfZLNpE_Pgh-H2kg5s1rZ0ud/view?usp=sharing");
        }
        else if(f.equals("khulna") && t.equals("rajshahi")){
            webView.loadUrl("https://drive.google.com/file/d/1dfKfeFDVxfZLNpE_Pgh-H2kg5s1rZ0ud/view?usp=sharing");
        }
        else if(f.equals("khulna") && t.equals("rangpur")){
            webView.loadUrl("https://drive.google.com/file/d/1dfKfeFDVxfZLNpE_Pgh-H2kg5s1rZ0ud/view?usp=sharing");
        }
        else if(f.equals("khulna") && t.equals("mymensingh")){
            webView.loadUrl("https://drive.google.com/file/d/1dfKfeFDVxfZLNpE_Pgh-H2kg5s1rZ0ud/view?usp=sharing");
        }
        else if(f.equals("khulna") && t.equals("chittagong")){
            webView.loadUrl("https://drive.google.com/file/d/1dfKfeFDVxfZLNpE_Pgh-H2kg5s1rZ0ud/view?usp=sharing");
        }
        else if(f.equals("khulna") && t.equals("barisal")){
            webView.loadUrl("https://drive.google.com/file/d/1dfKfeFDVxfZLNpE_Pgh-H2kg5s1rZ0ud/view?usp=sharing");
        }



        // Barisal
        else if(f.equals("barisal") && t.equals("dhaka")) {
            webView.loadUrl("https://drive.google.com/file/d/1d9yi3UzRNPw7BgsvScgKnnIKsl_qTijl/view?usp=sharing");
        }
        else if(f.equals("barisal") && t.equals("sylhet")){
            webView.loadUrl("https://drive.google.com/file/d/1d9yi3UzRNPw7BgsvScgKnnIKsl_qTijl/view?usp=sharing");
        }
        else if(f.equals("barisal") && t.equals("rajshahi")){
            webView.loadUrl("https://drive.google.com/file/d/1d9yi3UzRNPw7BgsvScgKnnIKsl_qTijl/view?usp=sharing");
        }
        else if(f.equals("barisal") && t.equals("rangpur")){
            webView.loadUrl("https://drive.google.com/file/d/1d9yi3UzRNPw7BgsvScgKnnIKsl_qTijl/view?usp=sharing");
        }
        else if(f.equals("barisal") && t.equals("mymensingh")){
            webView.loadUrl("https://drive.google.com/file/d/1d9yi3UzRNPw7BgsvScgKnnIKsl_qTijl/view?usp=sharing");
        }
        else if(f.equals("barisal") && t.equals("chittagong")){
            webView.loadUrl("https://drive.google.com/file/d/1d9yi3UzRNPw7BgsvScgKnnIKsl_qTijl/view?usp=sharing");
        }
        else if(f.equals("barisal") && t.equals("khulna")){
            webView.loadUrl("https://drive.google.com/file/d/1d9yi3UzRNPw7BgsvScgKnnIKsl_qTijl/view?usp=sharing");
        }

        else
            webView.loadUrl("https://www.google.com/");
    }
}