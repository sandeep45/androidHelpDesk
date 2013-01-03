package com.example.helpdesktest;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.*;
import android.webkit.*;

@SuppressLint("SetJavaScriptEnabled") public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        WebView myWebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();

        webSettings.setJavaScriptEnabled(true);
        //webSettings.setBuiltInZoomControls(true);
        
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://support.desk.com");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        
        return true;
    }
    
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
    	WebView myWebView = (WebView) findViewById(R.id.webview);
        if ((keyCode == KeyEvent.KEYCODE_BACK) && myWebView.canGoBack()) {
        	myWebView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    
}
