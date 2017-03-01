package com.example.android.chefsquiz;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.chefsquiz.R.id.Q5A1;
import static com.example.android.chefsquiz.R.id.Q5Btn;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    int guesses = 0;
    int checkbox = 0;
    int checkboxscore = 0;
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
//        new CountDownTimer(1000,2000)
//        {
//            public void onTick(long millisUntilFinished)
//            {}
//            public void onFinish() {View Q1show = findViewById(R.id.Question1View);
//                Q1show.setVisibility(View.INVISIBLE);
//                View Q2show = findViewById(R.id.Question2View);
//                Q2show.setVisibility(View.VISIBLE);}
//        }.start();
        View Q1show = findViewById(R.id.Question1View);
        Q1show.setVisibility(View.INVISIBLE);
        View Q2show = findViewById(R.id.Question2View);
        Q2show.setVisibility(View.VISIBLE);

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

        View Q1show = findViewById(R.id.Question1View);
        Q1show.setVisibility(View.INVISIBLE);
        View Q2show = findViewById(R.id.Question2View);
        Q2show.setVisibility(View.VISIBLE);
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

        View Q1show = findViewById(R.id.Question1View);
        Q1show.setVisibility(View.INVISIBLE);
        View Q2show = findViewById(R.id.Question2View);
        Q2show.setVisibility(View.VISIBLE);
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

        View Q2show = findViewById(R.id.Question2View);
        Q2show.setVisibility(View.INVISIBLE);
        View Q3show = findViewById(R.id.Question3View);
        Q3show.setVisibility(View.VISIBLE);
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

        View Q2show = findViewById(R.id.Question2View);
        Q2show.setVisibility(View.INVISIBLE);
        View Q3show = findViewById(R.id.Question3View);
        Q3show.setVisibility(View.VISIBLE);
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

        View Q2show = findViewById(R.id.Question2View);
        Q2show.setVisibility(View.INVISIBLE);
        View Q3show = findViewById(R.id.Question3View);
        Q3show.setVisibility(View.VISIBLE);
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

        View Q3show = findViewById(R.id.Question3View);
        Q3show.setVisibility(View.INVISIBLE);
        View Q4show = findViewById(R.id.Question4View);
        Q4show.setVisibility(View.VISIBLE);
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

        View Q3show = findViewById(R.id.Question3View);
        Q3show.setVisibility(View.INVISIBLE);
        View Q4show = findViewById(R.id.Question4View);
        Q4show.setVisibility(View.VISIBLE);
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

        View Q3show = findViewById(R.id.Question3View);
        Q3show.setVisibility(View.INVISIBLE);
        View Q4show = findViewById(R.id.Question4View);
        Q4show.setVisibility(View.VISIBLE);
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

        View Q4show = findViewById(R.id.Question4View);
        Q4show.setVisibility(View.INVISIBLE);
        View Q5show = findViewById(R.id.Question5View);
        Q5show.setVisibility(View.VISIBLE);
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

        View Q4show = findViewById(R.id.Question4View);
        Q4show.setVisibility(View.INVISIBLE);
        View Q5show = findViewById(R.id.Question5View);
        Q5show.setVisibility(View.VISIBLE);
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

        View Q4show = findViewById(R.id.Question4View);
        Q4show.setVisibility(View.INVISIBLE);
        View Q5show = findViewById(R.id.Question5View);
        Q5show.setVisibility(View.VISIBLE);
    }

    // Fifth question
    public void Q5Btn(View view) {
        guesses++;
        String correctAns = "noma";
        EditText ansField = (EditText) findViewById(Q5A1);
        String answer = ansField.getText().toString().toLowerCase();
        String ans = answer.replaceAll("[^A-Za-z]+","");
        ansField.setText(ans);
        View ansBtn = (Button) findViewById(Q5Btn);
        ansBtn.setVisibility(View.INVISIBLE);
        // if the answer is right...
        if (ans.equals(correctAns)) {
            score++;
            ansField.setBackgroundColor(Color.GREEN);
            MediaPlayer mp = MediaPlayer.create(this, R.raw.right);
            mp.start();
            // If the answer is wrong...
        } else {
            ansField.setBackgroundColor(Color.RED);
            MediaPlayer mp = MediaPlayer.create(this, R.raw.wrong);
            mp.start();
        }

        View Q5show = findViewById(R.id.Question5View);
        Q5show.setVisibility(View.INVISIBLE);
        View Q6show = findViewById(R.id.Question6View);
        Q6show.setVisibility(View.VISIBLE);
    }

    // Sixth question - Right answer
    public void Q6A1(View view) {
        checkbox++;
        checkboxscore++;
        View Q6A1 = findViewById(R.id.Q6A1);
        Q6A1.setBackgroundColor(Color.GREEN);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.right);
        mp.start();
        checkboxCheck();
    }

    // Sixth question - Right answer
    public void Q6A2(View view) {
        checkbox++;
        checkboxscore++;
        View Q6A2 = findViewById(R.id.Q6A2);
        Q6A2.setBackgroundColor(Color.GREEN);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.right);
        mp.start();
        checkboxCheck();
    }

    // Sixth question - Wrong answer
    public void Q6A3(View view) {
        checkbox++;
        View Q6A3 = findViewById(R.id.Q6A3);
        Q6A3.setBackgroundColor(Color.RED);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.wrong);
        mp.start();
        checkboxCheck();
    }

    // Sixth question - Right answer
    public void Q6A4(View view) {
        checkbox++;
        checkboxscore++;
        View Q6A4 = findViewById(R.id.Q6A4);
        Q6A4.setBackgroundColor(Color.GREEN);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.right);
        mp.start();
        checkboxCheck();
    }

    // Sixth question - Wrong answer
    public void Q6A5(View view) {
        checkbox++;
        View Q6A5 = findViewById(R.id.Q6A5);
        Q6A5.setBackgroundColor(Color.RED);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.wrong);
        mp.start();
        checkboxCheck();
    }

    public void checkboxCheck() {
        if (checkbox == 3) {
            View Q6A1 = findViewById(R.id.Q6A1);
            View Q6A2 = findViewById(R.id.Q6A2);
            View Q6A3 = findViewById(R.id.Q6A3);
            View Q6A4 = findViewById(R.id.Q6A4);
            View Q6A5 = findViewById(R.id.Q6A5);
            Q6A1.setClickable(false);
            Q6A2.setClickable(false);
            Q6A3.setClickable(false);
            Q6A4.setClickable(false);
            Q6A5.setClickable(false);
            View Q6show = findViewById(R.id.Question6View);
            Q6show.setVisibility(View.INVISIBLE);
            View Q7show = findViewById(R.id.Question7View);
            Q7show.setVisibility(View.VISIBLE);
            if (checkboxscore == 3) {
                score++;

            }
            guesses++;

        }
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

        View Q7show = findViewById(R.id.Question7View);
        Q7show.setVisibility(View.INVISIBLE);

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

        View Q7show = findViewById(R.id.Question7View);
        Q7show.setVisibility(View.INVISIBLE);

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

        View Q7show = findViewById(R.id.Question7View);
        Q7show.setVisibility(View.INVISIBLE);

    }


    /*
   *    This function runs only after every question is answered.
   *    It shows the score, and then resets the questions.
     */
    public void showResults(View view) {
        String endText = "";
        String message = (score + "/" + guesses);
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();
        if (name.equals("")) {
            name = "buddy";
        }
        if (score == 7) {
            endText = "Smashed it!";
        } else if (score == 6) {
            endText = "Solid effort!  Just one shy of perfect!";
        } else if (score == 5) {
            endText = "Not a bad attempt!";
        } else if (score == 4) {
            endText = "50% Not good enough!";

        } else if ((score == 2) || (score == 3)) {
            endText = "Poor show! Better luck next time";
        } else if (score == 1) {
            endText = "Maybe cooking isn't for you...";
        } else {
            endText = "Hang your head in shame!";
        }
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast,
                (ViewGroup) findViewById(R.id.custom_toast_container));

        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText("Thanks for playing, " + name + "\n" + message + "\n" + endText);

        final Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

        new CountDownTimer(9000, 3000)
        {

            public void onTick(long millisUntilFinished) {toast.show();}
            public void onFinish() {toast.show();}

        }.start();

        startActivity(getIntent());
    }
}



