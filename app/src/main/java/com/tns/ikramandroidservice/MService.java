package com.tns.ikramandroidservice;

import android.app.IntentService;
import android.content.Intent;
import android.os.Handler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by TNS on 20-May-17.
 */
public class MService extends IntentService {
Handler  handler = new Handler();

    public MService() {

        super("MService ");
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void onHandleIntent(Intent arg0) {
        // TODO Auto-generated method stub



        final Runnable r = new Runnable() {
            public void run() {

                DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                Date dateobj = new Date();
                System.out.println(df.format(dateobj));
                CustomModel.getCustomModel().setdata(dateobj+"");
                handler.postDelayed(this, 1000);
            }
        };

        handler.postDelayed(r, 1000);
    }

}