package com.example.aashutosh.tic_tac_toe;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.btn);
        b2=(Button)findViewById(R.id.btn2);
        b3=(Button)findViewById(R.id.btn3);
        b4=(Button)findViewById(R.id.btn4);
        b5=(Button)findViewById(R.id.btn5);
        b6=(Button)findViewById(R.id.btn6);
        b7=(Button)findViewById(R.id.btn7);
        b8=(Button)findViewById(R.id.btn8);
        b9=(Button)findViewById(R.id.btn9);

        turn=1;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(b1.getText().toString().equals(""))
                {
                if(turn == 1)
                 {
                turn = 2;
                b1.setText("x");
                 }
                 else if(turn == 2)
                {
                    turn = 1;
                    b1.setText("o");
                }
              }
              endGame();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (b2.getText().toString().equals(""))
                {
                    if (turn == 1)
                    {
                        turn = 2;
                        b2.setText("x");
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b2.setText("o");
                    }
                }
                endGame();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (b3.getText().toString().equals(""))
                {
                    if (turn == 1)
                    {
                        turn = 2;
                        b3.setText("x");
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b3.setText("o");
                    }
                }
                endGame();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (b4.getText().toString().equals(""))
                {
                    if (turn == 1)
                    {
                        turn = 2;
                        b4.setText("x");
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b4.setText("o");
                    }
                }

                endGame();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (b5.getText().toString().equals(""))
                {
                    if (turn == 1)
                    {
                        turn = 2;
                        b5.setText("x");
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b5.setText("o");
                    }
                }

                endGame();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (b6.getText().toString().equals(""))
                {
                    if (turn == 1)
                    {
                        turn = 2;
                        b6.setText("x");
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b6.setText("o");
                    }
                }

                endGame();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (b7.getText().toString().equals(""))
                {
                    if (turn == 1)
                    {
                        turn = 2;
                        b7.setText("x");
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b7.setText("o");
                    }
                }

                endGame();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (b8.getText().toString().equals(""))
                {
                    if (turn == 1)
                    {
                        turn = 2;
                        b8.setText("x");
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b8.setText("o");
                    }
                }

                endGame();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (b9.getText().toString().equals(""))
                {
                    if (turn == 1)
                    {
                        turn = 2;
                        b9.setText("x");
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b9.setText("o");
                    }
                }

                endGame();
            }
        });


    }
    public void endGame()

    {
        String a,b,c,d,e,f,g,h,i;
        boolean end = false;

        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();

        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();

        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();

        if(a.equals("x") && b.equals("x") && c.equals("x"))
        {
            Toast.makeText(MainActivity.this,"winner_player_x",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(a.equals("x") && e.equals("x") && i.equals("x"))
        {
            Toast.makeText(MainActivity.this,"winner_player_x",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(a.equals("x") && d.equals("x") && g.equals("x"))
        {
            Toast.makeText(MainActivity.this,"winner_player_x",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(b.equals("x") && e.equals("x") && h.equals("x"))
        {
            Toast.makeText(MainActivity.this,"winner_player_x",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(c.equals("x") && f.equals("x") && i.equals("x"))
        {
            Toast.makeText(MainActivity.this,"winner_player_x",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(c.equals("x") && e.equals("x") && g.equals("x"))
        {
            Toast.makeText(MainActivity.this,"winner_player_x",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(d.equals("x") && e.equals("x") && f.equals("x"))
        {
            Toast.makeText(MainActivity.this,"winner_player_x",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(g.equals("x") && h.equals("x") && i.equals("x"))
        {
            Toast.makeText(MainActivity.this,"winner_player_x",Toast.LENGTH_LONG).show();
            end = true;
        }



        if(a.equals("o") && b.equals("o") && c.equals("o"))
        {
            Toast.makeText(MainActivity.this,"winner_player_o",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(a.equals("o") && e.equals("o") && i.equals("o"))
        {
            Toast.makeText(MainActivity.this,"winner_player_o",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(a.equals("o") && d.equals("o") && g.equals("o"))
        {
            Toast.makeText(MainActivity.this,"winner_player_o",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(b.equals("o") && e.equals("o") && h.equals("o"))
        {
            Toast.makeText(MainActivity.this,"winner_player_o",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(c.equals("o") && f.equals("o") && i.equals("o"))
        {
            Toast.makeText(MainActivity.this,"winner_player_o",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(c.equals("o") && e.equals("o") && g.equals("o"))
        {
            Toast.makeText(MainActivity.this,"winner_player_o",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(d.equals("o") && e.equals("o") && f.equals("o"))
        {
            Toast.makeText(MainActivity.this,"winner_player_o",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(g.equals("o") && h.equals("o") && i.equals("o"))
        {
            Toast.makeText(MainActivity.this,"winner_player_o",Toast.LENGTH_LONG).show();
            end = true;
        }


           if(end)

           {

               b1.setEnabled(false);
               b2.setEnabled(false);
               b3.setEnabled(false);
               b4.setEnabled(false);
               b5.setEnabled(false);
               b6.setEnabled(false);
               b7.setEnabled(false);
               b8.setEnabled(false);
               b9.setEnabled(false);


               /*SystemClock.sleep(7000);*/

           }

        Button rstbtn = (Button) findViewById(R.id.play_again);
        rstbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent current = getIntent();
                finish();
                startActivity(current);
            }
        });


    }

}
