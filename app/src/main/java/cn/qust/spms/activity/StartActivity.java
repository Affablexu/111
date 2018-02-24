package cn.qust.spms.activity;

import android.app.Activity;
import android.os.Bundle;

import org.xutils.view.annotation.ContentView;
import org.xutils.x;

import cn.qust.spms.R;

/**
 * Author:Nolle
 * Datetime:2/22/2018 6:41PM
 * Description:开始页面，插入IC卡后在主页面点击快速启动后的跳转页面，在其中进行位置和负荷量的设定，可以查看使用者信息
 */
@ContentView(R.layout.activity_start)
public class StartActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
    }

}
