package com.example.helloworldassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView helloText;
    Button helloButton;
    //ImageView backGround;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloText = (TextView) findViewById(R.id.hello_text);
        helloButton = (Button) findViewById(R.id.hello_button);
        //backGround = (ImageView) findViewById(R.id.back_ground);
        layout = (LinearLayout) findViewById(R.id.LinearLayoutID);
    }

    public void onButtonClick(View view){
        helloText.setTextSize(23);
        helloText.setTextColor(Color.BLACK);
        helloText.setText("i'm sending your photo to FBI. Are you still willing to do this? ");
        helloButton.setText("Go ahead...");
        layout.setBackgroundResource(R.drawable.kangroo);
        //helloText.setHint((50));

    }

}