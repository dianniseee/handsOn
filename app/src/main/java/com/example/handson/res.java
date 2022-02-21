package com.example.handson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class res extends AppCompatActivity {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res);

        result = findViewById(R.id.tv_result);

        Bundle b = new Bundle();
        b = getIntent().getExtras();
        result.setText(null);
        result.setText(b.getString("key"));
    }

    @Override
    public void onBackPressed(){
        Intent intent=new Intent(res.this,MainActivity.class);
        startActivity(intent);
    }
}