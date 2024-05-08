package com.example.iosdialogdemo;


import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;

public final class AdaptScreenUtils {


    public static int getScreenWidth() {
        Resources resources = IvApplication.getContext().getResources();
        DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.widthPixels;
    }

    public static int getScreenHeight() {
        Resources resources = IvApplication.getContext().getResources();
        DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.heightPixels;
    }

    public static int getScreenItemWidth() {
        Resources resources = IvApplication.getContext().getResources();
        DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.widthPixels / 4;
    }

    public static int getScreenItemHeight() {
        Resources resources = IvApplication.getContext().getResources();
        DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.heightPixels / 3;
    }


    public static void getScreenHeight5(View view, int point, int widthSize, int heightSize, int widthLocation, int heightLocation) {
        switch (point) {
            case 0:
                FrameLayout.LayoutParams params0 = (FrameLayout.LayoutParams) view.getLayoutParams();
                params0.width = widthSize;
                params0.height = heightSize;
                params0.setMargins(0, 0, 0, 0);
                view.setLayoutParams(params0);
                break;
            case 1:
                FrameLayout.LayoutParams params1 = (FrameLayout.LayoutParams) view.getLayoutParams();
                params1.width = widthSize;
                params1.height = heightSize;
                params1.setMargins(widthLocation, 0, 0, 0);
                view.setLayoutParams(params1);
                break;
            case 2:
                FrameLayout.LayoutParams params2 = (FrameLayout.LayoutParams) view.getLayoutParams();
                params2.width = widthSize;
                params2.height = heightSize;
                params2.setMargins(widthLocation * 2, 0, 0, 0);
                view.setLayoutParams(params2);
                break;
            case 3:
                FrameLayout.LayoutParams params3 = (FrameLayout.LayoutParams) view.getLayoutParams();
                params3.width = widthSize;
                params3.height = heightSize;
                params3.setMargins(widthLocation * 3, 0, 0, 0);
                view.setLayoutParams(params3);
                break;
            case 4:
                FrameLayout.LayoutParams params4 = (FrameLayout.LayoutParams) view.getLayoutParams();
                params4.width = widthSize;
                params4.height = heightSize;
                params4.setMargins(0, heightLocation, 0, 0);
                view.setLayoutParams(params4);
                break;
            case 5:
                FrameLayout.LayoutParams params5 = (FrameLayout.LayoutParams) view.getLayoutParams();
                params5.width = widthSize;
                params5.height = heightSize;
                params5.setMargins(widthLocation, heightLocation, 0, 0);
                view.setLayoutParams(params5);
                break;
            case 6:
                FrameLayout.LayoutParams params6 = (FrameLayout.LayoutParams) view.getLayoutParams();
                params6.width = widthSize;
                params6.height = heightSize;
                params6.setMargins(widthLocation * 2, heightLocation, 0, 0);
                view.setLayoutParams(params6);
                break;
            case 7:
                FrameLayout.LayoutParams params7 = (FrameLayout.LayoutParams) view.getLayoutParams();
                params7.width = widthSize;
                params7.height = heightSize;
                params7.setMargins(widthLocation * 3, heightLocation, 0, 0);
                view.setLayoutParams(params7);
                break;
            case 8:
                FrameLayout.LayoutParams params8 = (FrameLayout.LayoutParams) view.getLayoutParams();
                params8.width = widthSize;
                params8.height = heightSize;
                params8.setMargins(0, heightLocation * 2, 0, 0);
                view.setLayoutParams(params8);
                break;
            case 9:
                FrameLayout.LayoutParams params9 = (FrameLayout.LayoutParams) view.getLayoutParams();
                params9.width = widthSize;
                params9.height = heightSize;
                params9.setMargins(widthLocation, heightLocation * 2, 0, 0);
                view.setLayoutParams(params9);
                break;
            case 10:
                FrameLayout.LayoutParams params10 = (FrameLayout.LayoutParams) view.getLayoutParams();
                params10.width = widthSize;
                params10.height = heightSize;
                params10.setMargins(widthLocation * 2, heightLocation * 2, 0, 0);
                view.setLayoutParams(params10);
                break;
            case 11:
                FrameLayout.LayoutParams params11 = (FrameLayout.LayoutParams) view.getLayoutParams();
                params11.width = widthSize;
                params11.height = heightSize;
                params11.setMargins(widthLocation * 3, heightLocation * 2, 0, 0);
                view.setLayoutParams(params11);
                break;
        }


    }
}
