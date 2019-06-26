package com.example.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button _00_;
    Button _01_;
    Button _02_;
    Button _10_;
    Button _11_;
    Button _12_;
    Button _20_;
    Button _21_;
    Button _22_;
    String game[][]={{"","",""},{"","",""},{"","",""}};
    public int chance=0;
    TextView Result;
    Button Reset;
    int steps=0;
    boolean game_won=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Initialize();
        LetsPlay();

    }

    private void LetsPlay() {
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        game[i][j]="";
                    }
                }
                _00_.setText("");
                _01_.setText("");
                _02_.setText("");
                _10_.setText("");
                _11_.setText("");
                _12_.setText("");
                _20_.setText("");
                _21_.setText("");
                _22_.setText("");
                Result.setText("XD");
            }
        });
        //int chance=1;
        _00_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                steps++;
                if(chance==0){
                    _00_.setText("0");
                    chance=1;
                    game[0][0]="0";
                }
                else{
                    _00_.setText("X");
                    chance=0;
                    game[0][0]="X";
                }
                check();
            }
        });

        _01_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                steps++;
                if(chance==0){
                    _01_.setText("0");
                    chance=1;
                    game[0][1]="0";
                }
                else{
                    _01_.setText("X");
                    chance=0;
                    game[0][1]="X";
                }
                check();

            }
        });

        _02_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                steps++;
                if(chance==0){
                    _02_.setText("0");
                    chance=1;
                    game[0][2]="0";
                }
                else{
                    _02_.setText("X");
                    chance=0;
                    game[0][2]="X";
                }
                check();

            }
        });

        _10_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                steps++;
                if(chance==0){
                    _10_.setText("0");
                    chance=1;
                    game[1][0]="0";
                }
                else{
                    _10_.setText("X");
                    chance=0;
                    game[1][0]="X";
                }
                check();

            }
        });

        _11_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                steps++;
                if(chance==0){
                    _11_.setText("0");
                    chance=1;
                    game[1][1]="0";
                }
                else{
                    _11_.setText("X");
                    chance=0;
                    game[1][1]="X";
                }
                check();

            }
        });

        _12_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                steps++;
                if(chance==0){
                    _12_.setText("0");
                    chance=1;
                    game[1][2]="0";
                }
                else{
                    _12_.setText("X");
                    chance=0;
                    game[1][2]="X";
                }
                check();

            }
        });

        _20_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                steps++;
                if(chance==0){
                    _20_.setText("0");
                    chance=1;
                    game[2][0]="0";
                }
                else{
                    _20_.setText("X");
                    chance=0;
                    game[2][0]="X";
                }
                check();

            }
        });

        _21_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                steps++;
                if(chance==0){
                    _21_.setText("0");
                    chance=1;
                    game[2][1]="0";
                }
                else{
                    _21_.setText("X");
                    chance=0;
                    game[2][1]="X";
                }
                check();

            }
        });

        _22_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                steps++;
                if(chance==0){
                    _22_.setText("0");
                    chance=1;
                    game[2][2]="0";
                }
                else{
                    _22_.setText("X");
                    chance=0;
                    game[2][2]="X";
                }
                check();

            }
        });

    }
    void check(){
        int backslash_for_0=0;
        int backslash_for_x=0;
        int frontslash_for_x=0;
        int frontslash_for_0=0;


        for(int i=0;i<3;i++){//linear check
            int count_x_horizontal=0;
            int count_0_horizontal=0;
            int count_x_vertical=0;
            int count_0_vertical=0;

            for(int j=0;j<3;j++){
                if(game[i][j]=="X"){
                    count_x_horizontal++;
                }
                if(game[i][j]=="0"){
                    count_0_horizontal++;
                }
                if(game[j][i]=="X"){
                    count_x_vertical++;
                }
                if(game[j][i]=="0"){
                    count_0_vertical++;
                }
                if(i==j){
                    if(game[i][i]=="X"){
                        backslash_for_x++;
                    }
                    if(game[i][i]=="0"){
                        backslash_for_0++;
                    }
                }
                if(i+j==2){
                    if(game[i][j]=="X"){
                        frontslash_for_x++;
                    }
                    if(game[i][j]=="0"){
                        frontslash_for_0++;
                    }
                }


            }
            if(count_x_horizontal==3){
                //x wins
                Result.setText("X wins");
                game_won=true;
            }
            if(count_0_horizontal==3){
                //0 wins
                Result.setText("0 wins");
                game_won=true;
            }
            if(count_x_vertical==3){
                //x wins
                Result.setText("X wins");
                game_won=true;
            }
            if(count_0_vertical==3){
                //0 wins
                Result.setText("0 wins");
                game_won=true;
            }
            if(backslash_for_x==3){
                Result.setText("X wins");
                game_won=true;
            }
            if(backslash_for_0==3){
                Result.setText("0 wins");
                game_won=true;
            }
            if(frontslash_for_x==3){
                Result.setText("X wins");
                game_won=true;
            }
            if(frontslash_for_0==3){
                Result.setText("0 wins");
                game_won=true;
            }
            if(steps==9){
                if((!game_won)){
                    Result.setText("Match Draw");
                    steps=0;
                }
            }
        }
    }

    void Initialize(){
        _00_=(Button) findViewById(R.id._00);
        _01_=(Button) findViewById(R.id._01);
        _02_=(Button) findViewById(R.id._02);
        _10_=(Button) findViewById(R.id._10);
        _11_=(Button) findViewById(R.id._11);
        _12_=(Button) findViewById(R.id._12);
        _20_=(Button) findViewById(R.id._20);
        _21_=(Button) findViewById(R.id._21);
        _22_=(Button) findViewById(R.id._22);
        Result=(TextView) findViewById(R.id.tv);
        Reset=(Button) findViewById(R.id.reset_button);
    }
}
