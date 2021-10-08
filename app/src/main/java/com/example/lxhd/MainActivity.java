package com.example.lxhd;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //这里进行本地独立调试（每个组件工程的app模块都是用于独立调试）
        findViewById(R.id.mBtnJumpHomePage).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //通过路由直接打开home组件的HomeActivity，
                ARouter.getInstance().build("/hd/HDActivity").navigation();
                finish();
            }
        });
    }
}
