package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView balldisplay = (ImageView) findViewById(R.id.image_eightball);
        final int[] ballarray = new int[]
                { R.drawable.ball1,
                        R.drawable.ball2,
                        R.drawable.ball3,
                        R.drawable.ball4,
                        R.drawable.ball5};

        final Button myButton = (Button) findViewById(R.id.askbutton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomnumbergenerator = new Random();
                int number = randomnumbergenerator.nextInt(5);
                int imageResourceId = ballarray[number];
                balldisplay.setImageResource(imageResourceId);
            }
        });

    }
}
