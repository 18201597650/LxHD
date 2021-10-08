package com.example.export_hd;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.export_hd.bean.HdInfo;
import com.example.export_hd.router.HdRouterTable;
import com.example.export_hd.service.IHDService;

/**
 * Time:2021/10/7
 * Author:liuxiong
 * Description:
 */
public class HdServiceUtil {
    /**
     * 跳转到购物车页面
     * @param param1
     * @param param2
     */
    public static void navigateCartPage(String param1, String param2){
        ARouter.getInstance()
                .build(HdRouterTable.PATH_PAGE_HD)
                .withString("key1",param1)
                .withString("key2",param2)
                .navigation();
    }

    /**
     * 获取服务
     * @return
     */
    public static IHDService getService(){
        //return ARouter.getInstance().navigation(ICartService.class);//如果只有一个实现，这种方式也可以
        return (IHDService) ARouter.getInstance().build(HdRouterTable.PATH_SERVICE_HD).navigation();
    }

    /**
     * 获取购物车中商品数量
     * @return
     */
    public static HdInfo getHdInfo(){
        return getService().getHdInfo();
    }

}
