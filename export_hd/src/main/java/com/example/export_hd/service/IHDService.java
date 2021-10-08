package com.example.export_hd.service;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.example.export_hd.bean.HdInfo;

/**
 * Time:2021/10/7
 * Author:liuxiong
 * Description:
 */
public interface IHDService extends IProvider {
    HdInfo getHdInfo();
}
