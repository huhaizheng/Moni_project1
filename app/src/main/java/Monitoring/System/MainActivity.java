package Monitoring.System;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button button_1;    //按钮名字
    private ImageView image_1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //界面打开后 最先运行的地方
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //对应界面UI
        //一般先用来进行界面初始化 控件初始化 初始化一些参数

        /* 进入弹窗*/
















        button_1 = findViewById(R.id.button_1);
        button_1.setOnClickListener(new View.OnClickListener() {           //这就是负责点击的函数
            @Override
            public void onClick(View v){              ///点击后执行相关指令的地方
                System.out.println("hello");
                Toast.makeText(MainActivity.this, "hello", Toast.LENGTH_SHORT).show();
            }
        });
        image_1 = findViewById(R.id.image_1);
        image_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"监控还没安，打不开",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

