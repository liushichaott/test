package com.example.mitest.a;

import android.content.Context;
import android.net.TrafficStats;
import android.text.format.Formatter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liushichao on 2017/12/22.
 */

public class Utils {

    private static Context context;
    private static Utils instance;

    private Utils(Context context) {
        this.context = context.getApplicationContext();
    }

    public synchronized static Utils newInstance(Context context) {
        if (instance == null)
            instance = new Utils(context);
        return instance;
    }

    //获得网络流量数值
    public static String getNetworkFlow() {
        return "你好";
    }
}
