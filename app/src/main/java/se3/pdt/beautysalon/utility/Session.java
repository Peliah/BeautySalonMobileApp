package se3.pdt.beautysalon.utility;

import android.content.Context;
import android.content.SharedPreferences;

public class Session {

    private final SharedPreferences sharedPreferences;
    public Session(Context context){
        sharedPreferences=context.getSharedPreferences(Constant.SESSION_NAME, Context.MODE_PRIVATE);
    }

    public void putBoolean(String key, Boolean value){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public Boolean getBoolean(String key){
        return sharedPreferences.getBoolean(key, false);
    }

    public void putString(String key, String value){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public String getString(String key){
        return sharedPreferences.getString(key, null);
    }

    public void putInt(String key, int value){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public int getInt(String key){
        return sharedPreferences.getInt(key, 0);
    }

    public void clear(){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }

}

