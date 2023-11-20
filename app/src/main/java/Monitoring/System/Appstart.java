package Monitoring.System;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Appstart  extends  Activity{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        //设置布局
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_start);



        //延迟两秒跳转页面
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //在此处跳转到正式页面
                Intent intent = new Intent(Appstart.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}
