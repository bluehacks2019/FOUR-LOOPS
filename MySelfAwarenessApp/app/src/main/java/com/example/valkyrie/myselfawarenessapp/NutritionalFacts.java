package com.example.valkyrie.myselfawarenessapp;

import android.content.Intent;
import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class NutritionalFacts extends AppCompatActivity {
    String calories,totalfat,saturatedfat,polyfat,monofat,transfat,cholest,sodium,potassium,carb,dietaryfiber,sugar,protein,vita,vitc,calc,iron,vitb,cobal,magne;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutritional_facts);

        Bundle dataGalingSaMainActivity = getIntent().getExtras();

        calories= dataGalingSaMainActivity.getString("calories");
        totalfat= dataGalingSaMainActivity.getString("totalfat");
        saturatedfat= dataGalingSaMainActivity.getString("saturatedfat");
        polyfat= dataGalingSaMainActivity.getString("polyfat");
        monofat= dataGalingSaMainActivity.getString("monofat");
        transfat= dataGalingSaMainActivity.getString("transfat");
        cholest= dataGalingSaMainActivity.getString("cholest");
        sodium= dataGalingSaMainActivity.getString("sodium");
        potassium= dataGalingSaMainActivity.getString("potassium");
        carb= dataGalingSaMainActivity.getString("carb");
        dietaryfiber= dataGalingSaMainActivity.getString("dietaryfiber");
        sugar= dataGalingSaMainActivity.getString("sugar");
        protein= dataGalingSaMainActivity.getString("protein");
        vita= dataGalingSaMainActivity.getString("vita");
        vitc= dataGalingSaMainActivity.getString("vitc");
        calc= dataGalingSaMainActivity.getString("calc");
        iron= dataGalingSaMainActivity.getString("iron");
        vitb= dataGalingSaMainActivity.getString("vitb");
        cobal= dataGalingSaMainActivity.getString("cobal");
        magne= dataGalingSaMainActivity.getString("magne");;
        t1 =  findViewById(R.id.text1);
        t1.setText(calories);
        t2 = findViewById(R.id.text2);
        t2.setText(totalfat);
        t3 =  findViewById(R.id.text3);
        t4 =  findViewById(R.id.text4);
        t5 = findViewById(R.id.text5);
        t6 =  findViewById(R.id.text6);
        t7 =  findViewById(R.id.text7);
        t8 = findViewById(R.id.text8);
        t9 = findViewById(R.id.text9);
        t10 =  findViewById(R.id.text10);
        t11 = findViewById(R.id.text11);
        t12 = findViewById(R.id.text12);
        t13 = findViewById(R.id.text13);
        t14 = findViewById(R.id.text14);
        t15 =  findViewById(R.id.text15);
        t16 =  findViewById(R.id.text16);
        t17 =  findViewById(R.id.text17);
        t18 =  findViewById(R.id.text18);
        t19 = findViewById(R.id.text19);
        t20 =  findViewById(R.id.text20);
        t3.setText(saturatedfat);
        t4.setText(polyfat);
        t5.setText(monofat);
        t6.setText(transfat);
        t7.setText(cholest);
        t8.setText(sodium);
        t9.setText(potassium);
        t10.setText(carb);
        t11.setText(dietaryfiber);
        t12.setText(sugar);
        t13.setText(protein);
        t14.setText(vita);
        t15.setText(vitc);
        t16.setText(calc);
        t17.setText(iron);
        t18.setText(vitb);
        t19.setText(cobal);
        t20.setText(magne);

    }

    public void Calories(View v)
    {
        Intent i = new Intent(this, InformationSystem.class);
        i.putExtra("pinindot", "What is Calories?Most people only associate calories with food and drink, but anything that contains energy has calories. 1 kilogram (kg) of coal, for example, contains 7,000,000 calories.\n" +
                "\n" +
                "There are two types of calorie:\n" +
                "\n" +
                "A small calorie (cal) is the amount of energy required to raise the temperature of 1 gram (g) of water by 1º Celsius (º C).\n" +
                "A large calorie (kcal) is the amount of energy required to raise 1 kilogram (kg) of water by 1º C. It is also known as a kilocalorie.\n\nDaily requirement\n" +
                "The United States government states that the average man needs 2,700 kcal per day and the average woman needs 2,200 kcal per day.\n" +
                "\n" +
                "Not everybody needs the same number of calories each day. People have different metabolisms that burn energy at different rates, and some people have more active lifestyles than others.\n" +
                "\n" +
                "The recommended intake of calories per day depends on several factors, including:\n" +
                "\n" +
                "overall general health\n" +
                "physical activity demands\n" +
                "sex\n" +
                "weight\n" +
                "height\n" +
                "body shape");
        startActivity(i);
    }
    public void TotalFat(View v)
    {
        Intent i = new Intent(this, InformationSystem.class);
        i.putExtra("pinindot", "What It Does\n" +
                "Fat provides calories, or “energy,” for the body. Fat also stores energy in excess of what the body needs immediately, and serves as a secondary energy source once calories from carbohydrates are used up. Each gram of fat provides 9 calories.\n" +
                "Fat is a basic part of cell membranes and is necessary for proper growth and development.\n" +
                "Fat helps the body absorb important fat-soluble vitamins (vitamins A, D, E, and K).\n" +
                "Fat supports key body processes, such as blood clotting, nervous system function, reproduction, and immune response.\n" +
                "Fat “cushions” internal organs and protects them from being damaged. The fat layer below the skin also insulates the body from heat loss.\n" +
                "Fat plays a vital role in maintaining healthy skin and hair.\n" +
                "Fat in food provides taste and consistency and helps you feel full.");
        startActivity(i);
    }


        public void SaturatedFat(View v)
        {
            Intent i = new Intent(this, InformationSystem.class);
            i.putExtra("pinindot", "Facts about saturated fats\n" +
                    "Email this page to a friend Print Facebook Twitter\n" +
                    "Saturated fat is a type of dietary fat. It is one of the unhealthy fats, along with trans fat. These fats are most often solid at room temperature. Foods like butter, palm and coconut oils, cheese, and red meat have high amounts of saturated fat.\n" +
                    "\n" +
                    "Too much saturated fat in your diet can lead to heart disease and other health problems.\n" +
                    "\n\n" +
                    "How Much you can Eat\n" +
                    "Most foods have a combination of different fats. You are better off choosing foods higher in healthier fats, such as monounsaturated and polyunsaturated fats. These fats tend to be liquid at room temperature.\n" +
                    "\n" +
                    "How much should you get every day? Here are recommendations from the 2015 Dietary Guidelines for Americans:\n" +
                    "\n" +
                    "You should get no more than 25% to 30% of your daily calories from fats.\n" +
                    "You should limit saturated fat to less than 10% of your daily calories.\n" +
                    "To further reduce your heart disease risk, limit saturated fats to less than 7% of your total daily calories.\n" +
                    "For a 2,000 calorie diet, that is 140 to 200 calories or 16 to 22 grams (g) of saturated fats a day. As an example, just 1 slice of cooked bacon contains nearly 9 g of saturated fat.\n" +
                    "If you have heart disease or high cholesterol, your health care provider may ask you to limit saturated fat even more.");
            startActivity(i);
        }



}
