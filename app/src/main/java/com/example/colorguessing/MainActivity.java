package com.example.colorguessing;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String chosenColor = randomColor();
    int score = 0;

    public String randomColor() {
        String[] colors = {"Red", "Blue", "Green", "Yellow"};
        int min = 0;
        int max = 4;
        int i = (int)Math.floor(Math.random()*(max-min+1)+min);
        return colors[i];
    }

    public void checkRed(View view) {
        TextView scoreView = findViewById(R.id.score);

        if(chosenColor.equals("Red")) {
            Toast.makeText(this, "That's Correct!", Toast.LENGTH_SHORT).show();
            //change the color and increase score
            chosenColor = randomColor();
            score++;
        } else {
            Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
        }
        scoreView.setText("Score: " + score);
    }

    public void checkBlue(View view) {
        TextView scoreView = findViewById(R.id.score);

        if(chosenColor.equals("Blue")) {
            Toast.makeText(this, "That's Correct!", Toast.LENGTH_SHORT).show();
            //change the color and increase score
            chosenColor = randomColor();
            score++;
        } else {
            Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
        }
        scoreView.setText("Score: " + score);
    }

    public void checkGreen(View view) {
        TextView scoreView = findViewById(R.id.score);

        if(chosenColor.equals("Green")) {
            Toast.makeText(this, "That's Correct!", Toast.LENGTH_SHORT).show();
            //change the color and increase score
            chosenColor = randomColor();
            score++;
        } else {
            Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
        }
        scoreView.setText("Score: " + score);
    }

    public void checkYellow(View view) {
        TextView scoreView = findViewById(R.id.score);

        if(chosenColor.equals("Yellow")) {
            Toast.makeText(this, "That's Correct!", Toast.LENGTH_SHORT).show();
            //change the color and increase score
            chosenColor = randomColor();
            score++;
        } else {
            Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
        }
        scoreView.setText("Score: " + score);
    }

}