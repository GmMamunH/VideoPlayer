package com.rsmdeveloper.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView pc;
    WebView webview;
    Button play,play2,play3,play4, play5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pc = findViewById(R.id.pc);
        webview = findViewById(R.id.webview);
        play = findViewById(R.id.play);
        play2 = findViewById(R.id.play2);
        play3 = findViewById(R.id.play3);
        play4 = findViewById(R.id.play4);
        play5 = findViewById(R.id.play5);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                pc.setVisibility(View.GONE);
                webview.setVisibility(View.VISIBLE);
                webview.getSettings().setJavaScriptEnabled(true);
                webview.loadUrl("https://www.youtube.com/embed/S5DrXDEEO-M");
            }
        });

        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pc.setVisibility(View.GONE);
                webview.setVisibility(View.VISIBLE);
                webview.getSettings().setJavaScriptEnabled(true);
                webview.loadUrl("https://www.youtube.com/embed/Xo1y1qlyxx8");
            }
        });

        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pc.setVisibility(View.GONE);
                webview.setVisibility(View.VISIBLE);
                webview.getSettings().setJavaScriptEnabled(true);
                webview.loadUrl("https://www.youtube.com/embed/POcoz3MLG9w");
            }
        });

        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pc.setVisibility(View.GONE);
                webview.setVisibility(View.VISIBLE);
                webview.getSettings().setJavaScriptEnabled(true);
                webview.loadUrl("https://www.youtube.com/embed/dQsEEZVkTlY");
            }
        });


        play5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pc.setVisibility(View.GONE);
                webview.setVisibility(View.VISIBLE);
                webview.getSettings().setJavaScriptEnabled(true);
                webview.loadUrl("https://www.youtube.com/embed/pRVpaR79X9Y");
            }
        });


    }
}