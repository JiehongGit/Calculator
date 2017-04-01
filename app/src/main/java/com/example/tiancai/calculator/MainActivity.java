package com.example.tiancai.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
}
