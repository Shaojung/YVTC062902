package com.example.yvtc.yvtc062902;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.textView3);
                tv.setText("Hello World");
            }
        });
    }
    public void click1(View v) {
        TextView tv = (TextView) findViewById(R.id.textView5);
        tv.setText(((TextView) v).getText().toString());
    }

}

