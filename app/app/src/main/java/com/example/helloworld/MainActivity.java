package com.example.helloworld;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    private Button button;
    public RadioGroup radioGroup;
    public String id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById (R.id.button);

        radioGroup = findViewById(R.id.radioGroupId);
        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            switch (checkedId) {
                case R.id.radioButton:
                    id = "radioButton1";
                    break;

                case R.id.radioButton2:
                    id = "radioButton2";
                    break;
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity2();
            }
        });
}

public void openMainActivity2() {
        Intent intent = new Intent( this, MainActivity2.class);
        intent.putExtra ( "SelectedRadioButton", id);
        startActivity(intent);
    }
}