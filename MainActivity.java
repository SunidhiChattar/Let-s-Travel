package com.example.intent;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_1);

        TextView button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) { openMainActivity2();

            }
        });
        TextView flight = findViewById(R.id.flight);
        flight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity4();
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

    public void openMainActivity2( ) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void openMainActivity4( ) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

}
