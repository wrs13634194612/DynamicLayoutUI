package com.example.iosdialogdemo;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.view.ViewGroup.LayoutParams;

public class SetCardActivity extends Activity {
    /*1.设置控件大小 2.获取屏幕宽高 3.根据屏幕宽高 等分比设置大小*/
    private static final int DEFAULT_DRAWER_WIDTH = LayoutParams.MATCH_PARENT;

    private CardView card_0;
    private  Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_card);

        card_0 = findViewById(R.id.set_card_0);

        btn = findViewById(R.id.set_btn);


        Resources resources = this.getResources();
        DisplayMetrics dm = resources.getDisplayMetrics();
        int screenWidth = dm.widthPixels;
        int screenHeight = dm.heightPixels;

        LayoutParams params = btn.getLayoutParams();
        params.width = screenWidth / 2;
        params.height = screenWidth / 2;
        btn.setLayoutParams(params);
        card_0.setLayoutParams(params);


    }

}