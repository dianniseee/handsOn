package com.example.handson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText words;
    Button btn;
    String res = "";
    String word_sentence[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        words = findViewById(R.id.words);
        btn = findViewById(R.id.btn_res);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                word_sentence = words.getText().toString().split(" ");

                for(int i = 0; i< word_sentence.length; i++) {
                    for(int j = i+1; j< word_sentence.length; j++) {
                        if(word_sentence[i].equals(word_sentence[j])) {
                            word_sentence[j] = "x";
                        }
                    }
                }

                for(String word: word_sentence) {
                    if(word != "x") {
                        res = res + word + " ";
                    }
                }

                Intent intent=new Intent(MainActivity.this,res.class);
                intent.putExtra("key", res);
                startActivity(intent);
            }
        });
    }
}
