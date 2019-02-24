package com.example.valkyrie.myselfawarenessapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class InformationSystem extends AppCompatActivity {

    String clicktext;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_system);
        Bundle dataGalingSaMainActivity = getIntent().getExtras();

        clicktext= dataGalingSaMainActivity.getString("pinindot");
        tv1 =  findViewById(R.id.tv1);
        tv1.setText(clicktext);
    }
}
