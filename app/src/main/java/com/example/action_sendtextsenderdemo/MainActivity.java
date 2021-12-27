package com.example.action_sendtextsenderdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSend(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        //intent.setType("message/rfc822");
        EditText et = findViewById(R.id.message);
        intent.putExtra(Intent.EXTRA_TEXT, et.getText().toString()); // key 통일 할 것
        Intent chooserIntent = Intent.createChooser(intent, null);
        startActivity(chooserIntent);
    }
}