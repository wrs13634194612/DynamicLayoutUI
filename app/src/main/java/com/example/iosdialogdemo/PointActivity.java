package com.example.iosdialogdemo;




        import android.app.Activity;
        import android.content.res.Resources;
        import android.nfc.cardemulation.CardEmulation;
        import android.os.Bundle;
        import android.util.DisplayMetrics;
        import android.widget.RelativeLayout;
        import androidx.cardview.widget.CardView;

public class PointActivity extends Activity {
    /*根据输入的值  来确定控件的位置和大小*/
    private int[] cardModelInt ={0,1,2,3,4,5,6,7,8,9,10,11}; //模块起始位置
    private CardView card_0, card_1, card_2, card_3,
            card_4, card_5, card_6, card_7,
            card_8,card_9, card_10, card_11;

    private int[] models =  {11, 11, 11, 11,
            11, 11, 11,11,
            11,  11, 11, 11
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_point);




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
        card_11= findViewById(R.id.auto_card_11);


        /*
        * 明显应该弄成json ，然后list 《bean》 类
        * */

       // getPoint(cardModelInt[0]);

        /*
        * 帧布局 设置位置可以了
        * 现在需要设置大小
        * 把所有的代码 存起来
        * 然后  我们应该做点什么呢
        *
        * 已经完全晕了
        *
        *接下来 需要我们做什么呢
        * 通过位置 把东西全部设置起来
        * */
//        AdaptScreenUtils.getScreenHeight5(card_0,cardModelInt[10],480,360);
//        AdaptScreenUtils.getScreenHeight5(card_0,cardModelInt[10],480,360);

      //  AdaptScreenUtils.getScreenHeight5(card_1,cardModelInt[3]);

  /*      AdaptScreenUtils.getScreenHeight5(card_0, models[0], AdaptScreenUtils.getScreenItemWidth(), AdaptScreenUtils.getScreenItemHeight() * 86 / 100);
        AdaptScreenUtils.getScreenHeight5(card_1, models[1], AdaptScreenUtils.getScreenItemWidth(), AdaptScreenUtils.getScreenItemHeight() * 86 / 100);
        AdaptScreenUtils.getScreenHeight5(card_2, models[2], AdaptScreenUtils.getScreenItemWidth(), AdaptScreenUtils.getScreenItemHeight() * 86 / 100);
        AdaptScreenUtils.getScreenHeight5(card_3, models[3], AdaptScreenUtils.getScreenItemWidth(), AdaptScreenUtils.getScreenItemHeight() * 86 / 100);

        AdaptScreenUtils.getScreenHeight5(card_4, models[4], AdaptScreenUtils.getScreenItemWidth(), AdaptScreenUtils.getScreenItemHeight() * 86 / 100);
        AdaptScreenUtils.getScreenHeight5(card_5, models[5], AdaptScreenUtils.getScreenItemWidth(), AdaptScreenUtils.getScreenItemHeight() * 86 / 100);
        AdaptScreenUtils.getScreenHeight5(card_6, models[6], AdaptScreenUtils.getScreenItemWidth(), AdaptScreenUtils.getScreenItemHeight() * 86 / 100);
        AdaptScreenUtils.getScreenHeight5(card_7, models[7], AdaptScreenUtils.getScreenItemWidth(), AdaptScreenUtils.getScreenItemHeight() * 86 / 100);

        AdaptScreenUtils.getScreenHeight5(card_8, models[8], AdaptScreenUtils.getScreenItemWidth(), AdaptScreenUtils.getScreenItemHeight() * 86 / 100);
        AdaptScreenUtils.getScreenHeight5(card_9, models[9], AdaptScreenUtils.getScreenItemWidth(), AdaptScreenUtils.getScreenItemHeight() * 86 / 100);
        AdaptScreenUtils.getScreenHeight5(card_10, models[10], AdaptScreenUtils.getScreenItemWidth(), AdaptScreenUtils.getScreenItemHeight() * 86 / 100);
        AdaptScreenUtils.getScreenHeight5(card_11, models[11], AdaptScreenUtils.getScreenItemWidth(), AdaptScreenUtils.getScreenItemHeight() * 86 / 100);*/
    }


    private void getPoint(int point){
        switch (point){
            case 0:
             //   AdaptScreenUtils.getScreenHeight4(card_0,0,0,0,0);
                break;
            case 1:
              //  AdaptScreenUtils.getScreenHeight4(card_0,AdaptScreenUtils.getScreenWidth(),0,0,0);
                break;


        }
    }

}