package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button RollButton;
        RollButton=(Button) findViewById(R.id.RollButton);

        final ImageView LeftDice= (ImageView) findViewById(R.id.image_leftdice);
        final ImageView RightDice= (ImageView) findViewById(R.id.image_rightdice);

        final int DiceArray[]={R.drawable.dice1,
                        R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        RollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Dicee","The button Has been pressed");


                Random RandomNumberGenerator=new Random();

                int number=RandomNumberGenerator.nextInt(6);
                int number2=RandomNumberGenerator.nextInt(6);
                Log.d("dicee","The Random Number is "+number);
                Log.d("dicee","The Random Number is "+number2);

                LeftDice.setImageResource(DiceArray[number]);
                RightDice.setImageResource(DiceArray[number2]);

            }
        });




    }
}
