package com.example.bhaktisagar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class aarti extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aarti);
        webView = findViewById(R.id.webview);
        webView.loadUrl("file:///android_asset/aarti.html");
    }
}