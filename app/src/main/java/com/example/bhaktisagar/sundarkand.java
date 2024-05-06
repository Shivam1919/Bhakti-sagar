package com.example.bhaktisagar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class sundarkand extends AppCompatActivity {
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sundarkand);
        webview = findViewById(R.id.web);
        webview.loadUrl("file:///android_asset/sundarkand.html");
    }
}