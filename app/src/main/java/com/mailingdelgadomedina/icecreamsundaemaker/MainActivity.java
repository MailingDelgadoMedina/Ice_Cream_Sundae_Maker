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


    Double small = 2.99, medium = 3.99, large = 4.99, oneOunce= 0.15, twoOunces = 0.25, threeOunces = 0.30;
    Double almonds = 0.15, subTotal, peanuts = 0.15, mms = 0.25 , brownie = 0.20, strawberries = 0.20, oreos = 0.20, gummybears = 0.20, marshmallows = 0.15;





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
                totalTextView.setText(numFormat.format(oneOunce + small));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

//test



        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(MainActivity.this,"Progress Updated", Toast.LENGTH_SHORT).show();
            hotFudgeTextView.setText(progress +"oz");
              int pos = sizeSpinner.getSelectedItemPosition();
                String result;
                Double SmallOneOunce = small + oneOunce, SmallTwoOunces = small + twoOunces, SmallThreeOunces = small + threeOunces,
                MediumOneOunce = medium + oneOunce, MediumTwoOunces = medium + twoOunces, MediumThreeOunces = medium + threeOunces,
                LargeOneOunce = large + oneOunce, LargeTwoOunces = large + twoOunces, LargeThreeOunces = large + threeOunces;



            if (seekbar.getProgress() == zeroNum  && pos == zeroNum){

                totalTextView.setText(numFormat.format(small));

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

                    totalTextView.setText(numFormat.format(medium));
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

                    totalTextView.setText(numFormat.format(large));
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

            checkboxesUpdate();

                   totalTextView.setText(numFormat.format(small));


            }if (sizeSpinner.getSelectedItemPosition() == zeroNum && seekbar.getProgress() == oneNum){
                    result = numFormat.format(small + oneOunce);
                    totalTextView.setText(result);
                }
                if (sizeSpinner.getSelectedItemPosition() == zeroNum && seekbar.getProgress() == twoNum){
                    result = numFormat.format(small + twoOunces);
                    totalTextView.setText(result);
                }if (sizeSpinner.getSelectedItemPosition() == zeroNum && seekbar.getProgress() == threeNum){
                    result = numFormat.format(small + threeOunces);
                    totalTextView.setText(result);
                }if (sizeSpinner.getSelectedItemPosition() == oneNum &&  seekbar.getProgress() == zeroNum){
                 totalTextView.setText(numFormat.format(medium));
               }if (sizeSpinner.getSelectedItemPosition() == oneNum && seekbar.getProgress() == oneNum){
                    result = numFormat.format(medium + oneOunce);
                    totalTextView.setText(result);
                }if (sizeSpinner.getSelectedItemPosition() == oneNum && seekbar.getProgress() == twoNum){
                    result = numFormat.format(medium + twoOunces);
                    totalTextView.setText(result);
                }if (sizeSpinner.getSelectedItemPosition() == oneNum && seekbar.getProgress() == threeNum){
                    result = numFormat.format(medium + threeOunces);
                    totalTextView.setText(result);
                }if (sizeSpinner.getSelectedItemPosition() == twoNum && seekbar.getProgress() == zeroNum){
                    totalTextView.setText(numFormat.format(large));
               }if (sizeSpinner.getSelectedItemPosition() == twoNum && seekbar.getProgress() == oneNum){
                    result = numFormat.format(large + oneOunce);
                    totalTextView.setText(result);
                }if (sizeSpinner.getSelectedItemPosition() == twoNum && seekbar.getProgress() == twoNum){
                    result = numFormat.format(large + twoOunces);
                    totalTextView.setText(result);
                }else if (sizeSpinner.getSelectedItemPosition() == twoNum && seekbar.getProgress() == threeNum){
                    result = numFormat.format(large + threeOunces);
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







    public void checkboxesUpdate(){
      //   Double almonds = 0.15, subTotal, peanuts = 0.15, mms = 0.25 , brownie = 0.20, strawberries = 0.20, oreos = 0.20, gummybears = 0.20, marshmallows = 0.15;

    int sizeSpinnerSelection = sizeSpinner.getSelectedItemPosition(), seekBarSelection = seekbar.getProgress() ;

        try {

            //no fudge DONE

            if(sizeSpinnerSelection == zeroNum && seekBarSelection == zeroNum){

               singleCheckboxesSmall();

               peanutsCombCheckboxSmall();

               mmsComCheckboxSmall();

                almondsComCheckboxSmall();

                brownieComCheckboxSmall();

                strawberriesComCheckboxSmall();

                oreosComCheckboxSmall();

                gummybearsCombSmall();






            }
//            if (sizeSpinnerSelection == oneNum && seekBarSelection == zeroNum){
//
//                if(peanutsCheckbox.isChecked()){
//                    subTotal = peanuts + medium;
//                    result = numFormat.format(subTotal);
//
//                } if(mmsCheckbox.isChecked()){
//                    subTotal = mms + medium;
//                    result = numFormat.format(subTotal);
//
//                } if(almondsCheckbox.isChecked()){
//                    subTotal = almonds + medium;
//                    result = numFormat.format(subTotal);
//
//                } if(brownieCheckbox.isChecked()){
//                    subTotal = brownie + medium;
//                    result = numFormat.format(subTotal);
//
//                } if(strawberriesCheckbox.isChecked()){
//                    subTotal = strawberries + medium;
//                    result = numFormat.format(subTotal);
//
//                } if(oreosCheckbox.isChecked()){
//                    subTotal = oreos + medium;
//                    result = numFormat.format(subTotal);
//
//                } if(gummybearsCheckbox.isChecked()){
//                    subTotal = gummybears + medium;
//                    result = numFormat.format(subTotal);
//
//                } if(marshmallowsCheckbox.isChecked()){
//                    subTotal = marshmallows + medium;
//                    result = numFormat.format(subTotal);
//
//                }
//
//                //PEANUTS selection Medium
//                //peanuts & MMs
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked()){
//                    subTotal = peanuts + mms + medium;
//                    result = numFormat.format(subTotal);
//
//                }
//                //peanuts, MMs, Almonds
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + medium;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + medium;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + medium;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + medium;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + medium;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + medium;
//                    result = numFormat.format(subTotal);
//                }
//
//
//
//
//
//                //MMs selection Medium
//                // MMs, Almonds
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked()){
//                    subTotal =  mms + almonds  + medium;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked()){
//                    subTotal =  mms + almonds + brownie + medium;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal =  mms + almonds + brownie + strawberries + medium;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()   ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + medium;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos, gummy
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + medium;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + medium;
//                    result = numFormat.format(subTotal);
//                }
//
//                //ALMONDS selection Medium
//                //  Almonds, brownie
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked()   ){
//                    subTotal =   almonds + brownie + medium;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + medium;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + oreos + medium;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos, gummy
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + oreos + gummybears + medium;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =   almonds + brownie + strawberries + oreos + gummybears + marshmallows+ medium;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //BROWNIE selection Medium
//                // brownie, strawberries
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + medium;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + medium;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos, gummy
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + gummybears + medium;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos, gummy,marshmallow
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + gummybears + marshmallows + medium;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //STRAWBERRIES selection Medium
//                // strawberries,oreos
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal =  strawberries + oreos + medium;
//                    result = numFormat.format(subTotal);
//                }
//                //  strawberries,oreos, gummy
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =  strawberries + oreos + gummybears + medium;
//                    result = numFormat.format(subTotal);
//                }
//                //  strawberries,oreos, gummy,marshmallow
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  strawberries + oreos + gummybears + marshmallows+ medium;
//                    result = numFormat.format(subTotal);
//                }
//
//                //OREOS selection Medium
//                //  oreos, gummy
//                if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =   oreos + gummybears + medium;
//                    result = numFormat.format(subTotal);
//                }
//                //  oreos, gummy,marshmallow
//                if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =   oreos + gummybears + marshmallows+ medium;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //GUMMY selection Medium
//                // gummy,marshmallow
//                if( gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  gummybears + marshmallows+ medium;
//                    result = numFormat.format(subTotal);
//                }
//
//
//
//            }
//            if (sizeSpinnerSelection == twoNum && seekBarSelection == zeroNum){
//
//                if(peanutsCheckbox.isChecked()){
//                    subTotal = peanuts + large;
//                    result = numFormat.format(subTotal);
//
//                } if(mmsCheckbox.isChecked()){
//                    subTotal = mms + large;
//                    result = numFormat.format(subTotal);
//
//                } if(almondsCheckbox.isChecked()){
//                    subTotal = almonds + large;
//                    result = numFormat.format(subTotal);
//
//                } if(brownieCheckbox.isChecked()){
//                    subTotal = brownie + large;
//                    result = numFormat.format(subTotal);
//
//                } if(strawberriesCheckbox.isChecked()){
//                    subTotal = strawberries + large;
//                    result = numFormat.format(subTotal);
//
//                } if(oreosCheckbox.isChecked()){
//                    subTotal = oreos + large;
//                    result = numFormat.format(subTotal);
//
//                } if(gummybearsCheckbox.isChecked()){
//                    subTotal = gummybears + large;
//                    result = numFormat.format(subTotal);
//
//                } if(marshmallowsCheckbox.isChecked()){
//                    subTotal = marshmallows + large;
//                    result = numFormat.format(subTotal);
//
//                }
//
//                //PEANUTS selection Large
//                //peanuts & MMs
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked()){
//                    subTotal = peanuts + mms + large;
//                    result = numFormat.format(subTotal);
//
//                }
//                //peanuts, MMs, Almonds
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + large;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + large;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + large;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + large;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + large;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + large;
//                    result = numFormat.format(subTotal);
//                }
//
//
//
//
//
//                //MMs selection Large
//                // MMs, Almonds
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked()){
//                    subTotal =  mms + almonds  + large;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked()){
//                    subTotal =  mms + almonds + brownie + large;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal =  mms + almonds + brownie + strawberries + large;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()   ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + large;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos, gummy
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + large;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows+ large;
//                    result = numFormat.format(subTotal);
//                }
//
//                //ALMONDS selection Large
//                //  Almonds, brownie
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked()   ){
//                    subTotal =   almonds + brownie + large;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + large;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + oreos + large;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos, gummy
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + oreos + gummybears + large;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =   almonds + brownie + strawberries + oreos + gummybears + marshmallows+ large;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //BROWNIE selection Large
//                // brownie, strawberries
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + large;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + large;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos, gummy
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + gummybears + large;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos, gummy,marshmallow
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + gummybears + marshmallows+ large;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //STRAWBERRIES selection Large
//                // strawberries,oreos
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal =  strawberries + oreos + large;
//                    result = numFormat.format(subTotal);
//                }
//                //  strawberries,oreos, gummy
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =  strawberries + oreos + gummybears + large;
//                    result = numFormat.format(subTotal);
//                }
//                //  strawberries,oreos, gummy,marshmallow
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  strawberries + oreos + gummybears + marshmallows+ large;
//                    result = numFormat.format(subTotal);
//                }
//
//                //OREOS selection Large
//                //  oreos, gummy
//                if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =   oreos + gummybears + large;
//                    result = numFormat.format(subTotal);
//                }
//                //  oreos, gummy,marshmallow
//                if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =   oreos + gummybears + marshmallows+ large;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //GUMMY selection Large
//                // gummy,marshmallow
//                if( gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  gummybears + marshmallows+ large;
//                    result = numFormat.format(subTotal);
//                }
//
//
//
//            }
//
//
//
//            //1oz Done
//            if (sizeSpinnerSelection == zeroNum && seekBarSelection == oneNum){
////1oz fudge
//                if(peanutsCheckbox.isChecked()){
//                    subTotal = peanuts + small + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                } if(mmsCheckbox.isChecked()){
//                    subTotal = mms + small + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                } if(almondsCheckbox.isChecked()){
//                    subTotal = almonds + small + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                } if(brownieCheckbox.isChecked()){
//                    subTotal = brownie + small + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                } if(strawberriesCheckbox.isChecked()){
//                    subTotal = strawberries + small + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                } if(oreosCheckbox.isChecked()){
//                    subTotal = oreos + small + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                } if(gummybearsCheckbox.isChecked()){
//                    subTotal = gummybears + small + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                } if(marshmallowsCheckbox.isChecked()){
//                    subTotal = marshmallows + small + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                }
//
//
//
//                //PEANUTS selection Small one ounce
//                //peanuts & MMs
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked()){
//                    subTotal = peanuts + mms + small + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                }
//                //peanuts, MMs, Almonds
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//
//
//
//
//
//                //MMs selection + oneOunce
//                // MMs, Almonds
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked()){
//                    subTotal =  mms + almonds  + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked()){
//                    subTotal =  mms + almonds + brownie + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal =  mms + almonds + brownie + strawberries + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()   ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos, gummy
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//
//                //ALMONDS selection + oneOunce
//                //  Almonds, brownie
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked()   ){
//                    subTotal =   almonds + brownie + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + oreos + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos, gummy
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + oreos + gummybears + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =   almonds + brownie + strawberries + oreos + gummybears + marshmallows + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //BROWNIE selection + oneOunce
//                // brownie, strawberries
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos, gummy
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + gummybears + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos, gummy,marshmallow
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + gummybears + marshmallows + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //STRAWBERRIES selection + oneOunce
//                // strawberries,oreos
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal =  strawberries + oreos + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //  strawberries,oreos, gummy
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =  strawberries + oreos + gummybears + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //  strawberries,oreos, gummy,marshmallow
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  strawberries + oreos + gummybears + marshmallows + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//
//                //OREOS selection + oneOunce
//                //  oreos, gummy
//                if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =   oreos + gummybears + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //  oreos, gummy,marshmallow + oneOunce
//                if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =   oreos + gummybears + marshmallows + small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //GUMMY selection + oneOunce
//                // gummy,marshmallow
//                if( gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  gummybears + marshmallows+ small + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//
//
//
//
//            }
//            if (sizeSpinnerSelection == oneNum && seekBarSelection == oneNum){
//                //1oz med
//                if(peanutsCheckbox.isChecked()){
//                    subTotal = peanuts + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                } if(mmsCheckbox.isChecked()){
//                    subTotal = mms + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                } if(almondsCheckbox.isChecked()){
//                    subTotal = almonds + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                } if(brownieCheckbox.isChecked()){
//                    subTotal = brownie + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                } if(strawberriesCheckbox.isChecked()){
//                    subTotal = strawberries + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                } if(oreosCheckbox.isChecked()){
//                    subTotal = oreos + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                } if(gummybearsCheckbox.isChecked()){
//                    subTotal = gummybears + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                } if(marshmallowsCheckbox.isChecked()){
//                    subTotal = marshmallows + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                }
//
//                //PEANUTS selection Medium + oneOunce
//                //peanuts & MMs
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked()){
//                    subTotal = peanuts + mms + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                }
//                //peanuts, MMs, Almonds
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//
//
//
//
//
//                //MMs selection Medium + oneOunce
//                // MMs, Almonds
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked()){
//                    subTotal =  mms + almonds  + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked()){
//                    subTotal =  mms + almonds + brownie + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal =  mms + almonds + brownie + strawberries + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()   ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos, gummy
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//
//
//
//                //ALMONDS selection Medium + oneOunce
//                //  Almonds, brownie
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked()   ){
//                    subTotal =   almonds + brownie + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + oreos + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos, gummy
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + oreos + gummybears + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =   almonds + brownie + strawberries + oreos + gummybears + marshmallows + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //BROWNIE selection Medium + oneOunce
//                // brownie, strawberries
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos, gummy
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + gummybears + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos, gummy,marshmallow
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + gummybears + marshmallows + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //STRAWBERRIES selection Medium
//                // strawberries,oreos
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal =  strawberries + oreos + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //  strawberries,oreos, gummy
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =  strawberries + oreos + gummybears + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //  strawberries,oreos, gummy,marshmallow
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  strawberries + oreos + gummybears + marshmallows + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//
//                //OREOS selection Medium
//                //  oreos, gummy
//                if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =   oreos + gummybears + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //  oreos, gummy,marshmallow
//                if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =   oreos + gummybears + marshmallows + medium + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //GUMMY selection Medium + oneOunce
//                // gummy,marshmallow
//                if( gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  gummybears + marshmallows + medium + oneOunce ;
//                    result = numFormat.format(subTotal);
//                }
//
//
//
//
//
//            }
//            if (sizeSpinnerSelection == twoNum && seekBarSelection == oneNum){
//                //1oz large
//                if(peanutsCheckbox.isChecked()){
//                    subTotal = peanuts + large + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                } if(mmsCheckbox.isChecked()){
//                    subTotal = mms + large + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                } if(almondsCheckbox.isChecked()){
//                    subTotal = almonds + large + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                } if(brownieCheckbox.isChecked()){
//                    subTotal = brownie + large + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                } if(strawberriesCheckbox.isChecked()){
//                    subTotal = strawberries + large + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                } if(oreosCheckbox.isChecked()){
//                    subTotal = oreos + large + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                } if(gummybearsCheckbox.isChecked()){
//                    subTotal = gummybears + large + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                } if(marshmallowsCheckbox.isChecked()){
//                    subTotal = marshmallows + large + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                }
//
//
//                //PEANUTS selection Large + oneOunce
//                //peanuts & MMs
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked()){
//                    subTotal = peanuts + mms + large + oneOunce;
//                    result = numFormat.format(subTotal);
//
//                }
//                //peanuts, MMs, Almonds
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//
//
//
//
//
//                //MMs selection Large + oneOunce
//                // MMs, Almonds
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked()){
//                    subTotal =  mms + almonds  + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked()){
//                    subTotal =  mms + almonds + brownie + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal =  mms + almonds + brownie + strawberries + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()   ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos, gummy
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//
//
//
//                //ALMONDS selection Large + oneOunce
//                //  Almonds, brownie
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked()   ){
//                    subTotal =   almonds + brownie + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + oreos + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos, gummy
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + oreos + gummybears + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =   almonds + brownie + strawberries + oreos + gummybears + marshmallows + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //BROWNIE selection Large + oneOunce
//                // brownie, strawberries
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos, gummy
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + gummybears + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos, gummy,marshmallow
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + gummybears + marshmallows + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //STRAWBERRIES selection Large 1oz
//                // strawberries,oreos
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal =  strawberries + oreos + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //  strawberries,oreos, gummy
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =  strawberries + oreos + gummybears + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //  strawberries,oreos, gummy,marshmallow
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  strawberries + oreos + gummybears + marshmallows + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//
//                //OREOS selection Large 1oz
//                //  oreos, gummy
//                if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =   oreos + gummybears + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//                //  oreos, gummy,marshmallow
//                if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =   oreos + gummybears + marshmallows + large + oneOunce;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //GUMMY selection Large + oneOunce
//                // gummy,marshmallow
//                if( gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  gummybears + marshmallows + large + oneOunce ;
//                    result = numFormat.format(subTotal);
//                }
//
//
//
//            }
//
//
//            //2oz Done
//            if (sizeSpinnerSelection == zeroNum && seekBarSelection == twoNum){
//
//                if(peanutsCheckbox.isChecked()){
//                    subTotal = peanuts + small + twoOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(mmsCheckbox.isChecked()){
//                    subTotal = mms + small + twoOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(almondsCheckbox.isChecked()){
//                    subTotal = almonds + small + twoOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(brownieCheckbox.isChecked()){
//                    subTotal = brownie + small + twoOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(strawberriesCheckbox.isChecked()){
//                    subTotal = strawberries + small + twoOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(oreosCheckbox.isChecked()){
//                    subTotal = oreos + small + twoOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(gummybearsCheckbox.isChecked()){
//                    subTotal = gummybears + small + twoOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(marshmallowsCheckbox.isChecked()){
//                    subTotal = marshmallows + small + twoOunces;
//                    result = numFormat.format(subTotal);
//
//                }
//
//
//
//
//                //PEANUTS selection 2oz
//                //peanuts & MMs
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked()){
//                    subTotal = peanuts + mms + small + twoOunces;
//                    result = numFormat.format(subTotal);
//
//                }
//                //peanuts, MMs, Almonds
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//
//
//
//                //MMs selection 2oz small
//
//                // MMs, Almonds
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked()){
//                    subTotal =  mms + almonds  + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked()){
//                    subTotal =  mms + almonds + brownie + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal =  mms + almonds + brownie + strawberries + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()   ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos, gummy
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//                //ALMONDS selection 2oz small
//                //  Almonds, brownie
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked()   ){
//                    subTotal =   almonds + brownie + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + oreos + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos, gummy
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + oreos + gummybears + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =   almonds + brownie + strawberries + oreos + gummybears + marshmallows + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //BROWNIE selection 2oz small
//                // brownie, strawberries
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos, gummy
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + gummybears + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos, gummy,marshmallow
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + gummybears + marshmallows + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //STRAWBERRIES selection 2 oz
//                // strawberries,oreos
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal =  strawberries + oreos + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  strawberries,oreos, gummy
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =  strawberries + oreos + gummybears + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  strawberries,oreos, gummy,marshmallow
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  strawberries + oreos + gummybears + marshmallows + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//                //OREOS selection 2oz small
//                //  oreos, gummy
//                if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =   oreos + gummybears + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  oreos, gummy,marshmallow
//                if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =   oreos + gummybears + marshmallows + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //GUMMY selection 2oz small
//                // gummy,marshmallow
//                if( gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  gummybears + marshmallows + small + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//
//
//
//            }
//            if (sizeSpinnerSelection == oneNum && seekBarSelection == twoNum){
//                //2oz med
//                if(peanutsCheckbox.isChecked()){
//                    subTotal = peanuts + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(mmsCheckbox.isChecked()){
//                    subTotal = mms + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(almondsCheckbox.isChecked()){
//                    subTotal = almonds + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(brownieCheckbox.isChecked()){
//                    subTotal = brownie + medium + twoOunces ;
//                    result = numFormat.format(subTotal);
//
//                } if(strawberriesCheckbox.isChecked()){
//                    subTotal = strawberries + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(oreosCheckbox.isChecked()){
//                    subTotal = oreos + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(gummybearsCheckbox.isChecked()){
//                    subTotal = gummybears + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(marshmallowsCheckbox.isChecked()){
//                    subTotal = marshmallows + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//
//                }
//
//
//
//                //PEANUTS selection 2oz medium
//                //peanuts & MMs
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked()){
//                    subTotal = peanuts + mms + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//
//                }
//                //peanuts, MMs, Almonds
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//
//
//
//                //MMs selection 2oz medium
//
//                // MMs, Almonds
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked()){
//                    subTotal =  mms + almonds  + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked()){
//                    subTotal =  mms + almonds + brownie + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal =  mms + almonds + brownie + strawberries + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()   ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos, gummy
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//                //ALMONDS selection 2oz medium
//                //  Almonds, brownie
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked()   ){
//                    subTotal =   almonds + brownie + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + oreos + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos, gummy
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + oreos + gummybears + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =   almonds + brownie + strawberries + oreos + gummybears + marshmallows + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //BROWNIE selection 2oz medium
//                // brownie, strawberries
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos, gummy
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + gummybears + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos, gummy,marshmallow
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + gummybears + marshmallows + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //STRAWBERRIES selection 2 oz medium
//                // strawberries,oreos
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal =  strawberries + oreos + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  strawberries,oreos, gummy
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =  strawberries + oreos + gummybears + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  strawberries,oreos, gummy,marshmallow
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  strawberries + oreos + gummybears + marshmallows + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//                //OREOS selection 2oz medium
//                //  oreos, gummy
//                if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =   oreos + gummybears + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  oreos, gummy,marshmallow
//                if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =   oreos + gummybears + marshmallows + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //GUMMY selection 2oz medium
//                // gummy,marshmallow
//                if( gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  gummybears + marshmallows + medium + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//
//
//            }
//            if (sizeSpinnerSelection == twoNum && seekBarSelection == twoNum){
//                //1oz large
//                if(peanutsCheckbox.isChecked()){
//                    subTotal = peanuts + large + twoOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(mmsCheckbox.isChecked()){
//                    subTotal = mms + large + twoOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(almondsCheckbox.isChecked()){
//                    subTotal = almonds + large + twoOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(brownieCheckbox.isChecked()){
//                    subTotal = brownie + large + twoOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(strawberriesCheckbox.isChecked()){
//                    subTotal = strawberries + large + twoOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(oreosCheckbox.isChecked()){
//                    subTotal = oreos + large + twoOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(gummybearsCheckbox.isChecked()){
//                    subTotal = gummybears + large + twoOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(marshmallowsCheckbox.isChecked()){
//                    subTotal = marshmallows + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//
//                //PEANUTS selection 2oz Large
//                //peanuts & MMs
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked()){
//                    subTotal = peanuts + mms + large + twoOunces;
//                    result = numFormat.format(subTotal);
//
//                }
//                //peanuts, MMs, Almonds
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//
//
//
//                //MMs selection 2oz Large
//
//                // MMs, Almonds
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked()){
//                    subTotal =  mms + almonds  + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked()){
//                    subTotal =  mms + almonds + brownie + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal =  mms + almonds + brownie + strawberries + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()   ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos, gummy
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//                //ALMONDS selection 2oz Large
//                //  Almonds, brownie
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked()   ){
//                    subTotal =   almonds + brownie + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + oreos + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos, gummy
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + oreos + gummybears + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =   almonds + brownie + strawberries + oreos + gummybears + marshmallows + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //BROWNIE selection 2oz Large
//                // brownie, strawberries
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos, gummy
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + gummybears + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos, gummy,marshmallow
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + gummybears + marshmallows + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //STRAWBERRIES selection 2 oz Large
//                // strawberries,oreos
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal =  strawberries + oreos + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  strawberries,oreos, gummy
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =  strawberries + oreos + gummybears + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  strawberries,oreos, gummy,marshmallow
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  strawberries + oreos + gummybears + marshmallows + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//                //OREOS selection 2oz Large
//                //  oreos, gummy
//                if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =   oreos + gummybears + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  oreos, gummy,marshmallow
//                if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =   oreos + gummybears + marshmallows + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //GUMMY selection 2oz medium
//                // gummy,marshmallow
//                if( gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  gummybears + marshmallows + large + twoOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//            }
//
//            //3oz Done
//            if (sizeSpinnerSelection == zeroNum && seekBarSelection == threeNum){
////1oz fudge
//                if(peanutsCheckbox.isChecked()){
//                    subTotal = peanuts + small + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(mmsCheckbox.isChecked()){
//                    subTotal = mms + small + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(almondsCheckbox.isChecked()){
//                    subTotal = almonds + small + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(brownieCheckbox.isChecked()){
//                    subTotal = brownie + small + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(strawberriesCheckbox.isChecked()){
//                    subTotal = strawberries + small + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(oreosCheckbox.isChecked()){
//                    subTotal = oreos + small + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(gummybearsCheckbox.isChecked()){
//                    subTotal = gummybears + small + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(marshmallowsCheckbox.isChecked()){
//                    subTotal = marshmallows + small + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                }
//
//                /////
//
//                //PEANUTS selection 3oz small
//                //peanuts & MMs
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked()){
//                    subTotal = peanuts + mms + small + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                }
//                //peanuts, MMs, Almonds
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//
//
//
//                //MMs selection Small + threeOunces
//
//                // MMs, Almonds
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked()){
//                    subTotal =  mms + almonds  + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked()){
//                    subTotal =  mms + almonds + brownie + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal =  mms + almonds + brownie + strawberries + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()   ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos, gummy
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//                //ALMONDS selection Small + threeOunces
//                //  Almonds, brownie
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked()   ){
//                    subTotal =   almonds + brownie + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + oreos + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos, gummy
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + oreos + gummybears + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =   almonds + brownie + strawberries + oreos + gummybears + marshmallows + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //BROWNIE selection Small + threeOunces
//                // brownie, strawberries
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos, gummy
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + gummybears + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos, gummy,marshmallow
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + gummybears + marshmallows + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //STRAWBERRIES selection Small + threeOunces
//                // strawberries,oreos
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal =  strawberries + oreos + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  strawberries,oreos, gummy
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =  strawberries + oreos + gummybears + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  strawberries,oreos, gummy,marshmallow
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  strawberries + oreos + gummybears + marshmallows + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//                //OREOS selection Small + threeOunces
//                //  oreos, gummy
//                if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =   oreos + gummybears + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  oreos, gummy,marshmallow
//                if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =   oreos + gummybears + marshmallows + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //GUMMY selection Small + threeOunces
//                // gummy,marshmallow
//                if( gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  gummybears + marshmallows + small + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//
//
//            }
//            if (sizeSpinnerSelection == oneNum && seekBarSelection == threeNum){
//                //1oz med
//                if(peanutsCheckbox.isChecked()){
//                    subTotal = peanuts + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(mmsCheckbox.isChecked()){
//                    subTotal = mms + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(almondsCheckbox.isChecked()){
//                    subTotal = almonds + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(brownieCheckbox.isChecked()){
//                    subTotal = brownie + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(strawberriesCheckbox.isChecked()){
//                    subTotal = strawberries + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(oreosCheckbox.isChecked()){
//                    subTotal = oreos + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(gummybearsCheckbox.isChecked()){
//                    subTotal = gummybears + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(marshmallowsCheckbox.isChecked()){
//                    subTotal = marshmallows + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                }
//
//
//                //PEANUTS selection 3oz Medium
//                //peanuts & MMs
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked()){
//                    subTotal = peanuts + mms + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                }
//                //peanuts, MMs, Almonds
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//
//
//
//                //MMs selection Medium + threeOunces
//
//                // MMs, Almonds
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked()){
//                    subTotal =  mms + almonds  + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked()){
//                    subTotal =  mms + almonds + brownie + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal =  mms + almonds + brownie + strawberries + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()   ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos, gummy
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//                //ALMONDS selection Medium + threeOunces
//                //  Almonds, brownie
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked()   ){
//                    subTotal =   almonds + brownie + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + oreos + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos, gummy
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + oreos + gummybears + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =   almonds + brownie + strawberries + oreos + gummybears + marshmallows + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //BROWNIE selection Medium + threeOunces
//                // brownie, strawberries
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos, gummy
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + gummybears + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos, gummy,marshmallow
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + gummybears + marshmallows + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //STRAWBERRIES selection Medium + threeOunces
//                // strawberries,oreos
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal =  strawberries + oreos + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  strawberries,oreos, gummy
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =  strawberries + oreos + gummybears + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  strawberries,oreos, gummy,marshmallow
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  strawberries + oreos + gummybears + marshmallows + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//                //OREOS selection Medium + threeOunces
//                //  oreos, gummy
//                if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =   oreos + gummybears + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  oreos, gummy,marshmallow
//                if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =   oreos + gummybears + marshmallows + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //GUMMY selection Medium + threeOunces
//                // gummy,marshmallow
//                if( gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  gummybears + marshmallows + medium + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//
//
//
//            }
//            if (sizeSpinnerSelection == twoNum && seekBarSelection == threeNum){
//                //1oz large
//                if(peanutsCheckbox.isChecked()){
//                    subTotal = peanuts + large + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(mmsCheckbox.isChecked()){
//                    subTotal = mms + large + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(almondsCheckbox.isChecked()){
//                    subTotal = almonds + large + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(brownieCheckbox.isChecked()){
//                    subTotal = brownie + large + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(strawberriesCheckbox.isChecked()){
//                    subTotal = strawberries + large + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(oreosCheckbox.isChecked()){
//                    subTotal = oreos + large + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(gummybearsCheckbox.isChecked()){
//                    subTotal = gummybears + large + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                } if(marshmallowsCheckbox.isChecked()){
//                    subTotal = marshmallows + large + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                }
//
//
//
//
//                //PEANUTS selection 3oz Large
//                //peanuts & MMs
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked()){
//                    subTotal = peanuts + mms + large + threeOunces;
//                    result = numFormat.format(subTotal);
//
//                }
//                //peanuts, MMs, Almonds
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//
//
//
//                //MMs selection Large + threeOunces
//
//                // MMs, Almonds
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked()){
//                    subTotal =  mms + almonds  + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked()){
//                    subTotal =  mms + almonds + brownie + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal =  mms + almonds + brownie + strawberries + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()   ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos, gummy
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//                //ALMONDS selection Large + threeOunces
//                //  Almonds, brownie
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked()   ){
//                    subTotal =   almonds + brownie + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + oreos + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos, gummy
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =   almonds + brownie + strawberries + oreos + gummybears + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =   almonds + brownie + strawberries + oreos + gummybears + marshmallows + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //BROWNIE selection Large + threeOunces
//                // brownie, strawberries
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos, gummy
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + gummybears + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                // brownie, strawberries,oreos, gummy,marshmallow
//                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  brownie + strawberries + oreos + gummybears + marshmallows + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //STRAWBERRIES selection Large + threeOunces
//                // strawberries,oreos
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
//                    subTotal =  strawberries + oreos + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  strawberries,oreos, gummy
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =  strawberries + oreos + gummybears + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  strawberries,oreos, gummy,marshmallow
//                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  strawberries + oreos + gummybears + marshmallows + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//                //OREOS selection Large + threeOunces
//                //  oreos, gummy
//                if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
//                    subTotal =   oreos + gummybears + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//                //  oreos, gummy,marshmallow
//                if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =   oreos + gummybears + marshmallows + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//                //GUMMY selection Large + threeOunces
//                // gummy,marshmallow
//                if( gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
//                    subTotal =  gummybears + marshmallows + large + threeOunces;
//                    result = numFormat.format(subTotal);
//                }
//
//
//            }


            //Me quede aqui

        }catch (NumberFormatException ex){
            Toast.makeText(this, "Incorrect key", Toast.LENGTH_SHORT).show();
        }finally {
            totalTextView.setText(result);
        }

    }
    public void singleCheckboxesSmall(){
//
        //indivdual
        if(peanutsCheckbox.isChecked() ){
            subTotal = peanuts + small;
            result = numFormat.format(subTotal);

        }
        if(mmsCheckbox.isChecked()){
            subTotal = mms + small;
            result = numFormat.format(subTotal);

        }
        if(almondsCheckbox.isChecked()){
            subTotal = almonds + small;
            result = numFormat.format(subTotal);

        }
        if(brownieCheckbox.isChecked()){
            subTotal = brownie + small;
            result = numFormat.format(subTotal);

        }
        if(strawberriesCheckbox.isChecked()){
            subTotal = strawberries + small;
            result = numFormat.format(subTotal);

        }
        if(oreosCheckbox.isChecked()){
            subTotal = oreos + small;
            result = numFormat.format(subTotal);

        }
        if(gummybearsCheckbox.isChecked()){
            subTotal = gummybears + small;
            result = numFormat.format(subTotal);

        }
        if(marshmallowsCheckbox.isChecked()){
            subTotal = marshmallows + small;
            result = numFormat.format(subTotal);

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




            public void peanutsCombCheckboxSmall(){

                //PEANUTS selection
                //peanuts & MMs
                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked()){
                    subTotal = peanuts + mms + small;
                    result = numFormat.format(subTotal);

                }

                //peanuts & Almonds wee need to add this
                if(peanutsCheckbox.isChecked() && almondsCheckbox.isChecked()){
                    subTotal = peanuts + almonds + small;
                    result = numFormat.format(subTotal);

                }
                //peanuts, Almonds & strawberries wee need to add this
                if(peanutsCheckbox.isChecked() && almondsCheckbox.isChecked() && strawberriesCheckbox.isChecked()){
                    subTotal = peanuts + almonds + strawberries + small;
                    result = numFormat.format(subTotal);

                }
                //peanuts, Almonds & strawberries, gummybears wee need to add this
                if(peanutsCheckbox.isChecked() && almondsCheckbox.isChecked() && strawberriesCheckbox.isChecked() && gummybearsCheckbox.isChecked()){
                    subTotal = peanuts + almonds + strawberries + gummybears + small;
                    result = numFormat.format(subTotal);

                }
                //peanuts, Almonds, strawberries, gummybears & marshmallows wee need to add this
                if(peanutsCheckbox.isChecked() && almondsCheckbox.isChecked() && strawberriesCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked()){
                    subTotal = peanuts + almonds + strawberries + gummybears + marshmallows + small;
                    result = numFormat.format(subTotal);

                }

                //peanuts, MMs, Almonds
                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() ){
                    subTotal = peanuts + mms + almonds + small;
                    result = numFormat.format(subTotal);
                }
                //peanuts, MMs, Almonds, brownie
                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() ){
                    subTotal = peanuts + mms + almonds + brownie + small;
                    result = numFormat.format(subTotal);
                }
                //peanuts, MMs, Almonds, brownie, strawberries
                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() ){
                    subTotal = peanuts + mms + almonds + brownie + strawberries + small;
                    result = numFormat.format(subTotal);
                }
                //peanuts, MMs, Almonds, brownie, strawberries,oreos
                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + small;
                    result = numFormat.format(subTotal);
                }
                //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + small;
                    result = numFormat.format(subTotal);
                }
                //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
                if(peanutsCheckbox.isChecked() && mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked()){
                    subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + small;
                    result = numFormat.format(subTotal);
                } else if(!peanutsCheckbox.isChecked() && !mmsCheckbox.isChecked() && !almondsCheckbox.isChecked() && !brownieCheckbox.isChecked() && !strawberriesCheckbox.isChecked() && !oreosCheckbox.isChecked() && !gummybearsCheckbox.isChecked() && !marshmallowsCheckbox.isChecked()){
                    subTotal = small;
                    result = numFormat.format(subTotal);
                }



            }
            public void mmsComCheckboxSmall(){
                //MMs selection
                // MMs, Almonds
                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked()){
                    subTotal =  mms + almonds  + small;
                    result = numFormat.format(subTotal);
                }
                // MMs, Almonds, brownie
                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked()){
                    subTotal =  mms + almonds + brownie + small;
                    result = numFormat.format(subTotal);
                }
                // MMs, Almonds, brownie, strawberries
                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
                    subTotal =  mms + almonds + brownie + strawberries + small;
                    result = numFormat.format(subTotal);
                }
                // MMs, Almonds, brownie, strawberries,oreos
                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
                    subTotal =  mms + almonds + brownie + strawberries + oreos + small;
                    result = numFormat.format(subTotal);
                }
                // MMs, Almonds, brownie, strawberries,oreos, gummy
                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
                    subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + small;
                    result = numFormat.format(subTotal);
                }
                // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
                if( mmsCheckbox.isChecked() && almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
                    subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows+ small;
                    result = numFormat.format(subTotal);
                }


            }
            public void almondsComCheckboxSmall(){
                //ALMONDS selection
                //  Almonds, brownie
                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked()   ){
                    subTotal =   almonds + brownie + small;
                    result = numFormat.format(subTotal);
                }
                //  Almonds, brownie, strawberries
                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()  ){
                    subTotal =   almonds + brownie + strawberries + small;
                    result = numFormat.format(subTotal);
                }
                //  Almonds, brownie, strawberries,oreos
                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
                    subTotal =   almonds + brownie + strawberries + oreos + small;
                    result = numFormat.format(subTotal);
                }
                //  Almonds, brownie, strawberries,oreos, gummy
                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
                    subTotal =   almonds + brownie + strawberries + oreos + gummybears + small;
                    result = numFormat.format(subTotal);
                }
                //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
                if( almondsCheckbox.isChecked() && brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
                    subTotal =   almonds + brownie + strawberries + oreos + gummybears + marshmallows + small;
                    result = numFormat.format(subTotal);
                }

                // Almonds, peanuts & strawberries, gummybear, marshmallows & mms wee need to add this
                if(peanutsCheckbox.isChecked() && almondsCheckbox.isChecked() && strawberriesCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() && mmsCheckbox.isChecked()){
                    subTotal = peanuts + almonds + strawberries + gummybears + marshmallows +  mms + small;
                    result = numFormat.format(subTotal);

                }//TODO ME QUEDE HERE


            }
            public void brownieComCheckboxSmall(){
                //BROWNIE selection
                // brownie, strawberries
                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked()){
                    subTotal =  brownie + strawberries + small;
                    result = numFormat.format(subTotal);
                }
                // brownie, strawberries,oreos
                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() ){
                    subTotal =  brownie + strawberries + oreos + small;
                    result = numFormat.format(subTotal);
                }
                // brownie, strawberries,oreos, gummy
                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
                    subTotal =  brownie + strawberries + oreos + gummybears + small;
                    result = numFormat.format(subTotal);
                }
                // brownie, strawberries,oreos, gummy,marshmallow
                if( brownieCheckbox.isChecked() && strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
                    subTotal =  brownie + strawberries + oreos + gummybears + marshmallows+ small;
                    result = numFormat.format(subTotal);
                }

            }
            public void strawberriesComCheckboxSmall(){
                //STRAWBERRIES selection
                // strawberries,oreos
                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked()  ){
                    subTotal =  strawberries + oreos + small;
                    result = numFormat.format(subTotal);
                }
                //  strawberries,oreos, gummy
                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() ){
                    subTotal =  strawberries + oreos + gummybears + small;
                    result = numFormat.format(subTotal);
                }
                //  strawberries,oreos, gummy,marshmallow
                if( strawberriesCheckbox.isChecked() && oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
                    subTotal =  strawberries + oreos + gummybears + marshmallows+ small;
                    result = numFormat.format(subTotal);
                }

            }

            public void oreosComCheckboxSmall(){

                //OREOS selection
                //  oreos, gummy
                if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked()  ){
                    subTotal =   oreos + gummybears + small;
                    result = numFormat.format(subTotal);
                }
                //  oreos, gummy,marshmallow
                if(oreosCheckbox.isChecked() && gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
                    subTotal =   oreos + gummybears + marshmallows+ small;
                    result = numFormat.format(subTotal);
                }

            }
            public void gummybearsCombSmall(){
                //GUMMY selection
                // gummy,marshmallow
                if( gummybearsCheckbox.isChecked() && marshmallowsCheckbox.isChecked() ){
                    subTotal =  gummybears + marshmallows+ small;
                    result = numFormat.format(subTotal);
                }


            }

