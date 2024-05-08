package com.example.iosdialogdemo;



        import android.app.Activity;
        import android.app.AlertDialog;
        import android.content.DialogInterface;
        import android.content.res.Resources;
        import android.os.Bundle;
        import android.util.DisplayMetrics;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.Toast;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.cardview.widget.CardView;

public class InputCardActivity extends Activity {
    /*根据输入的值  来确定控件的位置和大小*/
    private String[] cardModels ={"x1y1","x1y2","x2y1","x2y2","x2y3","x3y3"}; //模块大小
    private int[] cardModelInt ={11,12,21,22,23,33}; //模块大小
    private int point = 0;  //起始位置
    private CardView card_0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_card);
        card_0 = findViewById(R.id.input_card_0);
//        AdaptScreenUtils.getScreenHeight3(card_0,cardModelInt[2]);
    }
}