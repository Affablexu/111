package cn.qust.spms.app;

import android.app.Application;

import org.xutils.x;

/**
 * Created by fmyha on 2018/2/13 0013.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(false); //输出debug日志，开启会影响性能
    }
}
