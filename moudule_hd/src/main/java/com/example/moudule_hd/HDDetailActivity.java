package com.example.moudule_hd;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.export_hd.router.HdRouterTable;

/**
 * Time:2021/10/7
 * Author:liuxiong
 * Description:
 */
@Route(path = HdRouterTable.PATH_PAGE_HDDETAIL)
public class HDDetailActivity extends AppCompatActivity {
    public static void jump(Context context){
        Intent intent =new Intent(context,HDDetailActivity.class);
        context.startActivity(intent);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hd_detail);

    }
}
