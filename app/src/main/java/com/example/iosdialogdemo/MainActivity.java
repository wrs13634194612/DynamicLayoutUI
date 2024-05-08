package com.example.iosdialogdemo;


import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class MainActivity extends Activity {
    private List<CardBean> stuList;

    private int width=0;

    private int height=0;
    private String jsonString;

    private CardView card_0, card_1, card_2, card_3,
            card_4, card_5, card_6, card_7,
            card_8, card_9, card_10, card_11;


    private int[] cardInts0 = {11, 21, 0, 11,
            11, 12, 12, 11,
            11, 0, 0, 11
    };


    private Handler mHandler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(@NonNull Message message) {
            if (message.what == 100) {
                jsonString = (String) message.obj;
                Log.i("INFO", "##### Sub_json: " + ": " + jsonString);
                Gson gson = new Gson();

                //解析
                Type type = new TypeToken<List<CardBean>>() {
                }.getType();

                if (stuList != null) {
                    stuList.clear();
                }
                stuList.addAll(gson.fromJson(jsonString, type));


                Log.e("INFO", "##### Sub_list: " + ": " + stuList);

                //根据传递过来的值  来控制控件是否显示
                if (stuList != null) {
                    if (stuList.get(0).isShow()) {
                        card_0.setVisibility(View.VISIBLE);
                    } else {
                        card_0.setVisibility(View.GONE);
                    }
                    if (stuList.get(1).isShow()) {
                        card_1.setVisibility(View.VISIBLE);
                    } else {
                        card_1.setVisibility(View.GONE);
                    }
                    if (stuList.get(2).isShow()) {
                        card_2.setVisibility(View.VISIBLE);
                    } else {
                        card_2.setVisibility(View.GONE);
                    }
                    if (stuList.get(3).isShow()) {
                        card_3.setVisibility(View.VISIBLE);
                    } else {
                        card_3.setVisibility(View.GONE);
                    }
                    if (stuList.get(4).isShow()) {
                        card_4.setVisibility(View.VISIBLE);
                    } else {
                        card_4.setVisibility(View.GONE);
                    }
                    if (stuList.get(5).isShow()) {
                        card_5.setVisibility(View.VISIBLE);
                    } else {
                        card_5.setVisibility(View.GONE);
                    }
                    if (stuList.get(6).isShow()) {
                        card_6.setVisibility(View.VISIBLE);
                    } else {
                        card_6.setVisibility(View.GONE);
                    }
                    if (stuList.get(7).isShow()) {
                        card_7.setVisibility(View.VISIBLE);
                    } else {
                        card_7.setVisibility(View.GONE);
                    }

                    if (stuList.get(8).isShow()) {
                        card_8.setVisibility(View.VISIBLE);
                    } else {
                        card_8.setVisibility(View.GONE);
                    }
                    if (stuList.get(9).isShow()) {
                        card_9.setVisibility(View.VISIBLE);
                    } else {
                        card_9.setVisibility(View.GONE);
                    }
                    if (stuList.get(10).isShow()) {
                        card_10.setVisibility(View.VISIBLE);
                    } else {
                        card_10.setVisibility(View.GONE);
                    }
                    if (stuList.get(11).isShow()) {
                        card_11.setVisibility(View.VISIBLE);
                    } else {
                        card_11.setVisibility(View.GONE);
                    }
                }

                /*
                 * 根据 json里面的size 大小  来确定 控件的 长宽
                 * 11 12 21 22 33 */


                width =  AdaptScreenUtils.getScreenItemWidth();
                height = AdaptScreenUtils.getScreenItemHeight()* 86 / 100;

                Log.e("INFO", "##### Sub_size: " + width+": ===" + height);

                if (stuList.get(0).getSize()==11){
                    AdaptScreenUtils.getScreenHeight5(card_0, stuList.get(0).getLocation(), width,height,width,height);
                }else if (stuList.get(0).getSize()==12){
                    AdaptScreenUtils.getScreenHeight5(card_0, stuList.get(0).getLocation(), width,height*2,width,height);
                }else if (stuList.get(0).getSize()==21){
                    AdaptScreenUtils.getScreenHeight5(card_0, stuList.get(0).getLocation(), width*2,height,width,height);
                }else if (stuList.get(0).getSize()==22){
                    AdaptScreenUtils.getScreenHeight5(card_0, stuList.get(0).getLocation(), width*2,height*2,width,height);
                }else if (stuList.get(0).getSize()==33){
                    AdaptScreenUtils.getScreenHeight5(card_0, stuList.get(0).getLocation(), width*3,height*3,width,height);
                }

                if (stuList.get(1).getSize()==11){
                    AdaptScreenUtils.getScreenHeight5(card_1, stuList.get(1).getLocation(), width,height,width,height);
                }else if (stuList.get(1).getSize()==12){
                    AdaptScreenUtils.getScreenHeight5(card_1, stuList.get(1).getLocation(), width,height*2,width,height);
                }else if (stuList.get(1).getSize()==21){
                    AdaptScreenUtils.getScreenHeight5(card_1, stuList.get(1).getLocation(), width*2,height,width,height);
                }else if (stuList.get(1).getSize()==22){
                    AdaptScreenUtils.getScreenHeight5(card_1, stuList.get(1).getLocation(), width*2,height*2,width,height);
                }else if (stuList.get(1).getSize()==33){
                    AdaptScreenUtils.getScreenHeight5(card_1, stuList.get(1).getLocation(), width*3,height*3,width,height);
                }

                if (stuList.get(2).getSize()==11){
                    AdaptScreenUtils.getScreenHeight5(card_2, stuList.get(2).getLocation(), width,height,width,height);
                }else if (stuList.get(2).getSize()==12){
                    AdaptScreenUtils.getScreenHeight5(card_2, stuList.get(2).getLocation(), width,height*2,width,height);
                }else if (stuList.get(2).getSize()==21){
                    AdaptScreenUtils.getScreenHeight5(card_2, stuList.get(2).getLocation(), width*2,height,width,height);
                }else if (stuList.get(2).getSize()==22){
                    AdaptScreenUtils.getScreenHeight5(card_2, stuList.get(2).getLocation(), width*2,height*2,width,height);
                }else if (stuList.get(2).getSize()==33){
                    AdaptScreenUtils.getScreenHeight5(card_2, stuList.get(2).getLocation(), width*3,height*3,width,height);
                }

                if (stuList.get(3).getSize()==11){
                    AdaptScreenUtils.getScreenHeight5(card_3, stuList.get(3).getLocation(), width,height,width,height);
                }else if (stuList.get(3).getSize()==12){
                    AdaptScreenUtils.getScreenHeight5(card_3, stuList.get(3).getLocation(), width,height*2,width,height);
                }else if (stuList.get(3).getSize()==21){
                    AdaptScreenUtils.getScreenHeight5(card_3, stuList.get(3).getLocation(), width*2,height,width,height);
                }else if (stuList.get(3).getSize()==22){
                    AdaptScreenUtils.getScreenHeight5(card_3, stuList.get(3).getLocation(), width*2,height*2,width,height);
                }else if (stuList.get(3).getSize()==33){
                    AdaptScreenUtils.getScreenHeight5(card_3, stuList.get(3).getLocation(), width*3,height*3,width,height);
                }

                if (stuList.get(4).getSize()==11){
                    AdaptScreenUtils.getScreenHeight5(card_4, stuList.get(4).getLocation(), width,height,width,height);
                }else if (stuList.get(4).getSize()==12){
                    AdaptScreenUtils.getScreenHeight5(card_4, stuList.get(4).getLocation(), width,height*2,width,height);
                }else if (stuList.get(4).getSize()==21){
                    AdaptScreenUtils.getScreenHeight5(card_4, stuList.get(4).getLocation(), width*2,height,width,height);
                }else if (stuList.get(4).getSize()==22){
                    AdaptScreenUtils.getScreenHeight5(card_4, stuList.get(4).getLocation(), width*2,height*2,width,height);
                }else if (stuList.get(4).getSize()==33){
                    AdaptScreenUtils.getScreenHeight5(card_4, stuList.get(4).getLocation(), width*3,height*3,width,height);
                }

                if (stuList.get(5).getSize()==11){
                    AdaptScreenUtils.getScreenHeight5(card_5, stuList.get(5).getLocation(), width,height,width,height);
                }else if (stuList.get(5).getSize()==12){
                    AdaptScreenUtils.getScreenHeight5(card_5, stuList.get(5).getLocation(), width,height*2,width,height);
                }else if (stuList.get(5).getSize()==21){
                    AdaptScreenUtils.getScreenHeight5(card_5, stuList.get(5).getLocation(), width*2,height,width,height);
                }else if (stuList.get(5).getSize()==22){
                    AdaptScreenUtils.getScreenHeight5(card_5, stuList.get(5).getLocation(), width*2,height*2,width,height);
                }else if (stuList.get(5).getSize()==33){
                    AdaptScreenUtils.getScreenHeight5(card_5, stuList.get(5).getLocation(), width*3,height*3,width,height);
                }

                if (stuList.get(6).getSize()==11){
                    AdaptScreenUtils.getScreenHeight5(card_6, stuList.get(6).getLocation(), width,height,width,height);
                }else if (stuList.get(6).getSize()==12){
                    AdaptScreenUtils.getScreenHeight5(card_6, stuList.get(6).getLocation(), width,height*2,width,height);
                }else if (stuList.get(6).getSize()==21){
                    AdaptScreenUtils.getScreenHeight5(card_6, stuList.get(6).getLocation(), width*2,height,width,height);
                }else if (stuList.get(6).getSize()==22){
                    AdaptScreenUtils.getScreenHeight5(card_6, stuList.get(6).getLocation(), width*2,height*2,width,height);
                }else if (stuList.get(6).getSize()==33){
                    AdaptScreenUtils.getScreenHeight5(card_6, stuList.get(6).getLocation(), width*3,height*3,width,height);
                }

                if (stuList.get(7).getSize()==11){
                    AdaptScreenUtils.getScreenHeight5(card_7, stuList.get(7).getLocation(), width,height,width,height);
                }else if (stuList.get(7).getSize()==12){
                    AdaptScreenUtils.getScreenHeight5(card_7, stuList.get(7).getLocation(), width,height*2,width,height);
                }else if (stuList.get(7).getSize()==21){
                    AdaptScreenUtils.getScreenHeight5(card_7, stuList.get(7).getLocation(), width*2,height,width,height);
                }else if (stuList.get(7).getSize()==22){
                    AdaptScreenUtils.getScreenHeight5(card_7, stuList.get(7).getLocation(), width*2,height*2,width,height);
                }else if (stuList.get(7).getSize()==33){
                    AdaptScreenUtils.getScreenHeight5(card_7, stuList.get(7).getLocation(), width*3,height*3,width,height);
                }

                if (stuList.get(8).getSize()==11){
                    AdaptScreenUtils.getScreenHeight5(card_8, stuList.get(8).getLocation(), width,height,width,height);
                }else if (stuList.get(8).getSize()==12){
                    AdaptScreenUtils.getScreenHeight5(card_8, stuList.get(8).getLocation(), width,height*2,width,height);
                }else if (stuList.get(8).getSize()==21){
                    AdaptScreenUtils.getScreenHeight5(card_8, stuList.get(8).getLocation(), width*2,height,width,height);
                }else if (stuList.get(8).getSize()==22){
                    AdaptScreenUtils.getScreenHeight5(card_8, stuList.get(8).getLocation(), width*2,height*2,width,height);
                }else if (stuList.get(8).getSize()==33){
                    AdaptScreenUtils.getScreenHeight5(card_8, stuList.get(8).getLocation(), width*3,height*3,width,height);
                }

                if (stuList.get(9).getSize()==11){
                    AdaptScreenUtils.getScreenHeight5(card_9, stuList.get(9).getLocation(), width,height,width,height);
                }else if (stuList.get(9).getSize()==12){
                    AdaptScreenUtils.getScreenHeight5(card_9, stuList.get(9).getLocation(), width,height*2,width,height);
                }else if (stuList.get(9).getSize()==21){
                    AdaptScreenUtils.getScreenHeight5(card_9, stuList.get(9).getLocation(), width*2,height,width,height);
                }else if (stuList.get(9).getSize()==22){
                    AdaptScreenUtils.getScreenHeight5(card_9, stuList.get(9).getLocation(), width*2,height*2,width,height);
                }else if (stuList.get(9).getSize()==33){
                    AdaptScreenUtils.getScreenHeight5(card_9, stuList.get(9).getLocation(), width*3,height*3,width,height);
                }


                if (stuList.get(10).getSize()==11){
                    AdaptScreenUtils.getScreenHeight5(card_10, stuList.get(10).getLocation(), width,height,width,height);
                }else if (stuList.get(10).getSize()==12){
                    AdaptScreenUtils.getScreenHeight5(card_10, stuList.get(10).getLocation(), width,height*2,width,height);
                }else if (stuList.get(10).getSize()==21){
                    AdaptScreenUtils.getScreenHeight5(card_10, stuList.get(10).getLocation(), width*2,height,width,height);
                }else if (stuList.get(10).getSize()==22){
                    AdaptScreenUtils.getScreenHeight5(card_10, stuList.get(10).getLocation(), width*2,height*2,width,height);
                }else if (stuList.get(10).getSize()==33){
                    AdaptScreenUtils.getScreenHeight5(card_10, stuList.get(10).getLocation(), width*3,height*3,width,height);
                }

                if (stuList.get(11).getSize()==11){
                    AdaptScreenUtils.getScreenHeight5(card_11, stuList.get(11).getLocation(), width,height,width,height);
                }else if (stuList.get(11).getSize()==12){
                    AdaptScreenUtils.getScreenHeight5(card_11, stuList.get(11).getLocation(), width,height*2,width,height);
                }else if (stuList.get(11).getSize()==21){
                    AdaptScreenUtils.getScreenHeight5(card_11, stuList.get(11).getLocation(), width*2,height,width,height);
                }else if (stuList.get(11).getSize()==22){
                    AdaptScreenUtils.getScreenHeight5(card_11, stuList.get(11).getLocation(), width*2,height*2,width,height);
                }else if (stuList.get(11).getSize()==33){
                    AdaptScreenUtils.getScreenHeight5(card_11, stuList.get(11).getLocation(), width*3,height*3,width,height);
                }

                /*
                * 必须想办法 查看一下控件的大小才行呢
                * */

                ViewTreeObserver vto3 = card_1.getViewTreeObserver();
                vto3.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    @Override
                    public void onGlobalLayout() {
                        int width = card_1.getWidth();
                        int height = card_1.getHeight();
                        // 在获取到宽高之后要及时移除监听器，避免重复调用
                        Log.e("TAG","card_1:AutoCardActivity_data:"+width+"==="+height);
                        card_1.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                });


            }
            return false;
        }
    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        card_0 = findViewById(R.id.auto_card_0);
        card_1 = findViewById(R.id.auto_card_1);
        card_2 = findViewById(R.id.auto_card_2);
        card_3 = findViewById(R.id.auto_card_3);

        card_4 = findViewById(R.id.auto_card_4);
        card_5 = findViewById(R.id.auto_card_5);
        card_6 = findViewById(R.id.auto_card_6);
        card_7 = findViewById(R.id.auto_card_7);

        card_8 = findViewById(R.id.auto_card_8);
        card_9 = findViewById(R.id.auto_card_9);
        card_10 = findViewById(R.id.auto_card_10);
        card_11 = findViewById(R.id.auto_card_11);

        stuList = new ArrayList<>();


        loadJsonFromAssests();
    }

    public void loadJsonFromAssests() {
        String json = null;
        try {
            InputStream inputStream = getAssets().open("stu1.json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Log.i("TAG", "loadJsonFromAssests:" + json.toString());
        Message msg = new Message();
        msg.what = 100;
        msg.obj = json.toString();
        mHandler.sendMessage(msg);
    }


}