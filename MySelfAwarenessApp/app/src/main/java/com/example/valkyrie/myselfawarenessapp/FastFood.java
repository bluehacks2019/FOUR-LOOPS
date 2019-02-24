package com.example.valkyrie.myselfawarenessapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FastFood extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_food);


    }

    public void burger(View v)
    {
        Intent i = new Intent(this, NutritionalFacts.class);
        i.putExtra("calories", "261");
        i.putExtra("totalfat", "11 grams");
        i.putExtra("saturatedfat", "3.8 grams");
        i.putExtra("polyfat", "1.2 grams");
        i.putExtra("monofat", "4.2 grams");
        i.putExtra("transfat", "0.5 grams");
        i.putExtra("cholest", "35 mgrams");
        i.putExtra("sodium", "461 mgrams");
        i.putExtra("potassium", "217 mgrams");
        i.putExtra("carb", "27 grams");
        i.putExtra("dietaryfiber", "2 grams");
        i.putExtra("sugar", "6 grams");
        i.putExtra("protein", "15 grams");
        i.putExtra("vita", "0%");
        i.putExtra("vitc", "0%");
        i.putExtra("calc", "7%");
        i.putExtra("iron", "16%");
        i.putExtra("vitb", "5%");
        i.putExtra("cobal", "0%");
        i.putExtra("magne", "6%");
        startActivity(i);

    }
    public void Spag(View v)
    {
        Intent i = new Intent(this, NutritionalFacts.class);
        i.putExtra("calories", "158");
        i.putExtra("totalfat", "0.9 grams");
        i.putExtra("saturatedfat", "0.2 grams");
        i.putExtra("polyfat", "0.3 grams");
        i.putExtra("monofat", "0.1 grams");
        i.putExtra("transfat", "0 grams");
        i.putExtra("cholest", "0 mgrams");
        i.putExtra("sodium", "1 mgrams");
        i.putExtra("potassium", "44 mgrams");
        i.putExtra("carb", "31 grams");
        i.putExtra("dietaryfiber", "1.8 grams");
        i.putExtra("sugar", "0.6 grams");
        i.putExtra("protein", "6 grams");
        i.putExtra("vita", "0%");
        i.putExtra("vitc", "0%");
        i.putExtra("calc", "0%");
        i.putExtra("iron", "7%");
        i.putExtra("vitb", "0%");
        i.putExtra("cobal", "0%");
        i.putExtra("magne", "4%");
        startActivity(i);

    }
    public void chick(View v)
    {
        Intent i = new Intent(this, NutritionalFacts.class);
        i.putExtra("calories", "165");
        i.putExtra("totalfat", "3.6 grams");
        i.putExtra("saturatedfat", "1 grams");
        i.putExtra("polyfat", "0.8 grams");
        i.putExtra("monofat", "1.2 grams");
        i.putExtra("transfat", "0 grams");
        i.putExtra("cholest", "85 mgrams");
        i.putExtra("sodium", "74 mgrams");
        i.putExtra("potassium", "256 mgrams");
        i.putExtra("carb", "0 grams");
        i.putExtra("dietaryfiber", "0 grams");
        i.putExtra("sugar", "0 grams");
        i.putExtra("protein", "31 grams");
        i.putExtra("vita", "0%");
        i.putExtra("vitc", "0%");
        i.putExtra("calc", "1%");
        i.putExtra("iron", "5%");
        i.putExtra("vitb", "30%");
        i.putExtra("cobal", "5%");
        i.putExtra("magne", "7%");
        startActivity(i);

    }
    public void fries(View v)
    {
        Intent i = new Intent(this, NutritionalFacts.class);
        i.putExtra("calories", "312");
        i.putExtra("totalfat", "15 grams");
        i.putExtra("saturatedfat", "2.3 grams");
        i.putExtra("polyfat", "5 grams");
        i.putExtra("monofat", "6 grams");
        i.putExtra("transfat", "0.1 grams");
        i.putExtra("cholest", "0 mgrams");
        i.putExtra("sodium", "210 mgrams");
        i.putExtra("potassium", "579 mgrams");
        i.putExtra("carb", "41 grams");
        i.putExtra("dietaryfiber", "3.8 grams");
        i.putExtra("sugar", "0.3 grams");
        i.putExtra("protein", "3.4 grams");
        i.putExtra("vita", "0%");
        i.putExtra("vitc", "7%");
        i.putExtra("calc", "1%");
        i.putExtra("iron", "4%");
        i.putExtra("vitb", "20%");
        i.putExtra("cobal", "0%");
        i.putExtra("magne", "8%");
        startActivity(i);

    }


}
