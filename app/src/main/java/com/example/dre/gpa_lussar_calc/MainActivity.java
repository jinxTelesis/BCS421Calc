package com.example.dre.gpa_lussar_calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private String input = "default";
    private double total;
    // add components to the java
    private EditText eT1;
    private EditText eT2;
    private EditText eT3;
    private EditText eT4;
    private EditText eT5;
    private String input1;
    private String input2;
    private String input3;
    private String input4;
    private String input5;
    private double inputDouble;
    private double gpa;
    boolean dontCalc = false; // this is used intellisense wrong? or am i confused
    boolean clearflag = false;



    Button btnCompute1;

    TextView tvLabelGpa1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // add components onCreate
        eT1 = (EditText) findViewById(R.id.editText1);
        eT2 = (EditText) findViewById(R.id.editText2);
        eT3 = (EditText) findViewById(R.id.editText3);
        eT4 = (EditText) findViewById(R.id.editText4);
        eT5 = (EditText) findViewById(R.id.editText5);

        btnCompute1 = (Button) findViewById(R.id.btn_comp);
        tvLabelGpa1 = (TextView) findViewById(R.id.textLabel);

        btnCompute1.setOnClickListener(this::doCompute);

        eT1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus)
                {
                    eT1.setBackgroundResource((int) R.color.startColor); //R.color.colorRed
                }
                if(!hasFocus)
                {
                    input1 = String.valueOf(eT1.getText());
                    if(input1.equals(""))
                    {
                        eT1.setBackgroundResource((int) R.color.colorRed); //R.color.colorRed
                    }

                    try{
                        inputDouble = Double.parseDouble(input1);
                        if(inputDouble < 0.0)
                        {
                            throw new NumberFormatException();
                        }

                    }catch(NumberFormatException e){
                        eT1.setBackgroundResource((int) R.color.colorRed);
                    }
                }
            }
        });

        eT2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // was here
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus)
                {
                    eT2.setBackgroundResource((int) R.color.startColor); //R.color.colorRed
                }
                if(!hasFocus)
                {
                    input2 = String.valueOf(eT2.getText());
                    if(input2.equals(""))
                    {
                        eT2.setBackgroundResource((int) R.color.colorRed); //R.color.colorRed
                    }

                    try{
                        inputDouble = Double.parseDouble(input2);
                        if(inputDouble < 0.0)
                        {
                            throw new NumberFormatException();
                        }

                    }catch(NumberFormatException e){
                        eT2.setBackgroundResource((int) R.color.colorRed);
                    }
                }
            }
        });

        eT3.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus)
                {
                    eT3.setBackgroundResource((int) R.color.startColor); //R.color.colorRed
                }
                if(!hasFocus)
                {
                    input3 = String.valueOf(eT3.getText());
                    if(input3.equals(""))
                    {
                        eT3.setBackgroundResource((int) R.color.colorRed); //R.color.colorRed
                    }

                    try{
                        inputDouble = Double.parseDouble(input3);
                        if(inputDouble < 0.0)
                        {
                            throw new NumberFormatException();
                        }

                    }catch(NumberFormatException e){
                        eT3.setBackgroundResource((int) R.color.colorRed);
                    }
                }
            }
        });

        eT4.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus)
                {
                    eT4.setBackgroundResource((int) R.color.startColor); //R.color.colorRed
                }
                if(!hasFocus)
                {
                    input4 = String.valueOf(eT4.getText());
                    if(input4.equals(""))
                    {
                        eT4.setBackgroundResource((int) R.color.colorRed); //R.color.colorRed
                    }

                    try{
                        inputDouble = Double.parseDouble(input4);
                        if(inputDouble < 0.0)
                        {
                            throw new NumberFormatException();
                        }

                    }catch(NumberFormatException e){
                        eT4.setBackgroundResource((int) R.color.colorRed);
                    }
                }
            }
        });

        eT5.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus)
                {
                    eT5.setBackgroundResource((int) R.color.startColor); //R.color.colorRed

                }
                if(!hasFocus)
                {
                    input5 = String.valueOf(eT5.getText());
                    if(input5.equals(""))
                    {
                        eT5.setBackgroundResource((int) R.color.colorRed); //R.color.colorRed
                    }

                    try{
                        inputDouble = Double.parseDouble(input5);
                        if(inputDouble < 0.0)
                        {
                            throw new NumberFormatException();
                        }

                    }catch(NumberFormatException e){
                        eT5.setBackgroundResource((int) R.color.colorRed);
                    }
                }
            }

        }

        );

    }


    public void doCompute(View view) {
        dontCalc = true;
        input1 = String.valueOf(eT1.getText());
        input2 = String.valueOf(eT2.getText());
        input3 = String.valueOf(eT3.getText());
        input4 = String.valueOf(eT4.getText());
        input5 = String.valueOf(eT5.getText());
        //view.setBackgroundResource(color.colorPrimaryDark);

        if(input1.equals(""))
        {
            tvLabelGpa1.setText("Incomplete field enter data please");
            //eT1.setBackgroundResource((int) R.color.colorRed); //R.color.colorRed
            dontCalc = false;

        }
        else if(input2.equals(""))
        {
            tvLabelGpa1.setText("Incomplete field enter data please");
            //eT2.setBackgroundResource((int) R.color.colorRed);
            dontCalc = false;
        }
        else if(input3.equals(""))
        {
            tvLabelGpa1.setText("Incomplete field enter data please");
            //eT3.setBackgroundResource((int) R.color.colorRed);
            dontCalc = false;

        }
        else if(input4.equals(""))
        {
            tvLabelGpa1.setText("Incomplete field enter data please");
            //eT4.setBackgroundResource((int) R.color.colorRed);
            dontCalc = false;
        }
        else if(input5.equals(""))
        {
            tvLabelGpa1.setText("Incomplete field enter data please");
            //eT5.setBackgroundResource((int) R.color.colorRed);
            dontCalc = false;
        }
        else
        {
            try{
                inputDouble = Double.parseDouble(input1);
                if(inputDouble < 0.0)
                {
                    //eT1.setBackgroundResource((int) R.color.colorRed);
                    throw new NumberFormatException();

                }
                else
                {
                    gpa += inputDouble;
                }
            }catch(NumberFormatException e){
                tvLabelGpa1.setText("Field one's value is not a valid number");
                gpa = 0;
                dontCalc = false;
                //Log.e("",e.getMessage());
            }

            try{
                inputDouble = Double.parseDouble(input2);
                if(inputDouble < 0.0)
                {
                    //eT2.setBackgroundResource((int) R.color.colorRed);
                    throw new NumberFormatException();
                }
                else
                {
                    gpa += inputDouble;
                }
            }catch(NumberFormatException e){
                tvLabelGpa1.setText("Field two's value is not a valid number");
                gpa = 0;
                dontCalc = false;
                //Log.e("",e.getMessage());
            }

            try{
                inputDouble = Double.parseDouble(input3);
                if(inputDouble < 0.0)
                {
                    //eT3.setBackgroundResource((int) R.color.colorRed);
                    throw new NumberFormatException();
                }
                else
                {
                    gpa += inputDouble;
                }
            }catch(NumberFormatException e){
                tvLabelGpa1.setText("Field three's value is not a valid number");
                gpa = 0;
                dontCalc = false;
                //Log.e("",e.getMessage());
            }

            try{
                inputDouble = Double.parseDouble(input4);
                if(inputDouble < 0.0)
                {
                    //eT4.setBackgroundResource((int) R.color.colorRed);
                    throw new NumberFormatException();
                }
                else
                {
                    gpa += inputDouble;
                }
            }catch(NumberFormatException e){
                tvLabelGpa1.setText("Field four's value is not a valid number");
                gpa = 0;
                dontCalc = false;
                //Log.e("",e.getMessage());
            }

            try{
                inputDouble = Double.parseDouble(input5);
                if(inputDouble < 0.0)
                {
                    //eT5.setBackgroundResource((int) R.color.colorRed);
                    throw new NumberFormatException();
                }
                else
                {
                    gpa += inputDouble;
                }
            }catch(NumberFormatException e){
                tvLabelGpa1.setText("Field fives's value is not a valid number");
                gpa = 0;
                dontCalc = false;
                //Log.e("",e.getMessage());
            }

            if(dontCalc == true)
            {
                tvLabelGpa1.setText(new Double(gpa/5).toString());
                gpa = gpa/5;

                if(gpa < 60) {
                    //view.setBackgroundColor((int) color.colorRed);
                    //view.setBackgroundColor((int) color.colorRed);// it autoconverted from the resource to color.ColorRed this intended?
                    //view.setBackgroundResource((int)style.AppTheme2);
                    //view.setBackgroundColor((int) R.color.colorRed); //R.color.colorRed
                    view.setBackgroundResource((int) R.color.colorRed);
                    tvLabelGpa1.setBackgroundResource((int) R.color.colorRed);
                }
                else if(gpa >= 60 && gpa < 80)
                {
                    //view.setBackgroundColor((int) color.colorYellow);
                    //view.setBackgroundColor((int) R.color.colorYellow); //R.color.colorYellow
                    view.setBackgroundResource((int) R.color.colorYellow);
                    tvLabelGpa1.setBackgroundResource((int)R.color.colorYellow);

                }
                else
                {
                    //view.setBackgroundColor((int) R.color.colorGreen);
                    view.setBackgroundResource((int)R.color.colorGreen);
                    tvLabelGpa1.setBackgroundResource((int)R.color.colorGreen);
                }

                btnCompute1.setText("clear form");
                //view.setBackgroundColor();

                btnCompute1.setOnClickListener(this::doClearForm);
                eT1.requestFocus();
            }
        }
    }

    public void doClearForm(View view){
        eT1.setText("");
        eT2.setText("");
        eT3.setText("");
        eT4.setText("");
        eT5.setText("");
        btnCompute1.setOnClickListener(this::doCompute);
        btnCompute1.setText("Compute GPA");
        view.setBackgroundColor((int) R.color.startColor);
        tvLabelGpa1.setBackgroundResource((int)R.color.startColor);
        clearflag = true;
        eT1.requestFocus();
    }

}