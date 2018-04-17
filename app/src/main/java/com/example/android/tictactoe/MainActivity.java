package com.example.android.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declaration of button variables to be used in the game logic
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    int turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //Creating objects for the nine buttons
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9= (Button) findViewById(R.id.btn9);
//Turn taking in game starting with first player taking the first turn to play the game
        turn = 1;
//Game logic on what should happen when user clicks on every single button
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn1.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn1.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn2.setText("O");
                    }
                }
                endGame();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn2.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn2.setText("O");
                    }
                }
                endGame();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn3.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn3.setText("O");
                    }
                }
                endGame();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn4.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn4.setText("O");
                    }
                }
                endGame();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn5.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn5.setText("O");
                    }
                }
                endGame();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn6.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn6.setText("O");
                    }
                }
                endGame();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn7.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn7.setText("O");
                    }
                }
                endGame();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn8.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn8.setText("O");
                    }
                }
                endGame();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn9.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn9.setText("O");
                    }
                }
                endGame();
            }
        });


    }
    public void endGame(){
        String a,b,c,d,e,f,g,h,i;
        boolean end = false;
//Assignment of value to every button via the objects
        a = btn1.getText().toString();
        b = btn2.getText().toString();
        c = btn3.getText().toString();

        d = btn4.getText().toString();
        e = btn5.getText().toString();
        f = btn6.getText().toString();

        g = btn7.getText().toString();
        h = btn8.getText().toString();
        i = btn9.getText().toString();
//Decision logic that determines the winner of the game based on the choices they have made on the game board
        //Declares X as the game winner
        if(a.equals("X") && b.equals("X") && c.equals("X")){
            Toast.makeText(MainActivity.this,"Winner is player X", Toast.LENGTH_LONG).show();
            end = true;
        }

        if(a.equals("X") && e.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this,"Winner is player X", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(a.equals(d) && d.equals(g) && g.equals("X")){
            Toast.makeText(MainActivity.this,"Winner is player X", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(b.equals("X") && e.equals("X") && h.equals("X")){
            Toast.makeText(MainActivity.this,"Winner is player X", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(c.equals("X") && f.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this,"Winner is player X", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(d.equals("X") && e.equals("X") && f.equals("X")){
            Toast.makeText(MainActivity.this,"Winner is player X", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(g.equals("X") && h.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this,"Winner is player X", Toast.LENGTH_LONG).show();
            end = true;
        }
            ////////////////////////////////////////////////
        //Decision logic that determines the winner of the game based on the choices they have made on the game board
        //Declares O as the game winner

        if(a.equals("O") && b.equals("O") && c.equals("O")){
            Toast.makeText(MainActivity.this,"Winner is player O", Toast.LENGTH_LONG).show();
            end = true;
        }

        if(a.equals("O") && e.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this,"Winner is player O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(a.equals(d) && d.equals(g) && g.equals("O")){
            Toast.makeText(MainActivity.this,"Winner is player O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(b.equals("O") && e.equals("O") && h.equals("O")){
            Toast.makeText(MainActivity.this,"Winner is player O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(c.equals("O") && f.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this,"Winner is player O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(d.equals("O") && e.equals("O") && f.equals("O")){
            Toast.makeText(MainActivity.this,"Winner is player O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(g.equals("O") && h.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this,"Winner is player O", Toast.LENGTH_LONG).show();
            end = true;
        }
//Disabling the continuation of the game after winner is determined
        if (end) {
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }


    };
}
