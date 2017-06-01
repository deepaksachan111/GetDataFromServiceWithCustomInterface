package com.tns.ikramandroidservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.data;

public class MainActivity extends AppCompatActivity implements ListenerInterface {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.name);

        CustomModel.setListner(this);

        Intent i=new Intent();
        i.setClass(this, MService.class);
        startService(i);
    }

    @Override
    public void DataExchange(String data) {
        // TODO Auto-generated method stub
        Log.d("ikram","data received="+data);
        System.out.print("ikkki"+data);
        textView.setText(data);
    }

    @Override
    public void DataExchange2(String dataa) {
        //textView.setText(dataa);
    }

}

