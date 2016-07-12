package com.usermvp.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by YuZhongzheng on 2016/7/12.
 * <p/>
 * zhongzhengdev@gmail.com
 */
public abstract class ActivitySupport extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initView();
        initData();
    }

    abstract void initView();

    abstract void initData();
}
