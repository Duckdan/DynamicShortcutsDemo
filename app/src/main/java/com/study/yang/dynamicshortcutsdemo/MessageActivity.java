package com.study.yang.dynamicshortcutsdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        TextView tvMessage = (TextView) findViewById(R.id.tv_message);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("message");
        tvMessage.setText(msg);
    }
}
