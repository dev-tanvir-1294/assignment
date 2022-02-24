package com.example.myyoutube;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment {


    private String webUrl = "https://mlwbd.top/";





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank, container, false);
       WebView webView = v.findViewById(R.id.web);
       webView.loadUrl(webUrl);

       WebSettings WebSwtting = webView.getSettings();
       WebSwtting.setJavaScriptEnabled(true);
       webView.setWebViewClient(new WebViewClient());


        return v;
    }
}