package com.mailingdelgadomedina.icecreamsundaemaker;



import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
SeekBar seekbar;
TextView hotFudgeTextView;
TextView totalTextView;
Spinner sizeSpinner;
Spinner flavorSpinner;
CheckBox peanutsCheckbox, mmsCheckbox, almondsCheckbox, brownieCheckbox, strawberriesCheckbox, oreosCheckbox, gummybearsCheckbox, marshmallowsCheckbox;
    NumberFormat numFormat;
    Integer zeroNum = 0, oneNum = 1, twoNum = 2, threeNum = 3;
    String result;


    Double Small = 2.99, Medium = 3.99, Large = 4.99, oneOunce= 0.15, twoOunces = 0.25, threeOunces = 0.30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekbar = findViewById(R.id.seekBar);
        hotFudgeTextView = findViewById(R.id.hotfudge_oz_textView);
        sizeSpinner = findViewById(R.id.size_spinner);
        flavorSpinner = findViewById(R.id.flavors_spinner);
        totalTextView = findViewById(R.id.total_text_view);
        numFormat =  NumberFormat.getCurrencyInstance();
        peanutsCheckbox = findViewById(R.id.peanuts_checkBox);
        mmsCheckbox = findViewById(R.id.mm_checkBox);
        almondsCheckbox = findViewById(R.id.almonds_checkBox);
        brownieCheckbox = findViewById(R.id.brownies_checkBox);
        strawberriesCheckbox = findViewById(R.id.strawberries_checkBox);
        oreosCheckbox = findViewById(R.id.oreos_checkBox);
        gummybearsCheckbox = findViewById(R.id.gummybears_checkBox);
        marshmallowsCheckbox = findViewById(R.id.marshmallows_checkBox);



        flavorSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              //  totalTextView.setText(flavorSpinner.getSelectedItem().toString());
                Toast.makeText(MainActivity.this,flavorSpinner.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
                totalTextView.setText(numFormat.format(oneOunce + Small));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });





        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(MainActivity.this,"Progress Updated", Toast.LENGTH_SHORT).show();
            hotFudgeTextView.setText(progress +"oz");
              int pos = sizeSpinner.getSelectedItemPosition();
                String result;
                Double SmallOneOunce = Small + oneOunce, SmallTwoOunces = Small + twoOunces, SmallThreeOunces = Small + threeOunces,
                MediumOneOunce = Medium + oneOunce, MediumTwoOunces = Medium + twoOunces, MediumThreeOunces = Medium + threeOunces,
                LargeOneOunce = Large + oneOunce, LargeTwoOunces = Large + twoOunces, LargeThreeOunces = Large + threeOunces;



            if (seekbar.getProgress() == zeroNum  && pos == zeroNum){

                totalTextView.setText(numFormat.format(Small ));
            }if (seekbar.getProgress() == oneNum && pos == zeroNum){
                    result = numFormat.format(SmallOneOunce);
                    totalTextView.setText(result);
                    //totalTextView.setText(Double.toString( ));
                }if (seekbar.getProgress() == twoNum  && pos == zeroNum){
                    result = numFormat.format(SmallTwoOunces);
                    totalTextView.setText(result);
                   // totalTextView.setText(Double.toString(Small + twoOunces));
                }if (seekbar.getProgress() == threeNum  && pos == zeroNum){
                    result = numFormat.format(SmallThreeOunces);
                    totalTextView.setText(result);
                   // totalTextView.setText(Double.toString(Small + threeOunces));
                }if (seekbar.getProgress() == zeroNum  && pos == oneNum){

                    totalTextView.setText(numFormat.format(Medium));
                   // totalTextView.setText(Double.toString(Medium ));
                }if (seekbar.getProgress() == oneNum  && pos == oneNum){
                    result = numFormat.format(MediumOneOunce);
                    totalTextView.setText(result);
                    //totalTextView.setText(Double.toString( oneOunce + Medium ));
                }if (seekbar.getProgress() == twoNum && pos == oneNum){
                    result = numFormat.format(MediumTwoOunces);
                    totalTextView.setText(result);
                   // totalTextView.setText(Double.toString(Medium + twoOunces));
                }if (seekbar.getProgress() == threeNum  && pos == oneNum){
                    result = numFormat.format(MediumThreeOunces);
                    totalTextView.setText(result);
                    //totalTextView.setText(Double.toString(Medium + threeOunces ));
                }if (seekbar.getProgress() == zeroNum  && pos == twoNum){

                    totalTextView.setText(numFormat.format(Large ));
                }if (seekbar.getProgress() == oneNum  && pos == twoNum){
                    result = numFormat.format(LargeOneOunce);
                    totalTextView.setText(result);
                   // totalTextView.setText(Double.toString(Large + oneOunce ));
                }if (seekbar.getProgress() == twoNum  && pos == twoNum){
                    result = numFormat.format(LargeTwoOunces);
                    totalTextView.setText(result);
                    //totalTextView.setText(Double.toString(Large +twoOunces ));
                }else if (seekbar.getProgress() == threeNum  && pos == twoNum){
                    result = numFormat.format(LargeThreeOunces);
                    totalTextView.setText(result);
                    //totalTextView.setText(Double.toString(Large + threeOunces));
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sizeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              //  totalTextView.setText(Integer.toString(position));
            //me quede aqui
          if (sizeSpinner.getSelectedItemPosition() == zeroNum && seekbar.getProgress() == zeroNum ){



                   totalTextView.setText(numFormat.format(Small));


            }if (sizeSpinner.getSelectedItemPosition() == zeroNum && seekbar.getProgress() == oneNum){
                    result = numFormat.format(Small + oneOunce);
                    totalTextView.setText(result);
                }
                if (sizeSpinner.getSelectedItemPosition() == zeroNum && seekbar.getProgress() == twoNum){
                    result = numFormat.format(Small + twoOunces);
                    totalTextView.setText(result);
                }if (sizeSpinner.getSelectedItemPosition() == zeroNum && seekbar.getProgress() == threeNum){
                    result = numFormat.format(Small + threeOunces);
                    totalTextView.setText(result);
                }if (sizeSpinner.getSelectedItemPosition() == oneNum &&  seekbar.getProgress() == zeroNum){
                 totalTextView.setText(numFormat.format(Medium));
               }if (sizeSpinner.getSelectedItemPosition() == oneNum && seekbar.getProgress() == oneNum){
                    result = numFormat.format(Medium + oneOunce);
                    totalTextView.setText(result);
                }if (sizeSpinner.getSelectedItemPosition() == oneNum && seekbar.getProgress() == twoNum){
                    result = numFormat.format(Medium + twoOunces);
                    totalTextView.setText(result);
                }if (sizeSpinner.getSelectedItemPosition() == oneNum && seekbar.getProgress() == threeNum){
                    result = numFormat.format(Medium + threeOunces);
                    totalTextView.setText(result);
                }if (sizeSpinner.getSelectedItemPosition() == twoNum && seekbar.getProgress() == zeroNum){
                    totalTextView.setText(numFormat.format(Large));
               }if (sizeSpinner.getSelectedItemPosition() == twoNum && seekbar.getProgress() == oneNum){
                    result = numFormat.format(Large + oneOunce);
                    totalTextView.setText(result);
                }if (sizeSpinner.getSelectedItemPosition() == twoNum && seekbar.getProgress() == twoNum){
                    result = numFormat.format(Large + twoOunces);
                    totalTextView.setText(result);
                }else if (sizeSpinner.getSelectedItemPosition() == twoNum && seekbar.getProgress() == threeNum){
                    result = numFormat.format(Large + threeOunces);
                    totalTextView.setText(result);
                }

                    //Este muestra el nombre de la seleccion
                // totalTextView.setText(sizeSpinner.getSelectedItem().toString());

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

    //TODO Menu
    public void checkboxesUpdate(){
        Double subTotal, Peanuts = 0.15, MMs = 0.25, Almonds = 0.15,Brownie = 0.20, Strawberries = 0.20,Oreos = 0.20,GummyBears = 0.20,Marshmallows = 0.15;

        int sizeSpinnerSelection = sizeSpinner.getSelectedItemPosition(), seekBarSelection = seekbar.getProgress() ;

try {

    //no fudge DONE
    if(sizeSpinnerSelection == zeroNum && seekBarSelection == zeroNum){
        //indivdual
    if(peanutsCheckbox.isChecked()){
        subTotal = Peanuts + Small;
        result = numFormat.format(subTotal);

    }
    if(mmsCheckbox.isChecked()){
            subTotal = MMs + Small;
            result = numFormat.format(subTotal);

        }
    if(almondsCheckbox.isChecked()){
            subTotal = Almonds + Small;
            result = numFormat.format(subTotal);

        }
    if(brownieCheckbox.isChecked()){
            subTotal = Brownie + Small;
            result = numFormat.format(subTotal);

        }
    if(strawberriesCheckbox.isChecked()){
            subTotal = Strawberries + Small;
            result = numFormat.format(subTotal);

        }
    if(oreosCheckbox.isChecked()){
            subTotal = Oreos + Small;
            result = numFormat.format(subTotal);

        }
    if(gummybearsCheckbox.isChecked()){
            subTotal = GummyBears + Small;
            result = numFormat.format(subTotal);

        }
    if(marshmallowsCheckbox.isChecked()){
            subTotal = Marshmallows + Small;
            result = numFormat.format(subTotal);

        }
///////

        //PEANUTS selection
        //peanuts & MMs
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked()){
            subTotal = Peanuts + MMs + Small;
            result = numFormat.format(subTotal);

        }
        //peanuts, MMs, Almonds
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Small;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Small;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Small;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos + Small;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos+ GummyBears + Small;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Small;
            result = numFormat.format(subTotal);
        }





        //MMs selection
        // MMs, Almonds
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked()){
            subTotal =  MMs + Almonds  + Small;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked()){
            subTotal =  MMs + Almonds + Brownie  + Small;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Small;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()   ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + Small;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos, gummy
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Small;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows+ Small;
            result = numFormat.format(subTotal);
        }

        //ALMONDS selection
        //  Almonds, brownie
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked()   ){
            subTotal =   Almonds + Brownie +  Small;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries +  Small;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + Small;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos, gummy
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + GummyBears +  Small;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows+ Small;
            result = numFormat.format(subTotal);
        }


        //BROWNIE selection
        // brownie, strawberries
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Small;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + Small;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos, gummy
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + GummyBears + Small;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos, gummy,marshmallow
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + GummyBears + Marshmallows+ Small;
            result = numFormat.format(subTotal);
        }


        //STRAWBERRIES selection
        // strawberries,oreos
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal =  Strawberries + Oreos +  Small;
            result = numFormat.format(subTotal);
        }
        //  strawberries,oreos, gummy
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =  Strawberries + Oreos + GummyBears + Small;
            result = numFormat.format(subTotal);
        }
        //  strawberries,oreos, gummy,marshmallow
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  Strawberries + Oreos + GummyBears + Marshmallows+ Small;
            result = numFormat.format(subTotal);
        }

        //OREOS selection
        //  oreos, gummy
        if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =   Oreos + GummyBears + Small;
            result = numFormat.format(subTotal);
        }
        //  oreos, gummy,marshmallow
        if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =   Oreos + GummyBears + Marshmallows+ Small;
            result = numFormat.format(subTotal);
        }


        //GUMMY selection
        // gummy,marshmallow
        if( gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  GummyBears + Marshmallows+ Small;
            result = numFormat.format(subTotal);
        }






    }
    if (sizeSpinnerSelection == oneNum && seekBarSelection == zeroNum){

        if(peanutsCheckbox.isChecked()){
            subTotal = Peanuts + Medium;
            result = numFormat.format(subTotal);

        } if(mmsCheckbox.isChecked()){
            subTotal = MMs + Medium;
            result = numFormat.format(subTotal);

        } if(almondsCheckbox.isChecked()){
            subTotal = Almonds + Medium;
            result = numFormat.format(subTotal);

        } if(brownieCheckbox.isChecked()){
            subTotal = Brownie + Medium;
            result = numFormat.format(subTotal);

        } if(strawberriesCheckbox.isChecked()){
            subTotal = Strawberries + Medium;
            result = numFormat.format(subTotal);

        } if(oreosCheckbox.isChecked()){
            subTotal = Oreos + Medium;
            result = numFormat.format(subTotal);

        } if(gummybearsCheckbox.isChecked()){
            subTotal = GummyBears + Medium;
            result = numFormat.format(subTotal);

        } if(marshmallowsCheckbox.isChecked()){
            subTotal = Marshmallows + Medium;
            result = numFormat.format(subTotal);

        }

        //PEANUTS selection Medium
        //peanuts & MMs
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked()){
            subTotal = Peanuts + MMs + Medium;
            result = numFormat.format(subTotal);

        }
        //peanuts, MMs, Almonds
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Medium;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Medium;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Medium;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos + Medium;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos+ GummyBears + Medium;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Medium;
            result = numFormat.format(subTotal);
        }





        //MMs selection Medium
        // MMs, Almonds
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked()){
            subTotal =  MMs + Almonds  + Medium;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked()){
            subTotal =  MMs + Almonds + Brownie  + Medium;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Medium;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()   ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + Medium;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos, gummy
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Medium;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Medium;
            result = numFormat.format(subTotal);
        }

        //ALMONDS selection Medium
        //  Almonds, brownie
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked()   ){
            subTotal =   Almonds + Brownie +  Medium;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries +  Medium;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + Medium;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos, gummy
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + GummyBears +  Medium;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows+ Medium;
            result = numFormat.format(subTotal);
        }


        //BROWNIE selection Medium
        // brownie, strawberries
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Medium;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + Medium;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos, gummy
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + GummyBears + Medium;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos, gummy,marshmallow
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Medium ;
            result = numFormat.format(subTotal);
        }


        //STRAWBERRIES selection Medium
        // strawberries,oreos
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal =  Strawberries + Oreos +  Medium;
            result = numFormat.format(subTotal);
        }
        //  strawberries,oreos, gummy
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =  Strawberries + Oreos + GummyBears + Medium;
            result = numFormat.format(subTotal);
        }
        //  strawberries,oreos, gummy,marshmallow
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  Strawberries + Oreos + GummyBears + Marshmallows+ Medium;
            result = numFormat.format(subTotal);
        }

        //OREOS selection Medium
        //  oreos, gummy
        if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =   Oreos + GummyBears + Medium;
            result = numFormat.format(subTotal);
        }
        //  oreos, gummy,marshmallow
        if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =   Oreos + GummyBears + Marshmallows+ Medium;
            result = numFormat.format(subTotal);
        }


        //GUMMY selection Medium
        // gummy,marshmallow
        if( gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  GummyBears + Marshmallows+ Medium;
            result = numFormat.format(subTotal);
        }



    }
    if (sizeSpinnerSelection == twoNum && seekBarSelection == zeroNum){

        if(peanutsCheckbox.isChecked()){
            subTotal = Peanuts + Large;
            result = numFormat.format(subTotal);

        } if(mmsCheckbox.isChecked()){
            subTotal = MMs + Large;
            result = numFormat.format(subTotal);

        } if(almondsCheckbox.isChecked()){
            subTotal = Almonds + Large;
            result = numFormat.format(subTotal);

        } if(brownieCheckbox.isChecked()){
            subTotal = Brownie + Large;
            result = numFormat.format(subTotal);

        } if(strawberriesCheckbox.isChecked()){
            subTotal = Strawberries + Large;
            result = numFormat.format(subTotal);

        } if(oreosCheckbox.isChecked()){
            subTotal = Oreos + Large;
            result = numFormat.format(subTotal);

        } if(gummybearsCheckbox.isChecked()){
            subTotal = GummyBears + Large;
            result = numFormat.format(subTotal);

        } if(marshmallowsCheckbox.isChecked()){
            subTotal = Marshmallows + Large;
            result = numFormat.format(subTotal);

        }

        //PEANUTS selection Large
        //peanuts & MMs
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked()){
            subTotal = Peanuts + MMs + Large;
            result = numFormat.format(subTotal);

        }
        //peanuts, MMs, Almonds
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Large;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Large;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Large;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos + Large;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos+ GummyBears + Large;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Large;
            result = numFormat.format(subTotal);
        }





        //MMs selection Large
        // MMs, Almonds
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked()){
            subTotal =  MMs + Almonds  + Large;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked()){
            subTotal =  MMs + Almonds + Brownie  + Large;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Large;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()   ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + Large;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos, gummy
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Large;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows+ Large;
            result = numFormat.format(subTotal);
        }

        //ALMONDS selection Large
        //  Almonds, brownie
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked()   ){
            subTotal =   Almonds + Brownie +  Large;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries +  Large;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + Large;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos, gummy
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + GummyBears +  Large;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows+ Large;
            result = numFormat.format(subTotal);
        }


        //BROWNIE selection Large
        // brownie, strawberries
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Large;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + Large;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos, gummy
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + GummyBears + Large;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos, gummy,marshmallow
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + GummyBears + Marshmallows+ Large;
            result = numFormat.format(subTotal);
        }


        //STRAWBERRIES selection Large
        // strawberries,oreos
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal =  Strawberries + Oreos +  Large;
            result = numFormat.format(subTotal);
        }
        //  strawberries,oreos, gummy
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =  Strawberries + Oreos + GummyBears + Large;
            result = numFormat.format(subTotal);
        }
        //  strawberries,oreos, gummy,marshmallow
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  Strawberries + Oreos + GummyBears + Marshmallows+ Large;
            result = numFormat.format(subTotal);
        }

        //OREOS selection Large
        //  oreos, gummy
        if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =   Oreos + GummyBears + Large;
            result = numFormat.format(subTotal);
        }
        //  oreos, gummy,marshmallow
        if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =   Oreos + GummyBears + Marshmallows+ Large;
            result = numFormat.format(subTotal);
        }


        //GUMMY selection Large
        // gummy,marshmallow
        if( gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  GummyBears + Marshmallows+ Large;
            result = numFormat.format(subTotal);
        }



    }



    //1oz Done
    if (sizeSpinnerSelection == zeroNum && seekBarSelection == oneNum){
//1oz fudge
        if(peanutsCheckbox.isChecked()){
            subTotal = Peanuts + Small + oneOunce;
            result = numFormat.format(subTotal);

        } if(mmsCheckbox.isChecked()){
            subTotal = MMs +  Small + oneOunce;
            result = numFormat.format(subTotal);

        } if(almondsCheckbox.isChecked()){
            subTotal = Almonds +  Small + oneOunce;
            result = numFormat.format(subTotal);

        } if(brownieCheckbox.isChecked()){
            subTotal = Brownie +  Small + oneOunce;
            result = numFormat.format(subTotal);

        } if(strawberriesCheckbox.isChecked()){
            subTotal = Strawberries +  Small + oneOunce;
            result = numFormat.format(subTotal);

        } if(oreosCheckbox.isChecked()){
            subTotal = Oreos +  Small + oneOunce;
            result = numFormat.format(subTotal);

        } if(gummybearsCheckbox.isChecked()){
            subTotal = GummyBears +  Small + oneOunce;
            result = numFormat.format(subTotal);

        } if(marshmallowsCheckbox.isChecked()){
            subTotal = Marshmallows +  Small + oneOunce;
            result = numFormat.format(subTotal);

        }



        //PEANUTS selection Small one ounce
        //peanuts & MMs
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked()){
            subTotal = Peanuts + MMs + Small + oneOunce;
            result = numFormat.format(subTotal);

        }
        //peanuts, MMs, Almonds
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Small + oneOunce;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Small + oneOunce;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Small + oneOunce;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos + Small + oneOunce;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos+ GummyBears + Small + oneOunce;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Small + oneOunce;
            result = numFormat.format(subTotal);
        }





        //MMs selection + oneOunce
        // MMs, Almonds
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked()){
            subTotal =  MMs + Almonds  + Small + oneOunce;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked()){
            subTotal =  MMs + Almonds + Brownie  + Small + oneOunce;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Small + oneOunce;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()   ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + Small + oneOunce;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos, gummy
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Small + oneOunce;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Small + oneOunce;
            result = numFormat.format(subTotal);
        }

        //ALMONDS selection + oneOunce
        //  Almonds, brownie
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked()   ){
            subTotal =   Almonds + Brownie +  Small + oneOunce;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries +  Small + oneOunce;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + Small + oneOunce;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos, gummy
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + GummyBears +  Small + oneOunce;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Small + oneOunce;
            result = numFormat.format(subTotal);
        }


        //BROWNIE selection + oneOunce
        // brownie, strawberries
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Small + oneOunce;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + Small + oneOunce;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos, gummy
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + GummyBears + Small + oneOunce;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos, gummy,marshmallow
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Small + oneOunce;
            result = numFormat.format(subTotal);
        }


        //STRAWBERRIES selection + oneOunce
        // strawberries,oreos
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal =  Strawberries + Oreos +  Small + oneOunce;
            result = numFormat.format(subTotal);
        }
        //  strawberries,oreos, gummy
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =  Strawberries + Oreos + GummyBears + Small + oneOunce;
            result = numFormat.format(subTotal);
        }
        //  strawberries,oreos, gummy,marshmallow
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  Strawberries + Oreos + GummyBears + Marshmallows + Small + oneOunce;
            result = numFormat.format(subTotal);
        }

        //OREOS selection + oneOunce
        //  oreos, gummy
        if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =   Oreos + GummyBears + Small + oneOunce;
            result = numFormat.format(subTotal);
        }
        //  oreos, gummy,marshmallow + oneOunce
        if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =   Oreos + GummyBears + Marshmallows + Small + oneOunce;
            result = numFormat.format(subTotal);
        }


        //GUMMY selection + oneOunce
        // gummy,marshmallow
        if( gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  GummyBears + Marshmallows+ Small + oneOunce;
            result = numFormat.format(subTotal);
        }




    }
    if (sizeSpinnerSelection == oneNum && seekBarSelection == oneNum){
        //1oz med
        if(peanutsCheckbox.isChecked()){
            subTotal = Peanuts + Medium + oneOunce;
            result = numFormat.format(subTotal);

        } if(mmsCheckbox.isChecked()){
            subTotal = MMs +  Medium + oneOunce;
            result = numFormat.format(subTotal);

        } if(almondsCheckbox.isChecked()){
            subTotal = Almonds +  Medium + oneOunce;
            result = numFormat.format(subTotal);

        } if(brownieCheckbox.isChecked()){
            subTotal = Brownie +  Medium + oneOunce;
            result = numFormat.format(subTotal);

        } if(strawberriesCheckbox.isChecked()){
            subTotal = Strawberries + Medium + oneOunce;
            result = numFormat.format(subTotal);

        } if(oreosCheckbox.isChecked()){
            subTotal = Oreos + Medium + oneOunce;
            result = numFormat.format(subTotal);

        } if(gummybearsCheckbox.isChecked()){
            subTotal = GummyBears +  Medium + oneOunce;
            result = numFormat.format(subTotal);

        } if(marshmallowsCheckbox.isChecked()){
            subTotal = Marshmallows +  Medium + oneOunce;
            result = numFormat.format(subTotal);

        }

        //PEANUTS selection Medium + oneOunce
        //peanuts & MMs
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked()){
            subTotal = Peanuts + MMs + Medium + oneOunce;
            result = numFormat.format(subTotal);

        }
        //peanuts, MMs, Almonds
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Medium + oneOunce;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Medium + oneOunce;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Medium + oneOunce;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos + Medium + oneOunce;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos+ GummyBears + Medium + oneOunce;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Medium + oneOunce;
            result = numFormat.format(subTotal);
        }





        //MMs selection Medium + oneOunce
        // MMs, Almonds
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked()){
            subTotal =  MMs + Almonds  + Medium + oneOunce;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked()){
            subTotal =  MMs + Almonds + Brownie  + Medium + oneOunce;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Medium + oneOunce;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()   ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + Medium + oneOunce;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos, gummy
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Medium + oneOunce;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Medium + oneOunce;
            result = numFormat.format(subTotal);
        }



        //ALMONDS selection Medium + oneOunce
        //  Almonds, brownie
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked()   ){
            subTotal =   Almonds + Brownie +  Medium + oneOunce;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries +  Medium + oneOunce;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + Medium + oneOunce;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos, gummy
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + GummyBears +  Medium + oneOunce;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Medium + oneOunce;
            result = numFormat.format(subTotal);
        }


        //BROWNIE selection Medium + oneOunce
        // brownie, strawberries
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Medium + oneOunce;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + Medium + oneOunce;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos, gummy
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + GummyBears + Medium + oneOunce;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos, gummy,marshmallow
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Medium + oneOunce;
            result = numFormat.format(subTotal);
        }


        //STRAWBERRIES selection Medium
        // strawberries,oreos
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal =  Strawberries + Oreos +  Medium + oneOunce;
            result = numFormat.format(subTotal);
        }
        //  strawberries,oreos, gummy
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =  Strawberries + Oreos + GummyBears + Medium + oneOunce;
            result = numFormat.format(subTotal);
        }
        //  strawberries,oreos, gummy,marshmallow
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  Strawberries + Oreos + GummyBears + Marshmallows + Medium + oneOunce;
            result = numFormat.format(subTotal);
        }

        //OREOS selection Medium
        //  oreos, gummy
        if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =   Oreos + GummyBears + Medium + oneOunce;
            result = numFormat.format(subTotal);
        }
        //  oreos, gummy,marshmallow
        if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =   Oreos + GummyBears + Marshmallows + Medium + oneOunce;
            result = numFormat.format(subTotal);
        }


        //GUMMY selection Medium + oneOunce
        // gummy,marshmallow
        if( gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  GummyBears + Marshmallows + Medium + oneOunce ;
            result = numFormat.format(subTotal);
        }





    }
    if (sizeSpinnerSelection == twoNum && seekBarSelection == oneNum){
        //1oz large
        if(peanutsCheckbox.isChecked()){
            subTotal = Peanuts + Large + oneOunce;
            result = numFormat.format(subTotal);

        } if(mmsCheckbox.isChecked()){
            subTotal = MMs +  Large + oneOunce;
            result = numFormat.format(subTotal);

        } if(almondsCheckbox.isChecked()){
            subTotal = Almonds +  Large + oneOunce;
            result = numFormat.format(subTotal);

        } if(brownieCheckbox.isChecked()){
            subTotal = Brownie +  Large + oneOunce;
            result = numFormat.format(subTotal);

        } if(strawberriesCheckbox.isChecked()){
            subTotal = Strawberries +  Large + oneOunce;
            result = numFormat.format(subTotal);

        } if(oreosCheckbox.isChecked()){
            subTotal = Oreos +  Large + oneOunce;
            result = numFormat.format(subTotal);

        } if(gummybearsCheckbox.isChecked()){
            subTotal = GummyBears + Large + oneOunce;
            result = numFormat.format(subTotal);

        } if(marshmallowsCheckbox.isChecked()){
            subTotal = Marshmallows +  Large + oneOunce;
            result = numFormat.format(subTotal);

        }


        //PEANUTS selection Large + oneOunce
        //peanuts & MMs
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked()){
            subTotal = Peanuts + MMs + Large + oneOunce;
            result = numFormat.format(subTotal);

        }
        //peanuts, MMs, Almonds
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Large + oneOunce;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Large + oneOunce;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Large + oneOunce;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos + Large + oneOunce;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos+ GummyBears + Large + oneOunce;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Large + oneOunce;
            result = numFormat.format(subTotal);
        }





        //MMs selection Large + oneOunce
        // MMs, Almonds
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked()){
            subTotal =  MMs + Almonds  + Large + oneOunce;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked()){
            subTotal =  MMs + Almonds + Brownie  + Large + oneOunce;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Large + oneOunce;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()   ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + Large + oneOunce;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos, gummy
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Large + oneOunce;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Large + oneOunce;
            result = numFormat.format(subTotal);
        }



        //ALMONDS selection Large + oneOunce
        //  Almonds, brownie
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked()   ){
            subTotal =   Almonds + Brownie +  Large + oneOunce;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries +  Large + oneOunce;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + Large + oneOunce;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos, gummy
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + GummyBears + Large + oneOunce;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Large + oneOunce;
            result = numFormat.format(subTotal);
        }


        //BROWNIE selection Large + oneOunce
        // brownie, strawberries
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Large + oneOunce;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + Large + oneOunce;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos, gummy
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + GummyBears + Large + oneOunce;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos, gummy,marshmallow
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Large + oneOunce;
            result = numFormat.format(subTotal);
        }


        //STRAWBERRIES selection Large 1oz
        // strawberries,oreos
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal =  Strawberries + Oreos +  Large + oneOunce;
            result = numFormat.format(subTotal);
        }
        //  strawberries,oreos, gummy
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =  Strawberries + Oreos + GummyBears + Large + oneOunce;
            result = numFormat.format(subTotal);
        }
        //  strawberries,oreos, gummy,marshmallow
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  Strawberries + Oreos + GummyBears + Marshmallows + Large + oneOunce;
            result = numFormat.format(subTotal);
        }

        //OREOS selection Large 1oz
        //  oreos, gummy
        if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =   Oreos + GummyBears + Large + oneOunce;
            result = numFormat.format(subTotal);
        }
        //  oreos, gummy,marshmallow
        if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =   Oreos + GummyBears + Marshmallows + Large + oneOunce;
            result = numFormat.format(subTotal);
        }


        //GUMMY selection Large + oneOunce
        // gummy,marshmallow
        if( gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  GummyBears + Marshmallows + Large + oneOunce ;
            result = numFormat.format(subTotal);
        }



    }


    //2oz Done
    if (sizeSpinnerSelection == zeroNum && seekBarSelection == twoNum){

        if(peanutsCheckbox.isChecked()){
            subTotal = Peanuts + Small + twoOunces;
            result = numFormat.format(subTotal);

        } if(mmsCheckbox.isChecked()){
            subTotal = MMs +  Small + twoOunces;
            result = numFormat.format(subTotal);

        } if(almondsCheckbox.isChecked()){
            subTotal = Almonds +  Small + twoOunces;
            result = numFormat.format(subTotal);

        } if(brownieCheckbox.isChecked()){
            subTotal = Brownie +  Small + twoOunces;
            result = numFormat.format(subTotal);

        } if(strawberriesCheckbox.isChecked()){
            subTotal = Strawberries +  Small + twoOunces;
            result = numFormat.format(subTotal);

        } if(oreosCheckbox.isChecked()){
            subTotal = Oreos +  Small + twoOunces;
            result = numFormat.format(subTotal);

        } if(gummybearsCheckbox.isChecked()){
            subTotal = GummyBears +  Small + twoOunces;
            result = numFormat.format(subTotal);

        } if(marshmallowsCheckbox.isChecked()){
            subTotal = Marshmallows +  Small + twoOunces;
            result = numFormat.format(subTotal);

        }




        //PEANUTS selection 2oz
        //peanuts & MMs
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked()){
            subTotal = Peanuts + MMs + Small + twoOunces;
            result = numFormat.format(subTotal);

        }
        //peanuts, MMs, Almonds
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Small + twoOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Small + twoOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Small + twoOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos + Small + twoOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos+ GummyBears + Small + twoOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Small + twoOunces;
            result = numFormat.format(subTotal);
        }





        //MMs selection 2oz small

        // MMs, Almonds
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked()){
            subTotal =  MMs + Almonds  + Small + twoOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked()){
            subTotal =  MMs + Almonds + Brownie  + Small + twoOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Small + twoOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()   ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + Small + twoOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos, gummy
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Small + twoOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Small + twoOunces;
            result = numFormat.format(subTotal);
        }

        //ALMONDS selection 2oz small
        //  Almonds, brownie
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked()   ){
            subTotal =   Almonds + Brownie +  Small + twoOunces;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries +  Small + twoOunces;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + Small + twoOunces;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos, gummy
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + GummyBears +  Small + twoOunces;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Small + twoOunces;
            result = numFormat.format(subTotal);
        }


        //BROWNIE selection 2oz small
        // brownie, strawberries
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Small + twoOunces;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + Small + twoOunces;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos, gummy
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + GummyBears + Small + twoOunces;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos, gummy,marshmallow
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Small + twoOunces;
            result = numFormat.format(subTotal);
        }


        //STRAWBERRIES selection 2 oz
        // strawberries,oreos
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal =  Strawberries + Oreos +  Small + twoOunces;
            result = numFormat.format(subTotal);
        }
        //  strawberries,oreos, gummy
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =  Strawberries + Oreos + GummyBears + Small + twoOunces;
            result = numFormat.format(subTotal);
        }
        //  strawberries,oreos, gummy,marshmallow
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  Strawberries + Oreos + GummyBears + Marshmallows + Small + twoOunces;
            result = numFormat.format(subTotal);
        }

        //OREOS selection 2oz small
        //  oreos, gummy
        if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =   Oreos + GummyBears + Small + twoOunces;
            result = numFormat.format(subTotal);
        }
        //  oreos, gummy,marshmallow
        if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =   Oreos + GummyBears + Marshmallows + Small + twoOunces;
            result = numFormat.format(subTotal);
        }


        //GUMMY selection 2oz small
        // gummy,marshmallow
        if( gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  GummyBears + Marshmallows + Small + twoOunces;
            result = numFormat.format(subTotal);
        }





    }
    if (sizeSpinnerSelection == oneNum && seekBarSelection == twoNum){
        //2oz med
        if(peanutsCheckbox.isChecked()){
            subTotal = Peanuts + Medium + twoOunces;
            result = numFormat.format(subTotal);

        } if(mmsCheckbox.isChecked()){
            subTotal = MMs +  Medium + twoOunces;
            result = numFormat.format(subTotal);

        } if(almondsCheckbox.isChecked()){
            subTotal = Almonds +  Medium + twoOunces;
            result = numFormat.format(subTotal);

        } if(brownieCheckbox.isChecked()){
            subTotal = Brownie +  Medium + twoOunces ;
            result = numFormat.format(subTotal);

        } if(strawberriesCheckbox.isChecked()){
            subTotal = Strawberries + Medium + twoOunces;
            result = numFormat.format(subTotal);

        } if(oreosCheckbox.isChecked()){
            subTotal = Oreos + Medium + twoOunces;
            result = numFormat.format(subTotal);

        } if(gummybearsCheckbox.isChecked()){
            subTotal = GummyBears +  Medium + twoOunces;
            result = numFormat.format(subTotal);

        } if(marshmallowsCheckbox.isChecked()){
            subTotal = Marshmallows +  Medium + twoOunces;
            result = numFormat.format(subTotal);

        }



        //PEANUTS selection 2oz medium
        //peanuts & MMs
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked()){
            subTotal = Peanuts + MMs + Medium + twoOunces;
            result = numFormat.format(subTotal);

        }
        //peanuts, MMs, Almonds
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Medium + twoOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Medium + twoOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Medium + twoOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos + Medium + twoOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos+ GummyBears + Medium + twoOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Medium + twoOunces;
            result = numFormat.format(subTotal);
        }





        //MMs selection 2oz medium

        // MMs, Almonds
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked()){
            subTotal =  MMs + Almonds  + Medium + twoOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked()){
            subTotal =  MMs + Almonds + Brownie  + Medium + twoOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Medium + twoOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()   ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + Medium + twoOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos, gummy
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Medium + twoOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Medium + twoOunces;
            result = numFormat.format(subTotal);
        }

        //ALMONDS selection 2oz medium
        //  Almonds, brownie
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked()   ){
            subTotal =   Almonds + Brownie +  Medium + twoOunces;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries +  Medium + twoOunces;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + Medium + twoOunces;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos, gummy
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + GummyBears +  Medium + twoOunces;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Medium + twoOunces;
            result = numFormat.format(subTotal);
        }


        //BROWNIE selection 2oz medium
        // brownie, strawberries
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Medium + twoOunces;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + Medium + twoOunces;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos, gummy
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + GummyBears + Medium + twoOunces;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos, gummy,marshmallow
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Medium + twoOunces;
            result = numFormat.format(subTotal);
        }


        //STRAWBERRIES selection 2 oz medium
        // strawberries,oreos
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal =  Strawberries + Oreos +  Medium + twoOunces;
            result = numFormat.format(subTotal);
        }
        //  strawberries,oreos, gummy
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =  Strawberries + Oreos + GummyBears + Medium + twoOunces;
            result = numFormat.format(subTotal);
        }
        //  strawberries,oreos, gummy,marshmallow
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  Strawberries + Oreos + GummyBears + Marshmallows + Medium + twoOunces;
            result = numFormat.format(subTotal);
        }

        //OREOS selection 2oz medium
        //  oreos, gummy
        if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =   Oreos + GummyBears + Medium + twoOunces;
            result = numFormat.format(subTotal);
        }
        //  oreos, gummy,marshmallow
        if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =   Oreos + GummyBears + Marshmallows + Medium + twoOunces;
            result = numFormat.format(subTotal);
        }


        //GUMMY selection 2oz medium
        // gummy,marshmallow
        if( gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  GummyBears + Marshmallows + Medium + twoOunces;
            result = numFormat.format(subTotal);
        }




    }
    if (sizeSpinnerSelection == twoNum && seekBarSelection == twoNum){
        //1oz large
        if(peanutsCheckbox.isChecked()){
            subTotal = Peanuts + Large + twoOunces;
            result = numFormat.format(subTotal);

        } if(mmsCheckbox.isChecked()){
            subTotal = MMs +  Large + twoOunces;
            result = numFormat.format(subTotal);

        } if(almondsCheckbox.isChecked()){
            subTotal = Almonds +  Large + twoOunces;
            result = numFormat.format(subTotal);

        } if(brownieCheckbox.isChecked()){
            subTotal = Brownie +  Large + twoOunces;
            result = numFormat.format(subTotal);

        } if(strawberriesCheckbox.isChecked()){
            subTotal = Strawberries +  Large + twoOunces;
            result = numFormat.format(subTotal);

        } if(oreosCheckbox.isChecked()){
            subTotal = Oreos +  Large + twoOunces;
            result = numFormat.format(subTotal);

        } if(gummybearsCheckbox.isChecked()){
            subTotal = GummyBears + Large + twoOunces;
            result = numFormat.format(subTotal);

        } if(marshmallowsCheckbox.isChecked()){
            subTotal = Marshmallows +  Large + twoOunces;
            result = numFormat.format(subTotal);
        }



        //PEANUTS selection 2oz Large
        //peanuts & MMs
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked()){
            subTotal = Peanuts + MMs + Large + twoOunces;
            result = numFormat.format(subTotal);

        }
        //peanuts, MMs, Almonds
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Large + twoOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Large + twoOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Large + twoOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos + Large + twoOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos+ GummyBears + Large + twoOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Large + twoOunces;
            result = numFormat.format(subTotal);
        }





        //MMs selection 2oz Large

        // MMs, Almonds
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked()){
            subTotal =  MMs + Almonds  + Large + twoOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked()){
            subTotal =  MMs + Almonds + Brownie  + Large + twoOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Large + twoOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()   ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + Large + twoOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos, gummy
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Large + twoOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Large + twoOunces;
            result = numFormat.format(subTotal);
        }

        //ALMONDS selection 2oz Large
        //  Almonds, brownie
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked()   ){
            subTotal =   Almonds + Brownie +  Large + twoOunces;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries +  Large + twoOunces;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + Large + twoOunces;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos, gummy
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + GummyBears +  Large + twoOunces;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Large + twoOunces;
            result = numFormat.format(subTotal);
        }


        //BROWNIE selection 2oz Large
        // brownie, strawberries
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Large + twoOunces;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + Large + twoOunces;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos, gummy
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + GummyBears + Large + twoOunces;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos, gummy,marshmallow
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Large + twoOunces;
            result = numFormat.format(subTotal);
        }


        //STRAWBERRIES selection 2 oz Large
        // strawberries,oreos
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal =  Strawberries + Oreos +  Large + twoOunces;
            result = numFormat.format(subTotal);
        }
        //  strawberries,oreos, gummy
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =  Strawberries + Oreos + GummyBears + Large + twoOunces;
            result = numFormat.format(subTotal);
        }
        //  strawberries,oreos, gummy,marshmallow
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  Strawberries + Oreos + GummyBears + Marshmallows + Large + twoOunces;
            result = numFormat.format(subTotal);
        }

        //OREOS selection 2oz Large
        //  oreos, gummy
        if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =   Oreos + GummyBears + Large + twoOunces;
            result = numFormat.format(subTotal);
        }
        //  oreos, gummy,marshmallow
        if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =   Oreos + GummyBears + Marshmallows + Large + twoOunces;
            result = numFormat.format(subTotal);
        }


        //GUMMY selection 2oz medium
        // gummy,marshmallow
        if( gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  GummyBears + Marshmallows + Large + twoOunces;
            result = numFormat.format(subTotal);
        }


    }

    //3oz Done
    if (sizeSpinnerSelection == zeroNum && seekBarSelection == threeNum){
//1oz fudge
        if(peanutsCheckbox.isChecked()){
            subTotal = Peanuts + Small + threeOunces;
            result = numFormat.format(subTotal);

        } if(mmsCheckbox.isChecked()){
            subTotal = MMs +  Small + threeOunces;
            result = numFormat.format(subTotal);

        } if(almondsCheckbox.isChecked()){
            subTotal = Almonds +  Small + threeOunces;
            result = numFormat.format(subTotal);

        } if(brownieCheckbox.isChecked()){
            subTotal = Brownie +  Small + threeOunces;
            result = numFormat.format(subTotal);

        } if(strawberriesCheckbox.isChecked()){
            subTotal = Strawberries +  Small + threeOunces;
            result = numFormat.format(subTotal);

        } if(oreosCheckbox.isChecked()){
            subTotal = Oreos +  Small + threeOunces;
            result = numFormat.format(subTotal);

        } if(gummybearsCheckbox.isChecked()){
            subTotal = GummyBears +  Small + threeOunces;
            result = numFormat.format(subTotal);

        } if(marshmallowsCheckbox.isChecked()){
            subTotal = Marshmallows +  Small + threeOunces;
            result = numFormat.format(subTotal);

        }

        /////

        //PEANUTS selection 3oz small
        //peanuts & MMs
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked()){
            subTotal = Peanuts + MMs + Small + threeOunces;
            result = numFormat.format(subTotal);

        }
        //peanuts, MMs, Almonds
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Small + threeOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Small + threeOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Small + threeOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos + Small + threeOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos+ GummyBears + Small + threeOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Small + threeOunces;
            result = numFormat.format(subTotal);
        }





        //MMs selection Small + threeOunces

        // MMs, Almonds
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked()){
            subTotal =  MMs + Almonds  + Small + threeOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked()){
            subTotal =  MMs + Almonds + Brownie  + Small + threeOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Small + threeOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()   ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + Small + threeOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos, gummy
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Small + threeOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Small + threeOunces;
            result = numFormat.format(subTotal);
        }

        //ALMONDS selection Small + threeOunces
        //  Almonds, brownie
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked()   ){
            subTotal =   Almonds + Brownie +  Small + threeOunces;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries +  Small + threeOunces;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + Small + threeOunces;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos, gummy
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + GummyBears +  Small + threeOunces;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Small + threeOunces;
            result = numFormat.format(subTotal);
        }


        //BROWNIE selection Small + threeOunces
        // brownie, strawberries
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Small + threeOunces;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + Small + threeOunces;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos, gummy
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + GummyBears + Small + threeOunces;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos, gummy,marshmallow
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Small + threeOunces;
            result = numFormat.format(subTotal);
        }


        //STRAWBERRIES selection Small + threeOunces
        // strawberries,oreos
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal =  Strawberries + Oreos +  Small + threeOunces;
            result = numFormat.format(subTotal);
        }
        //  strawberries,oreos, gummy
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =  Strawberries + Oreos + GummyBears + Small + threeOunces;
            result = numFormat.format(subTotal);
        }
        //  strawberries,oreos, gummy,marshmallow
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  Strawberries + Oreos + GummyBears + Marshmallows + Small + threeOunces;
            result = numFormat.format(subTotal);
        }

        //OREOS selection Small + threeOunces
        //  oreos, gummy
        if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =   Oreos + GummyBears + Small + threeOunces;
            result = numFormat.format(subTotal);
        }
        //  oreos, gummy,marshmallow
        if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =   Oreos + GummyBears + Marshmallows + Small + threeOunces;
            result = numFormat.format(subTotal);
        }


        //GUMMY selection Small + threeOunces
        // gummy,marshmallow
        if( gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  GummyBears + Marshmallows + Small + threeOunces;
            result = numFormat.format(subTotal);
        }




    }
    if (sizeSpinnerSelection == oneNum && seekBarSelection == threeNum){
        //1oz med
        if(peanutsCheckbox.isChecked()){
            subTotal = Peanuts + Medium + threeOunces;
            result = numFormat.format(subTotal);

        } if(mmsCheckbox.isChecked()){
            subTotal = MMs +  Medium + threeOunces;
            result = numFormat.format(subTotal);

        } if(almondsCheckbox.isChecked()){
            subTotal = Almonds +  Medium + threeOunces;
            result = numFormat.format(subTotal);

        } if(brownieCheckbox.isChecked()){
            subTotal = Brownie +  Medium + threeOunces;
            result = numFormat.format(subTotal);

        } if(strawberriesCheckbox.isChecked()){
            subTotal = Strawberries + Medium + threeOunces;
            result = numFormat.format(subTotal);

        } if(oreosCheckbox.isChecked()){
            subTotal = Oreos + Medium + threeOunces;
            result = numFormat.format(subTotal);

        } if(gummybearsCheckbox.isChecked()){
            subTotal = GummyBears +  Medium + threeOunces;
            result = numFormat.format(subTotal);

        } if(marshmallowsCheckbox.isChecked()){
            subTotal = Marshmallows +  Medium + threeOunces;
            result = numFormat.format(subTotal);

        }


        //PEANUTS selection 3oz Medium
        //peanuts & MMs
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked()){
            subTotal = Peanuts + MMs + Medium + threeOunces;
            result = numFormat.format(subTotal);

        }
        //peanuts, MMs, Almonds
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Medium + threeOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Medium + threeOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Medium + threeOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos + Medium + threeOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos+ GummyBears + Medium + threeOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Medium + threeOunces;
            result = numFormat.format(subTotal);
        }





        //MMs selection Medium + threeOunces

        // MMs, Almonds
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked()){
            subTotal =  MMs + Almonds  + Medium + threeOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked()){
            subTotal =  MMs + Almonds + Brownie  + Medium + threeOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Medium + threeOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()   ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + Medium + threeOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos, gummy
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Medium + threeOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Medium + threeOunces;
            result = numFormat.format(subTotal);
        }

        //ALMONDS selection Medium + threeOunces
        //  Almonds, brownie
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked()   ){
            subTotal =   Almonds + Brownie +  Medium + threeOunces;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries +  Medium + threeOunces;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + Medium + threeOunces;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos, gummy
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + GummyBears +  Medium + threeOunces;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Medium + threeOunces;
            result = numFormat.format(subTotal);
        }


        //BROWNIE selection Medium + threeOunces
        // brownie, strawberries
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Medium + threeOunces;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + Medium + threeOunces;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos, gummy
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + GummyBears + Medium + threeOunces;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos, gummy,marshmallow
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Medium + threeOunces;
            result = numFormat.format(subTotal);
        }


        //STRAWBERRIES selection Medium + threeOunces
        // strawberries,oreos
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal =  Strawberries + Oreos +  Medium + threeOunces;
            result = numFormat.format(subTotal);
        }
        //  strawberries,oreos, gummy
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =  Strawberries + Oreos + GummyBears + Medium + threeOunces;
            result = numFormat.format(subTotal);
        }
        //  strawberries,oreos, gummy,marshmallow
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  Strawberries + Oreos + GummyBears + Marshmallows + Medium + threeOunces;
            result = numFormat.format(subTotal);
        }

        //OREOS selection Medium + threeOunces
        //  oreos, gummy
        if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =   Oreos + GummyBears + Medium + threeOunces;
            result = numFormat.format(subTotal);
        }
        //  oreos, gummy,marshmallow
        if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =   Oreos + GummyBears + Marshmallows + Medium + threeOunces;
            result = numFormat.format(subTotal);
        }


        //GUMMY selection Medium + threeOunces
        // gummy,marshmallow
        if( gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  GummyBears + Marshmallows + Medium + threeOunces;
            result = numFormat.format(subTotal);
        }





    }
    if (seekBarSelection == twoNum && seekBarSelection == threeNum){
        //1oz large
        if(peanutsCheckbox.isChecked()){
            subTotal = Peanuts + Large + threeOunces;
            result = numFormat.format(subTotal);

        } if(mmsCheckbox.isChecked()){
            subTotal = MMs +  Large + threeOunces;
            result = numFormat.format(subTotal);

        } if(almondsCheckbox.isChecked()){
            subTotal = Almonds +  Large + threeOunces;
            result = numFormat.format(subTotal);

        } if(brownieCheckbox.isChecked()){
            subTotal = Brownie +  Large + threeOunces;
            result = numFormat.format(subTotal);

        } if(strawberriesCheckbox.isChecked()){
            subTotal = Strawberries +  Large + threeOunces;
            result = numFormat.format(subTotal);

        } if(oreosCheckbox.isChecked()){
            subTotal = Oreos +  Large + threeOunces;
            result = numFormat.format(subTotal);

        } if(gummybearsCheckbox.isChecked()){
            subTotal = GummyBears + Large + threeOunces;
            result = numFormat.format(subTotal);

        } if(marshmallowsCheckbox.isChecked()){
            subTotal = Marshmallows +  Large + threeOunces;
            result = numFormat.format(subTotal);

        }




        //PEANUTS selection 3oz Large
        //peanuts & MMs
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked()){
            subTotal = Peanuts + MMs + Large + threeOunces;
            result = numFormat.format(subTotal);

        }
        //peanuts, MMs, Almonds
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Large + threeOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Large + threeOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Large + threeOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos + Large + threeOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos+ GummyBears + Large + threeOunces;
            result = numFormat.format(subTotal);
        }
        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal = Peanuts + MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Large + threeOunces;
            result = numFormat.format(subTotal);
        }





        //MMs selection Large + threeOunces

        // MMs, Almonds
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked()){
            subTotal =  MMs + Almonds  + Large + threeOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked()){
            subTotal =  MMs + Almonds + Brownie  + Large + threeOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Large + threeOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()   ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + Large + threeOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos, gummy
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Large + threeOunces;
            result = numFormat.format(subTotal);
        }
        // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  MMs + Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Large + threeOunces;
            result = numFormat.format(subTotal);
        }

        //ALMONDS selection Large + threeOunces
        //  Almonds, brownie
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked()   ){
            subTotal =   Almonds + Brownie +  Large + threeOunces;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries +  Large + threeOunces;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + Large + threeOunces;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos, gummy
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + GummyBears +  Large + threeOunces;
            result = numFormat.format(subTotal);
        }
        //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
        if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =   Almonds + Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Large + threeOunces;
            result = numFormat.format(subTotal);
        }


        //BROWNIE selection Large + threeOunces
        // brownie, strawberries
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Large + threeOunces;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + Large + threeOunces;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos, gummy
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + GummyBears + Large + threeOunces;
            result = numFormat.format(subTotal);
        }
        // brownie, strawberries,oreos, gummy,marshmallow
        if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  Brownie + Strawberries + Oreos + GummyBears + Marshmallows + Large + threeOunces;
            result = numFormat.format(subTotal);
        }


        //STRAWBERRIES selection Large + threeOunces
        // strawberries,oreos
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
            subTotal =  Strawberries + Oreos +  Large + threeOunces;
            result = numFormat.format(subTotal);
        }
        //  strawberries,oreos, gummy
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =  Strawberries + Oreos + GummyBears + Large + threeOunces;
            result = numFormat.format(subTotal);
        }
        //  strawberries,oreos, gummy,marshmallow
        if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  Strawberries + Oreos + GummyBears + Marshmallows + Large + threeOunces;
            result = numFormat.format(subTotal);
        }

        //OREOS selection Large + threeOunces
        //  oreos, gummy
        if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
            subTotal =   Oreos + GummyBears + Large + threeOunces;
            result = numFormat.format(subTotal);
        }
        //  oreos, gummy,marshmallow
        if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =   Oreos + GummyBears + Marshmallows + Large + threeOunces;
            result = numFormat.format(subTotal);
        }


        //GUMMY selection Large + threeOunces
        // gummy,marshmallow
        if( gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
            subTotal =  GummyBears + Marshmallows + Large + threeOunces;
            result = numFormat.format(subTotal);
        }


    }


    //Me quede aqui

}catch (NumberFormatException ex){
Toast.makeText(this, "Incorrect key", Toast.LENGTH_SHORT).show();
}finally {
    totalTextView.setText(result);
}

    }

    public void handleCheckboxes(View v){
        if(v.getId() == R.id.peanuts_checkBox){

            Toast.makeText(this, "Peanuts", Toast.LENGTH_SHORT).show();
        }if(v.getId() == R.id.mm_checkBox){

            Toast.makeText(this, "M&M's", Toast.LENGTH_SHORT).show();
        }if(v.getId() == R.id.almonds_checkBox){

            Toast.makeText(this, "Almonds", Toast.LENGTH_SHORT).show();
        }if(v.getId() == R.id.brownies_checkBox){

            Toast.makeText(this, "Brownie", Toast.LENGTH_SHORT).show();
        }if(v.getId() == R.id.strawberries_checkBox){

            Toast.makeText(this, "Strawberries", Toast.LENGTH_SHORT).show();
        }if(v.getId() == R.id.oreos_checkBox){

            Toast.makeText(this, "Oreos", Toast.LENGTH_SHORT).show();
        }if(v.getId() == R.id.gummybears_checkBox){

            Toast.makeText(this, "Gummy Bears", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.marshmallows_checkBox){
            Toast.makeText(this, "Marshmallows", Toast.LENGTH_SHORT ).show();
        }
    checkboxesUpdate();
    }
//    public void handleOrder(View v){}
//
//    public void handleTheWorks(View v){
//        //TODO sets to large spinner, seekbar 3oz, and selects all checkboxes, flavor stays the same
//
//    }


    public void handleReset(View v){
        String result;
        int zeroNum = 0, oneNum = 1;
        Double Small = 2.99,oneOunce= 0.15, subTotal;
        subTotal = Small + oneOunce;


try{
    sizeSpinner.setSelection(zeroNum) ;
    flavorSpinner.setSelection(zeroNum);
    seekbar.setProgress(oneNum);
    peanutsCheckbox.setChecked(false);
    mmsCheckbox.setChecked(false);
    almondsCheckbox.setChecked(false);
    brownieCheckbox.setChecked(false);
    strawberriesCheckbox.setChecked(false);
    oreosCheckbox.setChecked(false);
    gummybearsCheckbox.setChecked(false);
    marshmallowsCheckbox.setChecked(false);


}catch (NumberFormatException e){
    Toast.makeText(this, "Incorrect key", Toast.LENGTH_SHORT).show();

    }finally {
    result = numFormat.format(subTotal);
    totalTextView.setText(result);

}


    }
}
// sizeSpinner.setSelection(((ArrayAdapter)sizeSpinner.getAdapter()).getPosition(0));
