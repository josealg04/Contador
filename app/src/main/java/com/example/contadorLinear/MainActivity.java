package com.example.contadorLinear;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int count;
    private TextView countTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countTv = findViewById(R.id.countTv);
    }

    public void showToast(View view){
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG);
        toast.show();
    }

    public void countUp(View view){
        count++;
        if(countTv != null)
            countTv.setText(Integer.toString(count));
    }

    public void reset(View view){
        count=0;
        countTv.setText(Integer.toString(count));
    }
}
