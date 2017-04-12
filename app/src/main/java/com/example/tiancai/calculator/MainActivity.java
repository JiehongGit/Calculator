package com.example.tiancai.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//当程序里面有很多的部件需要点击执行动作的时候可以使用implements OnClickListener

    //数字按钮
    Button btn_0;
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;

    Button btn_point;//小数点按钮
    Button btn_clear;//清空
    Button btn_del;//清除

    Button btn_plus;//加
    Button btn_minus;//减
    Button btn_multiply;//乘
    Button btn_divide;//除

    Button btn_equal;//等于

    EditText et_input;
    boolean clear_flag;//清空标识

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //实例化按钮
        btn_0 = (Button) findViewById(R.id.btn_0) ;
        btn_1 = (Button) findViewById(R.id.btn_1) ;
        btn_2 = (Button) findViewById(R.id.btn_2) ;
        btn_3 = (Button) findViewById(R.id.btn_3) ;
        btn_4 = (Button) findViewById(R.id.btn_4) ;
        btn_5 = (Button) findViewById(R.id.btn_5) ;
        btn_6 = (Button) findViewById(R.id.btn_6) ;
        btn_7 = (Button) findViewById(R.id.btn_7) ;
        btn_8 = (Button) findViewById(R.id.btn_8) ;
        btn_9 = (Button) findViewById(R.id.btn_9) ;
        btn_point = (Button) findViewById(R.id.btn_point) ;
        btn_clear = (Button) findViewById(R.id.btn_clear) ;
        btn_del = (Button) findViewById(R.id.btn_del) ;
        btn_plus = (Button) findViewById(R.id.btn_plus) ;
        btn_minus = (Button) findViewById(R.id.btn_minus) ;
        btn_multiply = (Button) findViewById(R.id.btn_multiply) ;
        btn_divide = (Button) findViewById(R.id.btn_divide) ;
        btn_equal = (Button) findViewById(R.id.btn_equal);

    }
}
