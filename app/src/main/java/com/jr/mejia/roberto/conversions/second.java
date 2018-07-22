package com.jr.mejia.roberto.conversions;
import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;

public class second extends WearableActivity {

    private TextView mTextView;

    static ArrayList<Integer> array = new ArrayList<Integer>();

    TextView textnum;

    Button uno;
    Button dos;
    Button tres;
    Button cuatro;
    Button cinco;
    Button seis;
    Button siete;
    Button ocho;
    Button nueve;
    Button zeroo;


    Button negative;

    Button dot;

    Button backspace;

    Button enter;

    // trigger activates if there is decimal number
    int trigger = 0; // trigger is off if its 0, it is on if its 1

    // this is the number that will be displayed
    public static double x;

    //preview for dot
    double preview;


    //This is used for finding out how many decimal places should be accounted for
    //when backspacing while there are decimal points
    double d;


    int trigger2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textnum = (TextView) findViewById(R.id.text);
        textnum.setText(Double.toString(x));






        uno = (Button) findViewById(R.id.one);

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (trigger == 0)
                {
                    // the 1 is there because the person pressed the number 1
                    x = (x * 10) + 1;
                    textnum.setText(Double.toString(x));
                }

                // this is for when trigger is on (decimal)
                if (trigger == 1)
                {
                    // this is to know how many decimal places should be shown
                    d = d + 1;

                    // the 1 is there because the person pressed the number 1
                    x = x + (Math.pow(10, -d) * 1);

                    // this tells how many decimal places should be shown
                    x = Math.round(x * Math.pow(10, 1 + d))/Math.pow(10, 1 + d);
                    textnum.setText(Double.toString(x));
                }

            }

            // this is for when trigger is on (decimal)

        });

        dos =(Button) findViewById(R.id.two);

        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (trigger == 0)
                {
                    x = (x * 10.0) + 2.0;
                    textnum.setText(Double.toString(x));

                }
                if (trigger == 1)
                {
                    d = d + 1.0;
                    x = x + (Math.pow(10.0, -d) * 2.0);

                    x = Math.round(x * Math.pow(10.0, 1.0 + d))/Math.pow(10.0, 1.0 + d);
                    textnum.setText(Double.toString(x));
                }


            }
        });

        tres =(Button) findViewById(R.id.three);
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (trigger == 0)
                {
                    x = (x * 10.0) + 3.0;
                    textnum.setText(Double.toString(x));

                }
                if (trigger == 1)
                {
                    d = d + 1.0;
                    x = x + (Math.pow(10.0, -d) * 3.0);

                    x = Math.round(x * Math.pow(10.0, 1.0 + d))/Math.pow(10.0, 1.0 + d);
                    textnum.setText(Double.toString(x));
                }


            }
        });

        cuatro =(Button) findViewById(R.id.four);
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (trigger == 0)
                {
                    x = (x * 10.0) + 4.0;
                    textnum.setText(Double.toString(x));

                }
                if (trigger == 1)
                {
                    d = d + 1.0;
                    x = x + (Math.pow(10.0, -d) * 4.0);

                    x = Math.round(x * Math.pow(10.0, 1.0 + d))/Math.pow(10.0, 1.0 + d);
                    textnum.setText(Double.toString(x));
                }


            }
        });

        cinco =(Button) findViewById(R.id.five);
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (trigger == 0)
                {
                    x = (x * 10.0) + 5.0;
                    textnum.setText(Double.toString(x));

                }
                if (trigger == 1)
                {
                    d = d + 1.0;
                    x = x + (Math.pow(10.0, -d) * 5.0);

                    x = Math.round(x * Math.pow(10.0, 1.0 + d))/Math.pow(10.0, 1.0 + d);
                    textnum.setText(Double.toString(x));
                }


            }
        });

        seis =(Button) findViewById(R.id.six);
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (trigger == 0)
                {
                    x = (x * 10.0) + 6.0;
                    textnum.setText(Double.toString(x));

                }
                if (trigger == 1)
                {
                    d = d + 1.0;
                    x = x + (Math.pow(10.0, -d) * 6.0);

                    x = Math.round(x * Math.pow(10.0, 1.0 + d))/Math.pow(10.0, 1.0 + d);
                    textnum.setText(Double.toString(x));
                }


            }
        });

        siete =(Button) findViewById(R.id.seven);
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (trigger == 0)
                {
                    x = (x * 10) + 7;
                    textnum.setText(Double.toString(x));

                }
                if (trigger == 1)
                {
                    d = d + 1;
                    x = x + (Math.pow(10, -d) * 7);

                    x = Math.round(x * Math.pow(10, 1 + d))/Math.pow(10, 1 + d);
                    textnum.setText(Double.toString(x));
                }


            }
        });


        ocho =(Button) findViewById(R.id.eight);
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (trigger == 0)
                {
                    x = (x * 10) + 8;
                    textnum.setText(Double.toString(x));

                }
                if (trigger == 1)
                {
                    d = d + 1;
                    x = x + (Math.pow(10, -d) * 8);

                    x = Math.round(x * Math.pow(10, 1 + d))/Math.pow(10, 1 + d);
                    textnum.setText(Double.toString(x));
                }


            }
        });

        nueve =(Button) findViewById(R.id.nine);
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (trigger == 0)
                {
                    x = (x * 10) + 9;
                    textnum.setText(Double.toString(x));

                }
                if (trigger == 1) {
                    d = d + 1;
                    x = x + (Math.pow(10, -d) * 9);

                    x = Math.round(x * Math.pow(10, 1 + d))/Math.pow(10, 1 + d);
                    textnum.setText(Double.toString(x));
                }
            }
        });


        zeroo =(Button) findViewById(R.id.zero);
        zeroo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (trigger == 0)
                {
                    x = (x * 10) + 0;
                    textnum.setText(Double.toString(x));

                }
                if (trigger == 1)
                {
                    d = d + 1;
                    x = x + (Math.pow(10.0, -d) * 0.0);
                    x = Math.round(x * Math.pow(10.0, 1.0 + d))/Math.pow(10.0, 1.0 + d);
                    textnum.setText(Double.toString(x));
                }


            }
        });

        negative = (Button)findViewById(R.id.negative);
        negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ( 1 == 1)
                {
                    // this formula just makes the number negative or back to positive
                    x = (-1 * x );
                    textnum.setText(Double.toString(x));
                }



            }
        });

        dot = (Button)findViewById(R.id.dot);
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ( 1 == 1)
                {
                    preview = ( x + 0.0 );

                    // by pressing the dot button, the trigger gets activated and every number
                    // from now on will be placed
                    // after the decimal
                    trigger = 1;



                    textnum.setText(Double.toString(preview));
                }
            }
        });


        backspace = (Button)findViewById(R.id.backspace);
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                trigger2 = 1;

                if (trigger == 1 && d > 0 && trigger2 == 1){

                    trigger2 = 0;

                    d = d - 1;
                    x = (double)(((int)(Math.pow(10.0,d)*x))/Math.pow(10.0,d));
                    textnum.setText(Double.toString(x));

                    if (d == 0){
                        trigger = 0;

                    }

                }



                if (trigger == 0.0 && trigger2 == 1){

                        trigger2 = 0;



                    if(x != 0.0 && trigger2 != 1) {
                        x = (.1 * x);
                        int yy = (int)x;
                        x = yy;

                        textnum.setText(Double.toString(x));
                    }

                    if(x == 0.0) {
                        x =0.0;
                        textnum.setText("0.0");
                    }

                }







            }
        });

        enter = (Button)findViewById(R.id.enter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain();
            }
        });

    }

    public void openMain() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}
