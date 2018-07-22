//This is the main page


package com.jr.mejia.roberto.conversions;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.wearable.activity.WearableActivity;
        import android.text.TextUtils;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.EditText;
        import android.widget.Button;
        import android.widget.Spinner;
        import android.widget.TextView;
        import android.widget.Toast;






        import java.text.DecimalFormat;

        import static android.widget.Toast.*;






public class MainActivity extends WearableActivity implements AdapterView.OnItemSelectedListener {






    //these are the options that are available

    //Fahrenheit to Celsius
    //Celsius to Fahrenheit

    //Inch to Centimeter
    //Inch to Feet
    //Centimeter to Inch
    //Feet to Centimeter
    //Centimeter to Feet
    //Feet to Mile
    //Mile to Feet
    //Mile to Kilometer
    //Kilometer to Mile

    //Pound to Gram
    //Gram to Pound

    //Ounce to Milliliter
    //Milliliter to Ounce


    // This is value for user input
    double n1 = second.x;

// This is the value for the answer for any of the formulas

    double y;

    // This will determine what option the user
// chose for the spinner, default is first option
    int n = 0;



    Spinner spinner;
    Button et1;
    Button button;
    TextView conn;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

///


////
        conn=(TextView)findViewById(R.id.con);
        button =(Button) findViewById(R.id.button1);



        //this is for spinner
        spinner = (Spinner) findViewById(R.id.spin);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.formulas, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);



        ///////////////// these are linking the EditText, TextView, Button, to the variables

        et1 =(Button) findViewById(R.id.numberr);

        et1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });

        et1.setText(Double.toString(second.x));


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //conn.setText("" + n1);

                DecimalFormat df2 = new DecimalFormat(".##");
                DecimalFormat df5 = new DecimalFormat(".#####");



                if (n == 0)
                {
                    //   y = ( (87 - 32.0) * (5.0/9.0) );
                    //     Toast.makeText(this,String.valueOf(y), LENGTH_SHORT).show();
                    //     conn.setText("9 °F = " + df2.format(y) + " °C");

                }
                if (n == 1)
                {
                    y = ( (n1 - 32.0) * (5.0/9.0) );

                    conn.setText(n1 + " °F = " + df2.format(y) + " °C");
                }
                if (n == 2)
                {
                    y = (n1 * (9.0 / 5)) + 32;
                    conn.setText(n1 + " °C = " + df2.format(y) + " °F");
                }
                if (n == 3)
                {
                    y = (n1 * 2.54);
                    conn.setText(n1 + " in = " + df2.format(y) + " cm");
                }
                if (n == 4)
                {
                    y = (n1 / 2.54);
                    conn.setText(n1 + " cm = " + df2.format(y) + " in");
                }
                if (n == 5)
                {
                    y = (n1 * 30.48 );
                    conn.setText(n1 + " ft = " + df2.format(y) + " cm");
                }
                if (n == 6)
                {
                    y = (n1 / 30.48 );
                    conn.setText(n1 + " cm = " + df5.format(y) + " ft");
                }
                if (n == 7)
                {
                    y = (n1 / 5280.0);
                    conn.setText(n1 + " ft = " + df5.format(y) + " M");
                }

                if (n == 8)
                {
                    y = (n1 * 5280.0);
                    conn.setText(n1 + " M = " + df2.format(y) + " ft");
                }
                if (n == 9)
                {
                    y = (n1 * 1.60934);
                    conn.setText(n1 + "M = " + df2.format(y) + " km");
                }
                if (n == 10)
                {
                    y = (n1 / 1.60934);
                    conn.setText(n1 + " km = " + df5.format(y) + " M");
                }
                if (n == 11)
                {
                    y = (n1 / .00220462262 );
                    conn.setText(n1 + " lb = " + df2.format(y) + " g");
                }
                if (n == 12)
                {
                    y = (n1 * .00220462262 );
                    conn.setText(n1 + " g = " + df5.format(y) + " lb");
                }
                if (n == 13)
                {
                    y = (n1 / 0.033814);
                    conn.setText(n1 + "oz = " + df2.format(y) + " ml");
                }
                if (n == 14)
                {
                    y = (n1 * 0.033814);
                    conn.setText(n1 + " ml = " + df5.format(y) + " oz");
                }


                if (n == 15)
                {

                }

                //this was added later on, in to ft
                if(n == 16)
                {
                    y = (n1 / 12);

                    conn.setText(n1 + " in = " + y + " ft");
                }

            }
        });

    }

    public void openActivity2(){
        Intent intent = new Intent(this, second.class);
        startActivity(intent);
    }






    //
    ///
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {



        String selection = (String) parent.getItemAtPosition(position);


        if (!TextUtils.isEmpty(selection)) {
            if (selection.equals("Pick One")) {
                n = 0;
            }

            if (selection.equals("Fahrenheit to Celsius")) {

                Toast.makeText(this,selection, LENGTH_SHORT).show();
                n = 1;
            }
            if(selection.equals("Celsius to Fahrenheit")) {

                Toast.makeText(this,selection, LENGTH_SHORT).show();
                n = 2;
            }
            if(selection.equals("Inch to Centimeter")) {

                Toast.makeText(this,selection, LENGTH_SHORT).show();
                n = 3;
            }
            if(selection.equals("Centimeter to Inch")) {

                Toast.makeText(this,selection, LENGTH_SHORT).show();
                n = 4;
            }
            if(selection.equals("Feet to Centimeter")) {

                Toast.makeText(this,selection, LENGTH_SHORT).show();
                n = 5;
            }
            if(selection.equals("Centimeter to Feet")) {

                Toast.makeText(this,selection, LENGTH_SHORT).show();
                n = 6;
            }
            if(selection.equals("Feet to Mile")) {

                Toast.makeText(this,selection, LENGTH_SHORT).show();
                n = 7;
            }
            if(selection.equals("Mile to Feet")) {

                Toast.makeText(this,selection, LENGTH_SHORT).show();
                n = 8;
            }
            if(selection.equals("Mile to Kilometer")) {

                Toast.makeText(this,selection, LENGTH_SHORT).show();
                n = 9;
            }
            if(selection.equals("Kilometer to Mile")) {

                Toast.makeText(this,selection, LENGTH_SHORT).show();
                n = 10;
            }
            if(selection.equals("Pound to Gram")) {

                Toast.makeText(this,selection, LENGTH_SHORT).show();
                n = 11;
            }
            if(selection.equals("Gram to Pound")) {

                Toast.makeText(this,selection, LENGTH_SHORT).show();
                n = 12;
            }
            if(selection.equals("Ounce to Milliliter")) {

                Toast.makeText(this,selection, LENGTH_SHORT).show();
                n = 13;
            }
            if(selection.equals("Milliliter to Ounce")) {

                Toast.makeText(this,selection, LENGTH_SHORT).show();
                n = 14;
            }
            if(selection.equals("---TEMPERATURE---")) {

                Toast.makeText(this,selection, LENGTH_SHORT).show();
                n = 15;
            }
//
            if(selection.equals("Inch to Feet")){
                Toast.makeText(this,selection, LENGTH_SHORT).show();
                n = 16;

            }

            if(selection.equals("---LENGTH---")) {

                Toast.makeText(this,selection, LENGTH_SHORT).show();
                n = 15;
            }

            if(selection.equals("---MASS---")) {

                Toast.makeText(this,selection, LENGTH_SHORT).show();
                n = 15;
            }

            if(selection.equals("---LIQUID---")) {

                Toast.makeText(this,selection, LENGTH_SHORT).show();
                n = 15;
            }
















        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}
