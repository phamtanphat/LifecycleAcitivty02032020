package com.example.lifecycleacitivty02032020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button mBtnNavigate3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("BBB","onCreate Main2");
        mBtnNavigate3 = findViewById(R.id.buttonNavigateScreen3);


        mBtnNavigate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","onStart Main2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","onResume Main2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","onPause Main2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","onStop Main2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","onRestart Main2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","onDestroy Main2");
    }
}