package com.example.slidescreen;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatActivity;

public class PrefManager extends AppCompatActivity {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;

    //Shared pref mode
    int PRIVTE_MODE = 0;

    //Shared preferences file name
    private static final String PREF_NAME = "introslider";

    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    public PrefManager (Context context) {
        this._context = context;
        pref = context.getSharedPreferences(PREF_NAME, PRIVTE_MODE);
        editor = pref.edit();
    }

    public void setIsFirstTimeLaunch (boolean isFirstTime){
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }

    public boolean isFirstTimeLaunch (){
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }
}
