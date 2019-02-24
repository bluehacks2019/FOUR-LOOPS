package com.example.valkyrie.myselfawarenessapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Silogs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silogs);
    }

    public void hotsilog(View v)
    {
        Intent i = new Intent(this, NutritionalFacts.class);
        i.putExtra("calories", "290");
        i.putExtra("totalfat", "26 grams");
        i.putExtra("saturatedfat", "8 grams");
        i.putExtra("polyfat", "4.4 grams");
        i.putExtra("monofat", "11 grams");
        i.putExtra("transfat", "0 grams");
        i.putExtra("cholest", "77 mgrams");
        i.putExtra("sodium", "1090 mgrams");
        i.putExtra("potassium", "152 mgrams");
        i.putExtra("carb", "4.2 grams");
        i.putExtra("dietaryfiber", "0 grams");
        i.putExtra("sugar", "0 grams");
        i.putExtra("protein", "10 grams");
        i.putExtra("vita", "0%");
        i.putExtra("vitc", "0%");
        i.putExtra("calc", "9%");
        i.putExtra("iron", "6%");
        i.putExtra("vitb", "10%");
        i.putExtra("cobal", "26%");
        i.putExtra("magne", "3%");
        startActivity(i);

    }
    public void porksilog(View v)
    {
        Intent i = new Intent(this, NutritionalFacts.class);
        i.putExtra("calories", "231");
        i.putExtra("totalfat", "14 grams");
        i.putExtra("saturatedfat", "4.3 grams");
        i.putExtra("polyfat", "1.9 grams");
        i.putExtra("monofat", "4.9 grams");
        i.putExtra("transfat", "0.1 grams");
        i.putExtra("cholest", "78 mgrams");
        i.putExtra("sodium", "74 mgrams");
        i.putExtra("potassium", "315 mgrams");
        i.putExtra("carb", "0 grams");
        i.putExtra("dietaryfiber", "0 grams");
        i.putExtra("sugar", "0 grams");
        i.putExtra("protein", "24 grams");
        i.putExtra("vita", "0%");
        i.putExtra("vitc", "0%");
        i.putExtra("calc", "5%");
        i.putExtra("iron", "4%");
        i.putExtra("vitb", "25%");
        i.putExtra("cobal", "11%");
        i.putExtra("magne", "5%");
        startActivity(i);

    }
    public void longsilog(View v)
    {
        Intent i = new Intent(this, NutritionalFacts.class);
        i.putExtra("calories", "142");
        i.putExtra("totalfat", "9.7 grams");
        i.putExtra("saturatedfat", "2.8 grams");
        i.putExtra("polyfat", "0 grams");
        i.putExtra("monofat", "0 grams");
        i.putExtra("transfat", "0.1 grams");
        i.putExtra("cholest", "31 mgrams");
        i.putExtra("sodium", "385 mgrams");
        i.putExtra("potassium", "138 mgrams");
        i.putExtra("carb", "4.6 grams");
        i.putExtra("dietaryfiber", "0.1 grams");
        i.putExtra("sugar", "4.1 grams");
        i.putExtra("protein", "8.7 grams");
        i.putExtra("vita", "0%");
        i.putExtra("vitc", "1%");
        i.putExtra("calc", "1%");
        i.putExtra("iron", "3%");
        i.putExtra("vitb", "0%");
        i.putExtra("cobal", "0%");
        i.putExtra("magne", "0%");
        startActivity(i);

    }
    public void tosilog(View v)
    {
        Intent i = new Intent(this, NutritionalFacts.class);
        i.putExtra("calories", "105");
        i.putExtra("totalfat", "4.3 grams");
        i.putExtra("saturatedfat", "0.8 grams");
        i.putExtra("polyfat", "0 grams");
        i.putExtra("monofat", "0 grams");
        i.putExtra("transfat", "0.1 grams");
        i.putExtra("cholest", "33 mgrams");
        i.putExtra("sodium", "555 mgrams");
        i.putExtra("potassium", "203 mgrams");
        i.putExtra("carb", "4.1 grams");
        i.putExtra("dietaryfiber", "0.1 grams");
        i.putExtra("sugar", "3.4 grams");
        i.putExtra("protein", "12 grams");
        i.putExtra("vita", "0%");
        i.putExtra("vitc", "0%");
        i.putExtra("calc", "1%");
        i.putExtra("iron", "3%");
        i.putExtra("vitb", "0%");
        i.putExtra("cobal", "0%");
        i.putExtra("magne", "0%");
        startActivity(i);

    }

}
