package com.example.antora.ridingpritilota;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class RatingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

       PDFView pdfView = (PDFView) findViewById(R.id.pdfView);

       pdfView.fromAsset("welcome.pdf").load();
    }
}
