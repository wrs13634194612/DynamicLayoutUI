package com.example.iosdialogdemo;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;


import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class IvApplication extends Application {


    public static Context context;
    private static IvApplication application;


    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        application = this;

    }


    public static IvApplication getInstance() {
        return application;
    }

    public static Context getContext() {
        return context;
    }


}
