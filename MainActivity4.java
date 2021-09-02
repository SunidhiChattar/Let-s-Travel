package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    ImageView yatra;
    ImageView manawa;
    ImageView thrill;
    ImageView klook;
    TextView credit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_4);

yatra = findViewById(R.id.yatra);
manawa = findViewById(R.id.manawa);
thrill = findViewById(R.id.thrill);
klook = findViewById(R.id.klook);
credit = findViewById(R.id.credit);

        yatra.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.yatra.com/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        }));

        manawa.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.manawa.com/en-GB/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }


        }));
        thrill.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.thrillophilia.com/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        }));

        klook.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) { gotoUrl("https://www.klook.com/en-IN/");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }


        }));
        credit.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("mailto:chattarsunidhi@gmail.com");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        }));


        TextView button = findViewById(R.id.back);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) { openMainActivity3();

            }
        });

        TextView buton = findViewById(R.id.home);
        buton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) { openMainActivity();

            }
        });
        TextView exit = findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
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
