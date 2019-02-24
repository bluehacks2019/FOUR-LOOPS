package com.example.valkyrie.myselfawarenessapp;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    String finalLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=findViewById(R.id.radioGroup);

    }
    public void checkProgress(View v){
        Intent intent = new Intent(this,Main3Activity.class);
        startActivity(intent);
    }
    public void checkPhysical(View v){
        Intent intent = new Intent(this,Main4Activity.class);
        startActivity(intent);
    }
    public boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.getSystemService(Context.CONNECTIVITY_SERVICE);

        if (connectivityManager != null) {
            NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
            return (activeNetwork != null && activeNetwork.isConnectedOrConnecting());
        } else {
            return false;
        }
    }
    public void pagClick(View v){
        if(isNetworkAvailable()){
            int selectedId=radioGroup.getCheckedRadioButtonId();
            radioButton=findViewById(selectedId);
            if(radioGroup.getCheckedRadioButtonId()==-1){
                Toast.makeText(getApplicationContext(),"Specify first your category",Toast.LENGTH_LONG).show();
            }
            else {
                if (radioButton.getText().toString().equals("SPORT")) {
                    finalLink = "espn.com/espn/rss/nba/news";
                } else if (radioButton.getText().toString().equals("HEALTH NEWS")) {
                    finalLink = "feeds.reuters.com/reuters/healthNews";
                } else if (radioButton.getText().toString().equals("MOVIES")) {
                    finalLink = "feeds.etonline/ETMovies";
                } else if (radioButton.getText().toString().equals("ENTERTAINMENT")) {
                    finalLink = "feeds.reuters.com/reuters/entertainment";
                } else if (radioButton.getText().toString().equals("TECHNOLOGY")) {
                    finalLink = "feeds.bbci.co.uk/news/technology/rss.xml";

                } else if (radioButton.getText().toString().equals("BUSINESS")) {
                    finalLink = "feeds.bbci.co.uk/news/business/rss.xml";
                } else if (radioButton.getText().toString().equals("NEWS")) {
                    finalLink = "feeds.bbci.co.uk/news/world/rss.xml";
                } else if (radioButton.getText().toString().equals("LIFESTYLE")) {
                    finalLink = "feeds.reuters.com/reuters/lifestyle";
                }
                Intent intent = new Intent(this, Main2Activity.class);
                intent.putExtra("valueLink", finalLink);
                startActivity(intent);
                final Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int min = mcurrentTime.get(Calendar.MINUTE);
                final String dates = new SimpleDateFormat("MMM dd,yyyy").format(mcurrentTime.getInstance().getTime());
                final String newTime = new SimpleDateFormat("hh:mm a").format(mcurrentTime.getInstance().getTime());
                addProgress("Intellectual", dates, newTime);
            }
        }
        else{
            Toast.makeText(getApplicationContext(),"No Internet Connection",Toast.LENGTH_LONG).show();
        }
    }

    public void addProgress(String module,String dates,String times){
        String url = "http://192.168.43.176/xampp/Bluehacks/insert.php?module=" + module + "&dateopen=" + dates+"&timeopen="+times;
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        asyncHttpClient.get(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200) {
                    try {
                        String str = new String(responseBody, "UTF-8");
                        if (str.equals("inserted")) {

                        } else {

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Toast.makeText(getApplicationContext(), "Cannot Connect !", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
