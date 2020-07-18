package com.example.lifecycleacitivty02032020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button mBtnNavigate1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d("BBB","onCreate Main3");

        mBtnNavigate1 = findViewById(R.id.buttonNavigateScreen1);
        mBtnNavigate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","onStart Main3");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","onResume Main3");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","onPause Main3");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","onStop Main3");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","onRestart Main3");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","onDestroy Main3");
    }
}