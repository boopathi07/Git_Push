package com.example.boopathin.time;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {
    public static final String date_format = "dd-MMM-yyyy";
    public static final String date_format_web = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    private String strDate="2017-02-09T13:13:19.024Z";

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SimpleDateFormat formatter = new SimpleDateFormat(date_format_web, Locale.ENGLISH);
        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date value = null;
        try {
            value = formatter.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat dateFormatter = new SimpleDateFormat(date_format, Locale.ENGLISH); //this format changeable
        dateFormatter.setTimeZone(TimeZone.getDefault());
        strDate = dateFormatter.format(value);
        Log.e("String date","----"+strDate);


    }
}
