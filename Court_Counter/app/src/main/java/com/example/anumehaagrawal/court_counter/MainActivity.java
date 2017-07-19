package com.example.anumehaagrawal.court_counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int num=0;

    int numB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void threeptA(View view){
        num=num+3;
        displayForTeamA(num);
    }
    public void twoptA(View view){
        num=num+2;
        displayForTeamA(num);
    }
    public void freethrowA(View view){
        num=num+1;
        displayForTeamA(num);
    }
    public void displayForTeamB(int number){
        TextView mytext1 =(TextView)findViewById(R.id.textView4);
        mytext1.setText(String.valueOf(number));
    }

    public void threeptB(View view){
        numB=numB+3;
        displayForTeamB(numB);
    }
    public void twoptB(View view){
        numB=numB+2;
        displayForTeamB(numB);
    }
    public void freethrowB(View view){
        numB=numB+1;
        displayForTeamB(numB);
    }
    public void displayForTeamA(int number){
        TextView mytext =(TextView)findViewById(R.id.textView2);

        mytext.setText(String.valueOf(number));
    }
    public void reset(View view){
        num=0;
        numB=0;
        displayForTeamA(0);
        displayForTeamB(0);
    }
}
