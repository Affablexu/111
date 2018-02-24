package cn.qust.spms.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.x;

import cn.qust.spms.R;

/**
 * Author:Nolle
 * Datetime:2/22/2018 11:38 AM
 * Description:快速启动设定页面，在主页面点击快速启动后的跳转页面
 */
@ContentView(R.layout.activity_quick_start)
public class QuickStartActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
    }

    @Event(type = View.OnClickListener.class, value = R.id.btn_quick_back)
    private void turnback(View view) {
        Intent intent = new Intent();
        intent.setClassName("cn.qust.spms", "cn.qust.spms.activity.MainActivity");
        startActivity(intent);
    }

    @Event(type = View.OnClickListener.class, value = R.id.btn_quick_next)
    private void train(View view) {
        Intent intent = new Intent();
        intent.setClassName("cn.qust.spms", "cn.qust.spms.activity.TrainActivity");
        startActivity(intent);
    }
}
