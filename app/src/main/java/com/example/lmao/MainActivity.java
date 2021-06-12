package com.example.lmao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                int min = 0;
                int max = 1000;
                int b = (int)(Math.random()*(max-min+1)+min);
                String c = "";
                if (b < 6) {
                    c = "";

                }
                final TextView textViewToChange = (TextView) findViewById(R.id.textView);
                textViewToChange.setText((String.valueOf(b)));
            }
        });

    }
}