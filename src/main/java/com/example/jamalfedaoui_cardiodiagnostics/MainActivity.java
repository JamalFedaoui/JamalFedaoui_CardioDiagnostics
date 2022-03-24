package com.example.jamalfedaoui_cardiodiagnostics;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private int counter = 0;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView)findViewById(R.id.txtRelative)).setText("Start Working on yourself!");

        progressBar = findViewById(R.id.progressBar3);

        String firstName = getIntent().getStringExtra("FirstName");
        String lastName = getIntent().getStringExtra("LastName");
        Toast.makeText(this, "Welcome " + firstName + " " + lastName, Toast.LENGTH_LONG).show();
    }

    public void Article2(View v){
        counter = counter +10;
        progressBar.setProgress(counter);
        progressBar.setMax(100);
        if(counter>=25 && counter<50){
            ((TextView)findViewById(R.id.txtRelative)).setText("Keep up the good work!");
        }
        if(counter>=50 && counter<75){
            ((TextView)findViewById(R.id.txtRelative)).setText("More than halfway there!");
        }
        if(counter>=75){
            ((TextView)findViewById(R.id.txtRelative)).setText("Great Job!");
        }
        Intent i = new Intent(this, PDFV.class);
        i.putExtra("pdfName", "howbloodpressureworks.pdf");
        startActivity(i);
    }

    public void Article3(View v){
        counter = counter +10;
        progressBar.setProgress(counter);
        progressBar.setMax(100);
        if(counter>=25 && counter<50){
            ((TextView)findViewById(R.id.txtRelative)).setText("Keep up the good work!");
        }
        if(counter>=50 && counter<75){
            ((TextView)findViewById(R.id.txtRelative)).setText("More than halfway there!");
        }
        if(counter>=75){
            ((TextView)findViewById(R.id.txtRelative)).setText("Great Job!");
        }
        Intent i = new Intent(this, PDFV.class);
        i.putExtra("pdfName", "Understanding-Blood-Pressure-.pdf");
        startActivity(i);
    }

    public void Article4(View v){
        counter = counter +10;
        progressBar.setProgress(counter);
        progressBar.setMax(100);
        if(counter>=25 && counter<50){
            ((TextView)findViewById(R.id.txtRelative)).setText("Keep up the good work!");
        }
        if(counter>=50 && counter<75){
            ((TextView)findViewById(R.id.txtRelative)).setText("More than halfway there!");
        }
        if(counter>=75){
            ((TextView)findViewById(R.id.txtRelative)).setText("Great Job!");
        }
        Intent i = new Intent(this, PDFV.class);
        i.putExtra("pdfName", "hbp_low.pdf");
        startActivity(i);
    }

    public void Article5(View v){
        counter = counter +10;
        progressBar.setProgress(counter);
        progressBar.setMax(100);
        if(counter>=25 && counter<50){
            ((TextView)findViewById(R.id.txtRelative)).setText("Keep up the good work!");
        }
        if(counter>=50 && counter<75){
            ((TextView)findViewById(R.id.txtRelative)).setText("More than halfway there!");
        }
        if(counter>=75){
            ((TextView)findViewById(R.id.txtRelative)).setText("Great Job!");
        }
        Intent i = new Intent(this, YoutubePlayer.class);
        i.putExtra("vidCode", "Ab9OZsDECZw");
        startActivity(i);
    }

    public void Article6(View v){
        counter = counter +10;
        progressBar.setProgress(counter);
        progressBar.setMax(100);
        if(counter>=25 && counter<50){
            ((TextView)findViewById(R.id.txtRelative)).setText("Keep up the good work!");
        }
        if(counter>=50 && counter<75){
            ((TextView)findViewById(R.id.txtRelative)).setText("More than halfway there!");
        }
        if(counter>=75){
            ((TextView)findViewById(R.id.txtRelative)).setText("Great Job!");
        }
        Intent i = new Intent(this, YoutubePlayer.class);
        i.putExtra("vidCode", "eVBD7TQLS-E");
        startActivity(i);
    }

    public void Article7(View v){
        counter = counter +10;
        progressBar.setProgress(counter);
        progressBar.setMax(100);
        if(counter>=25 && counter<50){
            ((TextView)findViewById(R.id.txtRelative)).setText("Keep up the good work!");
        }
        if(counter>=50 && counter<75){
            ((TextView)findViewById(R.id.txtRelative)).setText("More than halfway there!");
        }
        if(counter>=75){
            ((TextView)findViewById(R.id.txtRelative)).setText("Great Job!");
        }
        Intent i = new Intent(this, YoutubePlayer.class);
        i.putExtra("vidCode", "u8mHxRfevY4");
        startActivity(i);
    }

}
