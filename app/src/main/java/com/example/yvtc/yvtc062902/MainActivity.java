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
        MyClick cc = new MyClick();
        btn.setOnClickListener(cc);
    }
    class MyClick implements View.OnClickListener
    {
        @Override
        public void onClick(View v) {
            TextView tv = (TextView) findViewById(R.id.textView3);
            tv.setText("Hello World");
        }
    }
}

