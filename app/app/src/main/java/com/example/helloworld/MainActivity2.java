package com.example.helloworld;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    private Button button2;
    public ImageView imageViewPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageViewPhoto = (ImageView)findViewById(R.id.imageView);
        Bundle extras = getIntent().getExtras();
        String message = extras.getString("SelectedRadioButton");
        switch (message){
            case "1":
                imageViewPhoto.setImageResource(R.drawable.inbox);
                break;

            case "2":
                imageViewPhoto.setImageResource(R.drawable.sent);
                break;
        }

button2 = (Button) findViewById(R.id.button2);
button2.setOnClickListener(new View.OnClickListener() {
    @Override
            public void onClick (View v) {
        openMainActivity ();
            }
        });
}

public void openMainActivity() {
    Intent intent = new Intent ( this , MainActivity.class);
    startActivity(intent);
}
}