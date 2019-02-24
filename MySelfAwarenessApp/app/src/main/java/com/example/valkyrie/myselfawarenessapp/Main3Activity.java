package com.example.valkyrie.myselfawarenessapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.TextView;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

public class Main3Activity extends AppCompatActivity {
    TextView txt1,txt2,txt3,txt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txt1=findViewById(R.id.textView1);
        txt2=findViewById(R.id.textView2);
        txt3=findViewById(R.id.textView3);
        txt4=findViewById(R.id.textView4);
        loadPercent();
    }

    public void loadPercent() {
        String url = "http://192.168.43.176/xampp/Bluehacks/fetch.php";
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        asyncHttpClient.get(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200) {

                    try {
                        String str = new String(responseBody, "UTF-8");
                        JSONArray jsonArray = new JSONArray(str);
                        for (int i = 0; i < jsonArray.length(); i++) {
                            JSONObject jsonObject=jsonArray.getJSONObject(i);

                            String intellectual = jsonObject.getString("Int")+" %";
                            String social = jsonObject.getString("Soc")+" %";
                            String spiritual = jsonObject.getString("Spi")+" %";
                            String physical = jsonObject.getString("Phy")+" %";
                            txt1.setText(intellectual);
                            txt2.setText(social);
                            txt3.setText(spiritual);
                            txt4.setText(physical);

                        }

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Toast.makeText(getApplicationContext(), "Cannot Login, Please check internet connection !", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
