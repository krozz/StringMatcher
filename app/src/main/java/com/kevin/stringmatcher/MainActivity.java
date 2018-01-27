package com.kevin.stringmatcher;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mEditText;
    private EditText mEditText2;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText = (EditText) findViewById(R.id.first_edit_text);
        mEditText2 = (EditText) findViewById(R.id.second_edit_text);
        button = (Button) findViewById(R.id.button);


    }

    public void compareStrings(View view) {
        if(mEditText.getText().toString().equals(mEditText2.getText().toString())){
            Toast.makeText(this, "The texts are the same!", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "The texts are NOT the same!", Toast.LENGTH_SHORT).show();
        }

    }
}
