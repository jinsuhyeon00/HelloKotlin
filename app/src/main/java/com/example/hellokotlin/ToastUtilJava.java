package com.example.hellokotlin;

import android.app.Application;
import android.widget.Toast;

public class ToastUtilJava{

    public static void toast_long(String s) {
        Toast.makeText(MainApplication.get_appContext(),s, Toast.LENGTH_LONG).show();
    }
    public static void toast_short(String s) {
        Toast.makeText(MainApplication.get_appContext(),s, Toast.LENGTH_SHORT).show();
    }
}
