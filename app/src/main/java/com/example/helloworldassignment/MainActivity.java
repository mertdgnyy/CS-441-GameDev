package com.example.helloworldassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView helloText;
    Button button1;
    Button button2;
    LinearLayout layout;

    int counter = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloText = (TextView) findViewById(R.id.hello_text);
        button1 = (Button) findViewById(R.id.button1);
        layout = (LinearLayout) findViewById(R.id.LinearLayoutID);
        button2 = (Button) findViewById(R.id.button2);
    }

    public void onButtonClick(View arg0){
        if (arg0 == button1) {
            counter++;
            helloText.setTextSize(23);
            helloText.setTextColor(Color.GREEN);
            button1.setBackgroundColor(Color.BLACK);
            helloText.setText("I'm sending your photo to FBI. Are you still willing to do this? ");
            button1.setText("(Go ahead...)");
            layout.setBackgroundResource(R.drawable.kangroo);
            if (counter == 3) {
                String url = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        }
        if (arg0 == button2){
            finish();
            System.exit(0);
        }

    }


}