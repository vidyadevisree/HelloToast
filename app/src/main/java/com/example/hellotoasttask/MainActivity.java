package com.example.hellotoasttask;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView mtextView;
    int count = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtextView = findViewById(R.id.tv);
        if (savedInstanceState != null && savedInstanceState.containsKey("ap")) {
            count = savedInstanceState.getInt("ap");
        }
    }

    public void showToast(View view){
             Toast.makeText(this,"YourCount is"+ count++ , Toast.LENGTH_SHORT).show();
        }
    }

    public void showCount(View view) {
        count++;
        mtextView.setText(String.valueOf(count));

    }


    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("ap", count);
    }
}