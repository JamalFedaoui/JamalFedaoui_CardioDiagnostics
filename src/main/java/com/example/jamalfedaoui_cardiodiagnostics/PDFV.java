package com.example.jamalfedaoui_cardiodiagnostics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFV extends AppCompatActivity {

    PDFView myPDF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfv);

        String pdfName = getIntent().getStringExtra("pdfName");

        myPDF = (PDFView)findViewById(R.id.pdfView);

        String title = pdfName;

        myPDF.fromAsset(title).load();
    }
}
