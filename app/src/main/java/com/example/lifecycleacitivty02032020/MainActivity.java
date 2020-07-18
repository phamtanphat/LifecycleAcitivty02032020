package com.example.lifecycleacitivty02032020;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button mBtnNavigate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("BBB","onCreate Main1");
        mBtnNavigate = findViewById(R.id.buttonNavigateScreen2);

        mBtnNavigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","onStart Main1");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","onResume Main1");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","onPause Main1");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","onStop Main1");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","onRestart Main1");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","onDestroy Main1");
    }
}