package com.example.android.chefsquiz;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.chefsquiz.R.id.Q5A1;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    int guesses = 0;
    int checkbox = 0;
    boolean Q1Ans1 = true;
    boolean Q1Ans2 = false;
    boolean Q1Ans3 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // First question - Correct answer

    public void Q1A1(View view) {
        score++;
        guesses++;

        View Q1A1 = findViewById(R.id.Q1A1);
        Q1A1.setBackgroundColor(Color.GREEN);
        Q1A1.setClickable(false);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.right);
        mp.start();
        View Q1A2 = findViewById(R.id.Q1A2);
        Q1A2.setClickable(false);
        View Q1A3 = findViewById(R.id.Q1A3);
        Q1A3.setClickable(false);
        showResults();
    }

    // First question - Wrong answer
    public void Q1A2(View view) {
        guesses++;
        MediaPlayer mp = MediaPlayer.create(this, R.raw.wrong);
        mp.start();
        View Q1A1 = findViewById(R.id.Q1A1);
        Q1A1.setBackgroundColor(Color.GREEN);
        Q1A1.setClickable(false);
        View Q1A2 = findViewById(R.id.Q1A2);
        Q1A2.setBackgroundColor(Color.RED);
        Q1A2.setClickable(false);
        View Q1A3 = findViewById(R.id.Q1A3);
        Q1A3.setClickable(false);
        showResults();
    }

    // First question - Wrong Answer
    public void Q1A3(View view) {
        guesses++;
        MediaPlayer mp = MediaPlayer.create(this, R.raw.wrong);
        mp.start();
        View Q1A1 = findViewById(R.id.Q1A1);
        Q1A1.setBackgroundColor(Color.GREEN);
        Q1A1.setClickable(false);
        View Q1A2 = findViewById(R.id.Q1A2);
        Q1A2.setClickable(false);
        View Q1A3 = findViewById(R.id.Q1A3);
        Q1A3.setBackgroundColor(Color.RED);
        Q1A3.setClickable(false);
        showResults();
    }

    // Second question - wrong answer
    public void Q2A1(View view) {
        guesses++;
        MediaPlayer mp = MediaPlayer.create(this, R.raw.wrong);
        mp.start();
        View Q2A1 = findViewById(R.id.Q2A1);
        Q2A1.setBackgroundColor(Color.RED);
        Q2A1.setClickable(false);
        View Q2A2 = findViewById(R.id.Q2A2);
        Q2A2.setBackgroundColor(Color.GREEN);
        Q2A2.setClickable(false);
        View Q2A3 = findViewById(R.id.Q2A3);
        Q2A3.setClickable(false);
        showResults();
    }

    //second question - correct answer
    public void Q2A2(View view) {
        score++;
        guesses++;

        View Q2A1 = findViewById(R.id.Q2A1);
        Q2A1.setClickable(false);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.right);
        mp.start();
        View Q2A2 = findViewById(R.id.Q2A2);
        Q2A2.setBackgroundColor(Color.GREEN);
        Q2A2.setClickable(false);
        View Q2A3 = findViewById(R.id.Q2A3);
        Q2A3.setClickable(false);
        showResults();
    }

    // second question - wrong answer
    public void Q2A3(View view) {
        guesses++;
        MediaPlayer mp = MediaPlayer.create(this, R.raw.wrong);
        mp.start();
        View Q2A1 = findViewById(R.id.Q2A1);
        Q2A1.setClickable(false);
        View Q2A2 = findViewById(R.id.Q2A2);
        Q2A2.setClickable(false);
        Q2A2.setBackgroundColor(Color.GREEN);
        View Q2A3 = findViewById(R.id.Q2A3);
        Q2A3.setBackgroundColor(Color.RED);
        Q2A3.setClickable(false);
        showResults();
    }

    // third question - wrong answer
    public void Q3A1(View view) {
        guesses++;
        MediaPlayer mp = MediaPlayer.create(this, R.raw.wrong);
        mp.start();
        View Q3A1 = findViewById(R.id.Q3A1);
        Q3A1.setBackgroundColor(Color.RED);
        Q3A1.setClickable(false);
        View Q3A2 = findViewById(R.id.Q3A2);
        Q3A2.setBackgroundColor(Color.GREEN);
        Q3A2.setClickable(false);
        View Q3A3 = findViewById(R.id.Q3A3);
        Q3A3.setClickable(false);
        showResults();
    }

    // third question - correct answer
    public void Q3A2(View view) {
        guesses++;
        score++;
        MediaPlayer mp = MediaPlayer.create(this, R.raw.right);
        mp.start();
        View Q3A1 = findViewById(R.id.Q3A1);
        Q3A1.setClickable(false);
        View Q3A2 = findViewById(R.id.Q3A2);
        Q3A2.setBackgroundColor(Color.GREEN);
        Q3A2.setClickable(false);
        View Q3A3 = findViewById(R.id.Q3A3);
        Q3A3.setClickable(false);
        showResults();
    }

    // third question - wrong answer
    public void Q3A3(View view) {
        guesses++;
        MediaPlayer mp = MediaPlayer.create(this, R.raw.wrong);
        mp.start();
        View Q3A1 = findViewById(R.id.Q3A1);
        Q3A1.setClickable(false);
        View Q3A2 = findViewById(R.id.Q3A2);
        Q3A2.setClickable(false);
        Q3A2.setBackgroundColor(Color.GREEN);
        View Q3A3 = findViewById(R.id.Q3A3);
        Q3A3.setBackgroundColor(Color.RED);
        Q3A3.setClickable(false);
        showResults();
    }

    // Fourth question - wrong answer
    public void Q4A1(View view) {
        guesses++;
        MediaPlayer mp = MediaPlayer.create(this, R.raw.wrong);
        mp.start();
        View Q4A1 = findViewById(R.id.Q4A1);
        Q4A1.setBackgroundColor(Color.RED);
        Q4A1.setClickable(false);
        View Q4A2 = findViewById(R.id.Q4A2);
        Q4A2.setBackgroundColor(Color.GREEN);
        Q4A2.setClickable(false);
        View Q4A3 = findViewById(R.id.Q4A3);
        Q4A3.setClickable(false);
        showResults();

    }

    // fourth question - corrct answer
    public void Q4A2(View view) {
        score++;
        guesses++;
        MediaPlayer mp = MediaPlayer.create(this, R.raw.right);
        mp.start();
        View Q4A1 = findViewById(R.id.Q4A1);
        Q4A1.setClickable(false);
        View Q4A2 = findViewById(R.id.Q4A2);
        Q4A2.setBackgroundColor(Color.GREEN);
        Q4A2.setClickable(false);
        View Q4A3 = findViewById(R.id.Q4A3);
        Q4A3.setClickable(false);
        showResults();
    }


    // fourth question - wrong answer
    public void Q4A3(View view) {
        guesses++;
        MediaPlayer mp = MediaPlayer.create(this, R.raw.wrong);
        mp.start();
        View Q4A1 = findViewById(R.id.Q4A1);
        Q4A1.setClickable(false);
        View Q4A2 = findViewById(R.id.Q4A2);
        Q4A2.setClickable(false);
        Q4A2.setBackgroundColor(Color.GREEN);
        View Q4A3 = findViewById(R.id.Q4A3);
        Q4A3.setBackgroundColor(Color.RED);
        Q4A3.setClickable(false);
        showResults();
    }

    // Fifth question
    public void Q5Btn(View view) {
        guesses++;
        String correctAns = "noma";
        View Q5A1 = findViewById(Q5A1);
        EditText ansField = (EditText) findViewById(Q5A1);
        String ans = ansField.getText().toString().toLowerCase();
        Q5A1.setClickable(false);
        // if the answer is right...
        if (ans.equals(correctAns)) {
            score++;
            Q5A1.setBackgroundColor(Color.GREEN);
            MediaPlayer mp = MediaPlayer.create(this, R.raw.right);
            mp.start();
            // If the answer is wrong...
        } else {
            Q5A1.setBackgroundColor(Color.RED);
            MediaPlayer mp = MediaPlayer.create(this, R.raw.wrong);
            mp.start();
        }
    }

    // Sixth question - Right answer
    public void Q6A1(View view) {
        checkbox++;
        score++;
        View Q6A1 = findViewById(R.id.Q6A1);
        Q6A1.setBackgroundColor(Color.GREEN);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.right);
        mp.start();
    }

    // Sixth question - Right answer
    public void Q6A2(View view) {
        checkbox++;
        score++;
        View Q6A2 = findViewById(R.id.Q6A2);
        Q6A2.setBackgroundColor(Color.GREEN);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.right);
        mp.start();
    }

    // Sixth question - Wrong answer
    public void Q6A3(View view) {
        checkbox++;
        score++;
        View Q6A3 = findViewById(R.id.Q6A3);
        Q6A3.setBackgroundColor(Color.RED);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.wrong);
        mp.start();
    }

    // Sixth question - Right answer
    public void Q6A4(View view) {
        checkbox++;
        score++;
        View Q6A4 = findViewById(R.id.Q6A4);
        Q6A4.setBackgroundColor(Color.GREEN);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.right);
        mp.start();
    }
    // Sixth question - Wrong answer
    public void Q6A5(View view) {
        checkbox++;
        score++;
        View Q6A5 = findViewById(R.id.Q6A5);
        Q6A5.setBackgroundColor(Color.GREEN);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.right);
        mp.start();
    }



    // Seventh question - right answer
    public void Q7A1(View view) {
        score++;
        guesses++;
        MediaPlayer mp = MediaPlayer.create(this, R.raw.right);
        mp.start();
        View Q7A1 = findViewById(R.id.Q7A1);
        Q7A1.setBackgroundColor(Color.GREEN);
        Q7A1.setClickable(false);
        View Q7A2 = findViewById(R.id.Q7A2);
        Q7A2.setClickable(false);
        View Q7A3 = findViewById(R.id.Q7A3);
        Q7A3.setClickable(false);
        showResults();

    }

    // Seventh question - Wrong answer
    public void Q7A2(View view) {
        guesses++;
        MediaPlayer mp = MediaPlayer.create(this, R.raw.wrong);
        mp.start();
        View Q7A1 = findViewById(R.id.Q7A1);
        Q7A1.setBackgroundColor(Color.GREEN);
        Q7A1.setClickable(false);
        View Q7A2 = findViewById(R.id.Q7A2);
        Q7A2.setBackgroundColor(Color.RED);
        Q7A2.setClickable(false);
        View Q7A3 = findViewById(R.id.Q7A3);
        Q7A3.setClickable(false);
        showResults();
    }

    // Seventh question - Wrong Answer
    public void Q7A3(View view) {
        guesses++;
        MediaPlayer mp = MediaPlayer.create(this, R.raw.wrong);
        mp.start();
        View Q7A1 = findViewById(R.id.Q7A1);
        Q7A1.setBackgroundColor(Color.GREEN);
        Q7A1.setClickable(false);
        View Q7A2 = findViewById(R.id.Q7A2);
        Q7A2.setClickable(false);
        View Q7A3 = findViewById(R.id.Q7A3);
        Q7A3.setBackgroundColor(Color.RED);
        Q7A3.setClickable(false);
        showResults();
    }

    /*
   *    This function runs only after every question is answered.
   *    It shows the score, and then resets the questions.
     */
    public void showResults() {
        String endText = "";
        String message = (score + "/" + guesses);
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();
        if (guesses == 5) {
            if (score == 5) {
                endText = "Smashed it!";
            } else if (score == 4) {
                endText = "Solid effort!  Just one shy of perfect!";
            } else if (score == 3) {
                endText = "Not a bad attempt!";
            } else if (score == 2) {
                endText = "Poor show! Better luck next time";
            } else if (score == 1) {
                endText = "Maybe cooking isn't for you...";
            } else {
                endText = "Hang your head in shame!";
            }
            // Toast.makeText(this, ("Thanks for playing, " + name + "\n" + message + "\n" + endText), Toast.LENGTH_LONG).show();
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.custom_toast,
                    (ViewGroup) findViewById(R.id.custom_toast_container));

            TextView text = (TextView) layout.findViewById(R.id.text);
            text.setText("Thanks for playing, " + name + "\n" + message + "\n" + endText);

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
            finish();
            startActivity(getIntent());
        }
    }


}
