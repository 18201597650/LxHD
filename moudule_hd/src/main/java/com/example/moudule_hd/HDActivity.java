package com.example.moudule_hd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.export_hd.router.HdRouterTable;

@Route(path = "/hd/HDActivity")
public class HDActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hd);

        //跳转到购物车页面
        findViewById(R.id.btn_go_cart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //通过路由跳转到 购物车组件的购物车页面（但没有依赖购物车组件）
//                ARouter.getInstance()
//                        .build("/cart/cartActivity")
//                        .withString("key1","param1")//携带参数1
//                        .withString("key2","param2")//携带参数2
//                        .navigation();

              //  CartServiceUtil.navigateCartPage("param1", "param1");
            }
        });


        //调用购物车组件服务：获取购物车商品数量
//        TextView tvCartProductCount = findViewById(R.id.tv_cart_product_count);
//        tvCartProductCount.setText("购物车商品数量:"+ CartServiceUtil.getCartProductCount().productCount);


        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction= manager.beginTransaction();

        Fragment userFragment = (Fragment) ARouter.getInstance().build(HdRouterTable.PATH_FRAGMENT_HD).navigation();
        transaction.add(R.id.fl_test_fragment, userFragment, "tag");
        transaction.commit();
    }
}