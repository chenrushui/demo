package com.crs.demo.utils;

import android.util.Log;

/**
 * Created on 2016/8/1.
 * Author:crs
 * Description:LogUtils
 */
public class LogUtils {
    public static boolean isDebug = true;

    public static void e(String tag, String msg) {
        if (isDebug) {
            Log.i(tag, msg);
        }

    }

    public static void w(String tag, String msg) {
        if (isDebug) {
            Log.i(tag, msg);
        }
    }

    public static void v(String tag, String msg) {
        if (isDebug) {
            Log.i(tag, msg);
        }
    }


    public static void d(String tag, String msg) {
        if (isDebug) {
            Log.i(tag, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (isDebug) {
            Log.i(tag, msg);
        }
    }


}
