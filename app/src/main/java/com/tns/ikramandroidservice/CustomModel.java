package com.tns.ikramandroidservice;

/**
 * Created by TNS on 01-Jun-17.
 */

 class CustomModel {

   static CustomModel customModel;

    public static CustomModel getCustomModel(){


        if(customModel == null ){

            customModel  = new CustomModel();
        }

        return customModel;
    }



    private static ListenerInterface mListenerInterface;

    public static void setListner(ListenerInterface listner){
        mListenerInterface = listner;
    }

    public String setdata(String s){

        if(mListenerInterface != null)
        {

            mListenerInterface.DataExchange(s);
        }

        return s;
    }
}