//            public void checkboxesUpdate(){
//                Double almonds = 0.15, subTotal, peanuts = 0.15, mms = 0.25 , brownie = 0.20, strawberries = 0.20, oreos = 0.20, gummybears = 0.20, marshmallows = 0.15;
//
//                int sizeSpinnerSelection = sizeSpinner.getSelectedItemPosition();
//                int seekBarSelection = seekbar.getProgress() ;
////
//
//                String result;
//
//                try {
//
//
//
//
//                    //no fudge DONE
//
//
//
//                    if (sizeSpinnerSelection == oneNum && seekBarSelection == zeroNum){
//
//                        if(peanutsCheckbox){
//                            subTotal = peanuts + medium;
//                            result = numFormat.format(subTotal);
//
//                        } if(mmsCheckbox){
//                            subTotal = mms + medium;
//                            result = numFormat.format(subTotal);
//
//                        } if(almondsCheckbox){
//                            subTotal = almonds + medium;
//                            result = numFormat.format(subTotal);
//
//                        } if(brownieCheckbox){
//                            subTotal = brownie + medium;
//                            result = numFormat.format(subTotal);
//
//                        } if(strawberriesCheckbox){
//                            subTotal = strawberries + medium;
//                            result = numFormat.format(subTotal);
//
//                        } if(oreosCheckbox){
//                            subTotal = oreos + medium;
//                            result = numFormat.format(subTotal);
//
//                        } if(gummybearsCheckbox){
//                            subTotal = gummybears + medium;
//                            result = numFormat.format(subTotal);
//
//                        } if(marshmallowsCheckbox){
//                            subTotal = marshmallows + medium;
//                            result = numFormat.format(subTotal);
//
//                        }
//
//                        //PEANUTS selection Medium
//                        //peanuts & MMs
//                        if(peanutsCheckbox && mmsCheckbox){
//                            subTotal = peanuts + mms + medium;
//                            result = numFormat.format(subTotal);
//
//                        }
//                        //peanuts, MMs, Almonds
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox ){
//                            subTotal = peanuts + mms + almonds + medium;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + medium;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox  ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + medium;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox  ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + medium;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
//
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + medium;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + medium;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//
//
//                        //Todo Me quede aqui
//                        //MMs selection Medium
//                        // MMs, Almonds
//                        if( mmsCheckbox && almondsCheckbox){
//                            subTotal =  mms + almonds  + medium;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox){
//                            subTotal =  mms + almonds + brownie + medium;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox  ){
//                            subTotal =  mms + almonds + brownie + strawberries + medium;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox  ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + medium;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos, gummy
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox  ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + medium;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + medium;
//                            result = numFormat.format(subTotal);
//                        }
//
//                        //ALMONDS selection Medium
//                        //  Almonds, brownie
//                        if( almondsCheckbox && brownieCheckbox ){
//                            subTotal =   almonds + brownie + medium;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox  ){
//                            subTotal =   almonds + brownie + strawberries + medium;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox){
//                            subTotal =   almonds + brownie + strawberries + oreos + medium;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos, gummy
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox  ){
//                            subTotal =   almonds + brownie + strawberries + oreos + gummybears + medium;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =   almonds + brownie + strawberries + oreos + gummybears + marshmallows+ medium;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //BROWNIE selection Medium
//                        // brownie, strawberries
//                        if( brownieCheckbox && strawberriesCheckbox ){
//                            subTotal =  brownie + strawberries + medium;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + medium;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos, gummy
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + gummybears + medium;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos, gummy,marshmallow
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + gummybears + marshmallows + medium;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //STRAWBERRIES selection Medium
//                        // strawberries,oreos
//                        if( strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =  strawberries + oreos + medium;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  strawberries,oreos, gummy
//                        if( strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =  strawberries + oreos + gummybears + medium;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  strawberries,oreos, gummy,marshmallow
//                        if( strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox){
//                            subTotal =  strawberries + oreos + gummybears + marshmallows+ medium;
//                            result = numFormat.format(subTotal);
//                        }
//
//                        //OREOS selection Medium
//                        //  oreos, gummy
//                        if(oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =   oreos + gummybears + medium;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  oreos, gummy,marshmallow
//                        if(oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =   oreos + gummybears + marshmallows+ medium;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //GUMMY selection Medium
//                        // gummy,marshmallow
//                        if( gummybearsCheckbox && marshmallowsCheckbox){
//                            subTotal =  gummybears + marshmallows+ medium;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//
//                    }
//                    if (sizeSpinnerSelection == twoNum && seekBarSelection == zeroNum){
//
//                        if(peanutsCheckbox){
//                            subTotal = peanuts + large;
//                            result = numFormat.format(subTotal);
//
//                        } if(mmsCheckbox){
//                            subTotal = mms + large;
//                            result = numFormat.format(subTotal);
//
//                        } if(almondsCheckbox){
//                            subTotal = almonds + large;
//                            result = numFormat.format(subTotal);
//
//                        } if(brownieCheckbox){
//                            subTotal = brownie + large;
//                            result = numFormat.format(subTotal);
//
//                        } if(strawberriesCheckbox){
//                            subTotal = strawberries + large;
//                            result = numFormat.format(subTotal);
//
//                        } if(oreosCheckbox){
//                            subTotal = oreos + large;
//                            result = numFormat.format(subTotal);
//
//                        } if(gummybearsCheckbox){
//                            subTotal = gummybears + large;
//                            result = numFormat.format(subTotal);
//
//                        } if(marshmallowsCheckbox){
//                            subTotal = marshmallows + large;
//                            result = numFormat.format(subTotal);
//
//                        }
//
//                        //PEANUTS selection Large
//                        //peanuts & MMs
//                        if(peanutsCheckbox && mmsCheckbox){
//                            subTotal = peanuts + mms + large;
//                            result = numFormat.format(subTotal);
//
//                        }
//                        //peanuts, MMs, Almonds
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox){
//                            subTotal = peanuts + mms + almonds + large;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + large;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + large;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox  ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + large;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + large;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + large;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//
//
//
//                        //MMs selection Large
//                        // MMs, Almonds
//                        if( mmsCheckbox && almondsCheckbox){
//                            subTotal =  mms + almonds  + large;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox){
//                            subTotal =  mms + almonds + brownie + large;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + large;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox  ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + large;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos, gummy
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + large;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows+ large;
//                            result = numFormat.format(subTotal);
//                        }
//
//                        //ALMONDS selection Large
//                        //  Almonds, brownie
//                        if( almondsCheckbox && brownieCheckbox   ){
//                            subTotal =   almonds + brownie + large;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox ){
//                            subTotal =   almonds + brownie + strawberries + large;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox){
//                            subTotal =   almonds + brownie + strawberries + oreos + large;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos, gummy
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =   almonds + brownie + strawberries + oreos + gummybears + large;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox){
//                            subTotal =   almonds + brownie + strawberries + oreos + gummybears + marshmallows+ large;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //BROWNIE selection Large
//                        // brownie, strawberries
//                        if( brownieCheckbox && strawberriesCheckbox){
//                            subTotal =  brownie + strawberries + large;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + large;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos, gummy
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + gummybears + large;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos, gummy,marshmallow
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + gummybears + marshmallows+ large;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //STRAWBERRIES selection Large
//                        // strawberries,oreos
//                        if( strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =  strawberries + oreos + large;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  strawberries,oreos, gummy
//                        if( strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =  strawberries + oreos + gummybears + large;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  strawberries,oreos, gummy,marshmallow
//                        if( strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  strawberries + oreos + gummybears + marshmallows+ large;
//                            result = numFormat.format(subTotal);
//                        }
//
//                        //OREOS selection Large
//                        //  oreos, gummy
//                        if(oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =   oreos + gummybears + large;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  oreos, gummy,marshmallow
//                        if(oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =   oreos + gummybears + marshmallows+ large;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //GUMMY selection Large
//                        // gummy,marshmallow
//                        if( gummybearsCheckbox && marshmallowsCheckbox){
//                            subTotal =  gummybears + marshmallows+ large;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//
//                    }
//
//
//
//                    //1oz Done
//                    if (sizeSpinnerSelection == zeroNum && seekBarSelection == oneNum){
////1oz fudge
//                        if(peanutsCheckbox){
//                            subTotal = peanuts + small + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        } if(mmsCheckbox){
//                            subTotal = mms + small + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        } if(almondsCheckbox){
//                            subTotal = almonds + small + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        } if(brownieCheckbox){
//                            subTotal = brownie + small + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        } if(strawberriesCheckbox){
//                            subTotal = strawberries + small + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        } if(oreosCheckbox){
//                            subTotal = oreos + small + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        } if(gummybearsCheckbox){
//                            subTotal = gummybears + small + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        } if(marshmallowsCheckbox){
//                            subTotal = marshmallows + small + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        }
//
//
//
//                        //PEANUTS selection Small one ounce
//                        //peanuts & MMs
//                        if(peanutsCheckbox && mmsCheckbox){
//                            subTotal = peanuts + mms + small + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        }
//                        //peanuts, MMs, Almonds
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox ){
//                            subTotal = peanuts + mms + almonds + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox){
//                            subTotal = peanuts + mms + almonds + brownie + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox  ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//
//
//
//                        //MMs selection + oneOunce
//                        // MMs, Almonds
//                        if( mmsCheckbox && almondsCheckbox){
//                            subTotal =  mms + almonds  + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox){
//                            subTotal =  mms + almonds + brownie + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox){
//                            subTotal =  mms + almonds + brownie + strawberries + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos, gummy
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//
//                        //ALMONDS selection + oneOunce
//                        //  Almonds, brownie
//                        if( almondsCheckbox && brownieCheckbox   ){
//                            subTotal =   almonds + brownie + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox  ){
//                            subTotal =   almonds + brownie + strawberries + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox  ){
//                            subTotal =   almonds + brownie + strawberries + oreos + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos, gummy
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox  ){
//                            subTotal =   almonds + brownie + strawberries + oreos + gummybears + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =   almonds + brownie + strawberries + oreos + gummybears + marshmallows + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //BROWNIE selection + oneOunce
//                        // brownie, strawberries
//                        if( brownieCheckbox && strawberriesCheckbox ){
//                            subTotal =  brownie + strawberries + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos, gummy
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + gummybears + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos, gummy,marshmallow
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + gummybears + marshmallows + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //STRAWBERRIES selection + oneOunce
//                        // strawberries,oreos
//                        if( strawberriesCheckbox && oreosCheckbox){
//                            subTotal =  strawberries + oreos + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  strawberries,oreos, gummy
//                        if( strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =  strawberries + oreos + gummybears + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  strawberries,oreos, gummy,marshmallow
//                        if( strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  strawberries + oreos + gummybears + marshmallows + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//
//                        //OREOS selection + oneOunce
//                        //  oreos, gummy
//                        if(oreosCheckbox && gummybearsCheckbox  ){
//                            subTotal =   oreos + gummybears + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  oreos, gummy,marshmallow + oneOunce
//                        if(oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =   oreos + gummybears + marshmallows + small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //GUMMY selection + oneOunce
//                        // gummy,marshmallow
//                        if( gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  gummybears + marshmallows+ small + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//
//
//                    }
//                    if (sizeSpinnerSelection == oneNum && seekBarSelection == oneNum){
//                        //1oz med
//                        if(peanutsCheckbox){
//                            subTotal = peanuts + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        } if(mmsCheckbox){
//                            subTotal = mms + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        } if(almondsCheckbox){
//                            subTotal = almonds + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        } if(brownieCheckbox){
//                            subTotal = brownie + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        } if(strawberriesCheckbox){
//                            subTotal = strawberries + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        } if(oreosCheckbox){
//                            subTotal = oreos + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        } if(gummybearsCheckbox){
//                            subTotal = gummybears + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        } if(marshmallowsCheckbox){
//                            subTotal = marshmallows + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        }
//
//                        //PEANUTS selection Medium + oneOunce
//                        //peanuts & MMs
//                        if(peanutsCheckbox && mmsCheckbox){
//                            subTotal = peanuts + mms + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        }
//                        //peanuts, MMs, Almonds
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox){
//                            subTotal = peanuts + mms + almonds + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//
//
//
//                        //MMs selection Medium + oneOunce
//                        // MMs, Almonds
//                        if( mmsCheckbox && almondsCheckbox){
//                            subTotal =  mms + almonds  + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox){
//                            subTotal =  mms + almonds + brownie + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox  ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos, gummy
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//
//                        //ALMONDS selection Medium + oneOunce
//                        //  Almonds, brownie
//                        if( almondsCheckbox && brownieCheckbox ){
//                            subTotal =   almonds + brownie + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox ){
//                            subTotal =   almonds + brownie + strawberries + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =   almonds + brownie + strawberries + oreos + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos, gummy
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox){
//                            subTotal =   almonds + brownie + strawberries + oreos + gummybears + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =   almonds + brownie + strawberries + oreos + gummybears + marshmallows + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //BROWNIE selection Medium + oneOunce
//                        // brownie, strawberries
//                        if( brownieCheckbox && strawberriesCheckbox){
//                            subTotal =  brownie + strawberries + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos, gummy
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + gummybears + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos, gummy,marshmallow
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + gummybears + marshmallows + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //STRAWBERRIES selection Medium
//                        // strawberries,oreos
//                        if( strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =  strawberries + oreos + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  strawberries,oreos, gummy
//                        if( strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =  strawberries + oreos + gummybears + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  strawberries,oreos, gummy,marshmallow
//                        if( strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox){
//                            subTotal =  strawberries + oreos + gummybears + marshmallows + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//
//                        //OREOS selection Medium
//                        //  oreos, gummy
//                        if(oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =   oreos + gummybears + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  oreos, gummy,marshmallow
//                        if(oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =   oreos + gummybears + marshmallows + medium + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //GUMMY selection Medium + oneOunce
//                        // gummy,marshmallow
//                        if( gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  gummybears + marshmallows + medium + oneOunce ;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//
//
//
//                    }
//                    if (sizeSpinnerSelection == twoNum && seekBarSelection == oneNum){
//                        //1oz large
//                        if(peanutsCheckbox){
//                            subTotal = peanuts + large + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        } if(mmsCheckbox){
//                            subTotal = mms + large + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        } if(almondsCheckbox){
//                            subTotal = almonds + large + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        } if(brownieCheckbox){
//                            subTotal = brownie + large + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        } if(strawberriesCheckbox){
//                            subTotal = strawberries + large + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        } if(oreosCheckbox){
//                            subTotal = oreos + large + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        } if(gummybearsCheckbox){
//                            subTotal = gummybears + large + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        } if(marshmallowsCheckbox){
//                            subTotal = marshmallows + large + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        }
//
//
//                        //PEANUTS selection Large + oneOunce
//                        //peanuts & MMs
//                        if(peanutsCheckbox && mmsCheckbox){
//                            subTotal = peanuts + mms + large + oneOunce;
//                            result = numFormat.format(subTotal);
//
//                        }
//                        //peanuts, MMs, Almonds
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox ){
//                            subTotal = peanuts + mms + almonds + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox  ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//
//
//
//                        //MMs selection Large + oneOunce
//                        // MMs, Almonds
//                        if( mmsCheckbox && almondsCheckbox){
//                            subTotal =  mms + almonds  + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox){
//                            subTotal =  mms + almonds + brownie + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox  ){
//                            subTotal =  mms + almonds + brownie + strawberries + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos, gummy
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox  ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//
//                        //ALMONDS selection Large + oneOunce
//                        //  Almonds, brownie
//                        if( almondsCheckbox && brownieCheckbox   ){
//                            subTotal =   almonds + brownie + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox ){
//                            subTotal =   almonds + brownie + strawberries + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox  ){
//                            subTotal =   almonds + brownie + strawberries + oreos + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos, gummy
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox  ){
//                            subTotal =   almonds + brownie + strawberries + oreos + gummybears + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =   almonds + brownie + strawberries + oreos + gummybears + marshmallows + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //BROWNIE selection Large + oneOunce
//                        // brownie, strawberries
//                        if( brownieCheckbox && strawberriesCheckbox ){
//                            subTotal =  brownie + strawberries + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos, gummy
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox){
//                            subTotal =  brownie + strawberries + oreos + gummybears + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos, gummy,marshmallow
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox){
//                            subTotal =  brownie + strawberries + oreos + gummybears + marshmallows + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //STRAWBERRIES selection Large 1oz
//                        // strawberries,oreos
//                        if( strawberriesCheckbox && oreosCheckbox  ){
//                            subTotal =  strawberries + oreos + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  strawberries,oreos, gummy
//                        if( strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox){
//                            subTotal =  strawberries + oreos + gummybears + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  strawberries,oreos, gummy,marshmallow
//                        if( strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox){
//                            subTotal =  strawberries + oreos + gummybears + marshmallows + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//
//                        //OREOS selection Large 1oz
//                        //  oreos, gummy
//                        if(oreosCheckbox && gummybearsCheckbox  ){
//                            subTotal =   oreos + gummybears + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  oreos, gummy,marshmallow
//                        if(oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox){
//                            subTotal =   oreos + gummybears + marshmallows + large + oneOunce;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //GUMMY selection Large + oneOunce
//                        // gummy,marshmallow
//                        if( gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  gummybears + marshmallows + large + oneOunce ;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//
//                    }
//
//
//                    //2oz Done
//                    if (sizeSpinnerSelection == zeroNum && seekBarSelection == twoNum){
//
//                        if(peanutsCheckbox){
//                            subTotal = peanuts + small + twoOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(mmsCheckbox){
//                            subTotal = mms + small + twoOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(almondsCheckbox){
//                            subTotal = almonds + small + twoOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(brownieCheckbox){
//                            subTotal = brownie + small + twoOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(strawberriesCheckbox){
//                            subTotal = strawberries + small + twoOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(oreosCheckbox){
//                            subTotal = oreos + small + twoOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(gummybearsCheckbox){
//                            subTotal = gummybears + small + twoOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(marshmallowsCheckbox){
//                            subTotal = marshmallows + small + twoOunces;
//                            result = numFormat.format(subTotal);
//
//                        }
//
//
//
//
//                        //PEANUTS selection 2oz
//                        //peanuts & MMs
//                        if(peanutsCheckbox && mmsCheckbox){
//                            subTotal = peanuts + mms + small + twoOunces;
//                            result = numFormat.format(subTotal);
//
//                        }
//                        //peanuts, MMs, Almonds
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox ){
//                            subTotal = peanuts + mms + almonds + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox  ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//
//
//
//                        //MMs selection 2oz small
//
//                        // MMs, Almonds
//                        if( mmsCheckbox && almondsCheckbox){
//                            subTotal =  mms + almonds  + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox){
//                            subTotal =  mms + almonds + brownie + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos, gummy
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//                        //ALMONDS selection 2oz small
//                        //  Almonds, brownie
//                        if( almondsCheckbox && brownieCheckbox ){
//                            subTotal =   almonds + brownie + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox ){
//                            subTotal =   almonds + brownie + strawberries + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox){
//                            subTotal =   almonds + brownie + strawberries + oreos + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos, gummy
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =   almonds + brownie + strawberries + oreos + gummybears + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =   almonds + brownie + strawberries + oreos + gummybears + marshmallows + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //BROWNIE selection 2oz small
//                        // brownie, strawberries
//                        if( brownieCheckbox && strawberriesCheckbox){
//                            subTotal =  brownie + strawberries + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos, gummy
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + gummybears + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos, gummy,marshmallow
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + gummybears + marshmallows + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //STRAWBERRIES selection 2 oz
//                        // strawberries,oreos
//                        if( strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =  strawberries + oreos + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  strawberries,oreos, gummy
//                        if( strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox){
//                            subTotal =  strawberries + oreos + gummybears + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  strawberries,oreos, gummy,marshmallow
//                        if( strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox){
//                            subTotal =  strawberries + oreos + gummybears + marshmallows + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//                        //OREOS selection 2oz small
//                        //  oreos, gummy
//                        if(oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =   oreos + gummybears + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  oreos, gummy,marshmallow
//                        if(oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =   oreos + gummybears + marshmallows + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //GUMMY selection 2oz small
//                        // gummy,marshmallow
//                        if( gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  gummybears + marshmallows + small + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//
//
//
//                    }
//                    if (sizeSpinnerSelection == oneNum && seekBarSelection == twoNum){
//                        //2oz med
//                        if(peanutsCheckbox){
//                            subTotal = peanuts + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(mmsCheckbox){
//                            subTotal = mms + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(almondsCheckbox){
//                            subTotal = almonds + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(brownieCheckbox){
//                            subTotal = brownie + medium + twoOunces ;
//                            result = numFormat.format(subTotal);
//
//                        } if(strawberriesCheckbox){
//                            subTotal = strawberries + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(oreosCheckbox){
//                            subTotal = oreos + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(gummybearsCheckbox){
//                            subTotal = gummybears + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(marshmallowsCheckbox){
//                            subTotal = marshmallows + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//
//                        }
//
//
//
//                        //PEANUTS selection 2oz medium
//                        //peanuts & MMs
//                        if(peanutsCheckbox && mmsCheckbox){
//                            subTotal = peanuts + mms + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//
//                        }
//                        //peanuts, MMs, Almonds
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox){
//                            subTotal = peanuts + mms + almonds + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if(peanutsCheckbox  && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//
//
//
//                        //MMs selection 2oz medium
//
//                        // MMs, Almonds
//                        if( mmsCheckbox && almondsCheckbox){
//                            subTotal =  mms + almonds  + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox){
//                            subTotal =  mms + almonds + brownie + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox  ){
//                            subTotal =  mms + almonds + brownie + strawberries + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox  ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos, gummy
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//                        //ALMONDS selection 2oz medium
//                        //  Almonds, brownie
//                        if( almondsCheckbox && brownieCheckbox ){
//                            subTotal =   almonds + brownie + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox ){
//                            subTotal =   almonds + brownie + strawberries + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =   almonds + brownie + strawberries + oreos + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos, gummy
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox  ){
//                            subTotal =   almonds + brownie + strawberries + oreos + gummybears + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =   almonds + brownie + strawberries + oreos + gummybears + marshmallows + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //BROWNIE selection 2oz medium
//                        // brownie, strawberries
//                        if( brownieCheckbox && strawberriesCheckbox ){
//                            subTotal =  brownie + strawberries + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos, gummy
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + gummybears + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos, gummy,marshmallow
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + gummybears + marshmallows + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //STRAWBERRIES selection 2 oz medium
//                        // strawberries,oreos
//                        if( strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =  strawberries + oreos + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  strawberries,oreos, gummy
//                        if( strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =  strawberries + oreos + gummybears + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  strawberries,oreos, gummy,marshmallow
//                        if( strawberriesCheckbox && oreosCheckbox  && gummybearsCheckbox && marshmallowsCheckbox){
//                            subTotal =  strawberries + oreos + gummybears + marshmallows + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//                        //OREOS selection 2oz medium
//                        //  oreos, gummy
//                        if(oreosCheckbox && gummybearsCheckbox  ){
//                            subTotal =   oreos + gummybears + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  oreos, gummy,marshmallow
//                        if(oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =   oreos + gummybears + marshmallows + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //GUMMY selection 2oz medium
//                        // gummy,marshmallow
//                        if( gummybearsCheckbox && marshmallowsCheckbox){
//                            subTotal =  gummybears + marshmallows + medium + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//
//
//                    }
//                    if (sizeSpinnerSelection == twoNum && seekBarSelection == twoNum){
//                        //1oz large
//                        if(peanutsCheckbox){
//                            subTotal = peanuts + large + twoOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(mmsCheckbox){
//                            subTotal = mms + large + twoOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(almondsCheckbox){
//                            subTotal = almonds + large + twoOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(brownieCheckbox){
//                            subTotal = brownie + large + twoOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(strawberriesCheckbox){
//                            subTotal = strawberries + large + twoOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(oreosCheckbox){
//                            subTotal = oreos + large + twoOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(gummybearsCheckbox){
//                            subTotal = gummybears + large + twoOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(marshmallowsCheckbox){
//                            subTotal = marshmallows + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//
//                        //PEANUTS selection 2oz Large
//                        //peanuts & MMs
//                        if(peanutsCheckbox && mmsCheckbox){
//                            subTotal = peanuts + mms + large + twoOunces;
//                            result = numFormat.format(subTotal);
//
//                        }
//                        //peanuts, MMs, Almonds
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox ){
//                            subTotal = peanuts + mms + almonds + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox){
//                            subTotal = peanuts + mms + almonds + brownie + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox&& strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//
//
//
//                        //MMs selection 2oz Large
//
//                        // MMs, Almonds
//                        if( mmsCheckbox && almondsCheckbox){
//                            subTotal =  mms + almonds  + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox){
//                            subTotal =  mms + almonds + brownie + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries
//                        if( mmsCheckbox&& almondsCheckbox && brownieCheckbox && strawberriesCheckbox  ){
//                            subTotal =  mms + almonds + brownie + strawberries + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox  ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos, gummy
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//                        //ALMONDS selection 2oz Large
//                        //  Almonds, brownie
//                        if( almondsCheckbox && brownieCheckbox  ){
//                            subTotal =   almonds + brownie + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox ){
//                            subTotal =   almonds + brownie + strawberries + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =   almonds + brownie + strawberries + oreos + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos, gummy
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =   almonds + brownie + strawberries + oreos + gummybears + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =   almonds + brownie + strawberries + oreos + gummybears + marshmallows + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //BROWNIE selection 2oz Large
//                        // brownie, strawberries
//                        if( brownieCheckbox && strawberriesCheckbox ){
//                            subTotal =  brownie + strawberries + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos, gummy
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + gummybears + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos, gummy,marshmallow
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + gummybears + marshmallows + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //STRAWBERRIES selection 2 oz Large
//                        // strawberries,oreos
//                        if( strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =  strawberries + oreos + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  strawberries,oreos, gummy
//                        if( strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =  strawberries + oreos + gummybears + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  strawberries,oreos, gummy,marshmallow
//                        if( strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  strawberries + oreos + gummybears + marshmallows + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//                        //OREOS selection 2oz Large
//                        //  oreos, gummy
//                        if(oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =   oreos + gummybears + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  oreos, gummy,marshmallow
//                        if(oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =   oreos + gummybears + marshmallows + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //GUMMY selection 2oz medium
//                        // gummy,marshmallow
//                        if( gummybearsCheckbox && marshmallowsCheckbox){
//                            subTotal =  gummybears + marshmallows + large + twoOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                    }
//
//                    //3oz Done
//                    if (sizeSpinnerSelection == zeroNum && seekBarSelection == threeNum){
////1oz fudge
//                        if(peanutsCheckbox){
//                            subTotal = peanuts + small + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(mmsCheckbox){
//                            subTotal = mms + small + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(almondsCheckbox){
//                            subTotal = almonds + small + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(brownieCheckbox){
//                            subTotal = brownie + small + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(strawberriesCheckbox){
//                            subTotal = strawberries + small + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(oreosCheckbox){
//                            subTotal = oreos + small + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(gummybearsCheckbox){
//                            subTotal = gummybears + small + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(marshmallowsCheckbox){
//                            subTotal = marshmallows + small + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        }
//
//                        /////
//
//                        //PEANUTS selection 3oz small
//                        //peanuts & MMs
//                        if(peanutsCheckbox && mmsCheckbox){
//                            subTotal = peanuts + mms + small + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        }
//                        //peanuts, MMs, Almonds
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox ){
//                            subTotal = peanuts + mms + almonds + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox){
//                            subTotal = peanuts + mms + almonds + brownie + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//
//
//
//                        //MMs selection Small + threeOunces
//
//                        // MMs, Almonds
//                        if( mmsCheckbox && almondsCheckbox){
//                            subTotal =  mms + almonds  + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox){
//                            subTotal =  mms + almonds + brownie + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos, gummy
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//                        //ALMONDS selection Small + threeOunces
//                        //  Almonds, brownie
//                        if( almondsCheckbox && brownieCheckbox   ){
//                            subTotal =   almonds + brownie + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox ){
//                            subTotal =   almonds + brownie + strawberries + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox  ){
//                            subTotal =   almonds + brownie + strawberries + oreos + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos, gummy
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox  ){
//                            subTotal =   almonds + brownie + strawberries + oreos + gummybears + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =   almonds + brownie + strawberries + oreos + gummybears + marshmallows + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //BROWNIE selection Small + threeOunces
//                        // brownie, strawberries
//                        if( brownieCheckbox && strawberriesCheckbox){
//                            subTotal =  brownie + strawberries + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos, gummy
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox){
//                            subTotal =  brownie + strawberries + oreos + gummybears + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos, gummy,marshmallow
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + gummybears + marshmallows + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //STRAWBERRIES selection Small + threeOunces
//                        // strawberries,oreos
//                        if( strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =  strawberries + oreos + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  strawberries,oreos, gummy
//                        if( strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox  ){
//                            subTotal =  strawberries + oreos + gummybears + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  strawberries,oreos, gummy,marshmallow
//                        if( strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  strawberries + oreos + gummybears + marshmallows + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//                        //OREOS selection Small + threeOunces
//                        //  oreos, gummy
//                        if(oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =   oreos + gummybears + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  oreos, gummy,marshmallow
//                        if(MainActivity.oreosCheckbox.isChecked() && MainActivity.gummybearsCheckbox.isChecked() && MainActivity.marshmallowsCheckbox.isChecked() ){
//                            subTotal =   oreos + gummybears + marshmallows + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //GUMMY selection Small + threeOunces
//                        // gummy,marshmallow
//                        if( MainActivity.gummybearsCheckbox.isChecked() && MainActivity.marshmallowsCheckbox.isChecked() ){
//                            subTotal =  gummybears + marshmallows + small + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//
//
//                    }
//                    if (sizeSpinnerSelection == oneNum && seekBarSelection == threeNum){
//                        //1oz med
//                        if(peanutsCheckbox){
//                            subTotal = peanuts + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(mmsCheckbox){
//                            subTotal = mms + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(almondsCheckbox){
//                            subTotal = almonds + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(brownieCheckbox){
//                            subTotal = brownie + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(strawberriesCheckbox){
//                            subTotal = strawberries + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(oreosCheckbox){
//                            subTotal = oreos + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(gummybearsCheckbox){
//                            subTotal = gummybears + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(marshmallowsCheckbox){
//                            subTotal = marshmallows + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        }
//
//
//                        //PEANUTS selection 3oz Medium
//                        //peanuts & MMs
//                        if(peanutsCheckbox && mmsCheckbox){
//                            subTotal = peanuts + mms + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        }
//                        //peanuts, MMs, Almonds
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox ){
//                            subTotal = peanuts + mms + almonds + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox){
//                            subTotal = peanuts + mms + almonds + brownie + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox  ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox  ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//
//
//
//                        //MMs selection Medium + threeOunces
//
//                        // MMs, Almonds
//                        if( mmsCheckbox && almondsCheckbox){
//                            subTotal =  mms + almonds  + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox){
//                            subTotal =  mms + almonds + brownie + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox  ){
//                            subTotal =  mms + almonds + brownie + strawberries + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos, gummy
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox  ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//                        //ALMONDS selection Medium + threeOunces
//                        //  Almonds, brownie
//                        if( almondsCheckbox && brownieCheckbox   ){
//                            subTotal =   almonds + brownie + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox  ){
//                            subTotal =   almonds + brownie + strawberries + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox  ){
//                            subTotal =   almonds + brownie + strawberries + oreos + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos, gummy
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox  ){
//                            subTotal =   almonds + brownie + strawberries + oreos + gummybears + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =   almonds + brownie + strawberries + oreos + gummybears + marshmallows + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //BROWNIE selection Medium + threeOunces
//                        // brownie, strawberries
//                        if( brownieCheckbox && strawberriesCheckbox ){
//                            subTotal =  brownie + strawberries + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos, gummy
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + gummybears + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos, gummy,marshmallow
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox){
//                            subTotal =  brownie + strawberries + oreos + gummybears + marshmallows + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //STRAWBERRIES selection Medium + threeOunces
//                        // strawberries,oreos
//                        if( strawberriesCheckbox && oreosCheckbox  ){
//                            subTotal =  strawberries + oreos + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  strawberries,oreos, gummy
//                        if( strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =  strawberries + oreos + gummybears + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  strawberries,oreos, gummy,marshmallow
//                        if( strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  strawberries + oreos + gummybears + marshmallows + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//                        //OREOS selection Medium + threeOunces
//                        //  oreos, gummy
//                        if(oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =   oreos + gummybears + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  oreos, gummy,marshmallow
//                        if(oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =   oreos + gummybears + marshmallows + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //GUMMY selection Medium + threeOunces
//                        // gummy,marshmallow
//                        if( gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  gummybears + marshmallows + medium + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//
//
//
//                    }
//                    if (seekBarSelection == twoNum && seekBarSelection == threeNum){
//                        //1oz large
//                        if(peanutsCheckbox){
//                            subTotal = peanuts + large + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(mmsCheckbox){
//                            subTotal = mms + large + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(almondsCheckbox){
//                            subTotal = almonds + large + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(brownieCheckbox){
//                            subTotal = brownie + large + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(strawberriesCheckbox){
//                            subTotal = strawberries + large + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(oreosCheckbox){
//                            subTotal = oreos + large + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(gummybearsCheckbox){
//                            subTotal = gummybears + large + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        } if(marshmallowsCheckbox){
//                            subTotal = marshmallows + large + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        }
//
//
//
//
//                        //PEANUTS selection 3oz Large
//                        //peanuts & MMs
//                        if(peanutsCheckbox && mmsCheckbox){
//                            subTotal = peanuts + mms + large + threeOunces;
//                            result = numFormat.format(subTotal);
//
//                        }
//                        //peanuts, MMs, Almonds
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox ){
//                            subTotal = peanuts + mms + almonds + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox  ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //peanuts, MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if(peanutsCheckbox && mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal = peanuts + mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//
//
//
//                        //MMs selection Large + threeOunces
//
//                        // MMs, Almonds
//                        if( mmsCheckbox && almondsCheckbox){
//                            subTotal =  mms + almonds  + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox){
//                            subTotal =  mms + almonds + brownie + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos, gummy
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // MMs, Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if( mmsCheckbox && almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  mms + almonds + brownie + strawberries + oreos + gummybears + marshmallows + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//                        //ALMONDS selection Large + threeOunces
//                        //  Almonds, brownie
//                        if( almondsCheckbox && brownieCheckbox   ){
//                            subTotal =   almonds + brownie + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox  ){
//                            subTotal =   almonds + brownie + strawberries + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox ){
//                            subTotal =   almonds + brownie + strawberries + oreos + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos, gummy
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =   almonds + brownie + strawberries + oreos + gummybears + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  Almonds, brownie, strawberries,oreos, gummy,marshmallow
//                        if( almondsCheckbox && brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =   almonds + brownie + strawberries + oreos + gummybears + marshmallows + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //BROWNIE selection Large + threeOunces
//                        // brownie, strawberries
//                        if( brownieCheckbox && strawberriesCheckbox){
//                            subTotal =  brownie + strawberries + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox){
//                            subTotal =  brownie + strawberries + oreos + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos, gummy
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + gummybears + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        // brownie, strawberries,oreos, gummy,marshmallow
//                        if( brownieCheckbox && strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  brownie + strawberries + oreos + gummybears + marshmallows + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //STRAWBERRIES selection Large + threeOunces
//                        // strawberries,oreos
//                        if( strawberriesCheckbox && oreosCheckbox  ){
//                            subTotal =  strawberries + oreos + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  strawberries,oreos, gummy
//                        if( strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox ){
//                            subTotal =  strawberries + oreos + gummybears + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  strawberries,oreos, gummy,marshmallow
//                        if( strawberriesCheckbox && oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  strawberries + oreos + gummybears + marshmallows + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//                        //OREOS selection Large + threeOunces
//                        //  oreos, gummy
//                        if(oreosCheckbox && gummybearsCheckbox){
//                            subTotal =   oreos + gummybears + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//                        //  oreos, gummy,marshmallow
//                        if(oreosCheckbox && gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =   oreos + gummybears + marshmallows + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                        //GUMMY selection Large + threeOunces
//                        // gummy,marshmallow
//                        if( gummybearsCheckbox && marshmallowsCheckbox ){
//                            subTotal =  gummybears + marshmallows + large + threeOunces;
//                            result = numFormat.format(subTotal);
//                        }
//
//
//                    }
//
//
//                    //Me quede aqui
//
//                }catch (NumberFormatException ex){
//                    // Toast.makeText(this, "Incorrect key", Toast.LENGTH_SHORT).show();
//                }finally {
//                    MainActivity.totalTextView.setText(result);
//                }
//
//            }
//







//    public void handleOrder(View v){}
//
//    public void handleTheWorks(View v){
//        //TODO sets to large spinner, seekbar 3oz, and selects all checkboxes, flavor stays the same
//
//    }


    public void handleReset(View v){

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
