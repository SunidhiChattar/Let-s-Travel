package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView str1;
    TextView str2;
    TextView str3;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_2);

        str1 = findViewById(R.id.str1);
        str2 = findViewById(R.id.str2);
        str3 = findViewById(R.id.str3);

        str1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.yatra.com/international-tour-packages/holidays-in-dubai");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        }));

        str2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.yatra.com/international-tour-packages/holidays-in-egypt");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        }));

        str3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.yatra.com/international-tour-packages/holidays-in-bangladesh");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        }));


        TextView button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) { openMainActivity3();

            }
        });
        TextView buton = findViewById(R.id.back);
        buton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) { openMainActivity();

            }
        });
    }
    public void openMainActivity3( ) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void openMainActivity( ) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
