
package com.programmerworld.custombrowserapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
        editText = findViewById(R.id.editText);
        webView.setWebViewClient(new WebViewClient());
    }

    public void buttonGO_Browse(View view){
        String stringURL = editText.getText().toString();
        stringURL = "https://www."+stringURL;

        webView.loadUrl(stringURL);
    }
}